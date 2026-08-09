/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sl {
    static int[] field_a;
    static boolean field_c;
    private static sl field_e;
    private java.util.zip.Inflater field_f;
    static int field_b;
    static th field_d;

    public sl() {
        this(-1, 1000000, 1000000);
    }

    public static void a(int param0) {
        java.awt.Component var2;
        if (param0 > -115) {
          var2 = (java.awt.Component) null;
          sl.a((java.awt.Component) null, (byte) 78);
          field_d = null;
          field_a = null;
          field_e = null;
          return;
        } else {
          field_d = null;
          field_a = null;
          field_e = null;
          return;
        }
    }

    final static void a(int param0, byte param1) {
        ta var5 = null;
        int var4 = stellarshard.field_B;
        try {
            var5 = (ta) ((Object) eg.field_b.b(-86));
            while (var5 != null) {
                fb.a(param0, (byte) -118, var5);
                var5 = (ta) ((Object) eg.field_b.b((byte) 55));
            }
            int var3 = -66 % ((param1 - 25) / 54);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "sl.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static byte[] a(byte param0, byte[] param1) {
        byte[] stackIn_9_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        String[] var9 = null;
        ka var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        try {
          L0: {
            L1: {
              var10 = new ka(param1);
              var3 = var10.f(4);
              if (param0 < -57) {
                break L1;
              } else {
                var9 = (String[]) null;
                sl.a((String) null, 44, (byte) -44, (String[]) null);
                break L1;
              }
            }
            L2: {
              var4 = var10.b(false);
              if (-1 < (var4 ^ -1)) {
                break L2;
              } else {
                L3: {
                  if (0 == of.field_B) {
                    break L3;
                  } else {
                    if (var4 <= of.field_B) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                if (var3 != 0) {
                  L4: {
                    var5 = var10.b(false);
                    if (var5 < 0) {
                      break L4;
                    } else {
                      L5: {
                        if (-1 == (of.field_B ^ -1)) {
                          break L5;
                        } else {
                          if (of.field_B >= var5) {
                            break L5;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L6: {
                        var14 = new byte[var5];
                        var12 = var14;
                        var6 = var12;
                        if (-2 == (var3 ^ -1)) {
                          j.a(var14, var5, param1, var4, 9);
                          break L6;
                        } else {
                          var7 = field_e;
                          synchronized (var7) {
                            L7: {
                              field_e.a(-1, var14, var10);
                              break L7;
                            }
                          }
                          break L6;
                        }
                      }
                      stackIn_23_0 = (byte[]) (var6);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                } else {
                  var13 = new byte[var4];
                  var11 = var13;
                  var5_ref_byte__ = var11;
                  var10.a(0, (byte) -118, var4, var13);
                  stackIn_9_0 = (byte[]) (var5_ref_byte__);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("sl.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_23_0;
        }
    }

    final static void a(String param0, int param1, byte param2, String[] param3) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String[] var6 = null;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = stellarshard.field_B;
        try {
          L0: {
            el.field_E = ta.field_m;
            if (param2 < -15) {
              if ((param1 ^ -1) == -256) {
                L1: {
                  if (u.field_k >= 13) {
                    stackIn_13_0 = 0;
                    break L1;
                  } else {
                    stackIn_13_0 = 1;
                    break L1;
                  }
                }
                ed.field_d = dg.a(stackIn_13_0 != 0, 0);
                var6 = (String[]) null;
                mk.a((String[]) null, true);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if ((param1 ^ -1) > -101) {
                  ed.field_d = fb.a(param1, true, param0);
                  return;
                } else {
                  if ((param1 ^ -1) >= -106) {
                    var4 = param3;
                    mk.a(var4, true);
                    ed.field_d = gj.a(true, param3);
                    return;
                  } else {
                    ed.field_d = fb.a(param1, true, param0);
                    return;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4_ref);

            stackIn_17_1 = new StringBuilder().append("sl.A(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, byte[] param1, ka param2) {
        try {
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            StringBuilder stackIn_19_1 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            RuntimeException var4_ref = null;
            try {
              L0: {
                L1: {
                  if (-32 != (param2.field_r[param2.field_k] ^ -1)) {
                    break L1;
                  } else {
                    if ((param2.field_r[param2.field_k - -1] ^ -1) != 116) {
                      break L1;
                    } else {
                      L2: {
                        if (this.field_f == null) {
                          this.field_f = new java.util.zip.Inflater(true);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      try {
                        L3: {
                          this.field_f.setInput(param2.field_r, param2.field_k - -10, -10 - param2.field_k - (8 - param2.field_r.length));
                          if (param0 == -1) {
                            this.field_f.inflate(param1);
                            decompiledRegionSelector0 = 1;
                            break L3;
                          } else {
                            decompiledRegionSelector0 = 0;
                            break L3;
                          }
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var4 = (Exception) (Object) decompiledCaughtException;
                        this.field_f.reset();
                        throw new RuntimeException("");
                      }
                      if (decompiledRegionSelector0 == 0) {
                        decompiledRegionSelector1 = 0;
                        break L0;
                      } else {
                        this.field_f.reset();
                        decompiledRegionSelector1 = 1;
                        break L0;
                      }
                    }
                  }
                }
                throw new RuntimeException("");
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_16_0 = (RuntimeException) (var4_ref);

                stackIn_16_1 = new StringBuilder().append("sl.E(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "null";
                  break L4;
                } else {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

                if (param2 == null) {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "null";
                  break L5;
                } else {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "{...}";
                  break L5;
                }
              }
              throw ma.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        wd.field_c = false;
        if (param0 != 51) {
            field_b = -49;
            ae.field_N.f(4);
            return;
        }
        ae.field_N.f(4);
    }

    final static void a(java.awt.Component param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param0.removeMouseListener(sf.field_c);
              param0.removeMouseMotionListener(sf.field_c);
              param0.removeFocusListener(sf.field_c);
              ib.field_g = 0;
              if (param1 >= 89) {
                break L1;
              } else {
                field_c = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("sl.F(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    private sl(int param0, int param1, int param2) {
    }

    static {
        field_a = new int[12];
        field_e = new sl();
        field_b = 0;
    }
}
