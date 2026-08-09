/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    static String[] field_a;
    wf field_d;
    static String field_c;
    private wf field_b;

    final wf a(byte param0) {
        if (param0 != -95) {
            return (wf) null;
        }
        wf var2 = this.field_d.field_b;
        if (!(this.field_d != var2)) {
            this.field_b = null;
            return null;
        }
        this.field_b = var2.field_b;
        return var2;
    }

    final wf a(int param0) {
        wf var2;
        if (param0 == -9424) {
          var2 = this.field_d.field_f;
          if (this.field_d == var2) {
            return null;
          } else {
            var2.c(5);
            return var2;
          }
        } else {
          qj.c((byte) 97);
          var2 = this.field_d.field_f;
          if (this.field_d == var2) {
            return null;
          } else {
            var2.c(5);
            return var2;
          }
        }
    }

    final static ti[] a(int param0, int param1, ci param2, byte param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 == -57) {
              break L0;
            } else {
              field_a = (String[]) null;
              break L0;
            }
          }
          if (rl.a(param1, 0, param0, param2)) {
            return uj.a(31151);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("qj.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    final static boolean b(byte param0) {
        if (param0 < 65) {
            field_c = (String) null;
            return ge.field_x;
        }
        return ge.field_x;
    }

    final wf a(boolean param0) {
        wf var2;
        var2 = this.field_b;
        if (this.field_d == var2) {
          this.field_b = null;
          return null;
        } else {
          if (!param0) {
            this.a(true);
            this.field_b = var2.field_b;
            return var2;
          } else {
            this.field_b = var2.field_b;
            return var2;
          }
        }
    }

    final void a(wf param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == param0.field_f) {
                break L1;
              } else {
                param0.c(5);
                break L1;
              }
            }
            param0.field_f = this.field_d.field_f;
            param0.field_b = this.field_d;
            param0.field_f.field_b = param0;
            param0.field_b.field_f = param0;
            if (param1 <= -81) {
              break L0;
            } else {
              this.field_d = (wf) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("qj.O(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final wf b(int param0) {
        wf var2;
        var2 = this.field_d.field_f;
        if (param0 == -10231) {
          if (this.field_d == var2) {
            this.field_b = null;
            return null;
          } else {
            this.field_b = var2.field_f;
            return var2;
          }
        } else {
          field_c = (String) null;
          if (this.field_d == var2) {
            this.field_b = null;
            return null;
          } else {
            this.field_b = var2.field_f;
            return var2;
          }
        }
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 >= 36) {
              stackIn_4_0 = ig.a(10, false, true, param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("qj.F(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final void g(int param0) {
        int statePc = 0;
        int var3 = 0;
        wf var4 = null;
        wf var5 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Transmogrify.field_A ? 1 : 0;
                    if (param0 == -1) {
                        statePc = 10;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    qj.b((byte) 115);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var5 = this.field_d.field_b;
                    if (this.field_d == var5) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var5.c(5);
                    statePc = 8;
                    continue stateLoop;
                }
                case 4: {
                    if (var3 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var3 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var5.c(5);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (var3 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    this.field_b = null;
                    return;
                }
                case 10: {
                    var4 = this.field_d.field_b;
                    if (this.field_d != var4) {
                        statePc = 14;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var3 != 0) {
                        statePc = 16;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var3 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var4.c(5);
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    var4.c(5);
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (var3 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    this.field_b = null;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void c(byte param0) {
        field_a = null;
        int var1 = -105 % ((-25 - param0) / 33);
        field_c = null;
    }

    final wf f(int param0) {
        wf var2;
        var2 = this.field_b;
        if (var2 != this.field_d) {
          if (param0 != -33) {
            this.field_d = (wf) null;
            this.field_b = var2.field_f;
            return var2;
          } else {
            this.field_b = var2.field_f;
            return var2;
          }
        } else {
          this.field_b = null;
          return null;
        }
    }

    final void a(wf param0, byte param1) {
        if (param0.field_f != null) {
            param0.c(5);
        }
        if (param1 != 33) {
            return;
        }
        try {
            param0.field_b = this.field_d.field_b;
            param0.field_f = this.field_d;
            param0.field_f.field_b = param0;
            param0.field_b.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "qj.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean d(int param0) {
        if (param0 != -1) {
            return true;
        }
        return this.field_d == this.field_d.field_b ? true : false;
    }

    final wf c(int param0) {
        wf var2;
        CharSequence var3;
        var2 = this.field_d.field_b;
        if (var2 != this.field_d) {
          if (param0 > -71) {
            var3 = (CharSequence) null;
            qj.a((CharSequence) null, 11);
            var2.c(5);
            return var2;
          } else {
            var2.c(5);
            return var2;
          }
        } else {
          return null;
        }
    }

    public qj() {
        this.field_d = new wf();
        this.field_d.field_f = this.field_d;
        this.field_d.field_b = this.field_d;
    }

    final static void e(int param0) {
        int var1;
        if (param0 <= -65) {
          if ((kc.field_g ^ -1) >= -33) {
            ec.a(0, 9956);
            if (Transmogrify.field_A) {
              L0: {
                var1 = kc.field_g % 32;
                if (var1 == 0) {
                  var1 = 32;
                  break L0;
                } else {
                  break L0;
                }
              }
              ec.a(-var1 + kc.field_g, 9956);
              return;
            } else {
              return;
            }
          } else {
            L1: {
              var1 = kc.field_g % 32;
              if (var1 == 0) {
                var1 = 32;
                break L1;
              } else {
                break L1;
              }
            }
            ec.a(-var1 + kc.field_g, 9956);
            return;
          }
        } else {
          field_a = (String[]) null;
          if ((kc.field_g ^ -1) >= -33) {
            ec.a(0, 9956);
            if (Transmogrify.field_A) {
              L2: {
                var1 = kc.field_g % 32;
                if (var1 == 0) {
                  var1 = 32;
                  break L2;
                } else {
                  break L2;
                }
              }
              ec.a(-var1 + kc.field_g, 9956);
              return;
            } else {
              return;
            }
          } else {
            L3: {
              var1 = kc.field_g % 32;
              if (var1 == 0) {
                var1 = 32;
                break L3;
              } else {
                break L3;
              }
            }
            ec.a(-var1 + kc.field_g, 9956);
            return;
          }
        }
    }

    static {
        field_c = "This password is part of your Player Name, and would be easy to guess";
        field_a = new String[]{"Decent Score", "Great Score", "Anagram", "Super Anagram", "Recycler", "Supercycler", "Focus", "Double Focus", "Brave Effort", "Sterling Effort", "DIY Builder", "Word of Power", "Speedster", "Super Speedster", "Multitasker", "Monster Speller"};
    }
}
