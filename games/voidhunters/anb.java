/*
 * Decompiled by CFR-JS 0.4.0.
 */
class anb extends ara implements ntb, utb {
    private int field_m;
    private int field_i;
    int[] field_q;
    int field_s;
    int field_n;
    private int field_r;
    int field_l;
    int field_p;
    private int field_j;
    int field_o;
    ml field_k;
    int field_t;

    public void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        anb var5 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, -85);
              var5 = (anb) (Object) param0;
              if (var5.field_k == null) {
                break L1;
              } else {
                if (var5.field_k != null) {
                  var5.field_k.a((tv) (Object) var5.field_k, -80);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var4 = 0;
            ml discarded$1 = var5.field_k;
            L2: {
              if (var5.field_k == null) {
                break L2;
              } else {
                if (var5.field_k.a((byte) -118, (tv) (Object) var5.field_k)) {
                  System.out.println("Component chassis has changed. before=" + var5.field_k + ", now=" + var5.field_k);
                  var4 = 1;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (var5.field_r != var5.field_r) {
                var4 = 1;
                System.out.println("int angle has changed. before=" + var5.field_r + ", now=" + var5.field_r);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (var5.field_n == var5.field_n) {
                break L4;
              } else {
                System.out.println("int angularvelocity has changed. before=" + var5.field_n + ", now=" + var5.field_n);
                var4 = 1;
                break L4;
              }
            }
            L5: {
              if (var5.field_i != var5.field_i) {
                var4 = 1;
                System.out.println("int centreofmassx has changed. before=" + var5.field_i + ", now=" + var5.field_i);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (var5.field_j == var5.field_j) {
                break L6;
              } else {
                var4 = 1;
                System.out.println("int centreofmassy has changed. before=" + var5.field_j + ", now=" + var5.field_j);
                break L6;
              }
            }
            L7: {
              if (var5.field_s == var5.field_s) {
                break L7;
              } else {
                System.out.println("int mass has changed. before=" + var5.field_s + ", now=" + var5.field_s);
                var4 = 1;
                break L7;
              }
            }
            L8: {
              if (var5.field_m != var5.field_m) {
                System.out.println("int momentofinertia has changed. before=" + var5.field_m + ", now=" + var5.field_m);
                var4 = 1;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (ikb.a(var5.field_q, var5.field_q, false)) {
                var4 = 1;
                System.out.println("int[] boundingbox has changed. ");
                break L9;
              } else {
                break L9;
              }
            }
            if (param1 <= -19) {
              L10: {
                if (var5.field_l != var5.field_l) {
                  var4 = 1;
                  System.out.println("int id has changed. before=" + var5.field_l + ", now=" + var5.field_l);
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (var4 == 0) {
                  break L11;
                } else {
                  System.out.println("This instance of Body has changed, where id=" + var5.field_l);
                  break L11;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var3;
            stackOut_36_1 = new StringBuilder().append("anb.F(");
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L12;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L12;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + 44 + param1 + 41);
        }
    }

    final int j(int param0) {
        if (param0 != 995401160) {
            int discarded$0 = ((anb) this).f(85);
        }
        int var2 = ((anb) this).field_r >> 8;
        return (int)((long)((anb) this).field_i * (long)fc.a(var2, (byte) -62) - (long)((anb) this).field_j * (long)eu.a(var2, 124) >> 16);
    }

    final void a(boolean param0, boolean param1, pe param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              ((anb) this).field_d = ((anb) this).field_d + ((anb) this).field_f;
              if (param1) {
                break L1;
              } else {
                ((anb) this).e((byte) 36);
                break L1;
              }
            }
            L2: {
              ((anb) this).field_r = ((anb) this).field_r + ((anb) this).field_n;
              ((anb) this).field_e = ((anb) this).field_e + ((anb) this).field_h;
              ((anb) this).field_n = nu.field_q * ((anb) this).field_n / gbb.field_o;
              ((anb) this).field_h = ((anb) this).field_h * ibb.field_a / fna.field_o;
              ((anb) this).field_f = ibb.field_a * ((anb) this).field_f / fna.field_o;
              if (!param0) {
                break L2;
              } else {
                param2.field_u.a(((anb) this).field_q, (byte) -105);
                break L2;
              }
            }
            L3: {
              this.c(16);
              var4_int = ((anb) this).field_d - ((anb) this).j(995401160);
              var5 = ((anb) this).field_e - ((anb) this).i((byte) 5);
              ((anb) this).field_k.a(this instanceof sg, var4_int, var5, ((anb) this).field_r >> 8, 0, ((anb) this).field_q);
              if (param0) {
                param2.field_u.a(1, ((anb) this).d(82), ((anb) this).field_l, ((anb) this).field_q);
                ((anb) this).d((byte) 124);
                break L3;
              } else {
                ((anb) this).d((byte) 124);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("anb.VA(").append(param0).append(44).append(param1).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    final int i(byte param0) {
        if (param0 != 5) {
            return -127;
        }
        int var2 = ((anb) this).field_r >> 8;
        return (int)((long)((anb) this).field_i * (long)eu.a(var2, param0 + 105) + (long)((anb) this).field_j * (long)fc.a(var2, (byte) -68) >> 16);
    }

    public void a(faa param0, int param1) {
        try {
            super.a(param0, false);
            if (kv.a(false, param0)) {
                if (null == ((anb) this).field_k) {
                    ((anb) this).field_k = new ml();
                }
                ((anb) this).field_k.a(param0, 32);
            } else {
                ((anb) this).field_k = null;
            }
            ((anb) this).field_r = uwa.a(24, param0, (byte) 20);
            ((anb) this).field_n = uwa.a(24, param0, (byte) 20);
            ((anb) this).field_i = param0.i(0, 32);
            ((anb) this).field_j = param0.i(param1 + -32, 32);
            ((anb) this).field_s = param0.i(0, param1);
            ((anb) this).field_m = param0.i(0, 32);
            ((anb) this).field_q = wkb.a((byte) 37, ((anb) this).field_q, param0, 8);
            ((anb) this).field_l = param0.i(0, 16);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "anb.L(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    private final void a(int[] param0, int[] param1, int[] param2, int param3, int[] param4, int param5, ml[] param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var12 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param3 == 3) {
                break L1;
              } else {
                ((anb) this).field_k = null;
                break L1;
              }
            }
            var8_int = 0;
            L2: while (true) {
              if (~param6.length >= ~var8_int) {
                break L0;
              } else {
                L3: {
                  var9 = ar.a(param4[var8_int], (byte) 111, param1[var8_int]);
                  if (param2[var8_int] < 0) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L3;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L3;
                  }
                }
                L4: {
                  stackOut_8_0 = stackIn_8_0;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (param5 < 0) {
                    stackOut_10_0 = stackIn_10_0;
                    stackOut_10_1 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    break L4;
                  } else {
                    stackOut_9_0 = stackIn_9_0;
                    stackOut_9_1 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    break L4;
                  }
                }
                L5: {
                  L6: {
                    L7: {
                      var10 = stackIn_11_0 ^ stackIn_11_1;
                      var11 = param2[var8_int];
                      if (param2[var8_int] >= 0) {
                        break L7;
                      } else {
                        if (var10 != 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    if (0 >= param2[var8_int]) {
                      break L5;
                    } else {
                      if (var10 != 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var11 = -var11;
                  break L5;
                }
                param0[var8_int] = var11 / Math.max(var9, 1);
                var8_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var8 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var8;
            stackOut_20_1 = new StringBuilder().append("anb.CA(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          L9: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          L10: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L10;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L10;
            }
          }
          L11: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(44).append(param3).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param4 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L11;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L11;
            }
          }
          L12: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(44).append(param5).append(44);
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param6 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L12;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L12;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 41);
        }
    }

    final int g(byte param0) {
        int var2 = 124 % ((param0 - 62) / 55);
        return ((anb) this).field_e;
    }

    final int g(int param0) {
        if (param0 >= -36) {
            int discarded$0 = ((anb) this).g(-59);
        }
        int var2 = Math.abs(-((anb) this).field_d + ((anb) this).field_q[0]);
        int var3 = Math.abs(-((anb) this).field_d + ((anb) this).field_q[1]);
        int var4 = Math.abs(((anb) this).field_q[2] - ((anb) this).field_e);
        int var5 = Math.abs(((anb) this).field_q[3] - ((anb) this).field_e);
        return Math.max(var2, Math.max(var3, Math.max(var4, var5)));
    }

    final void b(int param0, int param1) {
        int var3 = 0;
        Object var4 = null;
        L0: {
          if (param0 == 24) {
            break L0;
          } else {
            var4 = null;
            ((anb) this).a((lta) null, -28, (pe) null, -49);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((anb) this).field_t != 0) {
              break L2;
            } else {
              if (((anb) this).field_o == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          ((anb) this).field_f = ((anb) this).field_f + ((anb) this).field_t / param1;
          ((anb) this).field_h = ((anb) this).field_h + ((anb) this).field_o / param1;
          ((anb) this).d((byte) 91);
          ((anb) this).field_t = 0;
          ((anb) this).field_o = 0;
          break L1;
        }
        L3: {
          if (((anb) this).field_p != 0) {
            var3 = ((anb) this).field_p / Math.max(((anb) this).field_m >> wf.field_e, 1);
            ((anb) this).field_n = ((anb) this).field_n + var3;
            ((anb) this).d((byte) 40);
            ((anb) this).field_p = 0;
            break L3;
          } else {
            break L3;
          }
        }
    }

    final void i(int param0) {
        this.c(16);
        int var2 = ((anb) this).field_d - ((anb) this).j(995401160);
        int var3 = ((anb) this).field_e - ((anb) this).i((byte) 5);
        ((anb) this).field_k.a(this instanceof sg, var2, var3, ((anb) this).field_r >> 8, param0, ((anb) this).field_q);
    }

    final int e(int param0) {
        if (param0 != 0) {
            ((anb) this).field_o = -108;
        }
        return ((anb) this).field_r >> 8;
    }

    int d(int param0) {
        if (param0 <= 42) {
            ((anb) this).field_p = -29;
        }
        return -1;
    }

    void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var2 = ((anb) this).j(995401160);
          var3 = ((anb) this).i((byte) 5);
          ((anb) this).field_k.a(0, true, 0, false, (byte) 88, 0, (int[]) null);
          if (param0 == 119) {
            break L0;
          } else {
            ((anb) this).field_k = null;
            break L0;
          }
        }
        ((anb) this).field_s = ((anb) this).field_k.e((byte) -86);
        var4 = new int[]{0, 0, 0};
        ((anb) this).field_k.a((byte) 114, var4);
        var5 = Math.max(1, var4[2] >> 4);
        ((anb) this).field_j = var4[1] / var5;
        ((anb) this).field_i = var4[0] / var5;
        ((anb) this).field_m = ((anb) this).field_k.a(-921054591, ((anb) this).field_i, ((anb) this).field_j);
        var6 = ((anb) this).j(995401160);
        var7 = ((anb) this).i((byte) 5);
        var8 = var6 + -var2;
        ((anb) this).field_d = ((anb) this).field_d + var8;
        var9 = var7 + -var3;
        ((anb) this).field_e = ((anb) this).field_e + var9;
        ((anb) this).field_k.a(((anb) this).field_r >> 8, false, ((anb) this).field_e - var7, this instanceof sg, (byte) 106, ((anb) this).field_d - var6, (int[]) null);
        ((anb) this).d((byte) 38);
    }

    final boolean h(int param0) {
        if (param0 >= -112) {
            return false;
        }
        return ((anb) this).field_k.k((byte) 84);
    }

    public void b(faa param0, int param1) {
        RuntimeException var3 = null;
        faa stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        faa stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        faa stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        faa stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        faa stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        faa stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              super.b(param0, -111);
              stackOut_0_0 = (faa) param0;
              stackOut_0_1 = -94;
              stackIn_2_0 = stackOut_0_0;
              stackIn_2_1 = stackOut_0_1;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              if (((anb) this).field_k == null) {
                stackOut_2_0 = (faa) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                break L1;
              } else {
                stackOut_1_0 = (faa) (Object) stackIn_1_0;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                break L1;
              }
            }
            L2: {
              if (vq.a(stackIn_3_0, stackIn_3_1, stackIn_3_2 != 0)) {
                ((anb) this).field_k.b(param0, -115);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              param0.a(-632, ((anb) this).field_r, 24);
              param0.a(-632, ((anb) this).field_n, 24);
              param0.a(-632, ((anb) this).field_l, 16);
              if (param1 <= -109) {
                break L3;
              } else {
                this.c(-33);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("anb.B(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = fc.a(param1, (byte) -69) * param3 >> 8;
        int var7 = param3 * eu.a(param1, 42) >> 8;
        ((anb) this).a(var7, param2, param0, (byte) -118, var6);
        if (param4 != 1948934248) {
            ((anb) this).field_l = 82;
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4 = -57 / ((param0 - -56) / 55);
        return ((anb) this).field_k.a(param2, false, 0, param1, 21750, 0);
    }

    public void a(faa param0, boolean param1) {
        try {
            super.a(param0, false);
            if (kv.a(param1, param0)) {
                if (null == ((anb) this).field_k) {
                    ((anb) this).field_k = new ml();
                }
                ((anb) this).field_k.a(param0, false);
            } else {
                ((anb) this).field_k = null;
            }
            ((anb) this).field_r = uwa.a(24, param0, (byte) 20);
            ((anb) this).field_n = uwa.a(24, param0, (byte) 20);
            ((anb) this).field_l = param0.i(0, 16);
            this.h((byte) 63);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "anb.H(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(int param0, boolean param1, pe param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((anb) this).field_k.a(param1, param2, (anb) this, (byte) -89);
              if (param0 < -46) {
                break L1;
              } else {
                ((anb) this).field_t = 42;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("anb.RA(").append(param0).append(44).append(param1).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final void a(lta param0, int param1, pe param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (!rna.a(((anb) this).field_q, param0.field_f, 36)) {
              return;
            } else {
              L1: {
                ((anb) this).field_k.a((byte) 125, param0, this instanceof sg, param2, param1);
                if (pqa.a(2, 11284)) {
                  var5_int = ((anb) this).j(995401160);
                  var6 = ((anb) this).i((byte) 5);
                  var7 = param0.a(((anb) this).field_d, (byte) 125);
                  var8 = param0.b(true, ((anb) this).field_e);
                  ena.a(var8, param0.field_a * 1024.0f, -81, var7, 16711680);
                  var9 = param0.a(-var5_int + ((anb) this).field_d, (byte) 122);
                  var10 = param0.b(true, -var6 + ((anb) this).field_e);
                  kq.a(1024.0f * param0.field_a, (byte) 90, var10, 16777215, var9);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (pqa.a(param3, param3 ^ 11268)) {
                  var5_int = param0.a(((anb) this).field_q[0], (byte) 121);
                  var6 = param0.a(((anb) this).field_q[1], (byte) 112);
                  var7 = param0.b(true, ((anb) this).field_q[2]);
                  var8 = param0.b(true, ((anb) this).field_q[3]);
                  uv.a(param3 + 105, var5_int, -var7 + var8, var7, 16711935, -var5_int + var6);
                  break L2;
                } else {
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("anb.IB(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param3 + 41);
        }
    }

    final void a(int param0, int param1) {
        ((anb) this).field_r = param0 << 8;
        if (param1 > -13) {
            ((anb) this).field_i = -127;
        }
    }

    final int c(byte param0) {
        if (param0 > -111) {
            return 58;
        }
        return ((anb) this).field_f;
    }

    final void a(int param0, pe param1) {
        try {
            int var3_int = -85 % ((26 - param0) / 35);
            boolean discarded$0 = ((anb) this).field_k.a(0, param1, (anb) this);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "anb.NA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final int b(boolean param0) {
        if (!param0) {
            return -2;
        }
        return ((anb) this).field_k.a(0, ((anb) this).field_e, -125, ((anb) this).field_d);
    }

    final int f(int param0) {
        if (param0 != 0) {
            ((anb) this).field_l = -93;
        }
        return ((anb) this).field_h;
    }

    final boolean k(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == 995401160) {
            break L0;
          } else {
            ((anb) this).field_t = -99;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((anb) this).field_f != 0) {
              break L2;
            } else {
              if (((anb) this).field_h != 0) {
                break L2;
              } else {
                if (((anb) this).field_n == 0) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    public void a(faa param0, byte param1) {
        super.b(param0, -113);
        if (vq.a(param0, 54, ((anb) this).field_k != null ? true : false)) {
            ((anb) this).field_k.a(param0, (byte) -113);
        }
        param0.a(-632, ((anb) this).field_r, 24);
        if (param1 > -91) {
            return;
        }
        try {
            param0.a(-632, ((anb) this).field_n, 24);
            param0.a(-632, ((anb) this).field_i, 32);
            param0.a(-632, ((anb) this).field_j, 32);
            param0.a(-632, ((anb) this).field_s, 32);
            param0.a(-632, ((anb) this).field_m, 32);
            pgb.a(8, null != ((anb) this).field_q ? ((anb) this).field_q.length : 0, 84, param0, ((anb) this).field_q);
            param0.a(-632, ((anb) this).field_l, 16);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "anb.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    private final void h(byte param0) {
        if (this instanceof nbb) {
            ((anb) this).field_k.c(0, ((anb) this).field_k.i((byte) -112).field_b, param0 + -7, ((anb) this).field_k.i((byte) -112).field_i);
        } else {
            ((anb) this).field_k.c(0, 0, 56, 0);
        }
        int var2 = ((anb) this).field_d;
        int var3 = ((anb) this).field_e;
        ((anb) this).e((byte) 119);
        ((anb) this).field_d = var2;
        if (param0 != 63) {
            return;
        }
        ((anb) this).field_e = var3;
        this.c(16);
        ((anb) this).field_k.a(this instanceof sg, ((anb) this).field_d + -((anb) this).j(995401160), ((anb) this).field_e + -((anb) this).i((byte) 5), ((anb) this).field_r >> 8, param0 + -63, ((anb) this).field_q);
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = 5 / ((param2 - -11) / 38);
        ((anb) this).field_d = param0;
        ((anb) this).field_e = param1;
    }

    final boolean c(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          if (param2 >= 8) {
            break L0;
          } else {
            boolean discarded$2 = ((anb) this).c(101, -72, -14, 88, 79);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((anb) this).field_q == null) {
              break L2;
            } else {
              L3: {
                if (((anb) this).field_q[0] < param4) {
                  break L3;
                } else {
                  if (((anb) this).field_q[1] > param1) {
                    break L3;
                  } else {
                    if (((anb) this).field_q[2] < param3) {
                      break L3;
                    } else {
                      if (((anb) this).field_q[3] <= param0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              stackOut_8_0 = 1;
              stackIn_10_0 = stackOut_8_0;
              break L1;
            }
          }
          stackOut_9_0 = 0;
          stackIn_10_0 = stackOut_9_0;
          break L1;
        }
        return stackIn_10_0 != 0;
    }

    void d(byte param0) {
        int var2 = -43 % ((param0 - -4) / 38);
    }

    final int c(boolean param0) {
        if (param0) {
            Object var3 = null;
            ((anb) this).a((pe) null, 115, false, 79, -113);
        }
        return ((anb) this).field_l;
    }

    void a(int param0, int param1, pe param2, int param3, int param4) {
        RuntimeException var6 = null;
        Object var7 = null;
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
              if (param1 < 0) {
                break L1;
              } else {
                ((anb) this).field_k.a(param1, param3, param2, (byte) -73, param4, (anb) this);
                break L1;
              }
            }
            L2: {
              if (param0 <= -36) {
                break L2;
              } else {
                var7 = null;
                ((anb) this).a(-66, -62, (pe) null, 87, -25);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6;
            stackOut_5_1 = new StringBuilder().append("anb.WA(").append(param0).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void a(pe param0, int param1, boolean param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        ml[] var7_ref_ml__ = null;
        int var8_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12_int = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18_int = 0;
        boolean[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        Object var27 = null;
        ml var27_ref = null;
        Object var28 = null;
        ml var28_ref = null;
        Object var29 = null;
        ml var29_ref = null;
        Object var30 = null;
        ml var30_ref = null;
        Object var31 = null;
        ml var31_ref = null;
        Object var32 = null;
        ml var32_ref = null;
        ml var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        ml var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        int[] var53 = null;
        int[] var54 = null;
        int[] var55 = null;
        int[] var56 = null;
        int[] var57 = null;
        int[] var58 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        var27 = null;
        var28 = null;
        var29 = null;
        var30 = null;
        var31 = null;
        var32 = null;
        var26 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (gra.field_o == 1) {
                if (((anb) this).field_k.i((byte) -112).field_s) {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              } else {
                stackOut_2_0 = 0;
                stackIn_7_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_7_0;
              if (!param2) {
                break L2;
              } else {
                this.h((byte) -95);
                break L2;
              }
            }
            L3: {
              if (var6_int != 0) {
                var27_ref = new ml(13);
                var27_ref.a((byte) -127, 1);
                var8_int = 4096;
                var9 = -(var8_int * fc.a(((anb) this).field_k.field_b, (byte) -76)) >> 16;
                var10 = -(eu.a(((anb) this).field_k.field_b, 40) * var8_int) >> 16;
                var27_ref.a(false, ((anb) this).field_k.field_r - -var9, ((anb) this).field_k.field_n - -var10, ((anb) this).field_k.field_b, 0, (int[]) null);
                av.field_a[0] = var27_ref;
                var28_ref = new ml(13);
                var28_ref.a((byte) 114, 2);
                var8_int = 4096;
                var9 = fc.a(((anb) this).field_k.field_b, (byte) 100) * var8_int >> 16;
                var10 = var8_int * eu.a(((anb) this).field_k.field_b, 122) >> 16;
                var11 = ((anb) this).field_k.field_b - -4096;
                var28_ref.a(false, ((anb) this).field_k.field_r + var9, ((anb) this).field_k.field_n - -var10, var11, 0, (int[]) null);
                av.field_a[1] = var28_ref;
                var29_ref = new ml(13);
                var29_ref.a((byte) 113, 36);
                var8_int = 8192;
                var9 = rrb.a(22433, 256 + ((anb) this).field_k.field_b);
                var10 = var8_int * fc.a(var9, (byte) -112) >> 16;
                var11 = var8_int * eu.a(var9, 85) >> 16;
                var12_int = rrb.a(22433, -2048 + ((anb) this).field_k.field_b);
                var29_ref.a(false, var10 + ((anb) this).field_k.field_r, var11 + ((anb) this).field_k.field_n, var12_int, 0, (int[]) null);
                av.field_a[2] = var29_ref;
                var30_ref = new ml(13);
                var30_ref.a((byte) 120, 72);
                var8_int = 8192;
                var9 = rrb.a(22433, ((anb) this).field_k.field_b - 256);
                var10 = var8_int * fc.a(var9, (byte) -102) >> 16;
                var11 = var8_int * eu.a(var9, 87) >> 16;
                var12_int = rrb.a(22433, 2048 + ((anb) this).field_k.field_b);
                var30_ref.a(false, var10 + ((anb) this).field_k.field_r, var11 + ((anb) this).field_k.field_n, var12_int, 0, (int[]) null);
                av.field_a[3] = var30_ref;
                var31_ref = new ml(13);
                var31_ref.a((byte) -23, 68);
                var8_int = 8192;
                var9 = rrb.a(22433, ((anb) this).field_k.field_b - 3840);
                var10 = fc.a(var9, (byte) -91) * var8_int >> 16;
                var11 = var8_int * eu.a(var9, 122) >> 16;
                var12_int = rrb.a(22433, ((anb) this).field_k.field_b + 2048);
                var31_ref.a(false, var10 + ((anb) this).field_k.field_r, var11 + ((anb) this).field_k.field_n, var12_int, 0, (int[]) null);
                av.field_a[4] = var31_ref;
                var32_ref = new ml(13);
                var32_ref.a((byte) 12, 40);
                var8_int = 8192;
                var9 = rrb.a(22433, 4096 + ((anb) this).field_k.field_b - 256);
                var10 = var8_int * fc.a(var9, (byte) 46) >> 16;
                var11 = var8_int * eu.a(var9, 85) >> 16;
                var12_int = rrb.a(22433, ((anb) this).field_k.field_b + -2048);
                var32_ref.a(false, var10 + ((anb) this).field_k.field_r, ((anb) this).field_k.field_n - -var11, var12_int, 0, (int[]) null);
                av.field_a[5] = var32_ref;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              L5: {
                if (1 != wqa.field_b) {
                  break L5;
                } else {
                  if ((99 & param1) == 0) {
                    break L5;
                  } else {
                    if ((param1 & 111) != (99 & param1)) {
                      break L5;
                    } else {
                      L6: {
                        var7_ref_ml__ = ((anb) this).field_k.a(0, (ml[]) null, param1);
                        if (var6_int == 0) {
                          break L6;
                        } else {
                          var8_int = 0;
                          L7: while (true) {
                            if (var8_int >= av.field_a.length) {
                              break L6;
                            } else {
                              var7_ref_ml__ = (ml[]) (Object) ija.a((Object) (Object) av.field_a[var8_int], (Object[]) (Object) var7_ref_ml__, 0, ii.field_d);
                              var8_int++;
                              continue L7;
                            }
                          }
                        }
                      }
                      if (var7_ref_ml__ != null) {
                        var53 = new int[var7_ref_ml__.length];
                        var47 = var53;
                        var41 = var47;
                        var34 = var41;
                        var8 = var34;
                        var9 = ((anb) this).field_t;
                        var10 = ((anb) this).field_o;
                        var11 = ((anb) this).field_p;
                        var55 = new int[var7_ref_ml__.length];
                        var49 = var55;
                        var43 = var49;
                        var36 = var43;
                        var12 = var36;
                        var56 = new int[var7_ref_ml__.length];
                        var50 = var56;
                        var44 = var50;
                        var37 = var44;
                        var13 = var37;
                        var54 = new int[var7_ref_ml__.length];
                        var48 = var54;
                        var42 = var48;
                        var35 = var42;
                        var14 = var35;
                        var15 = 0;
                        var16 = 0;
                        L8: while (true) {
                          if (var7_ref_ml__.length <= var16) {
                            L9: {
                              ((anb) this).field_o = var10;
                              ((anb) this).field_p = var11;
                              ((anb) this).field_t = var9;
                              var16 = var15 / Math.max(((anb) this).field_m >> wf.field_e, 1);
                              if (var15 == 0) {
                                break L9;
                              } else {
                                if (Math.abs(var16) <= us.field_f) {
                                  break L9;
                                } else {
                                  var57 = new int[var7_ref_ml__.length];
                                  var18 = new boolean[var7_ref_ml__.length];
                                  this.a(var57, var56, var54, 3, var55, var15, var7_ref_ml__);
                                  var58 = new int[var7_ref_ml__.length];
                                  var20 = 0;
                                  L10: while (true) {
                                    if (var58.length <= var20) {
                                      var20 = 0;
                                      L11: while (true) {
                                        if (var58.length <= var20) {
                                          break L9;
                                        } else {
                                          var21 = var58[var20];
                                          if (0 <= var57[var21]) {
                                            var22 = var54[var21];
                                            var23 = Math.abs(var15);
                                            var24 = Math.abs(var22) >> 8;
                                            var25 = var23 / Math.max(var24, 1);
                                            if (var25 < 256) {
                                              if (var53[var21] > 0) {
                                                var8[var21] = -var25 + 256;
                                                break L9;
                                              } else {
                                                var53[var21] = var25;
                                                break L9;
                                              }
                                            } else {
                                              L12: {
                                                if (var53[var21] > 0) {
                                                  var53[var21] = 0;
                                                  break L12;
                                                } else {
                                                  var53[var21] = 256;
                                                  break L12;
                                                }
                                              }
                                              var15 = var15 + var22;
                                              var25 = 256;
                                              var20++;
                                              continue L11;
                                            }
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                    } else {
                                      var21 = -2147483648;
                                      var22 = -1;
                                      var23 = 0;
                                      L13: while (true) {
                                        if (var23 >= var57.length) {
                                          L14: {
                                            if (var22 == -1) {
                                              break L14;
                                            } else {
                                              var58[var20] = var22;
                                              var18[var22] = true;
                                              break L14;
                                            }
                                          }
                                          var20++;
                                          continue L10;
                                        } else {
                                          L15: {
                                            if (var18[var23]) {
                                              break L15;
                                            } else {
                                              break L15;
                                            }
                                          }
                                          var23++;
                                          continue L13;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var17 = 0;
                            L16: while (true) {
                              if (var17 >= var7_ref_ml__.length) {
                                param1 = param1 & -112;
                                break L5;
                              } else {
                                L17: {
                                  var40 = var7_ref_ml__[var17];
                                  if (var53[var17] > 0) {
                                    var40.a((anb) this, param4, param0, param3, 55, var53[var17]);
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                                var17++;
                                continue L16;
                              }
                            }
                          } else {
                            L18: {
                              var33 = var7_ref_ml__[var16];
                              var18_int = var33.field_e;
                              var19 = ((anb) this).field_t;
                              var20 = ((anb) this).field_o;
                              var21 = ((anb) this).field_p;
                              var22 = var33.field_a.a(var33.field_j, false);
                              ((anb) this).a(var33.field_n, var33.field_b, var33.field_r, var22, 1948934248);
                              var12[var16] = ((anb) this).field_t + -var19;
                              var13[var16] = -var20 + ((anb) this).field_o;
                              var14[var16] = ((anb) this).field_p + -var21;
                              if ((param1 & var18_int) == 0) {
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            var16++;
                            continue L8;
                          }
                        }
                      } else {
                        param1 = param1 & -112;
                        if (var6_int != 0) {
                          var7 = 0;
                          L19: while (true) {
                            if (var7 >= av.field_a.length) {
                              break L4;
                            } else {
                              av.field_a[var7].a(param4, 7834, (anb) this, param3, param1, param0);
                              var7++;
                              continue L19;
                            }
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
              }
              if (var6_int != 0) {
                var7 = 0;
                L20: while (true) {
                  if (var7 >= av.field_a.length) {
                    break L4;
                  } else {
                    av.field_a[var7].a(param4, 7834, (anb) this, param3, param1, param0);
                    var7++;
                    continue L20;
                  }
                }
              } else {
                break L4;
              }
            }
            ((anb) this).field_k.a(param4, 7834, (anb) this, param3, param1, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var6 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) var6;
            stackOut_69_1 = new StringBuilder().append("anb.FB(");
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param0 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L21;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L21;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_72_0, stackIn_72_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final int e(boolean param0) {
        if (param0) {
            ((anb) this).field_r = 99;
        }
        return ((anb) this).field_s;
    }

    void a(pe param0, boolean param1, byte param2, boolean param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        Object var6 = null;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (param1) {
                  break L2;
                } else {
                  if (0 != ((anb) this).field_f) {
                    break L2;
                  } else {
                    if (((anb) this).field_h != 0) {
                      break L2;
                    } else {
                      if (0 != ((anb) this).field_n) {
                        break L2;
                      } else {
                        L3: {
                          if (((anb) this).field_q[0] != 0) {
                            break L3;
                          } else {
                            if (((anb) this).field_q[1] != 0) {
                              break L3;
                            } else {
                              if (((anb) this).field_q[2] != 0) {
                                break L3;
                              } else {
                                if (0 != ((anb) this).field_q[3]) {
                                  break L3;
                                } else {
                                  break L2;
                                }
                              }
                            }
                          }
                        }
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        break L1;
                      }
                    }
                  }
                }
              }
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
              break L1;
            }
            L4: {
              var5_int = stackIn_11_0;
              if (var5_int != 0) {
                ((anb) this).a(param3, true, param0);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (!(this instanceof sg)) {
                break L5;
              } else {
                ((anb) this).field_k.a(true, (byte) -124, param0, (anb) this);
                break L5;
              }
            }
            L6: {
              if (param2 == 67) {
                break L6;
              } else {
                var6 = null;
                ((anb) this).a(93, false, (pe) null);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5;
            stackOut_19_1 = new StringBuilder().append("anb.SA(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final int d(boolean param0) {
        if (param0) {
            ((anb) this).e((byte) 22);
        }
        return ((anb) this).field_d;
    }

    final void a(tpb param0, tj param1, byte param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
            L1: {
              ((anb) this).field_k.a(param1, param0, 0);
              if (param2 >= 24) {
                break L1;
              } else {
                ((anb) this).field_r = 116;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("anb.U(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 41);
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        if (null != ((anb) this).field_q) {
          L0: {
            if (param1 == 2147483647) {
              break L0;
            } else {
              int[] discarded$1 = ((anb) this).f((byte) 36);
              break L0;
            }
          }
          L1: {
            var6 = 0;
            if (((anb) this).field_q[0] < param3) {
              L2: {
                var6 = 1;
                if (0 > ((anb) this).field_f) {
                  ((anb) this).field_f = -((anb) this).field_f;
                  break L2;
                } else {
                  break L2;
                }
              }
              ((anb) this).field_d = ((anb) this).field_d + (-((anb) this).field_q[0] + param3);
              break L1;
            } else {
              break L1;
            }
          }
          L3: {
            if (param4 >= ((anb) this).field_q[1]) {
              break L3;
            } else {
              L4: {
                if (((anb) this).field_f <= 0) {
                  break L4;
                } else {
                  ((anb) this).field_f = -((anb) this).field_f;
                  break L4;
                }
              }
              var6 = 1;
              ((anb) this).field_d = ((anb) this).field_d + (param4 - ((anb) this).field_q[1]);
              break L3;
            }
          }
          L5: {
            if (((anb) this).field_q[2] >= param0) {
              break L5;
            } else {
              L6: {
                if (((anb) this).field_h < 0) {
                  ((anb) this).field_h = -((anb) this).field_h;
                  break L6;
                } else {
                  break L6;
                }
              }
              var6 = 1;
              ((anb) this).field_e = ((anb) this).field_e + (-((anb) this).field_q[2] + param0);
              break L5;
            }
          }
          L7: {
            if (((anb) this).field_q[3] > param2) {
              L8: {
                ((anb) this).field_e = ((anb) this).field_e + (param2 + -((anb) this).field_q[3]);
                if (((anb) this).field_h <= 0) {
                  break L8;
                } else {
                  ((anb) this).field_h = -((anb) this).field_h;
                  break L8;
                }
              }
              var6 = 1;
              break L7;
            } else {
              break L7;
            }
          }
          return var6 != 0;
        } else {
          return false;
        }
    }

    final int[] f(byte param0) {
        if (param0 >= -21) {
            return null;
        }
        return ((anb) this).field_q;
    }

    public boolean a(byte param0, tv param1) {
        anb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        anb var5 = null;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var4 = -16 / ((param0 - 22) / 59);
                var5 = (anb) (Object) param1;
                var3 = var5;
                if (super.a((byte) 104, param1)) {
                  break L2;
                } else {
                  ml discarded$2 = var5.field_k;
                  L3: {
                    if (var3.field_k == null) {
                      break L3;
                    } else {
                      if (var3.field_k.a((byte) 126, (tv) (Object) var3.field_k)) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (var3.field_r != var3.field_r) {
                    break L2;
                  } else {
                    if (var3.field_n != var3.field_n) {
                      break L2;
                    } else {
                      if (var3.field_l == var3.field_l) {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              stackOut_10_0 = 1;
              stackIn_12_0 = stackOut_10_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("anb.C(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_12_0 != 0;
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        L0: {
          ((anb) this).field_t = ((anb) this).field_t + param4;
          ((anb) this).field_o = ((anb) this).field_o + param0;
          var6 = -((anb) this).field_d + param1;
          var7 = -((anb) this).field_e + param2;
          if (param3 <= -112) {
            break L0;
          } else {
            ((anb) this).field_s = 65;
            break L0;
          }
        }
        L1: {
          var8 = (long)(-var7 >> ge.field_c);
          var10 = (long)(var6 >> ge.field_c);
          var12 = var8 * (long)param4 - -((long)param0 * var10);
          var14 = ((anb) this).field_p;
          ((anb) this).field_p = (int)((long)((anb) this).field_p + (var12 >> tua.field_a));
          if (var12 <= 0L) {
            if (var12 >= 0L) {
              break L1;
            } else {
              if (var14 < ((anb) this).field_p) {
                ((anb) this).field_p = -2147483648;
                break L1;
              } else {
                if (var12 >= 0L) {
                  break L1;
                } else {
                  if (var14 >= ((anb) this).field_p) {
                    break L1;
                  } else {
                    ((anb) this).field_p = -2147483648;
                    break L1;
                  }
                }
              }
            }
          } else {
            if (var12 >= 0L) {
              break L1;
            } else {
              if (var14 >= ((anb) this).field_p) {
                break L1;
              } else {
                ((anb) this).field_p = -2147483648;
                break L1;
              }
            }
          }
        }
        ((anb) this).d((byte) 111);
        cqb.a(param1, param2, param2 - param0, -param4 + param1, (byte) -54);
    }

    final void a(sfa param0, tj param1, int param2) {
        RuntimeException runtimeException = null;
        Object var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
            L1: {
              ((anb) this).field_k.a(param1, param0, -1);
              if (param2 == -4414) {
                break L1;
              } else {
                var5 = null;
                ((anb) this).a(97, false, (pe) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("anb.JB(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 41);
        }
    }

    public final String toString() {
        return ": Mass=" + ((anb) this).field_s + ", MOI=" + ((anb) this).field_m + ",xpos=" + ((anb) this).field_d + ",ypos=" + ((anb) this).field_e + ", angle=" + ((anb) this).field_r + ",avel=" + ((anb) this).field_n;
    }

    public void b(byte param0, tv param1) {
        anb var4 = null;
        try {
            super.b((byte) 105, param1);
            var4 = (anb) (Object) param1;
            if (null != var4.field_k) {
                if (null == var4.field_k) {
                    var4.field_k = new ml();
                }
                var4.field_k.b((byte) 110, (tv) (Object) var4.field_k);
            } else {
                var4.field_k = null;
            }
            var4.field_n = var4.field_n;
            var4.field_m = var4.field_m;
            var4.field_r = var4.field_r;
            var4.field_s = var4.field_s;
            var4.field_i = var4.field_i;
            var4.field_j = var4.field_j;
            if (param0 < 54) {
                ((anb) this).field_l = 79;
            }
            var4.field_q = dob.a(var4.field_q, (byte) -85, var4.field_q);
            var4.field_l = var4.field_l;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "anb.D(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    anb() {
        ((anb) this).field_q = new int[4];
    }

    private final void c(int param0) {
        ((anb) this).field_q[3] = -2147483648;
        ((anb) this).field_q[2] = 2147483647;
        ((anb) this).field_q[1] = -2147483648;
        if (param0 != 16) {
            ((anb) this).field_s = 17;
        }
        ((anb) this).field_q[0] = 2147483647;
    }

    static {
    }
}
