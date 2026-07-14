/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm {
    static ne[] field_c;
    static byte[] field_b;
    private int field_g;
    wb field_i;
    private int field_d;
    private int field_h;
    wb[] field_j;
    private boolean field_e;
    private int field_a;
    private int field_f;

    final void a(sm param0, byte param1) {
        if (param1 < 74) {
            field_b = null;
        }
        param0.field_d = ((sm) this).field_d;
        param0.field_e = ((sm) this).field_e;
        param0.field_h = ((sm) this).field_h;
        param0.field_g = ((sm) this).field_g;
        param0.field_i = ((sm) this).field_i;
        param0.field_a = ((sm) this).field_a;
        param0.field_f = ((sm) this).field_f;
        param0.field_j = ((sm) this).field_j;
    }

    final void a(boolean param0) {
        ((sm) this).field_d = 0;
        ((sm) this).field_a = 0;
        ((sm) this).field_i = null;
        if (!param0) {
            field_c = null;
        }
        ((sm) this).field_g = 256;
        ((sm) this).field_f = -1;
        ((sm) this).field_h = 0;
        ((sm) this).field_j = null;
    }

    final sm d(int param0, int param1) {
        ((sm) this).field_f = param0;
        if (param1 != 30149) {
            ((sm) this).field_g = -30;
        }
        return (sm) this;
    }

    final sm a(wb[] param0, int param1) {
        if (param1 != 2147483647) {
            return null;
        }
        ((sm) this).field_j = param0;
        return (sm) this;
    }

    final static void a(int param0) {
        aa.field_a[0] = (ah) (Object) new fe(81920, 61440);
        aa.field_a[0].field_I = !rf.a(false) ? 5 : 10;
        aa.field_a[0].field_y = !rf.a(false) ? 5 : 10;
        aa.field_a[0].field_t = rf.a(false) ? 10 : 5;
        if (param0 <= 68) {
            sm.a((byte) 108);
        }
        aa.field_a[0].c((byte) 35);
        fa.field_b = 250;
    }

    final sm a(int param0, int param1) {
        if (param1 != -1) {
            return null;
        }
        ((sm) this).field_d = param0;
        return (sm) this;
    }

    final sm c(int param0, int param1) {
        if (param1 != 17818) {
            ((sm) this).field_a = 47;
        }
        ((sm) this).field_a = param0;
        return (sm) this;
    }

    final sm b(int param0, int param1) {
        ((sm) this).field_h = param1;
        if (param0 != 1) {
            ((sm) this).field_h = 21;
        }
        return (sm) this;
    }

    final static short[] a(short[] param0, pl param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        var4 = param1.b(param3, (byte) -109);
        if (var4 != 0) {
          L0: {
            if (param2 < -111) {
              break L0;
            } else {
              sm.a((byte) -110);
              break L0;
            }
          }
          L1: {
            L2: {
              if (param0 == null) {
                break L2;
              } else {
                if (param0.length != var4) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            param0 = new short[var4];
            break L1;
          }
          L3: {
            var5 = param1.b(4, (byte) -94);
            var6 = (short)param1.b(16, (byte) -119);
            if ((var5 ^ -1) < -1) {
              var7 = 0;
              L4: while (true) {
                if (var4 <= var7) {
                  break L3;
                } else {
                  param0[var7] = (short)(var6 + param1.b(var5, (byte) -123));
                  var7++;
                  continue L4;
                }
              }
            } else {
              var7 = 0;
              L5: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param0[var7] = (short)var6;
                  var7++;
                  continue L5;
                }
              }
            }
          }
          return param0;
        } else {
          return null;
        }
    }

    final sm a(boolean param0, boolean param1) {
        ((sm) this).field_e = param0 ? true : false;
        if (!param1) {
            sm discarded$0 = ((sm) this).d(124, 58);
        }
        return (sm) this;
    }

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        if (param0 != -30) {
            field_c = null;
        }
    }

    sm() {
        ((sm) this).field_g = -2147483648;
        ((sm) this).field_i = null;
        ((sm) this).field_j = null;
        ((sm) this).field_d = -2147483648;
        ((sm) this).field_f = -2;
        ((sm) this).field_h = -2147483648;
        ((sm) this).field_a = -2;
        ((sm) this).field_e = false;
    }

    final void a(int param0, fl param1, int param2, int param3, pk param4) {
        int var6 = 0;
        int var7_int = 0;
        String var7 = null;
        int var8 = 0;
        vn stackIn_19_0 = null;
        String stackIn_19_1 = null;
        vn stackIn_20_0 = null;
        String stackIn_20_1 = null;
        vn stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        vn stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        vn stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        vn stackIn_24_0 = null;
        String stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        vn stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        int stackIn_25_7 = 0;
        vn stackIn_26_0 = null;
        String stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        int stackIn_26_6 = 0;
        int stackIn_26_7 = 0;
        vn stackIn_27_0 = null;
        String stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_27_5 = 0;
        int stackIn_27_6 = 0;
        int stackIn_27_7 = 0;
        int stackIn_27_8 = 0;
        vn stackOut_18_0 = null;
        String stackOut_18_1 = null;
        vn stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        vn stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        vn stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        vn stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        vn stackOut_22_0 = null;
        String stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        vn stackOut_24_0 = null;
        String stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        int stackOut_24_6 = 0;
        int stackOut_24_7 = 0;
        vn stackOut_26_0 = null;
        String stackOut_26_1 = null;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int stackOut_26_5 = 0;
        int stackOut_26_6 = 0;
        int stackOut_26_7 = 0;
        int stackOut_26_8 = 0;
        vn stackOut_25_0 = null;
        String stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_25_5 = 0;
        int stackOut_25_6 = 0;
        int stackOut_25_7 = 0;
        int stackOut_25_8 = 0;
        L0: {
          kn.a(param2 + param4.field_r, ((sm) this).field_j, (byte) -34, param4.field_v + param0, param4.field_p, param4.field_q);
          var6 = -128 % ((param3 - -9) / 35);
          if (((sm) this).field_i != null) {
            L1: {
              var7_int = ((sm) this).field_d + (param2 + param4.field_r);
              var8 = ((sm) this).field_h + param4.field_v + param0;
              if (1 == param1.field_f) {
                var7_int = var7_int + (param4.field_q + -((sm) this).field_i.field_z) / 2;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-3 != (param1.field_f ^ -1)) {
                break L2;
              } else {
                var7_int = var7_int + (param4.field_q - ((sm) this).field_i.field_z);
                break L2;
              }
            }
            L3: {
              if (1 == param1.field_c) {
                var8 = var8 + (-((sm) this).field_i.field_w + param4.field_p) / 2;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (2 == param1.field_c) {
                var8 = var8 + (-((sm) this).field_i.field_w + param4.field_p);
                break L4;
              } else {
                break L4;
              }
            }
            ((sm) this).field_i.a(var7_int, var8);
            break L0;
          } else {
            break L0;
          }
        }
        L5: {
          var7 = param1.a(true, param4);
          if (var7 == null) {
            break L5;
          } else {
            if (param1.field_e == null) {
              break L5;
            } else {
              if (-1 >= ((sm) this).field_a) {
                L6: {
                  stackOut_18_0 = param1.field_e;
                  stackOut_18_1 = (String) var7;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  if (2147483647 == ((sm) this).field_d) {
                    stackOut_20_0 = (vn) (Object) stackIn_20_0;
                    stackOut_20_1 = (String) (Object) stackIn_20_1;
                    stackOut_20_2 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    stackIn_21_2 = stackOut_20_2;
                    break L6;
                  } else {
                    stackOut_19_0 = (vn) (Object) stackIn_19_0;
                    stackOut_19_1 = (String) (Object) stackIn_19_1;
                    stackOut_19_2 = ((sm) this).field_d;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    stackIn_21_2 = stackOut_19_2;
                    break L6;
                  }
                }
                L7: {
                  stackOut_21_0 = (vn) (Object) stackIn_21_0;
                  stackOut_21_1 = (String) (Object) stackIn_21_1;
                  stackOut_21_2 = stackIn_21_2 + (param1.field_k + (param4.field_r + param2));
                  stackOut_21_3 = param1.field_a + (param4.field_v + param0);
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_23_2 = stackOut_21_2;
                  stackIn_23_3 = stackOut_21_3;
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  stackIn_22_2 = stackOut_21_2;
                  stackIn_22_3 = stackOut_21_3;
                  if (2147483647 == (((sm) this).field_h ^ -1)) {
                    stackOut_23_0 = (vn) (Object) stackIn_23_0;
                    stackOut_23_1 = (String) (Object) stackIn_23_1;
                    stackOut_23_2 = stackIn_23_2;
                    stackOut_23_3 = stackIn_23_3;
                    stackOut_23_4 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    stackIn_24_2 = stackOut_23_2;
                    stackIn_24_3 = stackOut_23_3;
                    stackIn_24_4 = stackOut_23_4;
                    break L7;
                  } else {
                    stackOut_22_0 = (vn) (Object) stackIn_22_0;
                    stackOut_22_1 = (String) (Object) stackIn_22_1;
                    stackOut_22_2 = stackIn_22_2;
                    stackOut_22_3 = stackIn_22_3;
                    stackOut_22_4 = ((sm) this).field_h;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_24_1 = stackOut_22_1;
                    stackIn_24_2 = stackOut_22_2;
                    stackIn_24_3 = stackOut_22_3;
                    stackIn_24_4 = stackOut_22_4;
                    break L7;
                  }
                }
                L8: {
                  stackOut_24_0 = (vn) (Object) stackIn_24_0;
                  stackOut_24_1 = (String) (Object) stackIn_24_1;
                  stackOut_24_2 = stackIn_24_2;
                  stackOut_24_3 = stackIn_24_3 - -stackIn_24_4;
                  stackOut_24_4 = param4.field_q - (param1.field_k - -param1.field_h);
                  stackOut_24_5 = param4.field_p - (param1.field_a + param1.field_m);
                  stackOut_24_6 = ((sm) this).field_a;
                  stackOut_24_7 = ((sm) this).field_f;
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_26_1 = stackOut_24_1;
                  stackIn_26_2 = stackOut_24_2;
                  stackIn_26_3 = stackOut_24_3;
                  stackIn_26_4 = stackOut_24_4;
                  stackIn_26_5 = stackOut_24_5;
                  stackIn_26_6 = stackOut_24_6;
                  stackIn_26_7 = stackOut_24_7;
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  stackIn_25_2 = stackOut_24_2;
                  stackIn_25_3 = stackOut_24_3;
                  stackIn_25_4 = stackOut_24_4;
                  stackIn_25_5 = stackOut_24_5;
                  stackIn_25_6 = stackOut_24_6;
                  stackIn_25_7 = stackOut_24_7;
                  if (2147483647 == (((sm) this).field_g ^ -1)) {
                    stackOut_26_0 = (vn) (Object) stackIn_26_0;
                    stackOut_26_1 = (String) (Object) stackIn_26_1;
                    stackOut_26_2 = stackIn_26_2;
                    stackOut_26_3 = stackIn_26_3;
                    stackOut_26_4 = stackIn_26_4;
                    stackOut_26_5 = stackIn_26_5;
                    stackOut_26_6 = stackIn_26_6;
                    stackOut_26_7 = stackIn_26_7;
                    stackOut_26_8 = 256;
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    stackIn_27_2 = stackOut_26_2;
                    stackIn_27_3 = stackOut_26_3;
                    stackIn_27_4 = stackOut_26_4;
                    stackIn_27_5 = stackOut_26_5;
                    stackIn_27_6 = stackOut_26_6;
                    stackIn_27_7 = stackOut_26_7;
                    stackIn_27_8 = stackOut_26_8;
                    break L8;
                  } else {
                    stackOut_25_0 = (vn) (Object) stackIn_25_0;
                    stackOut_25_1 = (String) (Object) stackIn_25_1;
                    stackOut_25_2 = stackIn_25_2;
                    stackOut_25_3 = stackIn_25_3;
                    stackOut_25_4 = stackIn_25_4;
                    stackOut_25_5 = stackIn_25_5;
                    stackOut_25_6 = stackIn_25_6;
                    stackOut_25_7 = stackIn_25_7;
                    stackOut_25_8 = ((sm) this).field_g;
                    stackIn_27_0 = stackOut_25_0;
                    stackIn_27_1 = stackOut_25_1;
                    stackIn_27_2 = stackOut_25_2;
                    stackIn_27_3 = stackOut_25_3;
                    stackIn_27_4 = stackOut_25_4;
                    stackIn_27_5 = stackOut_25_5;
                    stackIn_27_6 = stackOut_25_6;
                    stackIn_27_7 = stackOut_25_7;
                    stackIn_27_8 = stackOut_25_8;
                    break L8;
                  }
                }
                int discarded$1 = ((vn) (Object) stackIn_27_0).a(stackIn_27_1, stackIn_27_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_27_8, param1.field_f, param1.field_c, param1.field_j);
                break L5;
              } else {
                break L5;
              }
            }
          }
        }
    }

    final void a(int param0, pk param1, int param2, fl param3, int param4, sm param5) {
        if (!(!((sm) this).field_e)) {
            param5.a(param4, param3, param0, 76, param1);
            param5.a(true);
        }
        if (-2147483648 != ((sm) this).field_h) {
            param5.field_h = ((sm) this).field_h;
        }
        if (0 >= (((sm) this).field_a ^ -1)) {
            param5.field_a = ((sm) this).field_a;
        }
        if (!(null == ((sm) this).field_i)) {
            param5.field_i = ((sm) this).field_i;
        }
        if (!(-1 > ((sm) this).field_f)) {
            param5.field_f = ((sm) this).field_f;
        }
        if (((sm) this).field_g != -2147483648) {
            param5.field_g = ((sm) this).field_g;
        }
        if (null != ((sm) this).field_j) {
            param5.field_j = ((sm) this).field_j;
        }
        if (!(((sm) this).field_d == -2147483648)) {
            param5.field_d = ((sm) this).field_d;
        }
        if (param2 > -1) {
            Object var8 = null;
            ((sm) this).a(32, (pk) null, -99, (fl) null, 16, (sm) null);
        }
    }

    final static void a(byte param0, boolean param1, boolean param2) {
        int var3 = -2 % ((param0 - 62) / 63);
        Object var4 = null;
        ea.a(1, param2, (String) null, param1);
    }

    static {
    }
}
