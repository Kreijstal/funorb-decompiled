/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DraggableWidget extends SingleChildContainer {
    private int field_F;
    private boolean field_N;
    static SceneWidget field_H;
    static int field_I;
    static char field_E;
    private boolean field_K;
    static String field_J;
    private int field_M;
    private int field_G;
    static String field_L;
    private int field_O;

    final static void printError(byte param0, String param1) {
        System.out.println("Error: " + CheckboxPainter.replaceAll(param1, "%0a", "\n", (byte) 100));
        int var2 = -71 / ((param0 + 53) / 57);
    }

    final static CanvasRasterBuffer createRasterBuffer(int param0, java.awt.Component param1, int param2, byte param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          CanvasRasterBuffer var5 = null;
          ImageProducerRasterBuffer var5_ref = null;
          CanvasRasterBuffer stackIn_3_0 = null;
          ImageProducerRasterBuffer stackIn_5_0 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var4 = Class.forName("BufferedImageRasterBuffer");
              var5 = (CanvasRasterBuffer) (var4.newInstance());
              var5.initialize(param2, param1, param3 ^ -123, param0);
              if (param3 != -123) {
                field_E = 'ﾣ';
              }
              stackIn_3_0 = var5;
              return stackIn_3_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new ImageProducerRasterBuffer();
              ((CanvasRasterBuffer) ((Object) var5_ref)).initialize(param2, param1, 0, param0);
              stackIn_5_0 = var5_ref;
              return (CanvasRasterBuffer) ((Object) stackIn_5_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var4_ref2;
            stackIn_8_1 = new StringBuilder().append("se.F(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw aa.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void updatePointer(UiComponent param0, int param1, int param2, int param3) {
        int stackIn_11_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_18_1 = 0;
        int stackIn_19_2 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          if ((!(this.field_B instanceof TextButton) ||
            ((TextButton) (this.field_B)).field_B) &&
            this.field_t == 1) {
            var5_int = EmailLoginCredentials.field_g - this.field_F - param1;
            var6 = -param3 + MenuButtonPanel.field_I - this.field_O;
            if (var5_int != this.field_n ||
              this.field_j != var6) {
              this.field_j = var6;
              this.field_n = var5_int;
              if (this.field_o instanceof WidgetDragListener) {
                ((WidgetDragListener) (this.field_o)).onWidgetDragged(this, param1, 20172, param3);
              }
            }
          } else {
            if (this.field_K) {
              if (this.field_n != this.field_M) {
                var5_int = this.field_M - this.field_n;
                stackIn_11_1 = this.field_n;
                if (Math.abs(var5_int) > 2) {
                  stackIn_12_2 = var5_int >> 1;
                } else {
                  if (var5_int <= 0) {
                    stackIn_12_2 = -1;
                  } else {
                    stackIn_12_2 = 1;
                  }
                }
                this.field_n = stackIn_11_1 + stackIn_12_2;
              }
              if (this.field_G != this.field_j) {
                var5_int = this.field_G - this.field_j;
                stackIn_18_1 = this.field_j;
                if (Math.abs(var5_int) > 2) {
                  stackIn_19_2 = var5_int >> 1;
                } else {
                  if (0 >= var5_int) {
                    stackIn_19_2 = -1;
                  } else {
                    stackIn_19_2 = 1;
                  }
                }
                this.field_j = stackIn_18_1 + stackIn_19_2;
              }
            }
          }
          super.updatePointer(param0, param1, param2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("se.E(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean handlePointerPress(int param0, int param1, UiComponent param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = 120 % ((param4 + 42) / 35);
          var8_int = super.handlePointerPress(param0, param1, param2, param3, 40, param5, param6) ? 1 : 0;
          if (var8_int != 0 &&
            this.field_N) {
            return true;
          }
          if (!this.containsPoint((byte) -47, param3, param0, param6, param5)) {
            stackIn_5_0 = var8_int;
            return stackIn_5_0 != 0;
          }
          this.field_t = param1;
          if (param1 != 1) {
            return true;
          }
          MenuInputState.field_i = this;
          this.field_O = -this.field_j + param0 - param3;
          this.field_F = -param6 + (param5 - this.field_n);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("se.DA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, int param2) {
        if (co.field_e == null ||
          !(param1 <= co.field_e.length)) {
          co.field_e = new int[param1 * 2];
        }
        if (Battle.field_z == null) {
          Battle.field_z = new int[param1 * 2];
          if (null == ConditionalTextValue.field_e ||
            !(param1 <= ConditionalTextValue.field_e.length)) {
            ConditionalTextValue.field_e = new int[2 * param1];
          }
          if (CachedArchiveProvider.field_u == null ||
            !(param1 <= CachedArchiveProvider.field_u.length)) {
            CachedArchiveProvider.field_u = new int[param1 * 2];
          }
          if (PatchEnvelopeSet.field_o == null ||
            !(param1 <= PatchEnvelopeSet.field_o.length)) {
            PatchEnvelopeSet.field_o = new int[2 * param1];
          }
          if (lm.field_i == null ||
            !(param1 <= lm.field_i.length)) {
            lm.field_i = new int[2 * param1];
          }
          if (param0 > -10) {
            field_E = '_';
          }
          if (ki.field_r == null ||
            !(param1 + param2 <= ki.field_r.length)) {
            ki.field_r = new int[2 * (param1 + param2)];
          }
          if (wh.field_e == null ||
            !(wh.field_e.length >= param1)) {
            wh.field_e = new boolean[2 * param1];
          }
        } else {
          if (Battle.field_z.length < param1) {
            Battle.field_z = new int[param1 * 2];
            if (null == ConditionalTextValue.field_e) {
              ConditionalTextValue.field_e = new int[2 * param1];
              if (CachedArchiveProvider.field_u == null ||
                !(param1 <= CachedArchiveProvider.field_u.length)) {
                CachedArchiveProvider.field_u = new int[param1 * 2];
              }
              if (PatchEnvelopeSet.field_o == null ||
                !(param1 <= PatchEnvelopeSet.field_o.length)) {
                PatchEnvelopeSet.field_o = new int[2 * param1];
              }
              if (lm.field_i == null ||
                !(param1 <= lm.field_i.length)) {
                lm.field_i = new int[2 * param1];
              }
              if (param0 > -10) {
                field_E = '_';
              }
              if (ki.field_r == null ||
                !(param1 + param2 <= ki.field_r.length)) {
                ki.field_r = new int[2 * (param1 + param2)];
              }
              if (wh.field_e == null ||
                !(wh.field_e.length >= param1)) {
                wh.field_e = new boolean[2 * param1];
              }
            } else {
              if (param1 > ConditionalTextValue.field_e.length) {
                ConditionalTextValue.field_e = new int[2 * param1];
              }
              if (CachedArchiveProvider.field_u == null ||
                !(param1 <= CachedArchiveProvider.field_u.length)) {
                CachedArchiveProvider.field_u = new int[param1 * 2];
              }
              if (PatchEnvelopeSet.field_o == null ||
                !(param1 <= PatchEnvelopeSet.field_o.length)) {
                PatchEnvelopeSet.field_o = new int[2 * param1];
              }
              if (lm.field_i == null ||
                !(param1 <= lm.field_i.length)) {
                lm.field_i = new int[2 * param1];
              }
              if (param0 > -10) {
                field_E = '_';
              }
              if (ki.field_r == null ||
                !(param1 + param2 <= ki.field_r.length)) {
                ki.field_r = new int[2 * (param1 + param2)];
              }
              if (wh.field_e == null ||
                !(wh.field_e.length >= param1)) {
                wh.field_e = new boolean[2 * param1];
              }
            }
          } else {
            if (null == ConditionalTextValue.field_e ||
              !(param1 <= ConditionalTextValue.field_e.length)) {
              ConditionalTextValue.field_e = new int[2 * param1];
            }
            if (CachedArchiveProvider.field_u == null ||
              !(param1 <= CachedArchiveProvider.field_u.length)) {
              CachedArchiveProvider.field_u = new int[param1 * 2];
            }
            if (PatchEnvelopeSet.field_o == null) {
              PatchEnvelopeSet.field_o = new int[2 * param1];
              if (lm.field_i == null ||
                !(param1 <= lm.field_i.length)) {
                lm.field_i = new int[2 * param1];
              }
              if (param0 > -10) {
                field_E = '_';
                if (ki.field_r == null ||
                  !(param1 + param2 <= ki.field_r.length)) {
                  ki.field_r = new int[2 * (param1 + param2)];
                }
                if (wh.field_e == null ||
                  !(wh.field_e.length >= param1)) {
                  wh.field_e = new boolean[2 * param1];
                }
              } else {
                if (ki.field_r == null) {
                  ki.field_r = new int[2 * (param1 + param2)];
                  if (wh.field_e == null ||
                    !(wh.field_e.length >= param1)) {
                    wh.field_e = new boolean[2 * param1];
                  }
                } else {
                  if (param1 + param2 <= ki.field_r.length) {
                    if (wh.field_e == null ||
                      !(wh.field_e.length >= param1)) {
                      wh.field_e = new boolean[2 * param1];
                    }
                  } else {
                    ki.field_r = new int[2 * (param1 + param2)];
                    if (wh.field_e == null ||
                      !(wh.field_e.length >= param1)) {
                      wh.field_e = new boolean[2 * param1];
                    }
                  }
                }
              }
            } else {
              if (param1 > PatchEnvelopeSet.field_o.length) {
                PatchEnvelopeSet.field_o = new int[2 * param1];
                if (lm.field_i == null ||
                  !(param1 <= lm.field_i.length)) {
                  lm.field_i = new int[2 * param1];
                }
                if (param0 > -10) {
                  field_E = '_';
                }
                if (ki.field_r == null) {
                  ki.field_r = new int[2 * (param1 + param2)];
                  if (wh.field_e == null ||
                    !(wh.field_e.length >= param1)) {
                    wh.field_e = new boolean[2 * param1];
                  }
                } else {
                  if (param1 + param2 <= ki.field_r.length) {
                    if (wh.field_e == null ||
                      !(wh.field_e.length >= param1)) {
                      wh.field_e = new boolean[2 * param1];
                    }
                  } else {
                    ki.field_r = new int[2 * (param1 + param2)];
                    if (wh.field_e == null ||
                      !(wh.field_e.length >= param1)) {
                      wh.field_e = new boolean[2 * param1];
                    }
                  }
                }
              } else {
                if (lm.field_i == null ||
                  !(param1 <= lm.field_i.length)) {
                  lm.field_i = new int[2 * param1];
                }
                if (param0 <= -10) {
                  if (ki.field_r == null) {
                    ki.field_r = new int[2 * (param1 + param2)];
                    if (wh.field_e == null ||
                      !(wh.field_e.length >= param1)) {
                      wh.field_e = new boolean[2 * param1];
                    }
                  } else {
                    if (param1 + param2 <= ki.field_r.length) {
                      if (wh.field_e == null ||
                        !(wh.field_e.length >= param1)) {
                        wh.field_e = new boolean[2 * param1];
                      }
                    } else {
                      ki.field_r = new int[2 * (param1 + param2)];
                      if (wh.field_e == null ||
                        !(wh.field_e.length >= param1)) {
                        wh.field_e = new boolean[2 * param1];
                      }
                    }
                  }
                } else {
                  field_E = '_';
                  if (ki.field_r == null) {
                    ki.field_r = new int[2 * (param1 + param2)];
                    if (wh.field_e == null ||
                      !(wh.field_e.length >= param1)) {
                      wh.field_e = new boolean[2 * param1];
                    }
                  } else {
                    if (param1 + param2 <= ki.field_r.length) {
                      if (wh.field_e == null ||
                        !(wh.field_e.length >= param1)) {
                        wh.field_e = new boolean[2 * param1];
                      }
                    } else {
                      ki.field_r = new int[2 * (param1 + param2)];
                      if (wh.field_e == null ||
                        !(wh.field_e.length >= param1)) {
                        wh.field_e = new boolean[2 * param1];
                      }
                    }
                  }
                }
              }
            }
          }
        }
        MouseInputHandler.field_b = 0;
        qa.field_m = -2147483648;
        tm.field_g = -2147483648;
        AlternateUsernameCredentials.field_m = 2147483647;
        ao.field_g = 2147483647;
    }

    public static void releaseStatics(int param0) {
        if (param0 < -88) {
          field_H = null;
          field_J = null;
          field_L = null;
          return;
        }
        field_L = (String) null;
        field_H = null;
        field_J = null;
        field_L = null;
    }

    final void refreshChildLayout(byte param0) {
        super.refreshChildLayout(param0);
        this.field_B.setBounds(this.field_k, 0, this.field_v, 0, -90);
        this.field_M = this.field_n;
        this.field_G = this.field_j;
    }

    final void handlePointerRelease(int param0, int param1, int param2, int param3, int param4, UiComponent param5) {
        try {
          super.handlePointerRelease(param0, param1, param2, param3, param4, param5);
          this.field_t = 0;
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "se.IA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    DraggableWidget(int param0, int param1, int param2, int param3, WidgetPainter param4, UiListener param5, UiComponent param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_M = 2147483647;
        this.field_G = 2147483647;
        try {
          this.field_K = param7 ? true : false;
          this.field_N = param8 ? true : false;
          this.field_B = param6;
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "se.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final StringBuilder appendDebugTree(StringBuilder param0, int param1, Hashtable param2, byte param3) {
        StringBuilder discarded$64 = null;
        StringBuilder discarded$65 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.beginDebugEntry(param0, (byte) -90, param2, param1)) {
            this.appendDebugSummary(param0, param1, param2, 1);
            this.appendDebugChild(0, param2, param0, param1);
            discarded$64 = param0.append(" revert=").append(this.field_K);
            if (2147483647 != this.field_M &&
              this.field_G != 2147483647) {
              discarded$65 = param0.append(" to ").append(this.field_M).append(',').append(this.field_G);
            }
          }
          var5_int = -77 % ((50 - param3) / 60);
          stackIn_6_0 = (StringBuilder) (param0);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("se.FA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_I = -1;
        field_E = '/';
        field_L = "Accept <%0> into this game";
        field_J = "Main Menu";
    }
}
