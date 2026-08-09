/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lq {
    static String field_c;
    static int field_d;
    static int field_b;
    static String field_a;
    private qa field_e;
    private qa field_f;

    final int a(byte param0) {
        int var2;
        qa var3;
        int var4;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = 0;
        var3 = this.field_e.field_k;
        if (param0 == 98) {
          L0: while (true) {
            L1: {
              if (var3 == this.field_e) {
                break L1;
              } else {
                var3 = var3.field_k;
                var2++;
                if (var4 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            return var2;
          }
        } else {
          return -26;
        }
    }

    public static void c(int param0) {
        field_a = null;
        field_c = null;
        if (param0 >= 74) {
            return;
        }
        lq.b(1);
    }

    final qa b(byte param0) {
        qa var2;
        if (param0 >= 82) {
          var2 = this.field_f;
          if (var2 == this.field_e) {
            this.field_f = null;
            return null;
          } else {
            this.field_f = var2.field_k;
            return var2;
          }
        } else {
          field_d = 18;
          var2 = this.field_f;
          if (var2 == this.field_e) {
            this.field_f = null;
            return null;
          } else {
            this.field_f = var2.field_k;
            return var2;
          }
        }
    }

    final static ma a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ma stackIn_5_0 = null;
        ma stackIn_9_0 = null;
        ma stackIn_18_0 = null;
        ma stackIn_22_0 = null;
        Object stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (param0 == 1) {
                break L1;
              } else {
                lq.c(-68);
                break L1;
              }
            }
            if (0 != var2_int) {
              if ((var2_int ^ -1) < -64) {
                stackIn_9_0 = er.field_f;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = 0;
                L2: while (true) {
                  if (var2_int > var3) {
                    L3: {
                      var4 = param1.charAt(var3);
                      if (45 != var4) {
                        if (lb.field_e.indexOf(var4) == -1) {
                          stackIn_22_0 = so.field_t;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L3;
                        }
                      } else {
                        L4: {
                          if (var3 == 0) {
                            break L4;
                          } else {
                            if (var3 != -1 + var2_int) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        stackIn_18_0 = so.field_t;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                    var3++;
                    if (var5 == 0) {
                      continue L2;
                    } else {
                      stackIn_25_0 = null;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackIn_5_0 = jo.field_e;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var2);

            stackIn_28_1 = new StringBuilder().append("lq.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L5;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_22_0;
              } else {
                return (ma) ((Object) stackIn_25_0);
              }
            }
          }
        }
    }

    final void d(int param0) {
        int var3 = 0;
        qa var4 = null;
        qa var6 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = ZombieDawnMulti.field_E ? 1 : 0;
                    if (param0 != -1) {
                        statePc = 8;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var4 = this.field_e.field_k;
                    if (this.field_e != var4) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_f = null;
                    return;
                }
                case 3: {
                    var4.a(-4564);
                    if (var3 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 5: {
                    if (var3 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.field_f = null;
                    return;
                }
                case 8: {
                    lq.c(-67);
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var6 = this.field_e.field_k;
                    if (this.field_e != var6) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.field_f = null;
                    return;
                }
                case 12: {
                    var6.a(-4564);
                    if (var3 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    return;
                }
                case 14: {
                    if (var3 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    this.field_f = null;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final qa c(byte param0) {
        qa var2 = null;
        if (param0 <= 84) {
            this.field_f = (qa) null;
            var2 = this.field_e.field_k;
            if (!(this.field_e != var2)) {
                this.field_f = null;
                return null;
            }
            this.field_f = var2.field_k;
            return var2;
        }
        var2 = this.field_e.field_k;
        if (!(this.field_e != var2)) {
            this.field_f = null;
            return null;
        }
        this.field_f = var2.field_k;
        return var2;
    }

    final static boolean b(int param0) {
        if (param0 != 0) {
            lq.c(72);
            return fh.field_m != null ? true : false;
        }
        return fh.field_m != null ? true : false;
    }

    final qa a(int param0) {
        qa var2;
        if (param0 == 11356) {
          var2 = this.field_e.field_k;
          if (var2 == this.field_e) {
            return null;
          } else {
            var2.a(-4564);
            return var2;
          }
        } else {
          lq.b(-38);
          var2 = this.field_e.field_k;
          if (var2 == this.field_e) {
            return null;
          } else {
            var2.a(-4564);
            return var2;
          }
        }
    }

    final void a(int param0, qa param1) {
        try {
            if (!(param1.field_p == null)) {
                param1.a(param0 + -34228);
            }
            param1.field_k = this.field_e;
            param1.field_p = this.field_e.field_p;
            if (param0 != 29664) {
                String var4 = (String) null;
                lq.a((byte) 122, (String) null);
            }
            param1.field_p.field_k = param1;
            param1.field_k.field_p = param1;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "lq.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public lq() {
        this.field_e = new qa();
        this.field_e.field_k = this.field_e;
        this.field_e.field_p = this.field_e;
    }

    static {
        field_a = "Game Complete!";
        field_b = 0;
        field_c = "Connection restored.";
    }
}
