/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends af {
    static String[] field_s;
    private bf field_w;
    static int[] field_q;
    static o field_p;
    private bf[] field_t;
    static gj field_r;
    static String field_u;
    static int field_v;

    final void a(byte param0, o param1) {
        bf[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        bf var6 = null;
        int var7 = 0;
        bf[] var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var4 = 12 / ((param0 - 14) / 55);
            var8 = this.field_t;
            var3 = var8;
            var5 = 0;
            L1: while (true) {
              if (var8.length <= var5) {
                break L0;
              } else {
                L2: {
                  var6 = var8[var5];
                  if (var6 == null) {
                    break L2;
                  } else {
                    var6.field_k = param1;
                    break L2;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3_ref);

            stackIn_9_1 = new StringBuilder().append("ql.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    public final void a(byte param0, int param1, boolean param2, int param3, rc param4) {
        rc stackIn_5_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        bf var7 = null;
        bf var9 = null;
        pj var10 = null;
        bf var11 = null;
        bf var12 = null;
        bf var13 = null;
        bf var14 = null;
        try {
          L0: {
            if (param0 >= 113) {
              L1: {
                if (param4 instanceof pj) {
                  stackIn_5_0 = (rc) (param4);
                  break L1;
                } else {
                  stackIn_5_0 = null;
                  break L1;
                }
              }
              L2: {
                var10 = (pj) ((Object) stackIn_5_0);
                kf.a((byte) 97, param3 + param4.field_m, param1 - -param4.field_j, param3 - -param4.field_m - -param4.field_t, param4.field_x + (param4.field_j + param1));
                if (var10 == null) {
                  break L2;
                } else {
                  param2 = param2 & var10.field_B;
                  break L2;
                }
              }
              L3: {
                var7 = this.field_t[0];
                this.field_w.a(36);
                var7.a(this.field_w, param3, param4, -2147483648, param1, (ql) (this));
                if (var10 == null) {
                  break L3;
                } else {
                  L4: {
                    if (!var10.field_F) {
                      break L4;
                    } else {
                      var11 = this.field_t[1];
                      if (var11 == null) {
                        break L4;
                      } else {
                        var11.a(this.field_w, param3, param4, -2147483648, param1, (ql) (this));
                        break L4;
                      }
                    }
                  }
                  if (var10.field_v) {
                    L5: {
                      var12 = this.field_t[3];
                      if (var10.field_u == 0) {
                        break L5;
                      } else {
                        if (var12 == null) {
                          break L5;
                        } else {
                          var12.a(this.field_w, param3, param4, -2147483648, param1, (ql) (this));
                          break L3;
                        }
                      }
                    }
                    var9 = this.field_t[2];
                    if (var9 == null) {
                      break L3;
                    } else {
                      var9.a(this.field_w, param3, param4, -2147483648, param1, (ql) (this));
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              L6: {
                if (param4.b(true)) {
                  var13 = this.field_t[5];
                  if (var13 != null) {
                    var13.a(this.field_w, param3, param4, -2147483648, param1, (ql) (this));
                    break L6;
                  } else {
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
              L7: {
                if (!param2) {
                  var14 = this.field_t[4];
                  if (var14 != null) {
                    var14.a(this.field_w, param3, param4, -2147483648, param1, (ql) (this));
                    break L7;
                  } else {
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              this.field_w.a(108, param1, param3, (ql) (this), param4);
              mf.e(4096);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var6);

            stackIn_32_1 = new StringBuilder().append("ql.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L8;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L8;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final bf a(byte param0, int param1) {
        if (param0 > -37) {
            return (bf) null;
        }
        bf dupTemp$0 = new bf();
        this.field_t[param1] = dupTemp$0;
        return dupTemp$0;
    }

    private final void a(ql param0, boolean param1, int param2) {
        bf dupTemp$2 = null;
        int var4_int = 0;
        bf var5 = null;
        bf var6 = null;
        int var7 = 0;
        o[] var8 = null;
        bf stackIn_8_0 = null;
        bf stackIn_9_0 = null;
        bf stackIn_9_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              super.a(param0, 6935);
              if (param1) {
                var4_int = 0;
                L2: while (true) {
                  if ((var4_int ^ -1) <= -7) {
                    break L1;
                  } else {
                    L3: {
                      var5 = this.field_t[var4_int];
                      if (var5 == null) {
                        param0.field_t[var4_int] = null;
                        break L3;
                      } else {
                        L4: {
                          var6 = param0.field_t[var4_int];
                          stackIn_8_0 = (bf) (var5);

                          if (var6 == null) {
                            dupTemp$2 = new bf();
                            param0.field_t[var4_int] = dupTemp$2;
                            stackIn_9_0 = (bf) ((Object) stackIn_8_0);
                            stackIn_9_1 = (bf) (dupTemp$2);
                            break L4;
                          } else {
                            stackIn_9_0 = (bf) ((Object) stackIn_8_0);
                            stackIn_9_1 = (bf) (var6);
                            break L4;
                          }
                        }
                        ((bf) (Object) stackIn_9_0).a(stackIn_9_1, 2);
                        break L3;
                      }
                    }
                    var4_int++;
                    continue L2;
                  }
                }
              } else {
                fk.a(this.field_t, 0, param0.field_t, 0, 6);
                break L1;
              }
            }
            L5: {
              if (param2 == 30089) {
                break L5;
              } else {
                var8 = (o[]) null;
                this.a((byte) 62, (o[]) null);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("ql.W(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte param0, o[] param1) {
        bf[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        bf var6 = null;
        int var7 = 0;
        bf[] var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var8 = this.field_t;
            var3 = var8;
            var4 = -51 % ((param0 - -26) / 48);
            var5 = 0;
            L1: while (true) {
              if (var8.length <= var5) {
                break L0;
              } else {
                L2: {
                  var6 = var8[var5];
                  if (var6 == null) {
                    break L2;
                  } else {
                    var6.field_j = param1;
                    break L2;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3_ref);

            stackIn_9_1 = new StringBuilder().append("ql.BA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    public static void e(int param0) {
        field_r = null;
        field_q = null;
        field_p = null;
        if (param0 != 1) {
            return;
        }
        field_s = null;
        field_u = null;
    }

    public ql() {
        this.field_t = new bf[6];
        this.field_w = new bf();
        bf dupTemp$0 = new bf();
        this.field_t[0] = dupTemp$0;
        bf var1 = dupTemp$0;
        var1.a(36);
    }

    final static void d(int param0) {
        u.field_b.j(1);
        if (!(pc.field_b != null)) {
            pc.field_b = new lb(u.field_b, v.field_a);
        }
        u.field_b.b(pc.field_b, -120);
        if (param0 != 18962) {
            field_p = (o) null;
        }
    }

    final void a(byte param0, int param1, o[] param2) {
        int var4_int = 0;
        if (param0 != -60) {
            return;
        }
        try {
            var4_int = param1;
            if (!(null != this.field_t[var4_int])) {
                this.field_t[var4_int] = new bf();
            }
            this.field_t[param1].field_j = param2;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ql.DA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    ql(ql param0, boolean param1) {
        this();
        try {
            param0.a((ql) (this), param1, 30089);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ql.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_s = new String[]{"Exciting new weapons", "Fullscreen mode", "No adverts"};
        field_q = new int[4];
        field_u = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_v = -1;
    }
}
