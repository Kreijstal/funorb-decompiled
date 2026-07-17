/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re extends ue {
    int field_f;
    private int field_l;
    private int[] field_t;
    static ko field_h;
    static String field_p;
    private int field_q;
    static String field_j;
    private int[] field_e;
    private int field_u;
    static String field_k;
    private int field_g;
    private int field_m;
    private int field_r;
    static int[] field_o;
    static String field_n;
    private int field_i;
    private int[] field_s;

    final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = CrazyCrystals.field_B;
        if (param0 <= -87) {
          L0: {
            if (((re) this).field_i < 195) {
              var2 = 0;
              L1: while (true) {
                if (var2 >= 12) {
                  ((re) this).field_i = ((re) this).field_i + 1;
                  break L0;
                } else {
                  if (((re) this).field_i >= 60 + var2 * 10) {
                    if (75 - -(10 * var2) > ((re) this).field_i) {
                      ((re) this).field_d[var2].field_a = ((re) this).field_d[var2].field_a - 18;
                      var2++;
                      continue L1;
                    } else {
                      var2++;
                      continue L1;
                    }
                  } else {
                    var2++;
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          }
          ((re) this).field_m = (((re) this).field_m - -1) % vp.field_i[0].length;
          return;
        } else {
          return;
        }
    }

    final void a(int param0, boolean param1) {
        dl var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_13_0 = 0;
        ik stackIn_15_0 = null;
        ik stackIn_16_0 = null;
        ik stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        ik stackOut_14_0 = null;
        ik stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        ik stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        L0: {
          var8 = CrazyCrystals.field_B;
          var3 = ee.field_m;
          var4 = 106 + -ee.field_m.field_o;
          var3.a(20, var4 - -((re) this).field_q);
          var5 = 56 - -((re) this).field_q;
          if (0 == ul.field_g) {
            break L0;
          } else {
            if (o.field_h.equals((Object) (Object) "top")) {
              var5 = -8 + ((re) this).field_q;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          vp.field_i[0][((re) this).field_m].b(-46 + (kf.field_c + 20), var5, 42, 63);
          vp.field_i[0][((re) this).field_m].b(me.field_b + 24, var5, 42, 63);
          if (!param1) {
            break L1;
          } else {
            re.d((byte) 114);
            break L1;
          }
        }
        var6 = 0;
        L2: while (true) {
          if (var6 >= ((re) this).field_d.length) {
            L3: {
              if (5 != ((re) this).field_b.field_c) {
                stackOut_20_0 = 12640511;
                stackIn_21_0 = stackOut_20_0;
                break L3;
              } else {
                stackOut_19_0 = 16777215;
                stackIn_21_0 = stackOut_19_0;
                break L3;
              }
            }
            L4: {
              var6 = stackIn_21_0;
              this.a(((re) this).field_d[5], var6, gi.field_m, true);
              if (((re) this).field_b.field_c == 6) {
                stackOut_23_0 = 16777215;
                stackIn_24_0 = stackOut_23_0;
                break L4;
              } else {
                stackOut_22_0 = 12640511;
                stackIn_24_0 = stackOut_22_0;
                break L4;
              }
            }
            L5: {
              var6 = stackIn_24_0;
              this.a(((re) this).field_d[6], var6, qd.field_r, true);
              if (((re) this).field_b.field_c == 7) {
                stackOut_26_0 = 16777215;
                stackIn_27_0 = stackOut_26_0;
                break L5;
              } else {
                stackOut_25_0 = 12640511;
                stackIn_27_0 = stackOut_25_0;
                break L5;
              }
            }
            L6: {
              var6 = stackIn_27_0;
              if (rb.field_h < 2) {
                break L6;
              } else {
                if ((Object) (Object) a.field_b != this) {
                  break L6;
                } else {
                  if (sg.field_a) {
                    an.field_q.b(ll.field_a, 635, 476, 16711680, 0);
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
            }
            return;
          } else {
            L7: {
              if (param0 != var6) {
                L8: {
                  if (var6 == ((re) this).field_b.field_c) {
                    stackOut_12_0 = 16777215;
                    stackIn_13_0 = stackOut_12_0;
                    break L8;
                  } else {
                    stackOut_11_0 = 12640511;
                    stackIn_13_0 = stackOut_11_0;
                    break L8;
                  }
                }
                var7 = stackIn_13_0;
                break L7;
              } else {
                var7 = 16760896;
                break L7;
              }
            }
            L9: {
              stackOut_14_0 = ((re) this).field_d[var6];
              stackIn_16_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (var6 != ((re) this).field_b.field_c) {
                stackOut_16_0 = (ik) (Object) stackIn_16_0;
                stackOut_16_1 = 0;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L9;
              } else {
                stackOut_15_0 = (ik) (Object) stackIn_15_0;
                stackOut_15_1 = 1;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                break L9;
              }
            }
            ((ik) (Object) stackIn_17_0).a(stackIn_17_1 != 0, var7, 1);
            var6++;
            continue L2;
          }
        }
    }

    final boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = CrazyCrystals.field_B;
          var2 = ((re) this).field_b.field_c;
          if (var2 < 0) {
            break L0;
          } else {
            if (var2 > 4) {
              break L0;
            } else {
              if (((re) this).field_b.a(true)) {
                var3 = jl.field_c[var2];
                a.field_b = (ue) (Object) new da((re) this, var2, ((re) this).field_d[var2].field_d, var3);
                return true;
              } else {
                break L0;
              }
            }
          }
        }
        L1: {
          if (var2 != 5) {
            break L1;
          } else {
            if (!((re) this).field_b.d(96)) {
              break L1;
            } else {
              if (gi.field_m <= 0) {
                break L1;
              } else {
                L2: {
                  gi.field_m = gi.field_m - 8;
                  if (gi.field_m < 0) {
                    gi.field_m = 0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                tb.field_d.a(fk.field_x[0], 100, 96 * gi.field_m, 8192);
                break L1;
              }
            }
          }
        }
        L3: {
          if (var2 != 5) {
            break L3;
          } else {
            if (!((re) this).field_b.b(108)) {
              break L3;
            } else {
              if (64 > gi.field_m) {
                L4: {
                  gi.field_m = gi.field_m + 8;
                  if (64 >= gi.field_m) {
                    break L4;
                  } else {
                    gi.field_m = 64;
                    break L4;
                  }
                }
                tb.field_d.a(fk.field_x[0], 100, gi.field_m * 96, 8192);
                break L3;
              } else {
                break L3;
              }
            }
          }
        }
        L5: {
          if (var2 != 5) {
            break L5;
          } else {
            if (!((re) this).field_b.b(true)) {
              break L5;
            } else {
              if (gi.field_m > 0) {
                gi.field_m = 0;
                break L5;
              } else {
                break L5;
              }
            }
          }
        }
        L6: {
          if (var2 != 5) {
            break L6;
          } else {
            if (!((re) this).field_b.e(-19741)) {
              break L6;
            } else {
              if (64 <= gi.field_m) {
                break L6;
              } else {
                gi.field_m = 64;
                tb.field_d.a(fk.field_x[0], 100, gi.field_m * 96, 8192);
                break L6;
              }
            }
          }
        }
        L7: {
          if (param0 >= 99) {
            break L7;
          } else {
            ((re) this).field_f = -116;
            break L7;
          }
        }
        L8: {
          L9: {
            L10: {
              if (var2 == 5) {
                break L10;
              } else {
                if (var2 != 6) {
                  break L9;
                } else {
                  break L10;
                }
              }
            }
            if (((re) this).field_b.g(-1)) {
              L11: {
                var3 = qh.field_i + -6 + (-((re) this).field_d[var2].field_a + (-9 - ((re) this).field_r));
                if (var3 >= 0) {
                  if (64 < var3) {
                    var3 = 64;
                    break L11;
                  } else {
                    break L11;
                  }
                } else {
                  var3 = 0;
                  break L11;
                }
              }
              L12: {
                if (var2 != 5) {
                  break L12;
                } else {
                  L13: {
                    if (~var3 != ~gi.field_m) {
                      break L13;
                    } else {
                      if (!((re) this).field_b.a(true)) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  gi.field_m = var3;
                  tb.field_d.a(fk.field_x[0], 100, gi.field_m * 96, 8192);
                  break L12;
                }
              }
              if (var2 != 6) {
                break L8;
              } else {
                if (~var3 == ~qd.field_r) {
                  break L8;
                } else {
                  ia.a(-658435066, var3);
                  break L8;
                }
              }
            } else {
              break L9;
            }
          }
          if (5 != var2) {
            break L8;
          } else {
            if (((re) this).field_b.a(true)) {
              tb.field_d.a(fk.field_x[0], 100, 96 * gi.field_m, 8192);
              break L8;
            } else {
              break L8;
            }
          }
        }
        L14: {
          if (var2 != 6) {
            break L14;
          } else {
            if (!((re) this).field_b.d(96)) {
              break L14;
            } else {
              if (0 < qd.field_r) {
                ia.a(-658435066, -8 + qd.field_r);
                break L14;
              } else {
                break L14;
              }
            }
          }
        }
        L15: {
          if (var2 != 6) {
            break L15;
          } else {
            if (!((re) this).field_b.b(77)) {
              break L15;
            } else {
              if (qd.field_r < 64) {
                ia.a(-658435066, 8 + qd.field_r);
                break L15;
              } else {
                break L15;
              }
            }
          }
        }
        L16: {
          if (var2 != 6) {
            break L16;
          } else {
            if (!((re) this).field_b.b(true)) {
              break L16;
            } else {
              if (qd.field_r <= 0) {
                break L16;
              } else {
                ia.a(-658435066, 0);
                break L16;
              }
            }
          }
        }
        L17: {
          if (var2 != 6) {
            break L17;
          } else {
            if (!((re) this).field_b.e(-19741)) {
              break L17;
            } else {
              if (qd.field_r >= 64) {
                break L17;
              } else {
                ia.a(-658435066, 64);
                break L17;
              }
            }
          }
        }
        L18: {
          if (var2 != 7) {
            break L18;
          } else {
            if (((re) this).field_b.a(true)) {
              qc.a(((re) this).field_b.field_i, 0);
              ((re) this).field_b.a(-1, true, -1);
              return true;
            } else {
              break L18;
            }
          }
        }
        L19: {
          if (var2 != 8) {
            break L19;
          } else {
            if (!((re) this).field_b.a(true)) {
              break L19;
            } else {
              a.field_b = (ue) (Object) new m((re) this, 8, cp.field_h, 0, 70, false);
              return true;
            }
          }
        }
        L20: {
          if (var2 != 9) {
            break L20;
          } else {
            if (((re) this).field_b.a(true)) {
              a.field_b = (ue) (Object) new m((re) this, 9, fq.field_G, 1, 25, false);
              return true;
            } else {
              break L20;
            }
          }
        }
        L21: {
          if (10 != var2) {
            break L21;
          } else {
            if (!((re) this).field_b.a(true)) {
              break L21;
            } else {
              a.field_b = (ue) (Object) new vn((m) null, (re) this, false);
              return true;
            }
          }
        }
        L22: {
          if (var2 != 11) {
            break L22;
          } else {
            if (((re) this).field_b.a(true)) {
              q.a(false);
              ta.a(le.b((byte) -20), 19);
              break L22;
            } else {
              return false;
            }
          }
        }
        return false;
    }

    final void b(int param0) {
        if (param0 != 8) {
            re.d((byte) 102);
        }
        ((re) this).e(79);
        ((re) this).a(-1, false);
    }

    private final void a(int param0, byte param1) {
        int var3 = 0;
        int var4 = CrazyCrystals.field_B;
        if (param0 >= 0) {
            if (!(((re) this).field_t[param0] >= 20)) {
                ((re) this).field_t[param0] = ((re) this).field_t[param0] + 1;
                ((re) this).field_d[param0].field_a = ((re) this).field_d[param0].field_a - 14;
            }
        }
        for (var3 = 0; var3 < 12; var3++) {
            if (param0 != var3) {
                if (((re) this).field_t[var3] > 0) {
                    ((re) this).field_t[var3] = ((re) this).field_t[var3] - 1;
                    ((re) this).field_d[var3].field_a = ((re) this).field_d[var3].field_a + 14;
                }
            }
            ((re) this).field_d[var3].field_d = ((re) this).field_t[var3] * (-((re) this).field_s[var3] + ((re) this).field_e[var3]) * ((re) this).field_t[var3] / 400 + ((re) this).field_s[var3];
        }
        if (param1 != -18) {
            field_k = null;
        }
    }

    final void b(int param0, int param1, int param2) {
        ((re) this).a((byte) 20, -1);
        ((re) this).c(param2, param1, 180);
        ((re) this).field_q = ((re) this).field_q - 10;
        ((re) this).field_g = 0;
        if (((re) this).field_q < -200) {
            ((re) this).field_q = -200;
        }
        if (param0 > -113) {
            this.a(51, (byte) 114);
        }
    }

    final void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = CrazyCrystals.field_B;
        if (!(((re) this).field_l >= 20)) {
            ((re) this).field_l = ((re) this).field_l + 1;
            for (var3 = 0; 12 > var3; var3++) {
                ((re) this).field_d[var3].field_a = ((re) this).field_d[var3].field_a + 14;
            }
        }
        this.a(param1, (byte) -18);
        if (param0 != 20) {
            boolean discarded$0 = ((re) this).a(-34);
        }
    }

    final void c(int param0, int param1, int param2) {
        if (param1 > ((re) this).field_f) {
            ((re) this).field_f = ((re) this).field_f + param0;
            if (param1 < ((re) this).field_f) {
                ((re) this).field_f = param1;
            }
        }
        if (param2 != 180) {
            return;
        }
        ((re) this).field_u = param0;
    }

    final void c(byte param0) {
        if (!(((re) this).field_g >= 13)) {
            ((re) this).field_g = ((re) this).field_g + 1;
        }
        ((re) this).field_q = ((re) this).field_q + ((re) this).field_g;
        if (param0 < 46) {
            ((re) this).b(-112);
        }
        if (!(((re) this).field_q < 0)) {
            ((re) this).field_q = 0;
            ((re) this).field_g = -((re) this).field_g;
            ((re) this).field_g = ((re) this).field_g - (((re) this).field_g >> 2);
        }
    }

    private final void a(ik param0, int param1, int param2, boolean param3) {
        try {
            ak.a((byte) 61, 9 + (param0.field_a + ((re) this).field_r), param0.field_d, param2, param1);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "re.L(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + 1 + 41);
        }
    }

    final static boolean a(boolean param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var4 = CrazyCrystals.field_B;
        try {
          try {
            if (un.field_u.startsWith("win")) {
              L0: {
                if (param1.startsWith("http://")) {
                  break L0;
                } else {
                  if (!param1.startsWith("https://")) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0 != 0;
                  } else {
                    break L0;
                  }
                }
              }
              var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
              var3 = 0;
              L1: while (true) {
                if (var3 >= param1.length()) {
                  L2: {
                    if (!param0) {
                      break L2;
                    } else {
                      re.d((byte) -80);
                      break L2;
                    }
                  }
                  Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                  stackOut_18_0 = 1;
                  stackIn_19_0 = stackOut_18_0;
                  return stackIn_19_0 != 0;
                } else {
                  if (-1 == var2.indexOf((int) param1.charAt(var3))) {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0 != 0;
                  } else {
                    var3++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            stackOut_20_0 = 0;
            stackIn_21_0 = stackOut_20_0;
            return stackIn_21_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2_ref2;
            stackOut_22_1 = new StringBuilder().append("re.K(").append(param0).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L3;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
    }

    public static void d(byte param0) {
        field_k = null;
        field_p = null;
        field_h = null;
        field_o = null;
        field_j = null;
        field_n = null;
        int var1 = 10 / ((param0 - -7) / 62);
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = CrazyCrystals.field_B;
        if (((re) this).field_l > 0) {
            ((re) this).field_l = ((re) this).field_l - 1;
            for (var2 = 0; 12 > var2; var2++) {
                ((re) this).field_d[var2].field_a = ((re) this).field_d[var2].field_a - 14;
            }
        }
        this.a(-1, (byte) -18);
        ((re) this).c(-1);
        ((re) this).c((byte) 52);
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = CrazyCrystals.field_B;
        ((re) this).f(-114);
        this.d(14);
        if (!(rb.field_h < 2)) {
            if (!(!cp.field_k[12])) {
                for (var2 = 0; var2 < 5; var2++) {
                    ke.field_b[var2] = jl.field_c[var2];
                }
                ll.field_a = "All levels considered reached - free player restrictions may apply";
            }
        }
        super.a(param0);
    }

    final void e(int param0) {
        L0: {
          if (0 < ((re) this).field_f) {
            ge.field_d.e(0, 0, -((((re) this).field_f << 7) / 20) + 256);
            break L0;
          } else {
            ge.field_d.c(0, 0);
            break L0;
          }
        }
        L1: {
          if (param0 >= 11) {
            break L1;
          } else {
            ((re) this).field_m = 118;
            break L1;
          }
        }
    }

    re() {
        super(12);
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var15 = null;
        int[] var16 = null;
        L0: {
          ((re) this).field_f = 0;
          ((re) this).field_q = -126;
          ((re) this).field_e = new int[12];
          ((re) this).field_t = new int[12];
          ((re) this).field_l = 0;
          ((re) this).field_g = 0;
          ((re) this).field_i = 0;
          ((re) this).field_s = new int[12];
          ((re) this).field_d = new ik[12];
          var1 = 0;
          var2 = 95;
          int incrementValue$9 = var1;
          var1++;
          ((re) this).field_d[incrementValue$9] = (ik) (Object) new mh(690, var2, 180, ai.field_n, 2);
          var2 += 26;
          var2 += 10;
          int incrementValue$10 = var1;
          var1++;
          ((re) this).field_d[incrementValue$10] = (ik) (Object) new mh(690, var2, 180, rh.field_d, 2);
          var2 += 26;
          int incrementValue$11 = var1;
          var1++;
          ((re) this).field_d[incrementValue$11] = (ik) (Object) new mh(690, var2, 180, li.field_e, 2);
          var2 += 26;
          int incrementValue$12 = var1;
          var1++;
          ((re) this).field_d[incrementValue$12] = (ik) (Object) new mh(690, var2, 180, l.field_c, 2);
          var2 += 26;
          int incrementValue$13 = var1;
          var1++;
          ((re) this).field_d[incrementValue$13] = (ik) (Object) new mh(690, var2, 180, b.field_d, 2);
          var2 += 26;
          var2 += 10;
          var3 = go.field_l.a(fa.field_m);
          var4 = go.field_l.a(cc.field_b);
          var5 = var3;
          if (var4 <= var5) {
            break L0;
          } else {
            var5 = var4;
            break L0;
          }
        }
        ((re) this).field_r = (-79 + (var5 + 180)) / 2;
        ((re) this).field_d[var1] = (ik) (Object) new mh(690, var2, 180, fa.field_m, 0);
        var2 += 26;
        ((mh) (Object) ((re) this).field_d[var1]).field_k = ((mh) (Object) ((re) this).field_d[var1]).field_k + (-var3 + ((re) this).field_r);
        var1++;
        ((re) this).field_d[var1] = (ik) (Object) new mh(690, var2, 180, cc.field_b, 0);
        var2 += 26;
        ((mh) (Object) ((re) this).field_d[var1]).field_k = ((mh) (Object) ((re) this).field_d[var1]).field_k + (-var4 + ((re) this).field_r);
        var1++;
        ((re) this).field_d[var1] = (ik) (Object) new mh(690, var2, 180, vl.field_e, 2);
        var2 += 26;
        var1++;
        var2 += 10;
        int incrementValue$14 = var1;
        var1++;
        ((re) this).field_d[incrementValue$14] = (ik) (Object) new mh(690, var2, 180, cp.field_h, 2);
        var2 += 26;
        int incrementValue$15 = var1;
        var1++;
        ((re) this).field_d[incrementValue$15] = (ik) (Object) new mh(690, var2, 180, fq.field_G, 2);
        var2 += 26;
        var2 += 10;
        int incrementValue$16 = var1;
        var1++;
        ((re) this).field_d[incrementValue$16] = (ik) (Object) new mh(690, var2, 180, nk.field_n, 2);
        var2 += 26;
        var2 += 10;
        int incrementValue$17 = var1;
        var1++;
        ((re) this).field_d[incrementValue$17] = (ik) (Object) new mh(690, var2, 180, dc.field_C, 2);
        var2 += 26;
        var1 = 0;
        L1: while (true) {
          if (var1 >= 12) {
            var1 = 0;
            L2: while (true) {
              if (5 <= var1) {
                var16 = ((re) this).field_e;
                var15 = ((re) this).field_e;
                ((re) this).field_e[10] = 78;
                var15[9] = 78;
                var16[8] = 78;
                um.a(128, "menu", (byte) 77);
                return;
              } else {
                ((re) this).field_e[var1] = 10;
                var1++;
                continue L2;
              }
            }
          } else {
            ((re) this).field_s[var1] = ((re) this).field_d[var1].field_d;
            var1++;
            continue L1;
          }
        }
    }

    final void c(int param0) {
        if (((re) this).field_f > 0) {
            ((re) this).field_f = ((re) this).field_f - ((re) this).field_u;
            if (((re) this).field_f < 0) {
                ((re) this).field_f = 0;
            }
        }
        if (param0 != -1) {
            Object var3 = null;
            boolean discarded$0 = re.a(true, (String) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new int[128];
        field_k = "Error connecting to server. Please try using a different server.";
        field_n = "Waiting for graphics";
        field_p = "Last Crystal";
    }
}
