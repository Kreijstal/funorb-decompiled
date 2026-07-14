/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm extends w {
    w field_Rb;
    static String field_Pb;
    jd field_Sb;
    static boolean field_Qb;
    static int[] field_Nb;
    w field_Ob;

    final static void f(int param0) {
        int var1 = -114 % ((param0 - 79) / 35);
        fj.a(48, (byte) -89, hm.field_d);
    }

    public static void g(int param0) {
        field_Nb = null;
        if (param0 != 48) {
            field_Nb = null;
        }
        field_Pb = null;
    }

    final static int a(float param0, float param1, boolean param2, float param3) {
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        int var8 = 0;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        L0: {
          var18 = client.field_A ? 1 : 0;
          var4 = 0.0f;
          var5 = 0.0f;
          var6 = 0.0f;
          var7 = param0 * 6.0f % 6.0f;
          var8 = (int)var7;
          var9 = var7 - (float)var8;
          var10 = (-param3 + 1.0f) * param1;
          var11 = (-(var9 * param3) + 1.0f) * param1;
          var12 = param1 * (-((1.0f - var9) * param3) + 1.0f);
          var13 = var8;
          if (var13 != 0) {
            if (var13 != -2) {
              if (-3 == var13) {
                var5 = param1;
                var4 = var10;
                var6 = var12;
                break L0;
              } else {
                if (var13 == -4) {
                  var5 = var11;
                  var6 = param1;
                  var4 = var10;
                  break L0;
                } else {
                  if (4 != var13) {
                    if (-6 == var13) {
                      var4 = param1;
                      var6 = var11;
                      var5 = var10;
                      break L0;
                    } else {
                      break L0;
                    }
                  } else {
                    var4 = var12;
                    var6 = param1;
                    var5 = var10;
                    break L0;
                  }
                }
              }
            } else {
              var5 = param1;
              var4 = var11;
              var6 = var10;
              break L0;
            }
          } else {
            var6 = var10;
            var4 = param1;
            var5 = var12;
            break L0;
          }
        }
        if (!param2) {
          var13 = 256;
          var14 = Math.min(Math.round((float)var13 * var4), var13 - 1);
          var15 = Math.min(Math.round(var5 * (float)var13), -1 + var13);
          var16 = Math.min(Math.round((float)var13 * var6), -1 + var13);
          var17 = 255 & var16 | (var15 << 457078600 & 65280 | 16711680 & var14 << -1294601872);
          return var17;
        } else {
          return 25;
        }
    }

    private final boolean a(boolean param0, int param1, byte param2, int param3, int param4, int param5, boolean param6) {
        int var8 = 0;
        int stackIn_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          if (param2 == 43) {
            break L0;
          } else {
            ((nm) this).a(97, true, false, -111);
            break L0;
          }
        }
        L1: {
          if (!param0) {
            if (((nm) this).field_jb) {
              if (!param6) {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L1;
              } else {
                stackOut_7_0 = 0;
                stackIn_10_0 = stackOut_7_0;
                break L1;
              }
            } else {
              stackOut_5_0 = 0;
              stackIn_10_0 = stackOut_5_0;
              break L1;
            }
          } else {
            stackOut_3_0 = 1;
            stackIn_10_0 = stackOut_3_0;
            break L1;
          }
        }
        var8 = stackIn_10_0;
        ((nm) this).field_Ob.a((byte) -94, param5, ((nm) this).field_Rb.field_N, var8 != 0);
        this.a(param1, param4, param2 ^ 43, false, param3);
        return var8 != 0;
    }

    private final void b(int param0, int param1, int param2) {
        ((nm) this).field_Rb.field_mb = -param0 + (((nm) this).field_mb - param2);
        ((nm) this).field_Rb.field_N = ((nm) this).field_N;
        ((nm) this).field_Ob.field_vb = param1;
        ((nm) this).field_Ob.field_mb = -param0 + (((nm) this).field_mb + -param2);
        ((nm) this).field_Sb.a(((nm) this).field_mb + -param2, (byte) -32, ((nm) this).field_N, ((nm) this).field_Ob.field_N, param2, -((nm) this).field_Ob.field_Ib, ((nm) this).field_Rb.field_N, 0);
    }

    final static ck g(byte param0) {
        int var4 = 0;
        int var6 = client.field_A ? 1 : 0;
        int var1 = tm.field_a[0] * hc.field_c[0];
        byte[] var2 = tc.field_Nb[0];
        int[] var3 = new int[var1];
        for (var4 = 0; var4 < var1; var4++) {
            var3[var4] = mb.field_d[lb.a(255, (int) var2[var4])];
        }
        var4 = -8 % ((param0 - -40) / 42);
        ck var5 = new ck(ed.field_f, i.field_d, sg.field_d[0], fh.field_a[0], tm.field_a[0], hc.field_c[0], var3);
        oa.a(127);
        return var5;
    }

    final static boolean a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        String var4_ref_String = null;
        int var5 = 0;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        Object var13 = null;
        Object var14 = null;
        Object var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String var20 = null;
        Object var21 = null;
        CharSequence var22 = null;
        L0: {
          var21 = null;
          var11 = client.field_A ? 1 : 0;
          if (param1 == 1) {
            break L0;
          } else {
            field_Qb = true;
            break L0;
          }
        }
        L1: {
          var3 = 1;
          if (sc.field_m) {
            break L1;
          } else {
            if (null != tf.field_gb) {
              break L1;
            } else {
              var3 = 0;
              break L1;
            }
          }
        }
        L2: {
          if (pk.field_r != 0) {
            break L2;
          } else {
            if (null != g.field_N) {
              var3 = 0;
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (2 != pk.field_r) {
            break L3;
          } else {
            if (hl.a((byte) -53)) {
              break L3;
            } else {
              var3 = 0;
              break L3;
            }
          }
        }
        if ((wh.field_c ^ -1) != -85) {
          if (wh.field_c != 85) {
            var4 = el.field_G;
            if (kh.a((char) var4, 8212)) {
              L4: {
                if (var3 == 0) {
                  break L4;
                } else {
                  if (80 > dj.field_ab.length()) {
                    L5: {
                      StringBuilder discarded$3 = dj.field_ab.append(var4);
                      var5 = 485;
                      var17 = oa.field_f;
                      var7 = var17;
                      var7 = var17;
                      var16 = b.a(param1 + 82, var17);
                      var7 = var16;
                      var7 = var16;
                      var18 = var16;
                      var7 = var18;
                      var7 = var18;
                      if (pk.field_r == 2) {
                        var22 = (CharSequence) (Object) ed.field_c;
                        var20 = cm.a((byte) 94, oj.field_b, new String[1]);
                        var8 = cm.a((byte) 108, im.field_j, new String[1]);
                        var9 = ff.field_o.a(var20);
                        var10 = ff.field_o.a(var8);
                        if (var9 <= var10) {
                          var5 = var5 - var10;
                          break L5;
                        } else {
                          var5 = var5 - var9;
                          break L5;
                        }
                      } else {
                        L6: {
                          var7 = "";
                          if (pk.field_r != 0) {
                            break L6;
                          } else {
                            L7: {
                              if (cd.field_m != null) {
                                break L7;
                              } else {
                                if (!ii.field_q) {
                                  break L7;
                                } else {
                                  var7 = "[" + uc.field_b + "] ";
                                  break L7;
                                }
                              }
                            }
                            if (null == cd.field_m) {
                              break L6;
                            } else {
                              L8: {
                                if (!wh.field_b) {
                                  break L8;
                                } else {
                                  if (null != f.field_q) {
                                    var7 = "[" + f.field_q + "] ";
                                    break L6;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              var7 = "[" + cm.a((byte) 125, hf.field_a, new String[1]) + "] ";
                              break L6;
                            }
                          }
                        }
                        var19 = var7 + var18 + ": ";
                        var5 = var5 - ff.field_o.a(var19);
                        break L5;
                      }
                    }
                    if (ff.field_o.a(dj.field_ab.toString()) > var5) {
                      StringBuilder discarded$4 = vf.a(dj.field_ab, -23510, dj.field_ab.length() + -1, ' ');
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
              }
              return true;
            } else {
              return false;
            }
          } else {
            L9: {
              if (var3 == 0) {
                break L9;
              } else {
                if (0 >= dj.field_ab.length()) {
                  break L9;
                } else {
                  StringBuilder discarded$5 = vf.a(dj.field_ab, -23510, dj.field_ab.length() - 1, ' ');
                  return true;
                }
              }
            }
            return true;
          }
        } else {
          L10: {
            if (var3 == 0) {
              if (0 == pk.field_r) {
                break L10;
              } else {
                qk.a((byte) 94);
                break L10;
              }
            } else {
              if ((dj.field_ab.length() ^ -1) >= -1) {
                qk.a((byte) 94);
                break L10;
              } else {
                var4_ref_String = dj.field_ab.toString();
                var7 = var4_ref_String;
                var7 = var4_ref_String;
                if (ue.a(param1 ^ 2049, var4_ref_String)) {
                  var13 = null;
                  var12 = null;
                  ca.a((String) null, (String) null, wd.field_a, (byte) 90, 2, 0);
                  var15 = null;
                  var14 = null;
                  ca.a((String) null, (String) null, um.field_e, (byte) 69, 2, 0);
                  qk.a((byte) 94);
                  break L10;
                } else {
                  L11: {
                    var5 = pk.field_r;
                    if (var5 != 0) {
                      break L11;
                    } else {
                      if (null == cd.field_m) {
                        break L11;
                      } else {
                        var5 = 1;
                        break L11;
                      }
                    }
                  }
                  L12: {
                    if (-3 != (rf.a(0, var5) ^ -1)) {
                      break L12;
                    } else {
                      eg.a(var5, param2, 1, (byte) 71);
                      break L12;
                    }
                  }
                  ce.a(param0, (byte) -85, pk.field_r, ed.field_c, -1, var4_ref_String);
                  qk.a((byte) 94);
                  break L10;
                }
              }
            }
          }
          return true;
        }
    }

    final boolean a(int param0, int param1, int param2, boolean param3, int param4, boolean param5) {
        if (param2 != -15230) {
            return false;
        }
        return this.a(param3, ((nm) this).field_Rb.field_N, (byte) 43, param0, param1, param4, param5);
    }

    nm(long param0, w param1, w param2, jd param3) {
        super(param0, (w) null);
        ((nm) this).field_Rb = new w(0L, param2);
        ((nm) this).field_Sb = new jd(0L, param3);
        ((nm) this).a(((nm) this).field_Rb, -16834);
        ((nm) this).a((w) (Object) ((nm) this).field_Sb, -16834);
        ((nm) this).field_Ob = param1;
        ((nm) this).field_Rb.a(param1, -16834);
    }

    final static void h(byte param0) {
        if (param0 != 112) {
            field_Qb = false;
        }
    }

    final void a(int param0, boolean param1, boolean param2, int param3) {
        this.a(((nm) this).field_Rb.field_N, param0, 0, param2, param3);
        if (!param1) {
            nm.h((byte) 66);
        }
    }

    final static void e(int param0) {
        if (!(ai.f((byte) -126))) {
            return;
        }
        bl.a(-11, 4, false);
        int var1 = -75 / ((-27 - param0) / 47);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((nm) this).field_mb = param5;
        if (param0 != 6) {
            return;
        }
        ((nm) this).field_vb = param3;
        ((nm) this).field_Ib = param1;
        ((nm) this).field_N = param4;
        this.b(param6, 0, param2);
    }

    private final void a(int param0, int param1, int param2, boolean param3, int param4) {
        L0: {
          if (!((nm) this).field_Sb.i((byte) 7)) {
            break L0;
          } else {
            ((nm) this).field_Ob.field_Mb = ((nm) this).field_Ob.field_Mb + param4;
            break L0;
          }
        }
        L1: {
          if (((nm) this).field_Sb.h((byte) 78)) {
            ((nm) this).field_Ob.field_Mb = ((nm) this).field_Ob.field_Mb - param4;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (!((nm) this).field_Sb.g((byte) -127)) {
            break L2;
          } else {
            ((nm) this).field_Ob.field_Mb = ((nm) this).field_Ob.field_Mb + param0;
            break L2;
          }
        }
        L3: {
          if (!((nm) this).field_Sb.f(param2)) {
            break L3;
          } else {
            ((nm) this).field_Ob.field_Mb = ((nm) this).field_Ob.field_Mb - param0;
            break L3;
          }
        }
        L4: {
          if (((nm) this).field_jb) {
            ((nm) this).field_Ob.field_Mb = ((nm) this).field_Ob.field_Mb - param1;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (param3) {
            L6: {
              if (0 <= -(((nm) this).field_Ob.field_Ib - -((nm) this).field_Ob.field_Mb)) {
                break L6;
              } else {
                ((nm) this).field_Ob.field_Mb = -((nm) this).field_Ob.field_Ib;
                break L6;
              }
            }
            if (((nm) this).field_Ob.field_F + (((nm) this).field_Ob.field_N + -((nm) this).field_Rb.field_N) >= -(((nm) this).field_Ob.field_Mb + ((nm) this).field_Ob.field_Ib)) {
              break L5;
            } else {
              ((nm) this).field_Ob.field_Mb = -((nm) this).field_Ob.field_Ib + -(-((nm) this).field_Rb.field_N + (((nm) this).field_Ob.field_F + ((nm) this).field_Ob.field_N));
              break L5;
            }
          } else {
            L7: {
              if (-(((nm) this).field_Ob.field_Mb + ((nm) this).field_Ob.field_Ib) <= ((nm) this).field_Ob.field_F + ((nm) this).field_Ob.field_N + -((nm) this).field_Rb.field_N) {
                break L7;
              } else {
                ((nm) this).field_Ob.field_Mb = -(-((nm) this).field_Rb.field_N + (((nm) this).field_Ob.field_N - -((nm) this).field_Ob.field_F)) - ((nm) this).field_Ob.field_Ib;
                break L7;
              }
            }
            if (-1 >= (-(((nm) this).field_Ob.field_Ib - -((nm) this).field_Ob.field_Mb) ^ -1)) {
              break L5;
            } else {
              ((nm) this).field_Ob.field_Mb = -((nm) this).field_Ob.field_Ib;
              break L5;
            }
          }
        }
        L8: {
          if (!((nm) this).field_Sb.j((byte) -2)) {
            break L8;
          } else {
            ((nm) this).field_Ob.field_Ib = -((nm) this).field_Sb.a(param3, (byte) 88, ((nm) this).field_Rb.field_N, ((nm) this).field_Ob.field_N);
            ((nm) this).field_Ob.field_Mb = 0;
            break L8;
          }
        }
        ((nm) this).field_Sb.a(((nm) this).field_Rb.field_N, ((nm) this).field_Ob.field_N, 106, -((nm) this).field_Ob.field_Ib);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Pb = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_Nb = new int[128];
    }
}
