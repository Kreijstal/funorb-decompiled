/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk {
    static int field_a;
    static ie field_e;
    static java.applet.Applet field_j;
    static int[] field_i;
    private boolean field_b;
    private td field_n;
    static String field_h;
    static boolean field_f;
    private Object[] field_o;
    static byte[][] field_g;
    private int field_k;
    private g field_l;
    static char field_d;
    private Object[][] field_c;
    static String field_m;

    final boolean a(String param0, String param1, int param2) {
        if (!(((gk) this).c(-109))) {
            return false;
        }
        param0 = param0.toLowerCase();
        param1 = param1.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param0;
        int var4 = ((gk) this).field_l.field_a.a(param2 ^ -16444, ae.a(param2 + -51781023, var6));
        if (!this.a(var4, false)) {
            return false;
        }
        if (param2 != 16484) {
            return ((boolean[]) ((gk) this).field_o[9])[3];
        }
        CharSequence var7 = (CharSequence) (Object) param1;
        int var5 = ((gk) this).field_l.field_k[var4].a(-122, ae.a(-51764539, var7));
        return ((gk) this).a(var4, var5, (byte) -14);
    }

    private final synchronized void e(int param0, int param1) {
        if (((gk) this).field_b) {
            ((gk) this).field_o[param1] = (Object) (Object) ((gk) this).field_n.a(param1, true);
        } else {
            ((gk) this).field_o[param1] = nh.a(false, -11560, ((gk) this).field_n.a(param1, true));
        }
        if (param0 != -19250) {
            gk.a(((int[]) ((gk) this).field_o[1])[10], (String) ((gk) this).field_o[2]);
        }
    }

    final static boolean b(int param0) {
        if (param0 < 110) {
            field_g = null;
        }
        return ih.field_Q.a(-125);
    }

    final int a(byte param0, int param1) {
        if (param0 != 47) {
            return ((int[]) ((gk) this).field_o[6])[22];
        }
        if (!(this.a(param1, false))) {
            return 0;
        }
        return ((gk) this).field_l.field_c[param1];
    }

    final static void a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var3 = Bounce.field_N;
          ge.field_c = ge.field_c + 1;
          if (ck.field_c != -1) {
            break L0;
          } else {
            if ((sj.field_d ^ -1) != 0) {
              break L0;
            } else {
              ck.field_c = uc.field_C;
              sj.field_d = ll.field_y;
              break L0;
            }
          }
        }
        L1: {
          L2: {
            if (param1 != null) {
              if (param1.equals((Object) (Object) oc.field_b)) {
                break L1;
              } else {
                break L2;
              }
            } else {
              if (null != oc.field_b) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (!nh.field_P) {
              if (ea.field_b <= ge.field_c) {
                if (ge.field_c < ea.field_b + sd.field_lb) {
                  stackOut_13_0 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  break L3;
                } else {
                  stackOut_12_0 = 0;
                  stackIn_15_0 = stackOut_12_0;
                  break L3;
                }
              } else {
                stackOut_10_0 = 0;
                stackIn_15_0 = stackOut_10_0;
                break L3;
              }
            } else {
              stackOut_8_0 = 0;
              stackIn_15_0 = stackOut_8_0;
              break L3;
            }
          }
          L4: {
            var2 = stackIn_15_0;
            if (param1 != null) {
              if (!nh.field_P) {
                if (var2 != 0) {
                  ge.field_c = ea.field_b;
                  break L4;
                } else {
                  ge.field_c = 0;
                  break L4;
                }
              } else {
                ge.field_c = ea.field_b;
                break L4;
              }
            } else {
              ge.field_c = 0;
              break L4;
            }
          }
          L5: {
            mh.field_Z = ck.field_c;
            if (param1 != null) {
              nh.field_P = false;
              break L5;
            } else {
              if (var2 == 0) {
                break L5;
              } else {
                nh.field_P = true;
                break L5;
              }
            }
          }
          ha.field_b = sj.field_d;
          break L1;
        }
        L6: {
          oc.field_b = param1;
          if (nh.field_P) {
            break L6;
          } else {
            if (ge.field_c >= ea.field_b) {
              break L6;
            } else {
              if (mi.field_j) {
                ge.field_c = 0;
                mh.field_Z = ck.field_c;
                ha.field_b = sj.field_d;
                break L6;
              } else {
                break L6;
              }
            }
          }
        }
        L7: {
          ck.field_c = -1;
          if (param0 > 20) {
            break L7;
          } else {
            gk.b(false);
            break L7;
          }
        }
        L8: {
          if (!nh.field_P) {
            break L8;
          } else {
            if (jk.field_K != ge.field_c) {
              break L8;
            } else {
              nh.field_P = false;
              ge.field_c = 0;
              break L8;
            }
          }
        }
        sj.field_d = -1;
    }

    private final synchronized boolean a(int param0, boolean param1) {
        if (!((gk) this).c(-94)) {
          return false;
        } else {
          L0: {
            if (!param1) {
              break L0;
            } else {
              ((gk) this).field_c = (Object[][]) ((gk) this).field_o[8];
              break L0;
            }
          }
          L1: {
            if (0 > param0) {
              break L1;
            } else {
              if (((gk) this).field_l.field_c.length <= param0) {
                break L1;
              } else {
                if (0 != ((gk) this).field_l.field_c[param0]) {
                  return true;
                } else {
                  break L1;
                }
              }
            }
          }
          if (!pe.field_e) {
            return false;
          } else {
            throw new IllegalArgumentException(Integer.toString(param0));
          }
        }
    }

    final boolean b(String param0, boolean param1) {
        if (!((gk) this).c(-78)) {
            return false;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((gk) this).field_l.field_a.a(-55, ae.a(-51764539, var4));
        if (param1) {
            field_g = (byte[][]) ((gk) this).field_o[0];
        }
        return ((gk) this).d(var3, 77);
    }

    final synchronized int a(int param0, int param1) {
        if (!this.a(param0, false)) {
            return 0;
        }
        if (param1 != 0) {
            return -128;
        }
        if (!(null == ((gk) this).field_o[param0])) {
            return 100;
        }
        return ((gk) this).field_n.a(113, param0);
    }

    final synchronized boolean c(int param0) {
        if (((gk) this).field_l == null) {
            ((gk) this).field_l = ((gk) this).field_n.b(1);
            if (null == ((gk) this).field_l) {
                return false;
            }
            ((gk) this).field_o = new Object[((gk) this).field_l.field_m];
            ((gk) this).field_c = new Object[((gk) this).field_l.field_m][];
        }
        int var2 = 110 % ((-19 - param0) / 57);
        return true;
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (((gk) this).c(72)) {
          L0: {
            if (param2 > param0) {
              break L0;
            } else {
              if (0 > param1) {
                break L0;
              } else {
                if (((gk) this).field_l.field_c.length <= param0) {
                  break L0;
                } else {
                  if (param1 < ((gk) this).field_l.field_c[param0]) {
                    return true;
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          if (!pe.field_e) {
            return false;
          } else {
            throw new IllegalArgumentException(param0 + " " + param1);
          }
        } else {
          return false;
        }
    }

    public static void b(boolean param0) {
        field_e = null;
        field_g = null;
        field_i = null;
        field_j = null;
        field_h = null;
        field_m = null;
        if (param0) {
            gk.b(-83, -52);
        }
    }

    final boolean a(String param0, byte param1) {
        if (!((gk) this).c(115)) {
            return false;
        }
        param0 = param0.toLowerCase();
        if (param1 != -16) {
            ((byte[]) ((gk) this).field_o[1])[0] = (byte) 78;
        }
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((gk) this).field_l.field_a.a(-86, ae.a(-51764539, var4));
        if (0 <= var3) {
            return true;
        }
        return false;
    }

    final int b(String param0, byte param1) {
        if (!((gk) this).c(param1 + 145)) {
            return 0;
        }
        param0 = param0.toLowerCase();
        if (param1 != -100) {
            return ((int[]) ((gk) this).field_o[0])[19];
        }
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((gk) this).field_l.field_a.a(-64, ae.a(-51764539, var4));
        return ((gk) this).a(var3, 0);
    }

    final synchronized int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Bounce.field_N;
        if (!((gk) this).c(94)) {
          return 0;
        } else {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= ((gk) this).field_o.length) {
              if (var2 == 0) {
                return 100;
              } else {
                var4 = var3 * param0 / var2;
                return var4;
              }
            } else {
              if (-1 > (((gk) this).field_l.field_q[var4] ^ -1)) {
                var3 = var3 + ((gk) this).a(var4, 0);
                var2 += 100;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    final int a(boolean param0) {
        if (!((gk) this).c(45)) {
            return -1;
        }
        if (!param0) {
            return -115;
        }
        return ((gk) this).field_l.field_c.length;
    }

    final static void a(int param0, int param1, tg[] param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = Bounce.field_N;
          if (param2 == null) {
            break L0;
          } else {
            if ((param4 ^ -1) < -1) {
              var5 = param2[0].field_t;
              var6 = param2[2].field_t;
              var7 = param2[1].field_t;
              param2[0].a(param0, param3);
              param2[2].a(param4 + (param0 + -var6), param3);
              na.b(hh.field_h);
              na.c(var5 + param0, param3, param4 + param0 - var6, param3 - -param2[param1].field_o);
              var8 = param0 - -var5;
              var9 = param4 + (param0 + -var6);
              param0 = var8;
              L1: while (true) {
                if (var9 <= param0) {
                  na.a(hh.field_h);
                  return;
                } else {
                  param2[1].a(param0, param3);
                  param0 = param0 + var7;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    final synchronized byte[] b(String param0, String param1, int param2) {
        int var4 = -22 / ((70 - param2) / 47);
        if (!((gk) this).c(50)) {
            return null;
        }
        param0 = param0.toLowerCase();
        param1 = param1.toLowerCase();
        CharSequence var7 = (CharSequence) (Object) param0;
        int var5 = ((gk) this).field_l.field_a.a(-73, ae.a(-51764539, var7));
        if (!this.a(var5, false)) {
            return null;
        }
        CharSequence var8 = (CharSequence) (Object) param1;
        int var6 = ((gk) this).field_l.field_k[var5].a(-96, ae.a(-51764539, var8));
        return ((gk) this).b(104, var6, var5);
    }

    final synchronized boolean d(int param0, int param1) {
        if (!this.a(param0, false)) {
            return false;
        }
        if (!(((gk) this).field_o[param0] == null)) {
            return true;
        }
        this.e(-19250, param0);
        if (param1 <= 68) {
            field_d = '￾';
        }
        if (null == ((gk) this).field_o[param0]) {
            return false;
        }
        return true;
    }

    final int a(int param0, String param1, int param2) {
        if (!this.a(param0, false)) {
            return -1;
        }
        int var5 = -1 / ((51 - param2) / 44);
        param1 = param1.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param1;
        int var4 = ((gk) this).field_l.field_k[param0].a(-79, ae.a(-51764539, var6));
        if (!this.a(param0, var4, 0)) {
            return -1;
        }
        return var4;
    }

    final synchronized boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Bounce.field_N;
        if (!((gk) this).c(-95)) {
          return false;
        } else {
          L0: {
            if (param0 <= -35) {
              break L0;
            } else {
              boolean discarded$2 = ((gk) this).a(-77, -72, (byte) -81);
              break L0;
            }
          }
          var2 = 1;
          var3 = 0;
          L1: while (true) {
            if (var3 >= ((gk) this).field_l.field_n.length) {
              return var2 != 0;
            } else {
              var4 = ((gk) this).field_l.field_n[var3];
              if (null == ((gk) this).field_o[var4]) {
                this.e(-19250, var4);
                if (null == ((gk) this).field_o[var4]) {
                  var2 = 0;
                  var3++;
                  continue L1;
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            }
          }
        }
    }

    final static void b(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Bounce.field_N;
          var2 = 0;
          var3 = oa.field_a;
          if ((var3 ^ -1) > -6) {
            var2 = var3 * var3 * 8192 / 1100;
            break L0;
          } else {
            if (105 > var3) {
              var2 = (-40960 + var3 * 16384) / 220;
              break L0;
            } else {
              if (-121 >= (var3 ^ -1)) {
                break L0;
              } else {
                var3 = 120 - var3;
                var2 = 8192 - var3 * var3 * 8192 / 3300;
                break L0;
              }
            }
          }
        }
        L1: {
          var4 = 1;
          if (param1 == -1) {
            break L1;
          } else {
            field_j = null;
            break L1;
          }
        }
        L2: {
          var5 = 0;
          if (-4 == (param0 ^ -1)) {
            var4 = -1;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (-2 == (param0 ^ -1)) {
            var5 = 1;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (4 == param0) {
            var5 = 1;
            var4 = 1;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if ((param0 ^ -1) == -6) {
            var4 = -1;
            var5 = 1;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (6 == param0) {
            var5 = -1;
            var4 = 1;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          L8: {
            if (7 == param0) {
              break L8;
            } else {
              if (-9 == (param0 ^ -1)) {
                break L8;
              } else {
                break L7;
              }
            }
          }
          var4 = -1;
          var5 = -1;
          break L7;
        }
        L9: {
          if ((param0 ^ -1) == -12) {
            var4 = -1;
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          if (12 != param0) {
            break L10;
          } else {
            var5 = -1;
            var4 = -1;
            break L10;
          }
        }
        L11: {
          if (-14 == (param0 ^ -1)) {
            var4 = 1;
            var5 = -1;
            break L11;
          } else {
            break L11;
          }
        }
        L12: {
          if (14 != param0) {
            break L12;
          } else {
            var5 = 1;
            var4 = -1;
            break L12;
          }
        }
        L13: {
          if (param0 == 15) {
            var5 = 1;
            var4 = 1;
            break L13;
          } else {
            break L13;
          }
        }
        il.field_e = jf.a(var2 * var4, false, var5 * var2);
    }

    final synchronized boolean a(int param0, int param1, byte param2) {
        if (!(this.a(param0, param1, 0))) {
            return false;
        }
        if (null != ((gk) this).field_c[param0]) {
            if (!(((gk) this).field_c[param0][param1] == null)) {
                return true;
            }
        }
        if (null != ((gk) this).field_o[param0]) {
            return true;
        }
        if (param2 != -14) {
            int discarded$0 = ((gk) this).a((String) null, ((boolean[]) ((gk) this).field_o[2])[0]);
        }
        this.e(param2 ^ 19260, param0);
        if (((gk) this).field_o[param0] != null) {
            return true;
        }
        return false;
    }

    final byte[] b(int param0, int param1, int param2) {
        int var4 = -13 % ((46 - param0) / 44);
        return this.a((byte) 121, param2, param1, (int[]) null);
    }

    gk(td param0, boolean param1, int param2) {
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          ((gk) this).field_l = null;
          if (0 > param2) {
            break L0;
          } else {
            if (2 >= param2) {
              L1: {
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (!param1) {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L1;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L1;
                }
              }
              ((gk) this).field_b = stackIn_6_1 != 0;
              ((gk) this).field_k = param2;
              ((gk) this).field_n = param0;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("");
    }

    private final synchronized byte[] a(byte param0, int param1, int param2, int[] param3) {
        Object var5 = null;
        byte[] var7 = null;
        if (this.a(param1, param2, 0)) {
          L0: {
            L1: {
              var5 = null;
              if (((gk) this).field_c[param1] == null) {
                break L1;
              } else {
                if (null == ((gk) this).field_c[param1][param2]) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            if (!this.a(param1, false, param3, param2)) {
              this.e(-19250, param1);
              if (this.a(param1, false, param3, param2)) {
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (null == ((gk) this).field_c[param1]) {
            throw new RuntimeException("");
          } else {
            L2: {
              if (((gk) this).field_c[param1][param2] == null) {
                break L2;
              } else {
                var7 = qf.a(0, false, ((gk) this).field_c[param1][param2]);
                var5 = (Object) (Object) var7;
                if (var7 != null) {
                  break L2;
                } else {
                  throw new RuntimeException("");
                }
              }
            }
            L3: {
              if (param0 == 121) {
                break L3;
              } else {
                ((boolean[]) ((gk) this).field_o[1])[5] = true;
                break L3;
              }
            }
            L4: {
              if (var5 == null) {
                break L4;
              } else {
                if ((((gk) this).field_k ^ -1) != -2) {
                  if ((((gk) this).field_k ^ -1) != -3) {
                    break L4;
                  } else {
                    ((gk) this).field_c[param1] = null;
                    break L4;
                  }
                } else {
                  ((gk) this).field_c[param1][param2] = null;
                  if (1 != ((gk) this).field_l.field_c[param1]) {
                    break L4;
                  } else {
                    ((gk) this).field_c[param1] = null;
                    break L4;
                  }
                }
              }
            }
            return (byte[]) var5;
          }
        } else {
          return null;
        }
    }

    final synchronized byte[] c(int param0, int param1) {
        if (!((gk) this).c(68)) {
            return null;
        }
        if (((gk) this).field_l.field_c.length == 1) {
            return ((gk) this).b(113, param1, 0);
        }
        if (!this.a(param1, false)) {
            return null;
        }
        if (param0 <= 118) {
            field_h = null;
        }
        if (!(((gk) this).field_l.field_c[param1] != 1)) {
            return ((gk) this).b(-19, 0, param1);
        }
        throw new RuntimeException();
    }

    private final synchronized boolean a(int param0, boolean param1, int[] param2, int param3) {
        int var5 = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        int var9_int = 0;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[] var14_ref_int__ = null;
        int var15 = 0;
        byte[][] var15_ref_byte____ = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int[] var24 = null;
        wi var26 = null;
        byte[] var27 = null;
        wi var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        wi var32 = null;
        int[] var34 = null;
        byte[] var36 = null;
        byte[] var37 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        int[] var42 = null;
        byte[] var44 = null;
        byte[] var45 = null;
        int[] var47 = null;
        byte[][] var48 = null;
        int[] var50 = null;
        byte[] var51 = null;
        byte[] var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        int[] var55 = null;
        byte[][] var56 = null;
        byte[] var57 = null;
        var22 = Bounce.field_N;
        if (this.a(param0, param1)) {
          if (null != ((gk) this).field_o[param0]) {
            L0: {
              var5 = ((gk) this).field_l.field_q[param0];
              if (!param1) {
                break L0;
              } else {
                ((gk) this).field_o[9] = ((gk) this).field_o[11];
                break L0;
              }
            }
            L1: {
              var50 = ((gk) this).field_l.field_o[param0];
              var42 = var50;
              var34 = var42;
              var24 = var34;
              var6 = var24;
              if (null == ((gk) this).field_c[param0]) {
                ((gk) this).field_c[param0] = new Object[((gk) this).field_l.field_c[param0]];
                break L1;
              } else {
                break L1;
              }
            }
            var7 = ((gk) this).field_c[param0];
            var8 = 1;
            var9_int = 0;
            L2: while (true) {
              L3: {
                if (var9_int >= var5) {
                  break L3;
                } else {
                  L4: {
                    if (var6 != null) {
                      var10 = var50[var9_int];
                      break L4;
                    } else {
                      var10 = var9_int;
                      break L4;
                    }
                  }
                  if (var7[var10] != null) {
                    var9_int++;
                    continue L2;
                  } else {
                    var8 = 0;
                    break L3;
                  }
                }
              }
              if (var8 != 0) {
                return true;
              } else {
                L5: {
                  L6: {
                    if (param2 == null) {
                      break L6;
                    } else {
                      L7: {
                        if (0 != param2[0]) {
                          break L7;
                        } else {
                          if (param2[1] != 0) {
                            break L7;
                          } else {
                            if (param2[2] != 0) {
                              break L7;
                            } else {
                              if (param2[3] == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      }
                      var51 = qf.a(0, true, ((gk) this).field_o[param0]);
                      var26 = new wi(var51);
                      var26.a(85, param2, 5, var26.field_i.length);
                      var52 = var51;
                      break L5;
                    }
                  }
                  var52 = qf.a(0, false, ((gk) this).field_o[param0]);
                  var44 = var52;
                  var36 = var44;
                  var9 = var36;
                  break L5;
                }
                L8: {
                  var53 = ta.a(21125, var52);
                  var45 = var53;
                  var37 = var45;
                  var27 = var37;
                  var23 = var27;
                  var54 = var23;
                  if (!((gk) this).field_b) {
                    break L8;
                  } else {
                    ((gk) this).field_o[param0] = null;
                    break L8;
                  }
                }
                L9: {
                  if (var5 > 1) {
                    var53 = var45;
                    if (2 == ((gk) this).field_k) {
                      var11 = var53.length;
                      var11--;
                      var12 = 255 & var23[var11];
                      var11 = var11 - var5 * var12 * 4;
                      var32 = new wi(var54);
                      var14 = 0;
                      var32.field_h = var11;
                      var15 = 0;
                      var16 = 0;
                      L10: while (true) {
                        if (var12 <= var16) {
                          if (-1 == (var14 ^ -1)) {
                            return true;
                          } else {
                            var57 = new byte[var14];
                            var32.field_h = var11;
                            var14 = 0;
                            var17 = 0;
                            var18 = 0;
                            L11: while (true) {
                              if (var18 >= var12) {
                                var7[var15] = (Object) (Object) var57;
                                break L9;
                              } else {
                                var19 = 0;
                                var20 = 0;
                                L12: while (true) {
                                  if (var5 <= var20) {
                                    var18++;
                                    continue L11;
                                  } else {
                                    L13: {
                                      var19 = var19 + var32.j(-3);
                                      if (var6 == null) {
                                        var21 = var20;
                                        break L13;
                                      } else {
                                        var21 = var50[var20];
                                        break L13;
                                      }
                                    }
                                    L14: {
                                      if (var21 != param3) {
                                        break L14;
                                      } else {
                                        cb.a(var54, var17, var57, var14, var19);
                                        var14 = var14 + var19;
                                        break L14;
                                      }
                                    }
                                    var17 = var17 + var19;
                                    var20++;
                                    continue L12;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var17 = 0;
                          var18 = 0;
                          L15: while (true) {
                            if (var5 <= var18) {
                              var16++;
                              continue L10;
                            } else {
                              L16: {
                                var17 = var17 + var32.j(-3);
                                if (var6 != null) {
                                  var19 = var50[var18];
                                  break L16;
                                } else {
                                  var19 = var18;
                                  break L16;
                                }
                              }
                              if (param3 == var19) {
                                var15 = var19;
                                var14 = var14 + var17;
                                var18++;
                                continue L15;
                              } else {
                                var18++;
                                continue L15;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var11 = var53.length;
                      var11--;
                      var12 = var23[var11] & 255;
                      var11 = var11 - 4 * (var5 * var12);
                      var29 = new wi(var54);
                      var55 = new int[var5];
                      var47 = var55;
                      var39 = var47;
                      var30 = var39;
                      var14_ref_int__ = var30;
                      var29.field_h = var11;
                      var15 = 0;
                      L17: while (true) {
                        if (var15 >= var12) {
                          var56 = new byte[var5][];
                          var48 = var56;
                          var40 = var48;
                          var31 = var40;
                          var15_ref_byte____ = var31;
                          var16 = 0;
                          L18: while (true) {
                            if (var16 >= var5) {
                              var29.field_h = var11;
                              var16 = 0;
                              var17 = 0;
                              L19: while (true) {
                                if (var12 <= var17) {
                                  var17 = 0;
                                  L20: while (true) {
                                    if (var5 <= var17) {
                                      break L9;
                                    } else {
                                      L21: {
                                        if (var6 != null) {
                                          var18 = var50[var17];
                                          break L21;
                                        } else {
                                          var18 = var17;
                                          break L21;
                                        }
                                      }
                                      if (0 == ((gk) this).field_k) {
                                        var7[var18] = nh.a(false, -11560, var56[var17]);
                                        var17++;
                                        continue L20;
                                      } else {
                                        var7[var18] = (Object) (Object) var56[var17];
                                        var17++;
                                        continue L20;
                                      }
                                    }
                                  }
                                } else {
                                  var18 = 0;
                                  var19 = 0;
                                  L22: while (true) {
                                    if (var19 >= var5) {
                                      var17++;
                                      continue L19;
                                    } else {
                                      var18 = var18 + var29.j(-3);
                                      cb.a(var54, var16, var56[var19], var55[var19], var18);
                                      var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                      var16 = var16 + var18;
                                      var19++;
                                      continue L22;
                                    }
                                  }
                                }
                              }
                            } else {
                              var15_ref_byte____[var16] = new byte[var55[var16]];
                              var55[var16] = 0;
                              var16++;
                              continue L18;
                            }
                          }
                        } else {
                          var16 = 0;
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var5) {
                              var15++;
                              continue L17;
                            } else {
                              var16 = var16 + var29.j(-3);
                              var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                              var17++;
                              continue L23;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    L24: {
                      if (var6 != null) {
                        var53 = var45;
                        var11 = var50[0];
                        break L24;
                      } else {
                        var11 = 0;
                        break L24;
                      }
                    }
                    var53 = var45;
                    if (0 == ((gk) this).field_k) {
                      var7[var11] = nh.a(false, -11560, var54);
                      break L9;
                    } else {
                      var7[var11] = (Object) (Object) var53;
                      return true;
                    }
                  }
                }
                return true;
              }
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final int a(String param0, boolean param1) {
        if (!(((gk) this).c(-104))) {
            return -1;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((gk) this).field_l.field_a.a(-107, ae.a(-51764539, var4));
        if (!(this.a(var3, param1))) {
            return -1;
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Create a free Account";
    }
}
