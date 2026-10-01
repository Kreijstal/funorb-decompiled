/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n extends q {
    private dj field_i;
    static vd[] field_k;
    static IntrusiveDeque field_l;
    static int field_j;

    n(dj param0, dj param1) {
        super(param0);
        try {
            this.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "n.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(int param0) {
        field_l = null;
        field_k = null;
        if (param0 != 0) {
            n.c((byte) 89);
        }
    }

    final static Sprite[] a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7, int param8) {
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_56_0 = 0;
        int statePc = 0;
        int var9 = 0;
        Sprite[] var10 = null;
        Sprite[] var11_ref_dm__ = null;
        int var11 = 0;
        int var12 = 0;
        Sprite var13 = null;
        int var14 = 0;
        int var15 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = Geoblox.field_C;
                    var9 = param1 + param7 + param8;
                    var10 = new Sprite[]{new Sprite(var9, var9), new Sprite(param3, var9), new Sprite(var9, var9), new Sprite(var9, param3), new Sprite(64, 64), new Sprite(var9, param3), new Sprite(var9, var9), new Sprite(param3, var9), new Sprite(var9, var9)};
                    var11_ref_dm__ = var10;
                    var12 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var12 >= var11_ref_dm__.length) {
                        statePc = 10;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 2. */
                        {
                            var13 = var11_ref_dm__[var12];
                            stackIn_11_0 = 0;
                            stackIn_3_0 = stackIn_11_0;
                            if (var15 != 0) {
                                statePc = 11;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        }
                    }
                }
                case 3: {
                    var14 = stackIn_3_0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (var13.pixels.length <= var14) {
                        statePc = 8;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 5. */
                        {
                            var13.pixels[var14] = param5;
                            var14++;
                            if (var15 != 0) {
                                statePc = 9;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 6. */
                                {
                                    if (var15 == 0) {
                                        statePc = 4;
                                    } else {
                                        statePc = 8;
                                    }
                                    continue stateLoop;
                                }
                            }
                        }
                    }
                }
                case 8: {
                    var12++;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (var15 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_11_0 = 0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var11 = stackIn_11_0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (var11 >= param8) {
                        statePc = 21;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 13. */
                        {
                            stackIn_22_0 = 0;
                            stackIn_14_0 = stackIn_22_0;
                            if (var15 != 0) {
                                statePc = 22;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 14. */
                                {
                                    var12 = stackIn_14_0;
                                    statePc = 15;
                                    continue stateLoop;
                                }
                            }
                        }
                    }
                }
                case 15: {
                    if (var9 <= var12) {
                        statePc = 19;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 16. */
                        {
                            var10[6].pixels[var12 + (var9 - var11 + -1) * var9] = param6;
                            var10[8].pixels[var12 + (-1 + -var11 + var9) * var9] = param6;
                            var10[2].pixels[var12 * var9 + -var11 + var9 + -1] = param6;
                            var10[8].pixels[-var11 - 1 - (-var9 - var9 * var12)] = param6;
                            var12++;
                            if (var15 != 0) {
                                statePc = 20;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 17. */
                                {
                                    if (var15 == 0) {
                                        statePc = 15;
                                    } else {
                                        statePc = 19;
                                    }
                                    continue stateLoop;
                                }
                            }
                        }
                    }
                }
                case 19: {
                    var11++;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (var15 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_22_0 = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    var11 = stackIn_22_0;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = var11;
                    stackIn_24_1 = param8;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (stackIn_24_0 >= stackIn_24_1) {
                        statePc = 33;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 25. */
                        {
                            stackIn_34_0 = 0;
                            stackIn_26_0 = stackIn_34_0;
                            if (var15 != 0) {
                                statePc = 34;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 26. */
                                {
                                    var12 = stackIn_26_0;
                                    statePc = 27;
                                    continue stateLoop;
                                }
                            }
                        }
                    }
                }
                case 27: {
                    if (var9 <= var12) {
                        statePc = 32;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 28. */
                        {
                            var10[0].pixels[var12 - -(var11 * var9)] = param2;
                            var10[0].pixels[var11 + var12 * var9] = param2;
                            stackIn_24_0 = -var11 + var9 ^ -1;
                            stackIn_29_0 = stackIn_24_0;
                            stackIn_24_1 = var12 ^ -1;
                            stackIn_29_1 = stackIn_24_1;
                            if (var15 != 0) {
                                statePc = 24;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 29. */
                                {
                                    if (stackIn_29_0 >= stackIn_29_1) {
                                        statePc = 31;
                                        continue stateLoop;
                                    } else {
                                        /* Inlined CFG state: 30. */
                                        {
                                            var10[2].pixels[var9 * var11 + var12] = param2;
                                            var10[6].pixels[var11 + var12 * var9] = param2;
                                            statePc = 31;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                case 31: {
                    var12++;
                    if (var15 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var11++;
                    if (var15 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_34_0 = 0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    var11 = stackIn_34_0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (var11 >= param3) {
                        statePc = 44;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 36. */
                        {
                            stackIn_45_0 = 0;
                            stackIn_37_0 = stackIn_45_0;
                            if (var15 != 0) {
                                statePc = 45;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 37. */
                                {
                                    var12 = stackIn_37_0;
                                    statePc = 38;
                                    continue stateLoop;
                                }
                            }
                        }
                    }
                }
                case 38: {
                    if (param8 <= var12) {
                        statePc = 42;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 39. */
                        {
                            var10[7].pixels[param3 * (var9 - var12 - 1) + var11] = param6;
                            var10[5].pixels[-1 + (var9 - var12 + var11 * var9)] = param6;
                            var10[1].pixels[param3 * var12 - -var11] = param2;
                            var10[3].pixels[var12 + var9 * var11] = param2;
                            var12++;
                            if (var15 != 0) {
                                statePc = 43;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 40. */
                                {
                                    if (var15 == 0) {
                                        statePc = 38;
                                    } else {
                                        statePc = 42;
                                    }
                                    continue stateLoop;
                                }
                            }
                        }
                    }
                }
                case 42: {
                    var11++;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (var15 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    stackIn_45_0 = 0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    var11 = stackIn_45_0;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (var11 >= param3 >> 362369793) {
                        statePc = 55;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 47. */
                        {
                            stackIn_56_0 = 0;
                            stackIn_48_0 = stackIn_56_0;
                            if (var15 != 0) {
                                statePc = 56;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 48. */
                                {
                                    var12 = stackIn_48_0;
                                    statePc = 49;
                                    continue stateLoop;
                                }
                            }
                        }
                    }
                }
                case 49: {
                    if (param1 <= var12) {
                        statePc = 53;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 50. */
                        {
                            var10[1].pixels[param3 * (-1 + (-var12 + var9)) - -var11] = param0;
                            var10[3].pixels[-1 - -var9 + (-var12 + var9 * var11)] = param0;
                            var10[7].pixels[var11 + param3 * var12] = param0;
                            var10[5].pixels[var9 * var11 - -var12] = param0;
                            var12++;
                            if (var15 != 0) {
                                statePc = 54;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 51. */
                                {
                                    if (var15 == 0) {
                                        statePc = 49;
                                    } else {
                                        statePc = 53;
                                    }
                                    continue stateLoop;
                                }
                            }
                        }
                    }
                }
                case 53: {
                    var11++;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if (var15 == 0) {
                        statePc = 46;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    stackIn_56_0 = param4;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if (stackIn_56_0 == 1) {
                        statePc = 58;
                        continue stateLoop;
                    } else {
                        /* Inlined CFG state: 57. */
                        {
                            n.g(5);
                            statePc = 58;
                            continue stateLoop;
                        }
                    }
                }
                case 58: {
                    return var10;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void c(byte param0) {
        if (!(Geoblox.field_y == null)) {
            Geoblox.field_y.h((byte) -104);
        }
        vk.field_d = new hi();
        int var1 = 32 / ((param0 - 43) / 47);
        hk.field_C.b(vk.field_d, -106);
    }

    final lh a(int param0, String param1) {
        dg var3 = null;
        RuntimeException var3_ref = null;
        lh stackIn_2_0 = null;
        lh stackIn_9_0 = null;
        lh stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -257) {
              if (this.field_i instanceof nl) {
                var3 = ((nl) ((Object) this.field_i)).a((byte) -106);
                if (var3 != null) {
                  if (var3.a((byte) -105) != kk.field_w) {
                    stackIn_9_0 = si.field_m;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              if (!param1.equals(this.field_i.field_s)) {
                stackIn_13_0 = si.field_m;
              } else {
                stackIn_13_0 = kk.field_w;
              }
              decompiledRegionSelector0 = 2;
            } else {
              stackIn_2_0 = (lh) null;
              decompiledRegionSelector0 = 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = (RuntimeException) (var3_ref);

          stackIn_16_1 = new StringBuilder().append("n.D(").append(param0).append(',');

          if (param1 == null) {
            stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
            stackIn_17_2 = "null";
          } else {
            stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    final String b(int param0, String param1) {
        dg var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != 422) {
              field_l = (IntrusiveDeque) null;
            }
            if (this.field_i instanceof nl) {
              var3 = ((nl) ((Object) this.field_i)).a((byte) -118);
              if (var3 != null) {
                if (var3.a((byte) -105) == kk.field_w) {
                  if (!param1.equals(this.field_i.field_s)) {
                    stackIn_8_0 = sj.field_b;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
                stackIn_10_0 = var3.c(-21666);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
            if (!param1.equals(this.field_i.field_s)) {
              stackIn_14_0 = sj.field_b;
              decompiledRegionSelector0 = 2;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = (RuntimeException) (var3_ref);

          stackIn_18_1 = new StringBuilder().append("n.A(").append(param0).append(',');

          if (param1 == null) {
            stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
            stackIn_19_2 = "null";
          } else {
            stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
            stackIn_19_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    final static sl d(byte param0) {
        if (!(uf.field_l != kd.field_b)) {
            throw new IllegalStateException();
        }
        int var1 = 28 % ((-79 - param0) / 44);
        if (va.field_e == kd.field_b) {
            kd.field_b = uf.field_l;
            return dl.field_a;
        }
        return null;
    }

    static {
        field_l = new IntrusiveDeque();
    }
}
