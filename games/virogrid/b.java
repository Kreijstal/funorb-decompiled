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
        if (this.field_Bb) {
            vc.a(true, false, -16113);
            return;
        }
        try {
            ul.a(param0 + 3344);
            this.h(true);
            if (param0 != 12085) {
                this.f(59);
            }
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "b.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void l(int param0) {
        if (param0 >= -85) {
          this.field_Bb = false;
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
            this.field_Ab = param1;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "b.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static mg[] a(String param0, eh param1, int param2, String param3) {
        mg[] var4 = null;
        RuntimeException var4_ref = null;
        mg[] var5 = null;
        mg[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = ke.a(32, param1, param0, param3);
            var4 = var5;
            var5[3].field_z = var5[3].field_p;
            var5[1].field_u = var5[1].field_w;
            var5[5].field_z = var5[5].field_p;
            var5[param2].field_u = var5[7].field_w;
            stackIn_1_0 = (mg[]) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4_ref);

            stackIn_4_1 = new StringBuilder().append("b.RA(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    public static void j(byte param0) {
        field_Cb = null;
        if (param0 != -22) {
            field_Gb = 0L;
            field_Eb = null;
            return;
        }
        field_Eb = null;
    }

    private final void a(ck param0, boolean param1, int param2) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        sf var5 = null;
        int var6 = 0;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_Fb = true;
              if (param2 > 97) {
                break L1;
              } else {
                this.field_Ab = (qh) null;
                break L1;
              }
            }
            L2: {
              if (param0.field_a) {
                var4 = ha.field_e;
                break L2;
              } else {
                if (param0.field_b == null) {
                  var4 = param0.field_e;
                  if (-249 == (param0.field_g ^ -1)) {
                    L3: {
                      if (!param1) {
                        mj.f(0);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    this.field_Bb = true;
                    var4 = ma.field_d;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  var4 = dm.field_t;
                  if (null != this.field_Ab) {
                    this.field_Ab.a((byte) -72);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
            L4: {
              var5 = new sf((sh) (this), on.field_b, var4);
              if (!param0.field_a) {
                L5: {
                  if (this.field_Bb) {
                    var5.a((cd) (this), 260, md.field_c);
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
                if (-4 == (param0.field_g ^ -1)) {
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
                  var5.a((cd) (this), 260, md.field_c);
                  break L4;
                } else {
                  this.b(new ok((b) (this)), (byte) -53);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            this.b(var5, (byte) -53);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var4_ref);

            stackIn_33_1 = new StringBuilder().append("b.W(");

            if (param0 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L6;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L6;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean f(int param0) {
        ck var2;
        if (param0 == 3) {
          if (this.field_G) {
            if (!this.field_Fb) {
              var2 = cf.a((byte) -113);
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
          if (this.field_G) {
            if (!this.field_Fb) {
              var2 = cf.a((byte) -113);
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
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param2 + param3;
              var6 = param4 + param0;
              if (df.field_i >= param2) {
                stackIn_4_0 = df.field_i;
                break L1;
              } else {
                stackIn_4_0 = param2;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (df.field_g < param0) {
                stackIn_7_0 = param0;
                break L2;
              } else {
                stackIn_7_0 = df.field_g;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (var5_int < df.field_k) {
                stackIn_10_0 = var5_int;
                break L3;
              } else {
                stackIn_10_0 = df.field_k;
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
                stackIn_15_0 = var6;
                break L5;
              } else {
                stackIn_15_0 = df.field_h;
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
                  var12 = -var8 + var10 + 1 >> 409501089;
                  L7: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
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
                  var12 = var9 + (1 + -var7) >> 50781825;
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
                  var12 = -var8 + var10 + 1 >> -1704708319;
                  L11: while (true) {
                    var12--;
                    if (-1 < (var12 ^ -1)) {
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
                  var12 = -var7 + 1 - -var9 >> 1225724801;
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
          throw kg.a((Throwable) ((Object) var5), "b.VA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_Cb = "Withdraw invitation to <%0> to join this game";
        field_Db = true;
    }
}
