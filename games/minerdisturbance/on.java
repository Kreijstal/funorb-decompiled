/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on extends eg {
    static ta field_t;
    private nb[] field_w;
    static String field_z;
    private nb field_y;
    static ta field_v;
    static ea field_x;
    static int field_u;
    static String field_s;

    final void a(byte param0, ea param1) {
        nb[] var3 = null;
        int var4 = 0;
        nb var5 = null;
        int var6 = 0;
        on var7 = null;
        nb[] var8 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var8 = this.field_w;
              var3 = var8;
              if (param0 > 67) {
                break L1;
              } else {
                var7 = (on) null;
                this.a(false, (byte) -94, (on) null);
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var8.length <= var4) {
                break L0;
              } else {
                L3: {
                  var5 = var8[var4];
                  if (var5 != null) {
                    var5.field_e = param1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("on.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    private final void a(boolean param0, byte param1, on param2) {
        nb dupTemp$2 = null;
        int var4_int = 0;
        nb var5 = null;
        nb var6 = null;
        int var7 = 0;
        nb stackIn_10_0 = null;
        nb stackIn_11_0 = null;
        nb stackIn_11_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = MinerDisturbance.field_ab;
        try {
          L0: {
            super.a(-3, param2);
            if (param1 == 36) {
              if (!param0) {
                ai.a(this.field_w, 0, param2.field_w, 0, 6);
                return;
              } else {
                var4_int = 0;
                L1: while (true) {
                  if (-7 >= (var4_int ^ -1)) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L2: {
                      var5 = this.field_w[var4_int];
                      var6 = var5;
                      var6 = var5;
                      if (var5 != null) {
                        L3: {
                          var6 = param2.field_w[var4_int];
                          stackIn_10_0 = (nb) (var5);

                          if (var6 != null) {
                            stackIn_11_0 = (nb) ((Object) stackIn_10_0);
                            stackIn_11_1 = (nb) (var6);
                            break L3;
                          } else {
                            dupTemp$2 = new nb();
                            param2.field_w[var4_int] = dupTemp$2;
                            stackIn_11_0 = (nb) ((Object) stackIn_10_0);
                            stackIn_11_1 = (nb) (dupTemp$2);
                            break L3;
                          }
                        }
                        ((nb) (Object) stackIn_11_0).a(stackIn_11_1, (byte) -123);
                        break L2;
                      } else {
                        param2.field_w[var4_int] = null;
                        break L2;
                      }
                    }
                    var4_int++;
                    continue L1;
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
          L4: {
            var4 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var4);

            stackIn_18_1 = new StringBuilder().append("on.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public on() {
        this.field_w = new nb[6];
        this.field_y = new nb();
        nb dupTemp$0 = new nb();
        this.field_w[0] = dupTemp$0;
        nb var1 = dupTemp$0;
        var1.b(-1);
    }

    public final void a(int param0, int param1, fe param2, int param3, boolean param4) {
        fe stackIn_3_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        nb var7 = null;
        nb var9 = null;
        hc var10 = null;
        nb var11 = null;
        nb var12 = null;
        nb var13 = null;
        nb var14 = null;
        try {
          L0: {
            L1: {
              if (!(param2 instanceof hc)) {
                stackIn_3_0 = null;
                break L1;
              } else {
                stackIn_3_0 = (fe) (param2);
                break L1;
              }
            }
            L2: {
              var10 = (hc) ((Object) stackIn_3_0);
              wf.a(param2.field_t + param3, param2.field_u + param1, (byte) 8, param2.field_u + param1 - -param2.field_v, param3 + param2.field_t - -param2.field_q);
              if (param0 == 12088) {
                break L2;
              } else {
                this.field_y = (nb) null;
                break L2;
              }
            }
            L3: {
              if (var10 != null) {
                param4 = param4 & var10.field_E;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var7 = this.field_w[0];
              this.field_y.b(-1);
              var7.a(param0 ^ 6185, param2, (on) (this), this.field_y, param3, param1);
              if (var10 != null) {
                L5: {
                  if (!var10.field_H) {
                    break L5;
                  } else {
                    var11 = this.field_w[1];
                    if (var11 == null) {
                      break L5;
                    } else {
                      var11.a(14097, param2, (on) (this), this.field_y, param3, param1);
                      break L5;
                    }
                  }
                }
                if (!var10.field_x) {
                  break L4;
                } else {
                  L6: {
                    var12 = this.field_w[3];
                    if (var10.field_w == 0) {
                      break L6;
                    } else {
                      if (var12 != null) {
                        var12.a(14097, param2, (on) (this), this.field_y, param3, param1);
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var9 = this.field_w[2];
                  if (var9 != null) {
                    var9.a(14097, param2, (on) (this), this.field_y, param3, param1);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              } else {
                break L4;
              }
            }
            L7: {
              if (!param2.k(param0 + -12188)) {
                break L7;
              } else {
                var13 = this.field_w[5];
                if (var13 != null) {
                  var13.a(14097, param2, (on) (this), this.field_y, param3, param1);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            L8: {
              if (!param4) {
                var14 = this.field_w[4];
                if (var14 == null) {
                  break L8;
                } else {
                  var14.a(param0 + 2009, param2, (on) (this), this.field_y, param3, param1);
                  break L8;
                }
              } else {
                break L8;
              }
            }
            this.field_y.a(param1, param2, (on) (this), param3, 100);
            tk.b(true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var6);

            stackIn_33_1 = new StringBuilder().append("on.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L9;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L9;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, ea[] param1, byte param2) {
        int var4_int = 0;
        try {
            var4_int = param0;
            if (this.field_w[var4_int] == null) {
                this.field_w[var4_int] = new nb();
            }
            if (param2 != 24) {
                field_z = (String) null;
            }
            this.field_w[param0].field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "on.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(ea[] param0, boolean param1) {
        nb[] var3 = null;
        int var4 = 0;
        nb var5 = null;
        int var6 = 0;
        nb[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                field_x = (ea) null;
                break L1;
              }
            }
            var7 = this.field_w;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              if (var7.length <= var4) {
                break L0;
              } else {
                L3: {
                  var5 = var7[var4];
                  if (var5 == null) {
                    break L3;
                  } else {
                    var5.field_d = param0;
                    break L3;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("on.D(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    public static void d(int param0) {
        field_z = null;
        field_t = null;
        field_x = null;
        field_v = null;
        field_s = null;
        if (param0 >= -49) {
            field_v = (ta) null;
        }
    }

    final nb a(byte param0, int param1) {
        nb dupTemp$2 = null;
        nb dupTemp$3 = null;
        if (param0 >= -96) {
          on.d(-8);
          dupTemp$2 = new nb();
          this.field_w[param1] = dupTemp$2;
          return dupTemp$2;
        } else {
          dupTemp$3 = new nb();
          this.field_w[param1] = dupTemp$3;
          return dupTemp$3;
        }
    }

    on(on param0, boolean param1) {
        this();
        try {
            param0.a(param1, (byte) 36, (on) (this));
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "on.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_t = new ta();
        field_z = "Become a member to get this expansion and...";
        field_v = new ta();
        field_s = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
