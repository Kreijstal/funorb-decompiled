/*
 * Decompiled by CFR-JS 0.4.0.
 */
class gk extends rk {
    static bi field_q;
    bi field_s;
    int field_m;
    boolean field_x;
    pm field_t;
    boolean field_o;
    private boolean field_p;
    double field_w;
    static String field_v;
    static vd field_u;
    static char[] field_y;
    vc field_n;
    static int field_r;

    final void d(int param0) {
        L0: {
          if (!((gk) this).field_x) {
            cb.field_a.a((gf) (Object) ((gk) this).field_n);
            break L0;
          } else {
            break L0;
          }
        }
        ((gk) this).field_t.field_A.field_z.a((rk) this, (byte) -66);
        if (param0 != 209) {
          ((gk) this).field_x = false;
          return;
        } else {
          return;
        }
    }

    void e(int param0) {
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        int var13 = 0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        int var21 = 0;
        double var22 = 0.0;
        Object var24_ref = null;
        ee var24_ref_ee = null;
        double var24 = 0.0;
        double var26 = 0.0;
        double var28 = 0.0;
        double var30 = 0.0;
        Object var32 = null;
        Throwable var33 = null;
        dj var34 = null;
        double[] var38 = null;
        int stackIn_3_0 = 0;
        double stackIn_9_0 = 0.0;
        double stackIn_10_0 = 0.0;
        double stackIn_11_0 = 0.0;
        double stackIn_11_1 = 0.0;
        int stackIn_13_0 = 0;
        vc stackIn_25_0 = null;
        vc stackIn_26_0 = null;
        vc stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_12_0 = 0;
        double stackOut_8_0 = 0.0;
        double stackOut_10_0 = 0.0;
        double stackOut_10_1 = 0.0;
        double stackOut_9_0 = 0.0;
        double stackOut_9_1 = 0.0;
        int stackOut_11_0 = 0;
        vc stackOut_24_0 = null;
        vc stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        vc stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        L0: {
          var24_ref = null;
          var34 = ((gk) this).field_t.field_A.field_B;
          var3 = var34.field_E - ((gk) this).field_t.field_E;
          var5 = -((gk) this).field_t.field_t + var34.field_t;
          var7 = var34.field_D - ((gk) this).field_t.field_D;
          var9 = var7 * var7 + (var3 * var3 + var5 * var5);
          var11 = ((gk) this).field_w * 2.0;
          if (var9 > var11 * var11) {
            stackOut_2_0 = (int)(0.5 + (double)((gk) this).field_m * var11 / Math.sqrt(var9));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ((gk) this).field_m;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var13 = stackIn_3_0;
          if (256 >= var13) {
            break L1;
          } else {
            var13 = 256;
            break L1;
          }
        }
        L2: {
          L3: {
            var38 = new double[12];
            var34.field_jb.a((byte) 71, var38);
            var15 = var38[3];
            var17 = var38[4];
            var19 = var38[5];
            if ((Object) (Object) var34 != (Object) (Object) ((gk) this).field_t) {
              break L3;
            } else {
              if (!((gk) this).field_o) {
                stackOut_12_0 = -1;
                stackIn_13_0 = stackOut_12_0;
                break L2;
              } else {
                break L3;
              }
            }
          }
          L4: {
            stackOut_8_0 = (var19 * var7 + (var3 * var15 + var17 * var5)) * 128.0;
            stackIn_10_0 = stackOut_8_0;
            stackIn_9_0 = stackOut_8_0;
            if (var9 > var11 * var11) {
              stackOut_10_0 = stackIn_10_0;
              stackOut_10_1 = Math.sqrt(var9);
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              break L4;
            } else {
              stackOut_9_0 = stackIn_9_0;
              stackOut_9_1 = var11;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              break L4;
            }
          }
          stackOut_11_0 = (int)(-(stackIn_11_0 / stackIn_11_1) + 128.5);
          stackIn_13_0 = stackOut_11_0;
          break L2;
        }
        var21 = stackIn_13_0;
        if (param0 == 6466) {
          L5: {
            ((gk) this).field_n.b(eg.field_i * (fa.field_S * var13) - -16384 >> 15, var21);
            if (var9 < 0.01) {
              break L5;
            } else {
              var9 = 1.0 / Math.sqrt(var9);
              var5 = var5 * var9;
              var3 = var3 * var9;
              var7 = var7 * var9;
              break L5;
            }
          }
          L6: {
            var22 = 2.0;
            if (((gk) this).field_t instanceof ee) {
              var24_ref_ee = (ee) (Object) ((gk) this).field_t;
              var22 = -(var24_ref_ee.field_L * var7) - (var5 * var24_ref_ee.field_G + var24_ref_ee.field_K * var3) + 2.0;
              if (var22 >= 0.01) {
                break L6;
              } else {
                ((gk) this).field_n.d(0);
                return;
              }
            } else {
              break L6;
            }
          }
          var24 = -(var7 * var34.field_L) - (var34.field_G * var5 + var3 * var34.field_K) + 2.0;
          if (var24 >= 0.01) {
            var26 = (double)(256 * ((gk) this).field_s.field_n) / (double)dk.field_k;
            var28 = 2.0 * var26 / var22;
            var30 = var24 * var28 / 2.0;
            var32 = (Object) (Object) ((gk) this).field_n;
            synchronized (var32) {
              L7: {
                L8: {
                  stackOut_24_0 = ((gk) this).field_n;
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_25_0 = stackOut_24_0;
                  if (1600.0 > var30) {
                    stackOut_26_0 = (vc) (Object) stackIn_26_0;
                    stackOut_26_1 = (int)(0.5 + var30);
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    break L8;
                  } else {
                    stackOut_25_0 = (vc) (Object) stackIn_25_0;
                    stackOut_25_1 = 1600;
                    stackIn_27_0 = stackOut_25_0;
                    stackIn_27_1 = stackOut_25_1;
                    break L8;
                  }
                }
                L9: {
                  ((vc) (Object) stackIn_27_0).d(stackIn_27_1);
                  if (!((gk) this).field_p) {
                    break L9;
                  } else {
                    ((gk) this).field_n.b(true);
                    ((gk) this).field_p = false;
                    break L9;
                  }
                }
                break L7;
              }
            }
            L10: {
              if (((gk) this).field_x) {
                cb.field_a.a((gf) (Object) ((gk) this).field_n);
                ((gk) this).field_x = false;
                break L10;
              } else {
                break L10;
              }
            }
            return;
          } else {
            ((gk) this).field_n.d(0);
            return;
          }
        } else {
          return;
        }
    }

    gk(pm param0, bi param1) {
        this(param0, param1, -1, false);
    }

    public static void c(int param0) {
        field_u = null;
        field_q = null;
        if (param0 != 14714) {
          gk.c(118);
          field_v = null;
          field_y = null;
          return;
        } else {
          field_v = null;
          field_y = null;
          return;
        }
    }

    final void f(int param0) {
        if (param0 == 128) {
          if (!((gk) this).field_x) {
            cb.field_a.b((gf) (Object) ((gk) this).field_n);
            ((gk) this).a(true);
            return;
          } else {
            ((gk) this).a(true);
            return;
          }
        } else {
          return;
        }
    }

    final void g(int param0) {
        dj var3 = null;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        int var14 = 0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        int var22 = 0;
        double var23 = 0.0;
        Object var25 = null;
        Throwable var26 = null;
        hn var27 = null;
        double[] var31 = null;
        int stackIn_3_0 = 0;
        double stackIn_7_0 = 0.0;
        double stackIn_8_0 = 0.0;
        double stackIn_9_0 = 0.0;
        double stackIn_9_1 = 0.0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        double stackOut_6_0 = 0.0;
        double stackOut_8_0 = 0.0;
        double stackOut_8_1 = 0.0;
        double stackOut_7_0 = 0.0;
        double stackOut_7_1 = 0.0;
        L0: {
          var27 = qn.field_v;
          var3 = var27.field_B;
          var4 = var3.field_E - var27.field_s;
          var6 = var3.field_t - var27.field_r;
          var8 = -var27.field_E + var3.field_D;
          var10 = Math.sqrt(var8 * var8 + (var6 * var6 + var4 * var4)) - var27.field_A;
          var12 = ((gk) this).field_w * 2.0;
          if (var12 < var10) {
            stackOut_2_0 = (int)(0.5 + (double)((gk) this).field_m * var12 / var10);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ((gk) this).field_m;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var14 = stackIn_3_0;
          if (var14 > 256) {
            var14 = 256;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var31 = new double[12];
          var3.field_jb.a((byte) 53, var31);
          var16 = var31[3];
          var18 = var31[4];
          var20 = var31[5];
          stackOut_6_0 = (var16 * var4 + var6 * var18 + var8 * var20) * 128.0;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (var12 < var10) {
            stackOut_8_0 = stackIn_8_0;
            stackOut_8_1 = var10;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            break L2;
          } else {
            stackOut_7_0 = stackIn_7_0;
            stackOut_7_1 = var12;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            break L2;
          }
        }
        L3: {
          var22 = (int)(-(stackIn_9_0 / stackIn_9_1) + 128.5);
          ((gk) this).field_n.b(16384 + fa.field_S * (var14 * eg.field_i) >> 15, var22);
          if (var10 >= 0.1) {
            var10 = 1.0 / var10;
            var8 = var8 * var10;
            var4 = var4 * var10;
            var6 = var6 * var10;
            break L3;
          } else {
            break L3;
          }
        }
        var23 = (double)(param0 * ((gk) this).field_s.field_n) / (double)dk.field_k;
        var25 = (Object) (Object) ((gk) this).field_n;
        synchronized (var25) {
          L4: {
            L5: {
              ((gk) this).field_n.d((int)(0.5 + var23));
              if (!((gk) this).field_p) {
                break L5;
              } else {
                ((gk) this).field_n.b(true);
                ((gk) this).field_p = false;
                break L5;
              }
            }
            break L4;
          }
        }
        if (((gk) this).field_x) {
          cb.field_a.a((gf) (Object) ((gk) this).field_n);
          ((gk) this).field_x = false;
          return;
        } else {
          return;
        }
    }

    final static void a(boolean param0, String param1, byte param2, boolean param3) {
        im.a((byte) -110);
        vg.field_Z.g((byte) 105);
        om.field_p = new w(kj.field_c, (String) null, rk.field_f, param0, param3);
        dn.field_b = new ef(vg.field_Z, (fj) (Object) om.field_p);
        if (param2 >= -110) {
            return;
        }
        try {
            vg.field_Z.c((fj) (Object) dn.field_b, 0);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "gk.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    void b(int param0) {
        if (((gk) this).field_x) {
          if (param0 == -25071) {
            if (null != ((gk) this).field_t) {
              if (((gk) this).field_t.field_z) {
                L0: {
                  if (((gk) this).field_t.field_s == 0) {
                    break L0;
                  } else {
                    int fieldTemp$4 = ((gk) this).field_m - ((gk) this).field_t.field_s;
                    ((gk) this).field_m = ((gk) this).field_m - ((gk) this).field_t.field_s;
                    if (0 >= fieldTemp$4) {
                      break L0;
                    } else {
                      ((gk) this).e(param0 ^ -30893);
                      return;
                    }
                  }
                }
                ((gk) this).f(128);
                return;
              } else {
                ((gk) this).e(param0 ^ -30893);
                return;
              }
            } else {
              return;
            }
          } else {
            ((gk) this).field_x = false;
            if (null != ((gk) this).field_t) {
              if (((gk) this).field_t.field_z) {
                L1: {
                  if (((gk) this).field_t.field_s == 0) {
                    break L1;
                  } else {
                    int fieldTemp$5 = ((gk) this).field_m - ((gk) this).field_t.field_s;
                    ((gk) this).field_m = ((gk) this).field_m - ((gk) this).field_t.field_s;
                    if (0 >= fieldTemp$5) {
                      break L1;
                    } else {
                      ((gk) this).e(param0 ^ -30893);
                      return;
                    }
                  }
                }
                ((gk) this).f(128);
                return;
              } else {
                ((gk) this).e(param0 ^ -30893);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          if (((gk) this).field_n.c((byte) 119)) {
            if (param0 != -25071) {
              ((gk) this).field_x = false;
              if (null != ((gk) this).field_t) {
                if (((gk) this).field_t.field_z) {
                  L2: {
                    if (((gk) this).field_t.field_s == 0) {
                      break L2;
                    } else {
                      int fieldTemp$6 = ((gk) this).field_m - ((gk) this).field_t.field_s;
                      ((gk) this).field_m = ((gk) this).field_m - ((gk) this).field_t.field_s;
                      if (0 >= fieldTemp$6) {
                        break L2;
                      } else {
                        ((gk) this).e(param0 ^ -30893);
                        return;
                      }
                    }
                  }
                  ((gk) this).f(128);
                  return;
                } else {
                  ((gk) this).e(param0 ^ -30893);
                  return;
                }
              } else {
                return;
              }
            } else {
              if (null != ((gk) this).field_t) {
                if (((gk) this).field_t.field_z) {
                  L3: {
                    if (((gk) this).field_t.field_s == 0) {
                      break L3;
                    } else {
                      int fieldTemp$7 = ((gk) this).field_m - ((gk) this).field_t.field_s;
                      ((gk) this).field_m = ((gk) this).field_m - ((gk) this).field_t.field_s;
                      if (0 >= fieldTemp$7) {
                        break L3;
                      } else {
                        ((gk) this).e(param0 ^ -30893);
                        return;
                      }
                    }
                  }
                  ((gk) this).f(128);
                  return;
                } else {
                  ((gk) this).e(param0 ^ -30893);
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            ((gk) this).a(true);
            return;
          }
        }
    }

    gk(pm param0, bi param1, int param2, boolean param3) {
        this(param0.field_A, param0, param1, param2, param3);
    }

    gk(pm param0, bi param1, int param2) {
        this(param0, param1, param2, false);
    }

    final void a(byte param0) {
        int var2_int = 0;
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        if (!((gk) this).field_x) {
          var2 = (Object) (Object) ((gk) this).field_n;
          synchronized (var2) {
            L0: {
              L1: {
                if (!((gk) this).field_n.i()) {
                  break L1;
                } else {
                  ((gk) this).field_p = true;
                  break L1;
                }
              }
              ((gk) this).field_n.d(0);
              ((gk) this).field_n.h(0);
              break L0;
            }
          }
          var2_int = -9 % ((-15 - param0) / 48);
          return;
        } else {
          var2_int = -9 % ((-15 - param0) / 48);
          return;
        }
    }

    gk(hn param0, pm param1, bi param2, int param3, boolean param4) {
        ((gk) this).field_m = 96;
        ((gk) this).field_w = 1.0;
        ((gk) this).field_x = true;
        try {
            ((gk) this).field_s = param2;
            ((gk) this).field_t = param1;
            int discarded$0 = 0;
            int discarded$1 = 0;
            ((gk) this).field_n = vc.a(param2);
            ((gk) this).field_n.c(param3);
            ((gk) this).field_n.c(param4);
            param0.field_z.a((rk) this, (byte) 106);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "gk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
    }
}
