/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ej extends eb {
    private long field_P;
    private int field_L;
    static int field_V;
    static String field_R;
    static String field_N;
    private boolean field_W;
    private long field_Q;
    private int field_T;
    private boolean field_O;
    private int field_K;
    private int field_U;
    static jh field_M;
    static int field_S;

    private final void a(byte param0, int param1) {
        ((ej) this).field_K = param1;
        if (!(bh.field_e[81])) {
            ((ej) this).field_T = ((ej) this).field_K;
        }
    }

    private final void g(int param0) {
        if (param0 != -18369) {
          field_M = null;
          this.h(-1);
          this.i((byte) 71);
          return;
        } else {
          this.h(-1);
          this.i((byte) 71);
          return;
        }
    }

    public static void m(int param0) {
        field_R = null;
        field_N = null;
        field_M = null;
    }

    final static String f(byte param0) {
        if (param0 != -30) {
            String discarded$0 = ej.g((byte) -11);
            return fg.field_e;
        }
        return fg.field_e;
    }

    private final void a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (((ej) this).field_U != -1) {
                var3_int = ((ej) this).field_U + -((ej) this).field_o.length();
                if (var3_int >= 0) {
                  return;
                } else {
                  param0 = param0.substring(0, var3_int);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (((ej) this).field_K != ((ej) this).field_o.length()) {
                ((ej) this).field_o = ((ej) this).field_o.substring(0, ((ej) this).field_K) + param0 + ((ej) this).field_o.substring(((ej) this).field_K, ((ej) this).field_o.length());
                break L2;
              } else {
                ((ej) this).field_o = ((ej) this).field_o + param0;
                break L2;
              }
            }
            ((ej) this).field_K = ((ej) this).field_K + param0.length();
            ((ej) this).field_T = ((ej) this).field_K;
            ((ej) this).i(124);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("ej.AA(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + -3 + ')');
        }
    }

    void i(int param0) {
        L0: {
          if (((ej) this).field_r instanceof pa) {
            ((pa) (Object) ((ej) this).field_r).a((ej) this, (byte) 83);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 < 121) {
          String discarded$2 = ej.f((byte) 77);
          return;
        } else {
          return;
        }
    }

    private final void n(int param0) {
        if (((ej) this).field_r instanceof pa) {
            ((pa) (Object) ((ej) this).field_r).a((ej) this, false);
            return;
        }
    }

    final static void a(int param0, int param1, dh param2, int param3, int param4) {
        try {
            param2.i(12, -19);
            param2.h(-1564407352, 17);
            param2.h(-1564407352, param0);
            param2.h(-1564407352, param4);
            param2.i(param3, 24);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "ej.G(" + param0 + ',' + -25563 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void j(byte param0) {
        ld var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        w var9 = null;
        var8 = Terraphoenix.field_V;
        if (((ej) this).field_W) {
          if (!(((ej) this).field_l instanceof w)) {
            return;
          } else {
            var9 = (w) (Object) ((ej) this).field_l;
            var3 = var9.a((gl) this, -19302);
            var4 = var3.b(0);
            var5 = var9.a(28889, (gl) this);
            var6 = var9.a(8233) >> 1;
            if (var5 - var6 <= var4) {
              var7 = ((ej) this).field_y + var3.a(((ej) this).field_K, 0);
              if (var5 - var6 >= var7) {
                if (var7 < var6) {
                  ((ej) this).field_y = var6 - (var7 - ((ej) this).field_y);
                  if (((ej) this).field_y <= 0) {
                    if (((ej) this).field_y < -var5 - -var6) {
                      ((ej) this).field_y = var6 + -var5;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((ej) this).field_y = 0;
                    return;
                  }
                } else {
                  if (((ej) this).field_y <= 0) {
                    if (((ej) this).field_y >= -var5 - -var6) {
                      return;
                    } else {
                      ((ej) this).field_y = var6 + -var5;
                      return;
                    }
                  } else {
                    ((ej) this).field_y = 0;
                    return;
                  }
                }
              } else {
                ((ej) this).field_y = ((ej) this).field_y - (var7 + (-var5 - -var6));
                if (((ej) this).field_y <= 0) {
                  if (((ej) this).field_y >= -var5 - -var6) {
                    return;
                  } else {
                    ((ej) this).field_y = var6 + -var5;
                    return;
                  }
                } else {
                  ((ej) this).field_y = 0;
                  return;
                }
              }
            } else {
              ((ej) this).field_y = 0;
              ((ej) this).field_v = 0;
              return;
            }
          }
        } else {
          ((ej) this).field_v = 0;
          ((ej) this).field_y = 0;
          return;
        }
    }

    private final void i(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = -110 % ((param0 - -9) / 63);
        if (!(((ej) this).field_T == ((ej) this).field_K)) {
            var3 = ((ej) this).field_T >= ((ej) this).field_K ? ((ej) this).field_K : ((ej) this).field_T;
            var4 = ((ej) this).field_K > ((ej) this).field_T ? ((ej) this).field_K : ((ej) this).field_T;
            ((ej) this).field_K = var3;
            ((ej) this).field_T = var3;
            ((ej) this).field_o = ((ej) this).field_o.substring(0, var3) + ((ej) this).field_o.substring(var4, ((ej) this).field_o.length());
            ((ej) this).i(126);
        }
    }

    private final String j(int param0) {
        int var2 = ((ej) this).field_T < ((ej) this).field_K ? ((ej) this).field_T : ((ej) this).field_K;
        int var3 = ((ej) this).field_T < ((ej) this).field_K ? ((ej) this).field_K : ((ej) this).field_T;
        return ((ej) this).field_o.substring(var2, var3);
    }

    private final int o(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Terraphoenix.field_V;
        var2 = ((ej) this).field_o.length();
        if (var2 != ((ej) this).field_K) {
          var3 = ((ej) this).field_K + 1;
          L0: while (true) {
            if (var2 > var3) {
              if (((ej) this).field_o.charAt(var3 + -1) != 32) {
                var3++;
                continue L0;
              } else {
                return var3;
              }
            } else {
              return var3;
            }
          }
        } else {
          return ((ej) this).field_K;
        }
    }

    final void a(boolean param0, byte param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == null) {
                param2 = "";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((ej) this).field_o = param2;
              var4_int = param2.length();
              if (-1 == ((ej) this).field_U) {
                break L2;
              } else {
                if (((ej) this).field_U < var4_int) {
                  ((ej) this).field_o = ((ej) this).field_o.substring(0, ((ej) this).field_U);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param1 < -117) {
                break L3;
              } else {
                field_S = -91;
                break L3;
              }
            }
            int dupTemp$2 = ((ej) this).field_o.length();
            ((ej) this).field_T = dupTemp$2;
            ((ej) this).field_K = dupTemp$2;
            if (!param0) {
              ((ej) this).i(122);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("ej.S(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    private final void h(int param0) {
        String var2 = this.j(-18031);
        if (!(~var2.length() >= param0)) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.j(-18031)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    void a(gl param0, int param1, int param2, int param3) {
        w var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            super.a(param0, param1, param2, 86);
            this.j((byte) 105);
            if (((ej) this).field_j == 1) {
              L1: {
                if (!(((ej) this).field_l instanceof w)) {
                  break L1;
                } else {
                  var5 = (w) (Object) ((ej) this).field_l;
                  var6 = var5.a(ef.field_j, -3477, jb.field_b, (gl) this, param1, param2);
                  if (var6 != -1) {
                    L2: {
                      if (!((ej) this).field_O) {
                        break L2;
                      } else {
                        if (var6 >= ((ej) this).field_L) {
                          break L2;
                        } else {
                          if (((ej) this).field_T >= var6) {
                            break L2;
                          } else {
                            var6 = ((ej) this).field_L;
                            break L2;
                          }
                        }
                      }
                    }
                    ((ej) this).field_K = var6;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              ((ej) this).field_P = ll.a(1000);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5_ref;
            stackOut_12_1 = new StringBuilder().append("ej.B(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + 77 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        long var6 = 0L;
        w var8 = null;
        if (((ej) this).field_l != null) {
          if (param2 == 0) {
            ((ej) this).field_l.a(param3, (gl) this, param0, -24381, ((ej) this).field_A);
            if (((ej) this).field_l instanceof w) {
              L0: {
                var8 = (w) (Object) ((ej) this).field_l;
                if (((ej) this).field_K != ((ej) this).field_T) {
                  var8.b(0, param3, param0, (gl) this, ((ej) this).field_K, ((ej) this).field_T);
                  break L0;
                } else {
                  break L0;
                }
              }
              var6 = ll.a(1000);
              if ((var6 - ((ej) this).field_P) % 1000L >= 500L) {
                if (param1 >= -106) {
                  ((ej) this).field_T = -91;
                  return;
                } else {
                  return;
                }
              } else {
                var8.a(((ej) this).field_K, param3, (gl) this, param0, -32135);
                if (param1 >= -106) {
                  ((ej) this).field_T = -91;
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param1 >= -106) {
                ((ej) this).field_T = -91;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param1 < -106) {
              return;
            } else {
              ((ej) this).field_T = -91;
              return;
            }
          }
        } else {
          if (param1 >= -106) {
            ((ej) this).field_T = -91;
            return;
          } else {
            return;
          }
        }
    }

    private final void h(byte param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var3 = 0;
                var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                this.i((byte) -91);
                this.a(var2, (byte) -3);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ej(String param0, sc param1, int param2) {
        super(param0, param1);
        ((ej) this).field_L = -1;
        ((ej) this).field_O = false;
        ((ej) this).field_Q = 0L;
        try {
            ((ej) this).field_l = vc.field_c.field_i;
            ((ej) this).field_U = param2;
            ((ej) this).a(true, (byte) -120, param0);
            ((ej) this).field_W = true;
            ((ej) this).field_P = ll.a(1000);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "ej.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void k(int param0) {
        Object var3 = null;
        ((ej) this).field_o = "";
        ((ej) this).field_K = 0;
        ((ej) this).field_T = 0;
        if (param0 != -1) {
          var3 = null;
          boolean discarded$2 = ((ej) this).a(false, 4, -51, -52, -78, (gl) null, 121);
          ((ej) this).i(122);
          return;
        } else {
          ((ej) this).i(122);
          return;
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        try {
            if (param0 != -12966) {
                String discarded$0 = ej.g((byte) -119);
            }
            if (!(11 != q.field_Jb)) {
                ta.a(54);
            }
            pg.a(ed.field_d, da.field_f, ad.field_e, 101);
            ia.a(0, param1, 0, (byte) 116);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "ej.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4, gl param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
                break L1;
              } else {
                if (((ej) this).field_l instanceof w) {
                  L2: {
                    var8_int = ((w) (Object) ((ej) this).field_l).a(ef.field_j, -3477, jb.field_b, (gl) this, param2, param3);
                    stackOut_3_0 = this;
                    stackOut_3_1 = 19;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var8_int != -1) {
                      stackOut_5_0 = this;
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = var8_int;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      stackIn_6_2 = stackOut_5_2;
                      break L2;
                    } else {
                      stackOut_4_0 = this;
                      stackOut_4_1 = stackIn_4_1;
                      stackOut_4_2 = 0;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      stackIn_6_2 = stackOut_4_2;
                      break L2;
                    }
                  }
                  L3: {
                    this.a((byte) stackIn_6_1, stackIn_6_2);
                    var8_long = ll.a(1000);
                    stackOut_6_0 = this;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (250L <= -((ej) this).field_Q + var8_long) {
                      stackOut_8_0 = this;
                      stackOut_8_1 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      break L3;
                    } else {
                      stackOut_7_0 = this;
                      stackOut_7_1 = 1;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      break L3;
                    }
                  }
                  L4: {
                    ((ej) this).field_O = stackIn_9_1 != 0;
                    if (((ej) this).field_O) {
                      L5: {
                        ((ej) this).field_T = this.l(-1);
                        ((ej) this).field_K = this.o(1);
                        if (((ej) this).field_K <= 0) {
                          break L5;
                        } else {
                          if (32 == ((ej) this).field_o.charAt(((ej) this).field_K + -1)) {
                            ((ej) this).field_K = ((ej) this).field_K - 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      ((ej) this).field_L = ((ej) this).field_K;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ((ej) this).field_Q = var8_long;
                  stackOut_16_0 = 1;
                  stackIn_17_0 = stackOut_16_0;
                  return stackIn_17_0 != 0;
                } else {
                  break L1;
                }
              }
            }
            if (!param0) {
              stackOut_21_0 = 0;
              stackIn_22_0 = stackOut_21_0;
              break L0;
            } else {
              stackOut_19_0 = 0;
              stackIn_20_0 = stackOut_19_0;
              return stackIn_20_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var8;
            stackOut_23_1 = new StringBuilder().append("ej.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param5 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param6 + ')');
        }
        return stackIn_22_0 != 0;
    }

    private final int l(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Terraphoenix.field_V;
        if (((ej) this).field_K != 0) {
          var2 = ((ej) this).field_K + -1;
          L0: while (true) {
            if (0 < var2) {
              if (((ej) this).field_o.charAt(var2 - 1) != 32) {
                var2--;
                continue L0;
              } else {
                return var2;
              }
            } else {
              return var2;
            }
          }
        } else {
          return ((ej) this).field_K;
        }
    }

    final static String g(byte param0) {
        if (kj.field_f == null) {
            return "";
        }
        int var1 = -71 / ((67 - param0) / 55);
        return kj.field_f;
    }

    final boolean a(char param0, gl param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        int stackIn_39_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_62_0 = 0;
        Object stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        Object stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        Object stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        int stackIn_68_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_70_0 = 0;
        Object stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        Object stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        int stackOut_66_2 = 0;
        Object stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        int stackOut_65_2 = 0;
        int stackOut_67_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_43_0 = 0;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        int stackOut_38_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_76_0 = 0;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        try {
          L0: {
            ((ej) this).field_P = ll.a(1000);
            if (60 == param0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (param0 != 62) {
                L1: {
                  if (param2 == 30) {
                    break L1;
                  } else {
                    this.h(121);
                    break L1;
                  }
                }
                L2: {
                  if (param0 < 32) {
                    break L2;
                  } else {
                    if (param0 > 126) {
                      break L2;
                    } else {
                      L3: {
                        if (((ej) this).field_T == ((ej) this).field_K) {
                          break L3;
                        } else {
                          this.i((byte) 62);
                          break L3;
                        }
                      }
                      L4: {
                        L5: {
                          if (((ej) this).field_U == -1) {
                            break L5;
                          } else {
                            if (((ej) this).field_o.length() < ((ej) this).field_U) {
                              break L5;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L6: {
                          if (((ej) this).field_K < ((ej) this).field_o.length()) {
                            ((ej) this).field_o = ((ej) this).field_o.substring(0, ((ej) this).field_K) + param0 + ((ej) this).field_o.substring(((ej) this).field_K, ((ej) this).field_o.length());
                            ((ej) this).field_K = ((ej) this).field_K + 1;
                            ((ej) this).field_T = ((ej) this).field_K;
                            break L6;
                          } else {
                            ((ej) this).field_o = ((ej) this).field_o + param0;
                            int dupTemp$1 = ((ej) this).field_o.length();
                            ((ej) this).field_K = dupTemp$1;
                            ((ej) this).field_T = dupTemp$1;
                            break L6;
                          }
                        }
                        ((ej) this).i(127);
                        break L4;
                      }
                      stackOut_18_0 = 1;
                      stackIn_19_0 = stackOut_18_0;
                      return stackIn_19_0 != 0;
                    }
                  }
                }
                L7: {
                  if (param3 == 85) {
                    if (~((ej) this).field_K == ~((ej) this).field_T) {
                      if (((ej) this).field_K > 0) {
                        ((ej) this).field_T = ((ej) this).field_K - 1;
                        this.i((byte) 72);
                        stackOut_74_0 = 1;
                        stackIn_75_0 = stackOut_74_0;
                        return stackIn_75_0 != 0;
                      } else {
                        break L7;
                      }
                    } else {
                      this.i((byte) -82);
                      stackOut_70_0 = 1;
                      stackIn_71_0 = stackOut_70_0;
                      return stackIn_71_0 != 0;
                    }
                  } else {
                    if (param3 != 101) {
                      if (param3 != 13) {
                        if (param3 != 96) {
                          if (param3 == 97) {
                            if (~((ej) this).field_K <= ~((ej) this).field_o.length()) {
                              break L7;
                            } else {
                              L8: {
                                stackOut_64_0 = this;
                                stackOut_64_1 = 19;
                                stackIn_66_0 = stackOut_64_0;
                                stackIn_66_1 = stackOut_64_1;
                                stackIn_65_0 = stackOut_64_0;
                                stackIn_65_1 = stackOut_64_1;
                                if (bh.field_e[82]) {
                                  stackOut_66_0 = this;
                                  stackOut_66_1 = stackIn_66_1;
                                  stackOut_66_2 = this.o(1);
                                  stackIn_67_0 = stackOut_66_0;
                                  stackIn_67_1 = stackOut_66_1;
                                  stackIn_67_2 = stackOut_66_2;
                                  break L8;
                                } else {
                                  stackOut_65_0 = this;
                                  stackOut_65_1 = stackIn_65_1;
                                  stackOut_65_2 = 1 + ((ej) this).field_K;
                                  stackIn_67_0 = stackOut_65_0;
                                  stackIn_67_1 = stackOut_65_1;
                                  stackIn_67_2 = stackOut_65_2;
                                  break L8;
                                }
                              }
                              this.a((byte) stackIn_67_1, stackIn_67_2);
                              stackOut_67_0 = 1;
                              stackIn_68_0 = stackOut_67_0;
                              return stackIn_68_0 != 0;
                            }
                          } else {
                            if (param3 == 102) {
                              this.a((byte) 19, 0);
                              stackOut_61_0 = 1;
                              stackIn_62_0 = stackOut_61_0;
                              return stackIn_62_0 != 0;
                            } else {
                              if (param3 != 103) {
                                if (param3 != 84) {
                                  L9: {
                                    if (!bh.field_e[82]) {
                                      break L9;
                                    } else {
                                      if (param3 == 65) {
                                        this.g(param2 ^ -18399);
                                        stackOut_59_0 = 1;
                                        stackIn_60_0 = stackOut_59_0;
                                        return stackIn_60_0 != 0;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  L10: {
                                    if (!bh.field_e[82]) {
                                      break L10;
                                    } else {
                                      if (param3 != 66) {
                                        break L10;
                                      } else {
                                        this.h(param2 + -31);
                                        stackOut_53_0 = 1;
                                        stackIn_54_0 = stackOut_53_0;
                                        return stackIn_54_0 != 0;
                                      }
                                    }
                                  }
                                  if (!bh.field_e[82]) {
                                    break L7;
                                  } else {
                                    if (67 != param3) {
                                      break L7;
                                    } else {
                                      this.h((byte) -85);
                                      stackOut_57_0 = 1;
                                      stackIn_58_0 = stackOut_57_0;
                                      return stackIn_58_0 != 0;
                                    }
                                  }
                                } else {
                                  this.n(-79);
                                  stackOut_46_0 = 1;
                                  stackIn_47_0 = stackOut_46_0;
                                  return stackIn_47_0 != 0;
                                }
                              } else {
                                this.a((byte) 19, ((ej) this).field_o.length());
                                stackOut_43_0 = 1;
                                stackIn_44_0 = stackOut_43_0;
                                return stackIn_44_0 != 0;
                              }
                            }
                          }
                        } else {
                          if (((ej) this).field_K > 0) {
                            L11: {
                              stackOut_35_0 = this;
                              stackOut_35_1 = 19;
                              stackIn_37_0 = stackOut_35_0;
                              stackIn_37_1 = stackOut_35_1;
                              stackIn_36_0 = stackOut_35_0;
                              stackIn_36_1 = stackOut_35_1;
                              if (!bh.field_e[82]) {
                                stackOut_37_0 = this;
                                stackOut_37_1 = stackIn_37_1;
                                stackOut_37_2 = -1 + ((ej) this).field_K;
                                stackIn_38_0 = stackOut_37_0;
                                stackIn_38_1 = stackOut_37_1;
                                stackIn_38_2 = stackOut_37_2;
                                break L11;
                              } else {
                                stackOut_36_0 = this;
                                stackOut_36_1 = stackIn_36_1;
                                stackOut_36_2 = this.l(-1);
                                stackIn_38_0 = stackOut_36_0;
                                stackIn_38_1 = stackOut_36_1;
                                stackIn_38_2 = stackOut_36_2;
                                break L11;
                              }
                            }
                            this.a((byte) stackIn_38_1, stackIn_38_2);
                            stackOut_38_0 = 1;
                            stackIn_39_0 = stackOut_38_0;
                            return stackIn_39_0 != 0;
                          } else {
                            break L7;
                          }
                        }
                      } else {
                        ((ej) this).k(-1);
                        stackOut_30_0 = 1;
                        stackIn_31_0 = stackOut_30_0;
                        return stackIn_31_0 != 0;
                      }
                    } else {
                      if (~((ej) this).field_T == ~((ej) this).field_K) {
                        if (~((ej) this).field_K > ~((ej) this).field_o.length()) {
                          ((ej) this).field_T = ((ej) this).field_K + 1;
                          this.i((byte) -102);
                          stackOut_27_0 = 1;
                          stackIn_28_0 = stackOut_27_0;
                          return stackIn_28_0 != 0;
                        } else {
                          break L7;
                        }
                      } else {
                        this.i((byte) -102);
                        stackOut_23_0 = 1;
                        stackIn_24_0 = stackOut_23_0;
                        return stackIn_24_0 != 0;
                      }
                    }
                  }
                }
                stackOut_76_0 = 0;
                stackIn_77_0 = stackOut_76_0;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) var5;
            stackOut_78_1 = new StringBuilder().append("ej.K(").append(param0).append(',');
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param1 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L12;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L12;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_77_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_V = 162;
        field_R = "Waiting for levels";
        field_N = "Confirm Password: ";
    }
}
