/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db {
    private int field_e;
    pb field_b;
    private int field_h;
    static int field_g;
    private boolean field_j;
    private int field_i;
    private int field_a;
    static int field_c;
    pb[] field_d;
    private int field_f;

    final db a(byte param0, pb[] param1) {
        if (param0 <= 72) {
            ((db) this).field_a = -127;
            ((db) this).field_d = param1;
            return (db) this;
        }
        ((db) this).field_d = param1;
        return (db) this;
    }

    final db a(byte param0, boolean param1) {
        ((db) this).field_j = param1 ? true : false;
        if (param0 <= 123) {
            return null;
        }
        return (db) this;
    }

    final void a(tc param0, db param1, int param2, int param3, rj param4, int param5) {
        int var7 = 0;
        L0: {
          if (((db) this).field_j) {
            param1.a(param3, param0, param4, 2, param5);
            param1.a((byte) 120);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (-1 <= ((db) this).field_e) {
            param1.field_e = ((db) this).field_e;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (0 >= (((db) this).field_h ^ -1)) {
            param1.field_h = ((db) this).field_h;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (null != ((db) this).field_d) {
            param1.field_d = ((db) this).field_d;
            break L3;
          } else {
            break L3;
          }
        }
        var7 = 64 / ((-22 - param2) / 60);
        if (-2147483648 == ((db) this).field_a) {
          if (-2147483648 == ((db) this).field_f) {
            L4: {
              if (-2147483648 != ((db) this).field_i) {
                param1.field_i = ((db) this).field_i;
                break L4;
              } else {
                break L4;
              }
            }
            if (null == ((db) this).field_b) {
              return;
            } else {
              param1.field_b = ((db) this).field_b;
              return;
            }
          } else {
            L5: {
              param1.field_f = ((db) this).field_f;
              if (-2147483648 != ((db) this).field_i) {
                param1.field_i = ((db) this).field_i;
                break L5;
              } else {
                break L5;
              }
            }
            if (null == ((db) this).field_b) {
              return;
            } else {
              param1.field_b = ((db) this).field_b;
              return;
            }
          }
        } else {
          param1.field_a = ((db) this).field_a;
          if (-2147483648 != ((db) this).field_f) {
            L6: {
              param1.field_f = ((db) this).field_f;
              if (-2147483648 != ((db) this).field_i) {
                param1.field_i = ((db) this).field_i;
                break L6;
              } else {
                break L6;
              }
            }
            if (null != ((db) this).field_b) {
              param1.field_b = ((db) this).field_b;
              return;
            } else {
              return;
            }
          } else {
            L7: {
              if (-2147483648 != ((db) this).field_i) {
                param1.field_i = ((db) this).field_i;
                break L7;
              } else {
                break L7;
              }
            }
            if (null != ((db) this).field_b) {
              param1.field_b = ((db) this).field_b;
              return;
            } else {
              return;
            }
          }
        }
    }

    final db a(int param0, boolean param1) {
        if (param1) {
            ((db) this).field_i = -34;
            ((db) this).field_i = param0;
            return (db) this;
        }
        ((db) this).field_i = param0;
        return (db) this;
    }

    final db a(int param0, int param1) {
        if (param0 != -1) {
            ((db) this).field_e = 114;
            ((db) this).field_e = param1;
            return (db) this;
        }
        ((db) this).field_e = param1;
        return (db) this;
    }

    final db a(boolean param0, int param1) {
        ((db) this).field_h = param1;
        if (param0) {
            db discarded$0 = ((db) this).a(-120, false);
            return (db) this;
        }
        return (db) this;
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = stellarshard.field_B;
        ii.field_F = null;
        ck.field_db = false;
        var1 = -66 % ((74 - param0) / 34);
        if (!gk.field_a) {
          var2 = ag.field_c;
          if (0 < var2) {
            if (var2 == 1) {
              ii.field_F = lj.field_C;
              ii.field_F = ei.a(new CharSequence[3], (byte) 127);
              ei.field_G.o(3);
              qh.b(-21923);
              return;
            } else {
              ii.field_F = h.a(be.field_e, 0, new String[1]);
              ii.field_F = ei.a(new CharSequence[3], (byte) 127);
              ei.field_G.o(3);
              qh.b(-21923);
              return;
            }
          } else {
            ei.field_G.o(3);
            qh.b(-21923);
            return;
          }
        } else {
          ei.field_G.h((byte) 52);
          return;
        }
    }

    final void a(db param0, boolean param1) {
        param0.field_f = ((db) this).field_f;
        param0.field_d = ((db) this).field_d;
        param0.field_b = ((db) this).field_b;
        if (!param1) {
          return;
        } else {
          param0.field_j = ((db) this).field_j;
          param0.field_i = ((db) this).field_i;
          param0.field_e = ((db) this).field_e;
          param0.field_h = ((db) this).field_h;
          param0.field_a = ((db) this).field_a;
          return;
        }
    }

    final static StringBuilder a(int param0, byte param1, char param2, StringBuilder param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = stellarshard.field_B;
        var4 = param3.length();
        param3.setLength(param0);
        var5 = var4;
        L0: while (true) {
          if (param0 <= var5) {
            if (param1 != 61) {
              field_g = 70;
              return param3;
            } else {
              return param3;
            }
          } else {
            param3.setCharAt(var5, param2);
            var5++;
            continue L0;
          }
        }
    }

    final void a(byte param0) {
        if (param0 <= 6) {
          return;
        } else {
          ((db) this).field_h = -1;
          ((db) this).field_e = 0;
          ((db) this).field_b = null;
          ((db) this).field_f = 256;
          ((db) this).field_i = 0;
          ((db) this).field_a = 0;
          ((db) this).field_d = null;
          return;
        }
    }

    final db b(int param0, int param1) {
        if (param0 != -2147483648) {
            ((db) this).field_b = null;
            ((db) this).field_a = param1;
            return (db) this;
        }
        ((db) this).field_a = param1;
        return (db) this;
    }

    db() {
        ((db) this).field_b = null;
        ((db) this).field_j = false;
        ((db) this).field_e = -2;
        ((db) this).field_h = -2;
        ((db) this).field_a = -2147483648;
        ((db) this).field_i = -2147483648;
        ((db) this).field_d = null;
        ((db) this).field_f = -2147483648;
    }

    final void a(int param0, tc param1, rj param2, int param3, int param4) {
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        bd stackIn_18_0 = null;
        String stackIn_18_1 = null;
        bd stackIn_19_0 = null;
        String stackIn_19_1 = null;
        bd stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        bd stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        bd stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        bd stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        bd stackIn_24_0 = null;
        String stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        int stackIn_24_5 = 0;
        int stackIn_24_6 = 0;
        int stackIn_24_7 = 0;
        bd stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        int stackIn_25_7 = 0;
        bd stackIn_26_0 = null;
        String stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        int stackIn_26_6 = 0;
        int stackIn_26_7 = 0;
        int stackIn_26_8 = 0;
        bd stackIn_35_0 = null;
        String stackIn_35_1 = null;
        bd stackIn_36_0 = null;
        String stackIn_36_1 = null;
        bd stackIn_37_0 = null;
        String stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        bd stackIn_38_0 = null;
        String stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        bd stackIn_39_0 = null;
        String stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        bd stackIn_40_0 = null;
        String stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        int stackIn_40_3 = 0;
        bd stackIn_41_0 = null;
        String stackIn_41_1 = null;
        int stackIn_41_2 = 0;
        int stackIn_41_3 = 0;
        int stackIn_41_4 = 0;
        int stackIn_41_5 = 0;
        int stackIn_41_6 = 0;
        int stackIn_41_7 = 0;
        bd stackIn_42_0 = null;
        String stackIn_42_1 = null;
        int stackIn_42_2 = 0;
        int stackIn_42_3 = 0;
        int stackIn_42_4 = 0;
        int stackIn_42_5 = 0;
        int stackIn_42_6 = 0;
        int stackIn_42_7 = 0;
        bd stackIn_43_0 = null;
        String stackIn_43_1 = null;
        int stackIn_43_2 = 0;
        int stackIn_43_3 = 0;
        int stackIn_43_4 = 0;
        int stackIn_43_5 = 0;
        int stackIn_43_6 = 0;
        int stackIn_43_7 = 0;
        int stackIn_43_8 = 0;
        bd stackOut_34_0 = null;
        String stackOut_34_1 = null;
        bd stackOut_36_0 = null;
        String stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        bd stackOut_35_0 = null;
        String stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        bd stackOut_37_0 = null;
        String stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        bd stackOut_39_0 = null;
        String stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        int stackOut_39_3 = 0;
        bd stackOut_38_0 = null;
        String stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        int stackOut_38_3 = 0;
        bd stackOut_40_0 = null;
        String stackOut_40_1 = null;
        int stackOut_40_2 = 0;
        int stackOut_40_3 = 0;
        int stackOut_40_4 = 0;
        int stackOut_40_5 = 0;
        int stackOut_40_6 = 0;
        int stackOut_40_7 = 0;
        bd stackOut_42_0 = null;
        String stackOut_42_1 = null;
        int stackOut_42_2 = 0;
        int stackOut_42_3 = 0;
        int stackOut_42_4 = 0;
        int stackOut_42_5 = 0;
        int stackOut_42_6 = 0;
        int stackOut_42_7 = 0;
        int stackOut_42_8 = 0;
        bd stackOut_41_0 = null;
        String stackOut_41_1 = null;
        int stackOut_41_2 = 0;
        int stackOut_41_3 = 0;
        int stackOut_41_4 = 0;
        int stackOut_41_5 = 0;
        int stackOut_41_6 = 0;
        int stackOut_41_7 = 0;
        int stackOut_41_8 = 0;
        bd stackOut_17_0 = null;
        String stackOut_17_1 = null;
        bd stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        bd stackOut_18_0 = null;
        String stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        bd stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        bd stackOut_22_0 = null;
        String stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        bd stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        bd stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        int stackOut_23_5 = 0;
        int stackOut_23_6 = 0;
        int stackOut_23_7 = 0;
        bd stackOut_25_0 = null;
        String stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_25_5 = 0;
        int stackOut_25_6 = 0;
        int stackOut_25_7 = 0;
        int stackOut_25_8 = 0;
        bd stackOut_24_0 = null;
        String stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        int stackOut_24_6 = 0;
        int stackOut_24_7 = 0;
        int stackOut_24_8 = 0;
        L0: {
          ed.a(param3 + -6315, param4 - -param2.field_w, param0 + param2.field_k, ((db) this).field_d, param2.field_p, param2.field_t);
          if (((db) this).field_b != null) {
            L1: {
              var6_int = param4 - -param2.field_w - -((db) this).field_i;
              if (-2 != (param1.field_h ^ -1)) {
                break L1;
              } else {
                var6_int = var6_int + (param2.field_p + -((db) this).field_b.field_w) / 2;
                break L1;
              }
            }
            L2: {
              var7 = param0 - (-param2.field_k - ((db) this).field_a);
              if (2 != param1.field_h) {
                break L2;
              } else {
                var6_int = var6_int + (-((db) this).field_b.field_w + param2.field_p);
                break L2;
              }
            }
            L3: {
              if (param1.field_d != 1) {
                break L3;
              } else {
                var7 = var7 + (-((db) this).field_b.field_x + param2.field_t) / 2;
                break L3;
              }
            }
            L4: {
              if (2 != param1.field_d) {
                break L4;
              } else {
                var7 = var7 + (-((db) this).field_b.field_x + param2.field_t);
                break L4;
              }
            }
            ((db) this).field_b.e(var6_int, var7);
            break L0;
          } else {
            break L0;
          }
        }
        if (param3 == 2) {
          var6 = param1.b(param2, 0);
          if (var6 != null) {
            if (null != param1.field_a) {
              if (0 > ((db) this).field_e) {
                return;
              } else {
                L5: {
                  stackOut_34_0 = param1.field_a;
                  stackOut_34_1 = (String) var6;
                  stackIn_36_0 = stackOut_34_0;
                  stackIn_36_1 = stackOut_34_1;
                  stackIn_35_0 = stackOut_34_0;
                  stackIn_35_1 = stackOut_34_1;
                  if (((db) this).field_i == -2147483648) {
                    stackOut_36_0 = (bd) (Object) stackIn_36_0;
                    stackOut_36_1 = (String) (Object) stackIn_36_1;
                    stackOut_36_2 = 0;
                    stackIn_37_0 = stackOut_36_0;
                    stackIn_37_1 = stackOut_36_1;
                    stackIn_37_2 = stackOut_36_2;
                    break L5;
                  } else {
                    stackOut_35_0 = (bd) (Object) stackIn_35_0;
                    stackOut_35_1 = (String) (Object) stackIn_35_1;
                    stackOut_35_2 = ((db) this).field_i;
                    stackIn_37_0 = stackOut_35_0;
                    stackIn_37_1 = stackOut_35_1;
                    stackIn_37_2 = stackOut_35_2;
                    break L5;
                  }
                }
                L6: {
                  stackOut_37_0 = (bd) (Object) stackIn_37_0;
                  stackOut_37_1 = (String) (Object) stackIn_37_1;
                  stackOut_37_2 = stackIn_37_2 + (param4 - -param2.field_w) - -param1.field_m;
                  stackIn_39_0 = stackOut_37_0;
                  stackIn_39_1 = stackOut_37_1;
                  stackIn_39_2 = stackOut_37_2;
                  stackIn_38_0 = stackOut_37_0;
                  stackIn_38_1 = stackOut_37_1;
                  stackIn_38_2 = stackOut_37_2;
                  if ((((db) this).field_a ^ -1) == 2147483647) {
                    stackOut_39_0 = (bd) (Object) stackIn_39_0;
                    stackOut_39_1 = (String) (Object) stackIn_39_1;
                    stackOut_39_2 = stackIn_39_2;
                    stackOut_39_3 = 0;
                    stackIn_40_0 = stackOut_39_0;
                    stackIn_40_1 = stackOut_39_1;
                    stackIn_40_2 = stackOut_39_2;
                    stackIn_40_3 = stackOut_39_3;
                    break L6;
                  } else {
                    stackOut_38_0 = (bd) (Object) stackIn_38_0;
                    stackOut_38_1 = (String) (Object) stackIn_38_1;
                    stackOut_38_2 = stackIn_38_2;
                    stackOut_38_3 = ((db) this).field_a;
                    stackIn_40_0 = stackOut_38_0;
                    stackIn_40_1 = stackOut_38_1;
                    stackIn_40_2 = stackOut_38_2;
                    stackIn_40_3 = stackOut_38_3;
                    break L6;
                  }
                }
                L7: {
                  stackOut_40_0 = (bd) (Object) stackIn_40_0;
                  stackOut_40_1 = (String) (Object) stackIn_40_1;
                  stackOut_40_2 = stackIn_40_2;
                  stackOut_40_3 = stackIn_40_3 + param1.field_c + (param2.field_k + param0);
                  stackOut_40_4 = -param1.field_f + param2.field_p - param1.field_m;
                  stackOut_40_5 = -param1.field_c + (param2.field_t - param1.field_k);
                  stackOut_40_6 = ((db) this).field_e;
                  stackOut_40_7 = ((db) this).field_h;
                  stackIn_42_0 = stackOut_40_0;
                  stackIn_42_1 = stackOut_40_1;
                  stackIn_42_2 = stackOut_40_2;
                  stackIn_42_3 = stackOut_40_3;
                  stackIn_42_4 = stackOut_40_4;
                  stackIn_42_5 = stackOut_40_5;
                  stackIn_42_6 = stackOut_40_6;
                  stackIn_42_7 = stackOut_40_7;
                  stackIn_41_0 = stackOut_40_0;
                  stackIn_41_1 = stackOut_40_1;
                  stackIn_41_2 = stackOut_40_2;
                  stackIn_41_3 = stackOut_40_3;
                  stackIn_41_4 = stackOut_40_4;
                  stackIn_41_5 = stackOut_40_5;
                  stackIn_41_6 = stackOut_40_6;
                  stackIn_41_7 = stackOut_40_7;
                  if (((db) this).field_f == -2147483648) {
                    stackOut_42_0 = (bd) (Object) stackIn_42_0;
                    stackOut_42_1 = (String) (Object) stackIn_42_1;
                    stackOut_42_2 = stackIn_42_2;
                    stackOut_42_3 = stackIn_42_3;
                    stackOut_42_4 = stackIn_42_4;
                    stackOut_42_5 = stackIn_42_5;
                    stackOut_42_6 = stackIn_42_6;
                    stackOut_42_7 = stackIn_42_7;
                    stackOut_42_8 = 256;
                    stackIn_43_0 = stackOut_42_0;
                    stackIn_43_1 = stackOut_42_1;
                    stackIn_43_2 = stackOut_42_2;
                    stackIn_43_3 = stackOut_42_3;
                    stackIn_43_4 = stackOut_42_4;
                    stackIn_43_5 = stackOut_42_5;
                    stackIn_43_6 = stackOut_42_6;
                    stackIn_43_7 = stackOut_42_7;
                    stackIn_43_8 = stackOut_42_8;
                    break L7;
                  } else {
                    stackOut_41_0 = (bd) (Object) stackIn_41_0;
                    stackOut_41_1 = (String) (Object) stackIn_41_1;
                    stackOut_41_2 = stackIn_41_2;
                    stackOut_41_3 = stackIn_41_3;
                    stackOut_41_4 = stackIn_41_4;
                    stackOut_41_5 = stackIn_41_5;
                    stackOut_41_6 = stackIn_41_6;
                    stackOut_41_7 = stackIn_41_7;
                    stackOut_41_8 = ((db) this).field_f;
                    stackIn_43_0 = stackOut_41_0;
                    stackIn_43_1 = stackOut_41_1;
                    stackIn_43_2 = stackOut_41_2;
                    stackIn_43_3 = stackOut_41_3;
                    stackIn_43_4 = stackOut_41_4;
                    stackIn_43_5 = stackOut_41_5;
                    stackIn_43_6 = stackOut_41_6;
                    stackIn_43_7 = stackOut_41_7;
                    stackIn_43_8 = stackOut_41_8;
                    break L7;
                  }
                }
                int discarded$2 = ((bd) (Object) stackIn_43_0).a(stackIn_43_1, stackIn_43_2, stackIn_43_3, stackIn_43_4, stackIn_43_5, stackIn_43_6, stackIn_43_7, stackIn_43_8, param1.field_h, param1.field_d, param1.field_j);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          ((db) this).field_d = null;
          var6 = param1.b(param2, 0);
          if (var6 != null) {
            if (null != param1.field_a) {
              if (0 > ((db) this).field_e) {
                return;
              } else {
                L8: {
                  stackOut_17_0 = param1.field_a;
                  stackOut_17_1 = (String) var6;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  if (((db) this).field_i == -2147483648) {
                    stackOut_19_0 = (bd) (Object) stackIn_19_0;
                    stackOut_19_1 = (String) (Object) stackIn_19_1;
                    stackOut_19_2 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    stackIn_20_2 = stackOut_19_2;
                    break L8;
                  } else {
                    stackOut_18_0 = (bd) (Object) stackIn_18_0;
                    stackOut_18_1 = (String) (Object) stackIn_18_1;
                    stackOut_18_2 = ((db) this).field_i;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    stackIn_20_2 = stackOut_18_2;
                    break L8;
                  }
                }
                L9: {
                  stackOut_20_0 = (bd) (Object) stackIn_20_0;
                  stackOut_20_1 = (String) (Object) stackIn_20_1;
                  stackOut_20_2 = stackIn_20_2 + (param4 - -param2.field_w) - -param1.field_m;
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_22_1 = stackOut_20_1;
                  stackIn_22_2 = stackOut_20_2;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  stackIn_21_2 = stackOut_20_2;
                  if ((((db) this).field_a ^ -1) == 2147483647) {
                    stackOut_22_0 = (bd) (Object) stackIn_22_0;
                    stackOut_22_1 = (String) (Object) stackIn_22_1;
                    stackOut_22_2 = stackIn_22_2;
                    stackOut_22_3 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    stackIn_23_1 = stackOut_22_1;
                    stackIn_23_2 = stackOut_22_2;
                    stackIn_23_3 = stackOut_22_3;
                    break L9;
                  } else {
                    stackOut_21_0 = (bd) (Object) stackIn_21_0;
                    stackOut_21_1 = (String) (Object) stackIn_21_1;
                    stackOut_21_2 = stackIn_21_2;
                    stackOut_21_3 = ((db) this).field_a;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_23_1 = stackOut_21_1;
                    stackIn_23_2 = stackOut_21_2;
                    stackIn_23_3 = stackOut_21_3;
                    break L9;
                  }
                }
                L10: {
                  stackOut_23_0 = (bd) (Object) stackIn_23_0;
                  stackOut_23_1 = (String) (Object) stackIn_23_1;
                  stackOut_23_2 = stackIn_23_2;
                  stackOut_23_3 = stackIn_23_3 + param1.field_c + (param2.field_k + param0);
                  stackOut_23_4 = -param1.field_f + param2.field_p - param1.field_m;
                  stackOut_23_5 = -param1.field_c + (param2.field_t - param1.field_k);
                  stackOut_23_6 = ((db) this).field_e;
                  stackOut_23_7 = ((db) this).field_h;
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_25_1 = stackOut_23_1;
                  stackIn_25_2 = stackOut_23_2;
                  stackIn_25_3 = stackOut_23_3;
                  stackIn_25_4 = stackOut_23_4;
                  stackIn_25_5 = stackOut_23_5;
                  stackIn_25_6 = stackOut_23_6;
                  stackIn_25_7 = stackOut_23_7;
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  stackIn_24_2 = stackOut_23_2;
                  stackIn_24_3 = stackOut_23_3;
                  stackIn_24_4 = stackOut_23_4;
                  stackIn_24_5 = stackOut_23_5;
                  stackIn_24_6 = stackOut_23_6;
                  stackIn_24_7 = stackOut_23_7;
                  if (((db) this).field_f == -2147483648) {
                    stackOut_25_0 = (bd) (Object) stackIn_25_0;
                    stackOut_25_1 = (String) (Object) stackIn_25_1;
                    stackOut_25_2 = stackIn_25_2;
                    stackOut_25_3 = stackIn_25_3;
                    stackOut_25_4 = stackIn_25_4;
                    stackOut_25_5 = stackIn_25_5;
                    stackOut_25_6 = stackIn_25_6;
                    stackOut_25_7 = stackIn_25_7;
                    stackOut_25_8 = 256;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    stackIn_26_2 = stackOut_25_2;
                    stackIn_26_3 = stackOut_25_3;
                    stackIn_26_4 = stackOut_25_4;
                    stackIn_26_5 = stackOut_25_5;
                    stackIn_26_6 = stackOut_25_6;
                    stackIn_26_7 = stackOut_25_7;
                    stackIn_26_8 = stackOut_25_8;
                    break L10;
                  } else {
                    stackOut_24_0 = (bd) (Object) stackIn_24_0;
                    stackOut_24_1 = (String) (Object) stackIn_24_1;
                    stackOut_24_2 = stackIn_24_2;
                    stackOut_24_3 = stackIn_24_3;
                    stackOut_24_4 = stackIn_24_4;
                    stackOut_24_5 = stackIn_24_5;
                    stackOut_24_6 = stackIn_24_6;
                    stackOut_24_7 = stackIn_24_7;
                    stackOut_24_8 = ((db) this).field_f;
                    stackIn_26_0 = stackOut_24_0;
                    stackIn_26_1 = stackOut_24_1;
                    stackIn_26_2 = stackOut_24_2;
                    stackIn_26_3 = stackOut_24_3;
                    stackIn_26_4 = stackOut_24_4;
                    stackIn_26_5 = stackOut_24_5;
                    stackIn_26_6 = stackOut_24_6;
                    stackIn_26_7 = stackOut_24_7;
                    stackIn_26_8 = stackOut_24_8;
                    break L10;
                  }
                }
                int discarded$3 = ((bd) (Object) stackIn_26_0).a(stackIn_26_1, stackIn_26_2, stackIn_26_3, stackIn_26_4, stackIn_26_5, stackIn_26_6, stackIn_26_7, stackIn_26_8, param1.field_h, param1.field_d, param1.field_j);
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
        field_c = 0;
    }
}
