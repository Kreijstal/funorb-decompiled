/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lfa extends dg {
    private fla field_s;
    private int field_p;
    private int field_r;
    static String field_m;
    private int field_q;
    static su field_o;
    static String field_n;

    final void a(int param0, la param1, kh param2) {
        super.a(126, param1, param2);
        if ((param1.field_E ^ -1) >= -18) {
            return;
        }
        if (param0 < 119) {
            return;
        }
        try {
            this.field_q = param2.b((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "lfa.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    lfa(int param0, la param1, kh param2) {
        super(param0, param1, param2);
    }

    final int m(byte param0) {
        if (param0 > -63) {
            return -74;
        }
        return -1;
    }

    final void h(int param0) {
        int var2;
        int var3;
        kh var4;
        var3 = TombRacer.field_G ? 1 : 0;
        super.h(78);
        var2 = this.field_q;
        if (var2 != 0) {
          if ((var2 ^ -1) == -2) {
            this.field_q = 0;
            if (param0 > 0) {
              return;
            } else {
              var4 = (kh) null;
              this.a(-98, (la) null, (kh) null);
              return;
            }
          } else {
            if (3 != var2) {
              if (var2 != 4) {
                if (param0 <= 0) {
                  var4 = (kh) null;
                  this.a(-98, (la) null, (kh) null);
                  return;
                } else {
                  return;
                }
              } else {
                this.field_q = 3;
                if (param0 <= 0) {
                  var4 = (kh) null;
                  this.a(-98, (la) null, (kh) null);
                  return;
                } else {
                  return;
                }
              }
            } else {
              this.field_q = 4;
              if (param0 <= 0) {
                var4 = (kh) null;
                this.a(-98, (la) null, (kh) null);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          this.field_q = 1;
          if (param0 > 0) {
            return;
          } else {
            var4 = (kh) null;
            this.a(-98, (la) null, (kh) null);
            return;
          }
        }
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = 0;
              var7 = null;
              var8 = this.field_q;
              if (var8 != 0) {
                if (-2 != (var8 ^ -1)) {
                  if ((var8 ^ -1) == -3) {
                    var7 = ta.field_ub[22];
                    break L1;
                  } else {
                    if (var8 != 3) {
                      if (4 != var8) {
                        if (5 == var8) {
                          var7 = ta.field_ub[25];
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        var7 = ta.field_ub[24];
                        break L1;
                      }
                    } else {
                      var7 = ta.field_ub[23];
                      break L1;
                    }
                  }
                } else {
                  var7 = ta.field_ub[21];
                  break L1;
                }
              } else {
                var7 = ta.field_ub[20];
                break L1;
              }
            }
            L2: {
              var8 = -76 / ((-38 - param4) / 47);
              if (var7 == null) {
                break L2;
              } else {
                var9 = dfa.a(4096 + var6_int - this.field_h.g(-25787) >> 905716642, 2048, 102);
                gqa.a(var9, -83584144, param1, param2, (ka) (var7), param3);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var6);

            stackIn_23_1 = new StringBuilder().append("lfa.D(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L3;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(gr param0, gma param1, byte param2) {
        try {
            super.a(param0, param1, param2);
            this.field_r = param1.d(param2 + -33);
            this.field_p = param1.e(param2 + 9612);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "lfa.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void i(int param0) {
        if (param0 != 5353) {
          field_o = (su) null;
          field_o = null;
          field_m = null;
          field_n = null;
          return;
        } else {
          field_o = null;
          field_m = null;
          field_n = null;
          return;
        }
    }

    final int f(byte param0) {
        int var2;
        int var3;
        var2 = -36 % ((15 - param0) / 45);
        var3 = this.field_q;
        if (-3 != (var3 ^ -1)) {
          if (5 == var3) {
            return 2;
          } else {
            return -1;
          }
        } else {
          return 2;
        }
    }

    final void d(int param0) {
        uja discarded$0 = null;
        uja discarded$1 = null;
        fsa var3;
        int var5;
        Object var6;
        w var6_ref;
        vna var7;
        vna var8;
        var6 = null;
        var6_ref = (w) ((Object) this.a(110).field_G);
        if (var6_ref == null) {
          return;
        } else {
          var3 = (fsa) ((Object) this.field_h);
          if (!var3.x(param0 + 15471).i(param0 + -14885)) {
            if (param0 == -1) {
              if (-3 != (this.field_q ^ -1)) {
                if (-6 != (this.field_q ^ -1)) {
                  L0: {
                    L1: {
                      var8 = var3.field_B;
                      discarded$0 = new uja(var8);
                      var5 = 0;
                      if (var3.d(3) != this.field_r) {
                        break L1;
                      } else {
                        if (var3.e(9648) != this.field_p) {
                          break L1;
                        } else {
                          break L0;
                        }
                      }
                    }
                    var5 = 1;
                    break L0;
                  }
                  L2: {
                    this.field_r = var3.d(3);
                    this.field_p = var3.e(param0 + 9649);
                    if (var5 == 0) {
                      break L2;
                    } else {
                      if (this.field_s != null) {
                        break L2;
                      } else {
                        this.field_s = var6_ref.a(new fm(55, this.b((byte) 89), this.c((byte) 117), this.e((byte) -122)), -58);
                        return;
                      }
                    }
                  }
                  if (var5 == 0) {
                    if (null != this.field_s) {
                      this.field_s.a(78, var6_ref);
                      this.field_s = null;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              this.h(95);
              if (-3 != (this.field_q ^ -1)) {
                if (-6 != (this.field_q ^ -1)) {
                  L3: {
                    L4: {
                      var7 = var3.field_B;
                      discarded$1 = new uja(var7);
                      var5 = 0;
                      if (var3.d(3) != this.field_r) {
                        break L4;
                      } else {
                        if (var3.e(9648) != this.field_p) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var5 = 1;
                    break L3;
                  }
                  L5: {
                    this.field_r = var3.d(3);
                    this.field_p = var3.e(param0 + 9649);
                    if (var5 == 0) {
                      break L5;
                    } else {
                      if (this.field_s != null) {
                        break L5;
                      } else {
                        this.field_s = var6_ref.a(new fm(55, this.b((byte) 89), this.c((byte) 117), this.e((byte) -122)), -58);
                        return;
                      }
                    }
                  }
                  if (var5 == 0) {
                    if (null != this.field_s) {
                      this.field_s.a(78, var6_ref);
                      this.field_s = null;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final void a(byte param0, kh param1) {
        try {
            int var3_int = 94 / ((-8 - param0) / 40);
            super.a((byte) -88, param1);
            param1.a((byte) -125, this.field_q, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "lfa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    lfa(int param0) {
        super(param0);
    }

    final void a(int param0, boolean param1) {
        this.field_q = param0;
        if (!param1) {
            iq var4 = (iq) null;
            this.a((iq) null, 94, 28, 90, (byte) -49);
        }
    }

    static {
        field_m = "Coins";
        field_o = new su(14, 0, 4, 1);
        field_n = "<%0> has dropped out.";
    }
}
