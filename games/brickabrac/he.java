/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class he extends ib implements en {
    static oh field_H;
    private d field_K;
    private d field_I;
    static String[] field_L;
    private d field_J;

    final static ff a(long param0, int param1, boolean param2, String param3, String param4) {
        RuntimeException var6 = null;
        String var7 = null;
        cm stackIn_7_0 = null;
        eb stackIn_9_0 = null;
        bo stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 20) {
                break L1;
              } else {
                var7 = (String) null;
                he.a(-13L, 34, false, (String) null, (String) null);
                break L1;
              }
            }
            L2: {
              if (0L != param0) {
                break L2;
              } else {
                if (param4 != null) {
                  stackIn_9_0 = new eb(param4, param3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            if (!param2) {
              stackIn_11_0 = new bo(param0, param3);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_7_0 = new cm(param0, param3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("he.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ff) ((Object) stackIn_7_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ff) ((Object) stackIn_9_0);
          } else {
            return (ff) ((Object) stackIn_11_0);
          }
        }
    }

    public he() {
        super(0, 0, 476, 225, (ub) null);
        this.field_I = new d(bd.field_a, (uh) null);
        this.field_K = new d(se.field_l, (uh) null);
        this.field_J = new d(nd.field_d, (uh) null);
        hi var1 = new hi();
        this.field_I.field_l = (ub) ((Object) var1);
        this.field_K.field_l = (ub) ((Object) var1);
        this.field_J.field_l = (ub) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> -1520159551;
        this.field_K.a(30, this.field_t + -var3 >> -1577851231, this.field_s + (-48 + -var2), (byte) -119, var4);
        this.field_J.a(30, (-var3 + this.field_t >> 161111425) + (var4 - -var2), -var2 + (-48 + this.field_s), (byte) -119, var4);
        this.field_I.a(30, this.field_t - var3 >> -1089739839, this.field_s - (78 - -(var2 * 2)), (byte) -119, var3);
        this.field_K.field_i = (uh) (this);
        this.field_I.field_i = (uh) (this);
        this.field_I.field_z = ie.field_q;
        this.field_J.field_i = (uh) (this);
        this.field_J.field_z = wp.field_i;
        this.a(this.field_K, true);
        this.a(this.field_I, true);
        this.a(this.field_J, true);
    }

    final static void a(wq param0, byte param1) {
        try {
            RuntimeException runtimeException = null;
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            byte[] var7 = null;
            byte[] var8 = null;
            byte[] var9 = null;
            byte[] var10 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            String stackIn_22_2 = null;
            Throwable decompiledCaughtException = null;
            var5 = BrickABrac.field_J ? 1 : 0;
            try {
              L0: {
                L1: {
                  var9 = new byte[24];
                  var7 = var9;
                  var6 = var7;
                  var10 = var6;
                  var8 = var10;
                  var2 = var8;
                  if (go.field_a == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        go.field_a.a(0, 0L);
                        go.field_a.a(var9, (byte) -29);
                        var3_int = 0;
                        L3: while (true) {
                          L4: {
                            if (-25 >= (var3_int ^ -1)) {
                              break L4;
                            } else {
                              if ((var10[var3_int] ^ -1) == -1) {
                                var3_int++;
                                continue L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          if (-25 >= (var3_int ^ -1)) {
                            throw new IOException();
                          } else {
                            break L2;
                          }
                        }
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        var3 = (Exception) (Object) decompiledCaughtException;
                        var4 = 0;
                        L6: while (true) {
                          if (var4 >= 24) {
                            break L5;
                          } else {
                            var2[var4] = (byte)-1;
                            var4++;
                            continue L6;
                          }
                        }
                      }
                    }
                    break L1;
                  }
                }
                L7: {
                  if (param1 <= -41) {
                    break L7;
                  } else {
                    field_H = (oh) null;
                    break L7;
                  }
                }
                param0.a(var10, -1, 0, 24);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_21_0 = (RuntimeException) (runtimeException);

                stackIn_21_1 = new StringBuilder().append("he.B(");

                if (param0 == null) {
                  stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
                  stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackIn_22_2 = "null";
                  break L8;
                } else {
                  stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
                  stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackIn_22_2 = "{...}";
                  break L8;
                }
              }
              throw qb.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0, byte param1, oc param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (98 != param0) {
                if (99 != param0) {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_8_0 = this.a(param2, (byte) -116);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = this.b(param2, (byte) 117);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("he.T(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_10_0 != 0;
            }
          }
        }
    }

    final static String a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              if (20 < var2_int) {
                var2_int = 20;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var8 = new char[var2_int];
              var7 = var8;
              var3 = var7;
              if (param1 == -58) {
                break L2;
              } else {
                field_H = (oh) null;
                break L2;
              }
            }
            var4 = 0;
            L3: while (true) {
              if (var4 >= var2_int) {
                stackIn_21_0 = new String(var8);
                break L0;
              } else {
                L4: {
                  L5: {
                    var5 = param0.charAt(var4);
                    if (var5 < 65) {
                      break L5;
                    } else {
                      if (90 < var5) {
                        break L5;
                      } else {
                        var3[var4] = (char)(-65 + (var5 + 97));
                        break L4;
                      }
                    }
                  }
                  L6: {
                    L7: {
                      if (var5 < 97) {
                        break L7;
                      } else {
                        if (var5 <= 122) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (var5 < 48) {
                        break L8;
                      } else {
                        if (var5 > 57) {
                          break L8;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var3[var4] = (char)95;
                    break L4;
                  }
                  var3[var4] = (char)var5;
                  break L4;
                }
                var4++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("he.E(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        return stackIn_21_0;
    }

    public final void a(int param0, int param1, byte param2, int param3, d param4) {
        int var7 = 0;
        wq var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 <= -22) {
                break L1;
              } else {
                var8 = (wq) null;
                he.a((wq) null, (byte) -62);
                break L1;
              }
            }
            L2: {
              if (this.field_K == param4) {
                ee.d(-117);
                break L2;
              } else {
                if (this.field_I == param4) {
                  fr.d(-1);
                  break L2;
                } else {
                  if (param4 != this.field_J) {
                    break L2;
                  } else {
                    cc.f(967);
                    break L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var6);

            stackIn_12_1 = new StringBuilder().append("he.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    public static void a(byte param0) {
        field_H = null;
        if (param0 != 36) {
            field_H = (oh) null;
        }
        field_L = null;
    }

    final static void a(String param0, boolean param1, byte param2) {
        try {
            if (param2 <= 18) {
                field_H = (oh) null;
            }
            sm.field_b = oh.field_b;
            ln.field_k = param1 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "he.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = this.field_o + param1;
        int var6 = param0 + this.field_w;
        a.field_u.a(qo.field_H, var5 - -20, 20 + var6, this.field_t - 40, -50 + this.field_s, 16777215, -1, 1, 0, a.field_u.field_F);
        super.a(param0, param1, param2, param3);
    }

    static {
        field_L = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
