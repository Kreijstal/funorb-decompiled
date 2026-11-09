/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class MarkerTrackWidget extends InteractiveWidget {
    int trackY;
    private IntList markers;
    static String namesCanOnlyContainText;
    static String field_E;
    int paddingX;
    private int valueRange;

    final static void closeCacheResources(int guard) {
        try {
          int var1_int = 0;
          IOException iOException = null;
          int var3 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var1 = null;
          IOException var2 = null;
          var3 = Sumoblitz.field_L ? 1 : 0;
          try {
            if (null != jk.field_b) {
              jk.field_b.closeConnection(-106);
            }
            if (FadingWidget.field_D != null) {
              FadingWidget.field_D.shutdown(109);
            }
            if (null != DiskCacheDataFile.dataFile) {
              try {
                DiskCacheDataFile.dataFile.close(-1);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (guard != -1) {
              namesCanOnlyContainText = (String) null;
            }
            if (ProgressDialog.field_O != null) {
              for (var1_int = 0; ProgressDialog.field_O.length > var1_int; var1_int++) {
                if (null != ProgressDialog.field_O[var1_int]) {
                  try {
                    ProgressDialog.field_O[var1_int].close(-1);
                  } catch (java.io.IOException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var2 = (IOException) (Object) decompiledCaughtException;
                  }
                }
              }
              return;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1), "fu.I(" + guard + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(boolean guard) {
        field_E = null;
        if (guard) {
          MarkerTrackWidget.closeCacheResources(78);
        }
        namesCanOnlyContainText = null;
    }

    final int markerPosition(int index, int guard) {
        if (index < 0 ||
          index >= this.markers.size((byte) 51)) {
          return -1;
        }
        if (guard != -24194) {
          this.markerCount(-5);
        }
        return this.markers.get(index, -29816);
    }

    final int range(int guard) {
        if (guard != -1) {
          this.paddingX = 54;
        }
        return this.valueRange;
    }

    final int markerCount(int guard) {
        if (guard != 0) {
          this.paddingX = 112;
        }
        return this.markers.size((byte) 70);
    }

    final boolean onPointerPressed(UiWidget root, int guard, int pointerY, int button, int parentX, int pointerX, int parentY) {
        int var12 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard > -42) {
            MarkerTrackWidget.persistRandomDataAndAdvance(-122);
          }
          if (!super.onPointerPressed(root, -105, pointerY, button, parentX, pointerX, parentY)) {
            return false;
          }
          var8_int = pointerX - (parentX + this.paddingX);
          var9 = -(this.paddingX * 2) + this.width;
          if (var9 < var8_int) {
            var8_int = var9;
          }
          if (var8_int < 0) {
            var8_int = 0;
          }
          var8_int = var8_int * this.valueRange / var9;
          if (button != 1) {
            if (button != 2) {
              return true;
            }
            var10 = 2147483647;
            var11 = -1;
            for (var12 = 0; var12 < this.markers.size((byte) 29); var12++) {
              var13 = this.markers.get(var12, -29816) - var8_int;
              var13 = var13 * var13;
              if (var10 > var13) {
                var11 = var12;
                var10 = var13;
              }
            }
            if (var11 >= 0) {
              this.markers.removeAt((byte) 61, var11);
            }
          } else {
            this.markers.add(-18, var8_int);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_28_0 = var8;
          stackIn_28_1 = new StringBuilder().append("fu.R(");
          if (root == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(guard).append(',').append(pointerY).append(',').append(button).append(',').append(parentX).append(',').append(pointerX).append(',').append(parentY).append(')').toString());
        }
    }

    final static int fullscreenDialogHeight(byte guard) {
        int var1 = 126 % ((guard + 26) / 38);
        return RenderPresentationException.field_d;
    }

    private MarkerTrackWidget() throws Throwable {
        throw new Error();
    }

    final static void persistRandomDataAndAdvance(int skipBytes) {
        try {
          if (NameSuggestionsPanel.field_E != null) {
            try {
              NameSuggestionsPanel.field_E.seek(-7564, 0L);
              NameSuggestionsPanel.field_E.write(ig.field_a.payload, 24, (byte) -41, ig.field_a.position);
            } catch (Exception exception) {
            }
          }
          ig.field_a.position = ig.field_a.position + skipBytes;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        namesCanOnlyContainText = "Names can only contain letters, numbers, spaces and underscores";
    }
}
