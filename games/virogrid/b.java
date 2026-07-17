/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b extends sh implements ta {
    private qh field_Ab;
    static long field_Gb;
    static mg field_Eb;
    static String field_Cb;
    private boolean field_Fb;
    private boolean field_Bb;
    static boolean field_Db;

    public final void a(int param0, tg param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (!((b) this).field_Bb) {
              L1: {
                ul.a(param0 + 3344);
                ((b) this).h(true);
                if (param0 == 12085) {
                  break L1;
                } else {
                  boolean discarded$2 = ((b) this).f(59);
                  break L1;
                }
              }
              break L0;
            } else {
              vc.a(true, false, -16113);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) runtimeException;
            stackOut_6_1 = new StringBuilder().append("b.L(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void l(int param0) {
        if (param0 >= -85) {
          ((b) this).field_Bb = false;
          this.a(lc.a(248, ma.field_d, 29493), true, 113);
          return;
        } else {
          this.a(lc.a(248, ma.field_d, 29493), true, 113);
          return;
        }
    }

    b(je param0, qh param1) {
        super(param0, on.field_b, aj.field_e, false, false);
        try {
            ((b) this).field_Ab = param1;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "b.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static mg[] a(String param0, eh param1, int param2, String param3) {
        mg[] var4 = null;
        RuntimeException var4_ref = null;
        mg[] var5 = null;
        mg[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        mg[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var5 = ke.a(32, param1, param0, param3);
            var4 = var5;
            var5[3].field_z = var5[3].field_p;
            var5[1].field_u = var5[1].field_w;
            var5[5].field_z = var5[5].field_p;
            var5[7].field_u = var5[7].field_w;
            stackOut_0_0 = (mg[]) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("b.RA(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(7).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_1_0;
    }

    public static void j() {
        field_Cb = null;
        field_Eb = null;
    }

    private final void a(ck param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        sf var5 = null;
        int var6 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              ((b) this).field_Fb = true;
              if (param2 > 97) {
                break L1;
              } else {
                ((b) this).field_Ab = null;
                break L1;
              }
            }
            L2: {
              if (param0.field_a) {
                var4_ref = ha.field_e;
                break L2;
              } else {
                if (param0.field_b == null) {
                  var4_ref = param0.field_e;
                  if (param0.field_g == 248) {
                    L3: {
                      if (!param1) {
                        int discarded$3 = 0;
                        mj.f();
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    ((b) this).field_Bb = true;
                    var4_ref = ma.field_d;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  var4_ref = dm.field_t;
                  if (null != ((b) this).field_Ab) {
                    ((b) this).field_Ab.a((byte) -72);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
            L4: {
              var5 = new sf((sh) this, on.field_b, var4_ref);
              if (!param0.field_a) {
                L5: {
                  if (((b) this).field_Bb) {
                    tg discarded$4 = var5.a((cd) this, 260, md.field_c);
                    break L5;
                  } else {
                    if (param0.field_g != 5) {
                      var5.a(-1, jl.field_D, (byte) 127);
                      break L5;
                    } else {
                      var5.a(11, rn.field_g, (byte) 126);
                      var5.a(17, og.field_k, (byte) 127);
                      break L5;
                    }
                  }
                }
                if (param0.field_g == 3) {
                  var5.a(7, qh.field_N, (byte) 127);
                  break L4;
                } else {
                  if (param0.field_g != 6) {
                    break L4;
                  } else {
                    var5.a(9, o.field_f, (byte) 126);
                    break L4;
                  }
                }
              } else {
                if (!param0.field_d) {
                  tg discarded$5 = var5.a((cd) this, 260, md.field_c);
                  break L4;
                } else {
                  ((b) this).b((fi) (Object) new ok((b) this), (byte) -53);
                  return;
                }
              }
            }
            ((b) this).b((fi) (Object) var5, (byte) -53);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var4;
            stackOut_31_1 = new StringBuilder().append("b.W(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L6;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L6;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final boolean f(int param0) {
        ck var2 = null;
        if (param0 == 3) {
          if (((b) this).field_G) {
            if (!((b) this).field_Fb) {
              int discarded$4 = -113;
              var2 = cf.a();
              if (var2 == null) {
                return super.f(3);
              } else {
                this.a(var2, false, 120);
                return super.f(3);
              }
            } else {
              return super.f(3);
            }
          } else {
            return super.f(3);
          }
        } else {
          field_Gb = 49L;
          if (((b) this).field_G) {
            if (!((b) this).field_Fb) {
              int discarded$5 = -113;
              var2 = cf.a();
              if (var2 == null) {
                return super.f(3);
              } else {
                this.a(var2, false, 120);
                return super.f(3);
              }
            } else {
              return super.f(3);
            }
          } else {
            return super.f(3);
          }
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        var13 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param2 + param3;
              var6 = param4 + param0;
              if (df.field_i >= param2) {
                stackOut_3_0 = df.field_i;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = param2;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (df.field_g < param0) {
                stackOut_6_0 = param0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = df.field_g;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (var5_int < df.field_k) {
                stackOut_9_0 = var5_int;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = df.field_k;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_10_0;
              if (param1 > 1) {
                break L4;
              } else {
                field_Db = true;
                break L4;
              }
            }
            L5: {
              if (var6 < df.field_h) {
                stackOut_14_0 = var6;
                stackIn_15_0 = stackOut_14_0;
                break L5;
              } else {
                stackOut_13_0 = df.field_h;
                stackIn_15_0 = stackOut_13_0;
                break L5;
              }
            }
            L6: {
              var10 = stackIn_15_0;
              if (df.field_i > param2) {
                break L6;
              } else {
                if (param2 >= df.field_k) {
                  break L6;
                } else {
                  var11 = var8 * df.field_e - -param2;
                  var12 = -var8 + var10 + 1 >> 1;
                  L7: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L6;
                    } else {
                      df.field_d[var11] = 16777215;
                      var11 = var11 + df.field_e * 2;
                      continue L7;
                    }
                  }
                }
              }
            }
            L8: {
              if (param0 < df.field_g) {
                break L8;
              } else {
                if (var6 >= df.field_h) {
                  break L8;
                } else {
                  var11 = var7 + df.field_e * param0;
                  var12 = var9 + (1 + -var7) >> 1;
                  L9: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L8;
                    } else {
                      df.field_d[var11] = 16777215;
                      var11 += 2;
                      continue L9;
                    }
                  }
                }
              }
            }
            L10: {
              if (var5_int < df.field_i) {
                break L10;
              } else {
                if (var5_int >= df.field_k) {
                  break L10;
                } else {
                  var11 = (var8 - -(var5_int + -param2 & 1)) * df.field_e - -var5_int;
                  var12 = -var8 + var10 + 1 >> 1;
                  L11: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L10;
                    } else {
                      df.field_d[var11] = 16777215;
                      var11 = var11 + 2 * df.field_e;
                      continue L11;
                    }
                  }
                }
              }
            }
            L12: {
              if (df.field_g > param0) {
                break L12;
              } else {
                if (var6 < df.field_h) {
                  var11 = (1 & var6 + -param0) + df.field_e * var6 + var7;
                  var12 = -var7 + 1 - -var9 >> 1;
                  L13: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L12;
                    } else {
                      df.field_d[var11] = 16777215;
                      var11 += 2;
                      continue L13;
                    }
                  }
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var5, "b.VA(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Cb = "Withdraw invitation to <%0> to join this game";
        field_Db = true;
    }
}
