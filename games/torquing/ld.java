/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld implements el {
    static ce field_e;
    private int field_h;
    private int field_c;
    static int field_l;
    private int field_a;
    private int field_i;
    private int field_g;
    private int field_f;
    static int field_k;
    private int field_d;
    private uc field_j;
    static String field_b;

    public final void a(int param0, int param1, int param2, boolean param3, gm param4) {
        va var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        gm stackIn_7_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        int var13 = 0;
        try {
          L0: {
            L1: {
              if (param0 >= 89) {
                break L1;
              } else {
                this.field_a = -98;
                break L1;
              }
            }
            L2: {
              if (param4 instanceof va) {
                stackIn_7_0 = (gm) (param4);
                break L2;
              } else {
                stackIn_7_0 = null;
                break L2;
              }
            }
            L3: {
              var6 = (va) ((Object) stackIn_7_0);
              if (var6 == null) {
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              ph.d(param4.field_w + param2, param4.field_k + param1, param4.field_p, param4.field_o, this.field_h);
              var7 = param2 - -param4.field_w - -var6.field_G;
              var8 = var6.field_F + (param1 - -param4.field_k);
              ph.d(var7, var8, var6.field_C, this.field_a);
              if (0 != (var6.field_I ^ -1)) {
                var9 = 2.0 * ((double)var6.field_I * 3.141592653589793) / (double)var6.field_E;
                var11 = (int)(-Math.sin(var9) * (double)var6.field_C);
                var12 = (int)(Math.cos(var9) * (double)var6.field_C);
                ph.d(var11 + var7, var12 + var8, 1, this.field_g);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              ph.d(var7, var8, 2, 1);
              var9 = 2.0 * (3.141592653589793 * (double)var6.field_D) / (double)var6.field_E;
              var11 = (int)(-Math.sin(var9) * (double)var6.field_C);
              var12 = (int)(Math.cos(var9) * (double)var6.field_C);
              ph.a(var7, var8, var7 + var11, var12 + var8, 1);
              if (this.field_j != null) {
                var13 = this.field_c + var6.field_C + var6.field_G;
                this.field_j.a(param4.field_m, var13 + (param2 + param4.field_w), this.field_d + (param1 - -param4.field_k), -this.field_c + -var13 + param4.field_p, -(this.field_c << -725819935) + param4.field_o, this.field_i, this.field_f, 1, 1, 0);
                break L5;
              } else {
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var6_ref);

            stackIn_20_1 = new StringBuilder().append("ld.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    final static void a(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_14_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        df var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        ae var5 = null;
        String var5_ref = null;
        String var6 = null;
        ae var6_ref = null;
        String var7 = null;
        ae var7_ref = null;
        int var8 = 0;
        var8 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var1 = kj.field_d;
              if (param0 == 123) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            var2 = var1.i((byte) -101);
            if (-1 == (var2 ^ -1)) {
              L2: {
                if (ed.field_c != null) {
                  break L2;
                } else {
                  ed.field_c = new uk(128);
                  vf.field_d = 0;
                  break L2;
                }
              }
              L3: {
                if ((var1.i((byte) -101) ^ -1) != -2) {
                  stackIn_14_0 = 0;
                  break L3;
                } else {
                  stackIn_14_0 = 1;
                  break L3;
                }
              }
              L4: {
                var3_int = stackIn_14_0;
                var4_ref_String = var1.h((byte) 124);
                if (var3_int == 0) {
                  break L4;
                } else {
                  var1.h((byte) 120);
                  break L4;
                }
              }
              L5: {
                var5 = ac.a(var4_ref_String, 0);
                var6 = var1.h((byte) 116);
                var7 = hf.a((CharSequence) ((Object) var4_ref_String), 121);
                if (null == var7) {
                  var7 = var4_ref_String;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (var5 == null) {
                  var5 = ac.a(var6, 0);
                  if (null == var5) {
                    break L6;
                  } else {
                    ed.field_c.a(var5, (long)var7.hashCode(), 0);
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
              L7: {
                if (null != var5) {
                  break L7;
                } else {
                  var5 = new ae();
                  ed.field_c.a(var5, (long)var7.hashCode(), 0);
                  fieldTemp$0 = vf.field_d;
                  vf.field_d = vf.field_d + 1;
                  var5.field_kb = fieldTemp$0;
                  eh.field_b.a((byte) 54, var5);
                  break L7;
                }
              }
              var5.field_ob = var4_ref_String;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-2 != (var2 ^ -1)) {
                if ((var2 ^ -1) != -3) {
                  if (3 == var2) {
                    L8: {
                      if (cn.field_b != 2) {
                        break L8;
                      } else {
                        cn.field_b = 1;
                        break L8;
                      }
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (var2 == 4) {
                      cn.field_b = 1;
                      var3 = var1.h((byte) 116);
                      og.field_m = ((String) (var3)).intern();
                      var4 = var1.i((byte) -101);
                      rf.a(var4, 64);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      nn.a("F1: " + me.a(-1), (Throwable) null, param0 + -10081);
                      ih.b(true);
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  }
                } else {
                  L9: {
                    if (cn.field_b != 1) {
                      break L9;
                    } else {
                      cn.field_b = 2;
                      break L9;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                L10: {
                  if (sh.field_a == null) {
                    sh.field_a = new uk(128);
                    mm.field_g = 0;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  var3 = var1.h((byte) 124);
                  if (((String) (var3)).equals("")) {
                    var3 = null;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  var4_ref_String = var1.h((byte) 122);
                  var5_ref = var1.h((byte) 124);
                  var6_ref = qm.a(var4_ref_String, (byte) 45);
                  if (null != var6_ref) {
                    break L12;
                  } else {
                    var6_ref = qm.a(var5_ref, (byte) 45);
                    if (var6_ref == null) {
                      break L12;
                    } else {
                      sh.field_a.a(var6_ref, (long)hf.a((CharSequence) ((Object) var4_ref_String), 114).hashCode(), 0);
                      break L12;
                    }
                  }
                }
                L13: {
                  if (null == var6_ref) {
                    var6_ref = new ae();
                    sh.field_a.a(var6_ref, (long)hf.a((CharSequence) ((Object) var4_ref_String), 118).hashCode(), 0);
                    fieldTemp$1 = mm.field_g;
                    mm.field_g = mm.field_g + 1;
                    var6_ref.field_kb = fieldTemp$1;
                    wf.field_x.a((byte) 54, var6_ref);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (null == var3) {
                    break L14;
                  } else {
                    var3 = ((String) (var3)).intern();
                    break L14;
                  }
                }
                var6_ref.field_jb = (String) (var3);
                var6_ref.field_ob = var4_ref_String;
                var6_ref.f(param0 + -123);
                var7_ref = (ae) ((Object) wf.field_x.b(0));
                L15: while (true) {
                  L16: {
                    if (null == var7_ref) {
                      break L16;
                    } else {
                      if (!ha.a((byte) 75, var6_ref, var7_ref)) {
                        break L16;
                      } else {
                        var7_ref = (ae) ((Object) wf.field_x.f(-24059));
                        if (var8 == 0) {
                          continue L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                  }
                  L17: {
                    L18: {
                      if (var7_ref == null) {
                        break L18;
                      } else {
                        fi.a(var6_ref, var7_ref, -1240266932);
                        if (var8 == 0) {
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                    }
                    wf.field_x.a((byte) 54, var6_ref);
                    break L17;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1_ref), "ld.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    public static void b(byte param0) {
        try {
            field_e = null;
            field_b = null;
            if (param0 != -21) {
                ld.b((byte) 5);
            }
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "ld.D(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              bp.a((byte) -49);
              if (param4 <= -90) {
                break L1;
              } else {
                ld.b((byte) -123);
                break L1;
              }
            }
            ph.f(param1, param3, param0, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var5), "ld.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    ld(uc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_c = param1;
            this.field_h = param7;
            this.field_f = param4;
            this.field_i = param3;
            this.field_j = param0;
            this.field_a = param5;
            this.field_g = param6;
            this.field_d = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("ld.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_e = new ce();
        field_b = "6 more worlds";
    }
}
