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
        wf var2 = null;
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
            stackOut_6_0 = (RuntimeException) (var4);
            stackOut_6_1 = new StringBuilder().append("qj.H(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
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
        wf discarded$2 = null;
        wf var2 = null;
        var2 = this.field_b;
        if (this.field_d == var2) {
          this.field_b = null;
          return null;
        } else {
          if (!param0) {
            discarded$2 = this.a(true);
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("qj.O(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final wf b(int param0) {
        wf var2 = null;
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 >= 36) {
              stackOut_3_0 = ig.a(10, false, true, param0);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("qj.F(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
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
        boolean discarded$1 = false;
        int var3 = 0;
        wf var4 = null;
        wf var5 = null;
        var3 = Transmogrify.field_A ? 1 : 0;
        if (param0 == -1) {
          L0: while (true) {
            L1: {
              var4 = this.field_d.field_b;
              if (this.field_d != var4) {
                var4.c(5);
                break L1;
              } else {
                if (var3 != 0) {
                  break L1;
                } else {
                  if (var3 == 0) {
                    this.field_b = null;
                    return;
                  } else {
                    var4.c(5);
                    break L1;
                  }
                }
              }
            }
            continue L0;
          }
        } else {
          discarded$1 = qj.b((byte) 115);
          L2: while (true) {
            L3: {
              var5 = this.field_d.field_b;
              if (this.field_d == var5) {
                if (var3 != 0) {
                  break L3;
                } else {
                  if (var3 == 0) {
                    this.field_b = null;
                    return;
                  } else {
                    var5.c(5);
                    break L3;
                  }
                }
              } else {
                var5.c(5);
                break L3;
              }
            }
            continue L2;
          }
        }
    }

    public static void c(byte param0) {
        field_a = null;
        int var1 = -105 % ((-25 - param0) / 33);
        field_c = null;
    }

    final wf f(int param0) {
        wf var2 = null;
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
        boolean discarded$2 = false;
        wf var2 = null;
        CharSequence var3 = null;
        var2 = this.field_d.field_b;
        if (var2 != this.field_d) {
          if (param0 > -71) {
            var3 = (CharSequence) null;
            discarded$2 = qj.a((CharSequence) null, 11);
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
        int var1 = 0;
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
