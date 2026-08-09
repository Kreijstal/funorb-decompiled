/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk extends kj {
    static java.awt.Color field_H;
    private im field_B;
    static String field_G;
    static String field_C;
    static tl field_E;
    static int[] field_I;

    final void o(int param0) {
        int var5 = OrbDefence.field_D ? 1 : 0;
        km var2 = new km(this.field_B);
        int var4 = -70 / ((param0 - 85) / 32);
        sg var3 = (sg) ((Object) var2.d(27935));
        do {
            if (var3 == null) {
                this.field_y = (pj) ((Object) this.k(3469));
                return;
            }
            if (var5 != 0) {
                return;
            }
            if (!(!var3.d(false))) {
                var3.b(57);
            }
            var3 = (sg) ((Object) var2.b(true));
        } while (var5 == 0);
        this.field_y = (pj) ((Object) this.k(3469));
    }

    public static void m(int param0) {
        field_I = null;
        field_E = null;
        field_C = null;
        if (param0 > -18) {
          field_H = (java.awt.Color) null;
          field_H = null;
          field_G = null;
          return;
        } else {
          field_H = null;
          field_G = null;
          return;
        }
    }

    final pj c(boolean param0) {
        km var2;
        sg var3;
        int var4;
        km stackIn_8_0 = null;
        km stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        boolean stackIn_11_0 = false;
        var4 = OrbDefence.field_D ? 1 : 0;
        var2 = new km(this.field_B);
        var3 = (sg) ((Object) var2.d(27935));
        L0: while (true) {
          L1: {
            L2: {
              if (var3 == null) {
                break L2;
              } else {
                stackIn_11_0 = var3.field_A;

                if (var4 != 0) {
                  break L1;
                } else {
                  if (stackIn_11_0) {
                    return var3.b((byte) -109);
                  } else {
                    L3: {
                      stackIn_8_0 = (km) (var2);

                      if (param0) {
                        stackIn_9_0 = (km) ((Object) stackIn_8_0);
                        stackIn_9_1 = 0;
                        break L3;
                      } else {
                        stackIn_9_0 = (km) ((Object) stackIn_8_0);
                        stackIn_9_1 = 1;
                        break L3;
                      }
                    }
                    var3 = (sg) ((Object) ((km) (Object) stackIn_9_0).b(stackIn_9_1 != 0));
                    if (var4 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackIn_11_0 = param0;
            break L1;
          }
          if (!stackIn_11_0) {
            return null;
          } else {
            field_I = (int[]) null;
            return null;
          }
        }
    }

    final void n(int param0) {
        km var2 = null;
        sg var3 = null;
        int var4 = 0;
        km var5 = null;
        km var6 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = OrbDefence.field_D ? 1 : 0;
                    if (param0 == 7920) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.field_B = (im) null;
                    statePc = 10;
                    continue stateLoop;
                }
                case 2: {
                    var5 = new km(this.field_B);
                    var2 = var5;
                    var3 = (sg) ((Object) var5.d(27935));
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var3 != null) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    this.field_y = null;
                    return;
                }
                case 6: {
                    var3.field_A = false;
                    var3 = (sg) ((Object) var5.b(true));
                    if (var4 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                case 8: {
                    if (var4 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    this.field_y = null;
                    return;
                }
                case 10: {
                    var6 = new km(this.field_B);
                    var2 = var6;
                    var3 = (sg) ((Object) var6.d(27935));
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (var3 != null) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    this.field_y = null;
                    return;
                }
                case 14: {
                    var3.field_A = false;
                    var3 = (sg) ((Object) var6.b(true));
                    if (var4 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    return;
                }
                case 16: {
                    if (var4 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    this.field_y = null;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final sg k(int param0) {
        km var2;
        sg var3;
        int var4;
        CharSequence var5;
        boolean stackIn_3_0 = false;
        int stackIn_8_0 = 0;
        boolean stackOut_2_0;
        var4 = OrbDefence.field_D ? 1 : 0;
        var2 = new km(this.field_B);
        var3 = (sg) ((Object) var2.d(param0 + 24466));
        L0: while (true) {
          L1: {
            L2: {
              if (var3 == null) {
                break L2;
              } else {
                stackOut_2_0 = var3.field_A;
                stackIn_8_0 = stackOut_2_0 ? 1 : 0;
                stackIn_3_0 = stackOut_2_0;
                if (var4 != 0) {
                  break L1;
                } else {
                  if (stackIn_3_0) {
                    return var3;
                  } else {
                    var3 = (sg) ((Object) var2.b(true));
                    if (var4 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackIn_8_0 = param0;
            break L1;
          }
          if (stackIn_8_0 == 3469) {
            return null;
          } else {
            var5 = (CharSequence) null;
            sk.a((byte) -126, (CharSequence) null);
            return null;
          }
        }
    }

    public sk() {
        super(0, 0, ed.field_a, lh.field_d, (td) null, (ag) null);
        this.field_B = new im();
    }

    final void l(int param0) {
        km var2;
        sg var3;
        int var4;
        var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 <= -5) {
          var2 = new km(this.field_B);
          var3 = (sg) ((Object) var2.d(27935));
          L0: while (true) {
            if (var3 != null) {
              if (var4 == 0) {
                L1: {
                  if (!var3.l(194)) {
                    break L1;
                  } else {
                    var3.b(57);
                    break L1;
                  }
                }
                var3 = (sg) ((Object) var2.b(true));
                if (var4 == 0) {
                  continue L0;
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
          this.o(-56);
          var2 = new km(this.field_B);
          var3 = (sg) ((Object) var2.d(27935));
          L2: while (true) {
            if (var3 != null) {
              if (var4 == 0) {
                L3: {
                  if (!var3.l(194)) {
                    break L3;
                  } else {
                    var3.b(57);
                    break L3;
                  }
                }
                var3 = (sg) ((Object) var2.b(true));
                if (var4 == 0) {
                  continue L2;
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
        }
    }

    final static boolean a(char param0, int param1) {
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        if (param1 == -46) {
          if (param0 != 160) {
            if (param0 != 32) {
              if (param0 != 95) {
                if (param0 == 45) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackIn_20_0 = 1;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_H = (java.awt.Color) null;
          if (param0 != 160) {
            if (param0 != 32) {
              if (param0 != 95) {
                if (param0 == 45) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackIn_8_0 = 1;
                return stackIn_8_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        pj var6 = null;
        int var7 = 0;
        pj var8 = null;
        km var9 = null;
        km var10 = null;
        km var11 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = OrbDefence.field_D ? 1 : 0;
                    if (null == this.field_j) {
                        statePc = 17;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.field_j.a(param0, param3, (pj) (this), param2 + -1052969, true);
                    var10 = new km(this.field_B);
                    var9 = var10;
                    var6 = (pj) ((Object) var10.c(param2 ^ -1040926));
                    if (param2 != 1048575) {
                        statePc = 9;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (var6 != null) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    var6.a(param0 + this.field_n, param1, param2 ^ 0, param3 - -this.field_s);
                    var6 = (pj) ((Object) var10.a((byte) -84));
                    if (var7 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                case 6: {
                    if (var7 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                case 9: {
                    var8 = (pj) null;
                    this.b((byte) -95, (pj) null);
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var6 != null) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    return;
                }
                case 12: {
                    var6.a(param0 + this.field_n, param1, param2 ^ 0, param3 - -this.field_s);
                    var6 = (pj) ((Object) var10.a((byte) -84));
                    if (var7 == 0) {
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
                    if (var7 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    return;
                }
                case 17: {
                    var11 = new km(this.field_B);
                    var9 = var11;
                    var6 = (pj) ((Object) var11.c(param2 ^ -1040926));
                    if (param2 != 1048575) {
                        statePc = 24;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (var6 != null) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    return;
                }
                case 20: {
                    var6.a(param0 + this.field_n, param1, param2 ^ 0, param3 - -this.field_s);
                    var6 = (pj) ((Object) var11.a((byte) -84));
                    if (var7 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    return;
                }
                case 22: {
                    if (var7 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    return;
                }
                case 24: {
                    var8 = (pj) null;
                    this.b((byte) -95, (pj) null);
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (var6 != null) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    return;
                }
                case 27: {
                    var6.a(param0 + this.field_n, param1, param2 ^ 0, param3 - -this.field_s);
                    var6 = (pj) ((Object) var11.a((byte) -84));
                    if (var7 == 0) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    return;
                }
                case 29: {
                    if (var7 == 0) {
                        statePc = 25;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(byte param0, pj param1) {
        sg var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            if (!(param1 instanceof sg)) {
              throw new IllegalArgumentException();
            } else {
              L1: {
                var3 = (sg) ((Object) param1);
                this.field_B.a(var3, 9);
                var3.field_A = true;
                var3.a(-81, (pj) (this));
                if (param0 == 74) {
                  break L1;
                } else {
                  var4 = (CharSequence) null;
                  sk.a((byte) 48, (CharSequence) null);
                  break L1;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3_ref);

            stackIn_8_1 = new StringBuilder().append("sk.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static int a(byte param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        CharSequence var6 = null;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 76) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var6 = (CharSequence) null;
                        sk.a((byte) 9, (CharSequence) null);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2_int = param1.length();
                        var3 = 0;
                        var4 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 >= var2_int) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_8_0 = -var3 + (var3 << 180463845) + oc.a(-109, param1.charAt(var4));
                        stackIn_6_0 = stackIn_8_0;
                        if (var5 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var3 = stackIn_6_0;
                        var4++;
                        if (var5 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_8_0 = var3;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_11_0 = (RuntimeException) (var2);
                    stackIn_10_0 = stackIn_11_0;
                    stackIn_11_1 = new StringBuilder().append("sk.H(").append(param0).append(',');
                    stackIn_10_1 = stackIn_11_1;
                    if (param1 == null) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_12_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_12_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_12_2 = "{...}";
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                    stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                    stackIn_12_2 = "null";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    throw dd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_C = "Continue";
        field_H = new java.awt.Color(10040319);
        field_E = new tl();
        field_I = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
