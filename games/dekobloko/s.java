/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s extends w {
    w field_Ob;
    static ck[] field_Qb;
    static int field_Pb;
    w field_Nb;
    nm field_Rb;
    w field_Sb;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((s) this).field_Ib = param3;
        ((s) this).field_mb = param6;
        ((s) this).field_vb = param0;
        ((s) this).field_N = param2;
        if (param1 != 1) {
            ((s) this).field_Nb = null;
        }
        ((s) this).a(param4, param7, param5, 16);
    }

    final static int a(boolean param0, int param1, int param2, CharSequence param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = client.field_A ? 1 : 0;
          if (2 > param2) {
            break L0;
          } else {
            if (-37 > (param2 ^ -1)) {
              break L0;
            } else {
              L1: {
                var4 = 0;
                var5 = 0;
                var6 = 0;
                if (param1 == 4) {
                  break L1;
                } else {
                  s.b(true);
                  break L1;
                }
              }
              var7 = param3.length();
              var8 = 0;
              L2: while (true) {
                if (var7 <= var8) {
                  if (var5 == 0) {
                    throw new NumberFormatException();
                  } else {
                    return var6;
                  }
                } else {
                  L3: {
                    var9 = param3.charAt(var8);
                    if (var8 != 0) {
                      break L3;
                    } else {
                      if (45 == var9) {
                        var4 = 1;
                        var8++;
                        continue L2;
                      } else {
                        if (var9 != 43) {
                          break L3;
                        } else {
                          if (!param0) {
                            break L3;
                          } else {
                            var8++;
                            continue L2;
                          }
                        }
                      }
                    }
                  }
                  L4: {
                    L5: {
                      if (var9 < 48) {
                        break L5;
                      } else {
                        if (57 >= var9) {
                          var9 -= 48;
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var9 < 65) {
                        break L6;
                      } else {
                        if (var9 > 90) {
                          break L6;
                        } else {
                          var9 -= 55;
                          break L4;
                        }
                      }
                    }
                    L7: {
                      if (97 > var9) {
                        break L7;
                      } else {
                        if (var9 <= 122) {
                          var9 -= 87;
                          break L4;
                        } else {
                          break L7;
                        }
                      }
                    }
                    throw new NumberFormatException();
                  }
                  if (var9 < param2) {
                    L8: {
                      if (var4 == 0) {
                        break L8;
                      } else {
                        var9 = -var9;
                        break L8;
                      }
                    }
                    var10 = param2 * var6 - -var9;
                    if (var6 != var10 / param2) {
                      throw new NumberFormatException();
                    } else {
                      var6 = var10;
                      var5 = 1;
                      var8++;
                      continue L2;
                    }
                  } else {
                    throw new NumberFormatException();
                  }
                }
              }
            }
          }
        }
        throw new IllegalArgumentException("" + param2);
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        a.field_k = param3;
        nd.field_b = param0;
        if (param2 != -91) {
            int discarded$0 = s.b((byte) 18, 119);
        }
        ke.field_d = param4;
        cc.field_a = param1;
    }

    final static void h(byte param0) {
        sn.a(false);
        if (null != jh.field_b) {
            tj.a(false, jh.field_b);
        }
        wf.d(90);
        rf.a((byte) 0);
        fc.a((byte) 67);
        if (!(!di.a(false))) {
            we.field_b.f(1, -4);
            wj.c(4792, 0);
        }
        si.a(80);
        if (param0 <= 69) {
            Object var2 = null;
            s.a(-57, -79, (ck[][]) null, (byte[]) null, (ck[][]) null, -19, false, (String[][]) null, (int[]) null, (byte[]) null, (ji) null, (int[]) null, (ji) null, (pi[]) null, (String[]) null, (String[][]) null, (ji) null);
        }
    }

    public static void i(byte param0) {
        int var1 = 8 % ((param0 - -32) / 55);
        field_Qb = null;
    }

    s(long param0, w param1, w param2, jd param3, w param4, String param5, String param6) {
        super(param0, param1);
        ((s) this).field_Sb = new w(0L, (w) null);
        ((s) this).field_Rb = new nm(0L, ((s) this).field_Sb, param2, param3);
        ((s) this).field_Ob = new w(0L, param4);
        ((s) this).field_Nb = new w(0L, param4);
        ((s) this).field_Ob.field_Y = param5;
        ((s) this).field_Nb.field_Y = param6;
        ((s) this).a((w) (Object) ((s) this).field_Rb, -16834);
        ((s) this).a(((s) this).field_Ob, -16834);
        ((s) this).a(((s) this).field_Nb, -16834);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = (((s) this).field_mb - -param2) / 2;
        int var6 = ((s) this).field_N - param1;
        ((s) this).field_Rb.a(6, 0, param0, 0, -param2 + var6, ((s) this).field_mb, param2);
        ((s) this).field_Ob.field_Ib = var6;
        if (param3 != 16) {
            field_Qb = null;
        }
        ((s) this).field_Ob.field_N = param1;
        ((s) this).field_Ob.field_mb = var5 - param2;
        ((s) this).field_Ob.field_vb = 0;
        ((s) this).field_Nb.field_mb = ((s) this).field_mb - var5;
        ((s) this).field_Nb.field_vb = var5;
        ((s) this).field_Nb.field_Ib = var6;
        ((s) this).field_Nb.field_N = param1;
    }

    final static void g(byte param0) {
        if (ah.field_c != null) {
            ah.field_c.f((byte) -66);
        }
        if (!(null == pk.field_v)) {
            pk.field_v.m((byte) 114);
        }
        sh.a(0);
        int var1 = 62 % ((-55 - param0) / 60);
    }

    final static int b(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            var2 = 0;
            if (param1 < 0) {
              break L1;
            } else {
              if ((param1 ^ -1) > -65537) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param1 = param1 >>> 16;
          var2 += 16;
          break L0;
        }
        L2: {
          if (256 > param1) {
            break L2;
          } else {
            var2 += 8;
            param1 = param1 >>> 8;
            break L2;
          }
        }
        L3: {
          if (-17 >= (param1 ^ -1)) {
            param1 = param1 >>> 4;
            var2 += 4;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (4 > param1) {
            break L4;
          } else {
            var2 += 2;
            param1 = param1 >>> 2;
            break L4;
          }
        }
        L5: {
          if (param1 >= 1) {
            param1 = param1 >>> 1;
            var2++;
            break L5;
          } else {
            break L5;
          }
        }
        var3 = -60 % ((param0 - 69) / 45);
        return var2 - -param1;
    }

    s(long param0, s param1, String param2, String param3) {
        this(param0, (w) (Object) param1, param1.field_Rb.field_Rb, param1.field_Rb.field_Sb, param1.field_Ob, param2, param3);
    }

    final static void b(boolean param0) {
        int var2 = 0;
        int var3 = client.field_A ? 1 : 0;
        gh.field_e = null;
        ge.field_c = false;
        he.field_db = false;
        gn.field_b = false;
        si.field_e = new vj();
        if (!param0) {
            Object var4 = null;
            int discarded$0 = s.a(true, -23, -56, (CharSequence) null);
        }
        jm.field_r = new vj();
        int[] var5 = o.field_g;
        int[] var1 = var5;
        for (var2 = 0; (var2 ^ -1) > -9; var2++) {
            var5[var2] = 0;
        }
        int[] var6 = j.field_d;
        var1 = var6;
        int var7 = 0;
        var2 = var7;
        while (var7 < 8) {
            var6[var7] = 0;
            var7++;
        }
        id.field_P = 0;
    }

    final static void a(int param0, int param1, ck[][] param2, byte[] param3, ck[][] param4, int param5, boolean param6, String[][] param7, int[] param8, byte[] param9, ji param10, int[] param11, ji param12, pi[] param13, String[] param14, String[][] param15, ji param16) {
        Object var18 = null;
        sg.a(param15, param6, param9, param16, param11, (byte) -57, param7, param14, 1, param3, param13, param8, param1, param12, (String[]) null, param10, param4, param2, param5);
        if (param0 < 66) {
            field_Pb = 77;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Qb = new ck[8];
    }
}
