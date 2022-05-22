package org.nbfalcon.fractalViewer.fractals;

import org.nbfalcon.fractalViewer.ui.AsyncImageViewer;
import org.nbfalcon.fractalViewer.ui.SettingsUI;
import org.nbfalcon.fractalViewer.util.ViewPort;
import org.nbfalcon.fractalViewer.util.concurrent.MultithreadedExecutor;
import org.nbfalcon.fractalViewer.util.concurrent.SimplePromise;

import java.awt.image.BufferedImage;

public interface FractalRenderer extends AsyncImageViewer.AsyncImageRenderer {
    SimplePromise<BufferedImage> renderWithCustomPool(
            MultithreadedExecutor pool, ViewPort viewPort, int width, int height);

    SimplePromise<int[]> renderIterations(ViewPort viewPort, int width, int height, MultithreadedExecutor pool);

    FractalRenderer copy();

    SettingsUI createSettingsUI();

    String getName();
}