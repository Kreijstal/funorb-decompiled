/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa extends dg {
    static String field_N;
    private int field_R;
    private ba field_O;
    private kc field_Q;
    private String field_P;

    final static void a(java.applet.Applet param0, String param1, int param2) {
        try {
            java.net.URL var3 = null;
            try {
                var3 = new java.net.URL(param0.getCodeBase(), param1);
                var3 = fh.a(param0, var3, -1);
                bk.a(param0, -25573, var3.toString(), true);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            if (param2 >= -5) {
                pa.f((byte) -124);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, lk param2, int param3) {
        ((pa) this).field_R = ((pa) this).field_R + 1;
        super.a(param0, param1, param2, param3);
    }

    final static int a(String param0, jk param1, jk param2, int param3, int param4, int param5, boolean param6) {
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        pb stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        pb stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        pb stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        String stackIn_9_2 = null;
        pb stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        pb stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        pb stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        String stackIn_12_2 = null;
        pb stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        pb stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        String stackOut_8_2 = null;
        pb stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        String stackOut_7_2 = null;
        pb stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        pb stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        String stackOut_11_2 = null;
        pb stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        String stackOut_10_2 = null;
        L0: {
          var13 = Main.field_T;
          var14 = param1.a(0);
          var8 = param2.a(0);
          if (null == cb.field_j) {
            if (md.a(100, false)) {
              break L0;
            } else {
              return -1;
            }
          } else {
            break L0;
          }
        }
        L1: {
          if (vf.field_a != ra.field_b) {
            break L1;
          } else {
            L2: {
              ni.field_f = null;
              na.field_r.field_i = 0;
              if (param0 != null) {
                L3: {
                  var9 = 0;
                  gh.field_h.field_i = 0;
                  if (param6) {
                    var9 = var9 | 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  gh.field_h.a(-246, pg.field_a.nextInt());
                  gh.field_h.a(-246, pg.field_a.nextInt());
                  gh.field_h.a(744825352, var14);
                  gh.field_h.a(744825352, var8);
                  var15 = (CharSequence) (Object) param0;
                  gh.field_h.a(744825352, sh.a(var15, (byte) -128));
                  gh.field_h.e(param3, 26040);
                  gh.field_h.b(param5 ^ -9455, param4);
                  gh.field_h.b(-9469, var9);
                  na.field_r.b(-9469, 18);
                  na.field_r.field_i = na.field_r.field_i + 2;
                  var10 = na.field_r.field_i;
                  var11_ref_String = bi.a((byte) -27, mk.g(-119));
                  if (var11_ref_String == null) {
                    var11_ref_String = "";
                    break L4;
                  } else {
                    break L4;
                  }
                }
                na.field_r.a(var11_ref_String, 19235);
                lf.a(wd.field_c, (pb) (Object) na.field_r, id.field_c, (byte) -75, gh.field_h);
                na.field_r.d(na.field_r.field_i + -var10, -27308);
                break L2;
              } else {
                L5: {
                  gh.field_h.field_i = 0;
                  gh.field_h.a(-246, pg.field_a.nextInt());
                  gh.field_h.a(param5 + -264, pg.field_a.nextInt());
                  stackOut_6_0 = gh.field_h;
                  stackOut_6_1 = 744825352;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  if (!param1.b(true)) {
                    stackOut_8_0 = (pb) (Object) stackIn_8_0;
                    stackOut_8_1 = stackIn_8_1;
                    stackOut_8_2 = "";
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    stackIn_9_2 = stackOut_8_2;
                    break L5;
                  } else {
                    stackOut_7_0 = (pb) (Object) stackIn_7_0;
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = (String) var14;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_9_2 = stackOut_7_2;
                    break L5;
                  }
                }
                L6: {
                  ((pb) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2);
                  stackOut_9_0 = gh.field_h;
                  stackOut_9_1 = 744825352;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  if (param2.b(true)) {
                    stackOut_11_0 = (pb) (Object) stackIn_11_0;
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = (String) var8;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    break L6;
                  } else {
                    stackOut_10_0 = (pb) (Object) stackIn_10_0;
                    stackOut_10_1 = stackIn_10_1;
                    stackOut_10_2 = "";
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    stackIn_12_2 = stackOut_10_2;
                    break L6;
                  }
                }
                ((pb) (Object) stackIn_12_0).a(stackIn_12_1, stackIn_12_2);
                na.field_r.b(-9469, 16);
                na.field_r.field_i = na.field_r.field_i + 1;
                var9 = na.field_r.field_i;
                lf.a(wd.field_c, (pb) (Object) na.field_r, id.field_c, (byte) -75, gh.field_h);
                na.field_r.f(na.field_r.field_i - var9, 8049);
                break L2;
              }
            }
            fe.a((byte) -97, -1);
            ra.field_b = kg.field_c;
            break L1;
          }
        }
        L7: {
          if (kg.field_c == ra.field_b) {
            if (!r.a(1, (byte) 122)) {
              break L7;
            } else {
              L8: {
                var9 = rd.field_j.f(72);
                rd.field_j.field_i = 0;
                if (-101 < (var9 ^ -1)) {
                  break L8;
                } else {
                  if (105 < var9) {
                    break L8;
                  } else {
                    ll.field_f = new String[var9 - 100];
                    ra.field_b = ta.field_eb;
                    break L7;
                  }
                }
              }
              if (-249 == (var9 ^ -1)) {
                wf.a((byte) -83, mk.g(-126));
                e.field_a = qk.field_i;
                mc.a((byte) -127);
                lk.field_w = false;
                return var9;
              } else {
                if (var9 != 99) {
                  ra.field_b = kb.field_a;
                  al.field_a = -1;
                  pd.field_l = var9;
                  break L7;
                } else {
                  boolean discarded$1 = r.a(ia.b(param5 + -23), (byte) 119);
                  ni.field_f = new Boolean(tg.a(-2, (pb) (Object) rd.field_j));
                  rd.field_j.field_i = 0;
                  break L7;
                }
              }
            }
          } else {
            break L7;
          }
        }
        L9: {
          if (ta.field_eb != ra.field_b) {
            break L9;
          } else {
            var9 = 2;
            if (r.a(var9, (byte) 120)) {
              var10 = rd.field_j.d((byte) 72);
              rd.field_j.field_i = 0;
              if (!r.a(var10, (byte) 124)) {
                break L9;
              } else {
                var11 = ll.field_f.length;
                var12 = 0;
                L10: while (true) {
                  if (var12 >= var11) {
                    mc.a((byte) -125);
                    lk.field_w = false;
                    return 100 - -var11;
                  } else {
                    ll.field_f[var12] = rd.field_j.d(-74);
                    var12++;
                    continue L10;
                  }
                }
              }
            } else {
              break L9;
            }
          }
        }
        L11: {
          if (kb.field_a != ra.field_b) {
            break L11;
          } else {
            if (gl.a(false)) {
              L12: {
                if (255 != pd.field_l) {
                  e.field_a = rd.field_j.c(false);
                  break L12;
                } else {
                  var9_ref_String = rd.field_j.f((byte) 29);
                  if (var9_ref_String == null) {
                    break L12;
                  } else {
                    lk.a(mk.g(param5 + -146), 0, var9_ref_String);
                    break L12;
                  }
                }
              }
              mc.a((byte) -128);
              lk.field_w = false;
              return pd.field_l;
            } else {
              break L11;
            }
          }
        }
        L13: {
          if (cb.field_j != null) {
            break L13;
          } else {
            if (lk.field_w) {
              L14: {
                if ((we.a((byte) 79) ^ -1L) < -30001L) {
                  e.field_a = jf.field_k;
                  break L14;
                } else {
                  e.field_a = e.field_f;
                  break L14;
                }
              }
              lk.field_w = false;
              return 249;
            } else {
              var9 = ag.field_e;
              ag.field_e = hj.field_l;
              hj.field_l = var9;
              lk.field_w = true;
              break L13;
            }
          }
        }
        L15: {
          if (param5 == 18) {
            break L15;
          } else {
            field_N = null;
            break L15;
          }
        }
        return -1;
    }

    final static ic a(byte[] param0, int param1) {
        if (param0 == null) {
            return null;
        }
        if (param1 != -1) {
            field_N = null;
        }
        ic var2 = new ic(param0, kb.field_c, ml.field_b, na.field_q, hb.field_a, jf.field_i, rd.field_k);
        rh.d(-41);
        return var2;
    }

    pa(ba param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (ci) (Object) dj.b(31959));
        ((pa) this).field_O = param0;
        ((pa) this).field_P = param1;
        ((pa) this).a(param5, param3, param4, param2, true);
    }

    final String b(byte param0) {
        if (param0 == -79) {
            return null;
        }
        return null;
    }

    final boolean a(int param0, lk param1) {
        if (param0 <= 71) {
            ((pa) this).field_O = null;
            return false;
        }
        return false;
    }

    final static void i(int param0) {
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        w var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        w var11 = null;
        int[] var12 = null;
        rc var13 = null;
        rc var14 = null;
        dh var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        L0: {
          var8 = Main.field_T;
          var11 = rd.field_j;
          var2 = var11.f(param0 ^ -121);
          if (var2 != param0) {
            if (-2 == (var2 ^ -1)) {
              var15 = (dh) (Object) vb.field_c.a((byte) 74);
              if (var15 == null) {
                mc.a((byte) -128);
                return;
              } else {
                var15.c(param0 ^ 121);
                break L0;
              }
            } else {
              if ((var2 ^ -1) != -3) {
                k.a((Throwable) null, (byte) 70, "A1: " + aj.a((byte) 92));
                mc.a((byte) -128);
                break L0;
              } else {
                var14 = (rc) (Object) ue.field_b.a((byte) 74);
                if (var14 != null) {
                  var14.field_p = eg.a(85);
                  var14.field_h = var14.field_p[0];
                  var14.field_j = true;
                  var14.c(118);
                  break L0;
                } else {
                  mc.a((byte) -126);
                  return;
                }
              }
            }
          } else {
            var10 = eg.a(-60);
            var18 = var10;
            var17 = var18;
            var16 = var17;
            var12 = var16;
            var3 = var12;
            var9 = var10;
            var4 = var9;
            var5 = var11;
            var6 = ((pb) (Object) var5).f(-124);
            var7 = 0;
            L1: while (true) {
              if (var7 >= var6) {
                var13 = (rc) (Object) ue.field_b.a((byte) 74);
                if (var13 == null) {
                  mc.a((byte) -127);
                  return;
                } else {
                  var13.field_p = var3;
                  var13.field_j = true;
                  var13.field_h = var18[0];
                  var13.c(87);
                  break L0;
                }
              } else {
                var9[var7] = ((pb) (Object) var5).e((byte) 127);
                var7++;
                continue L1;
              }
            }
          }
        }
    }

    public static void f(byte param0) {
        if (param0 >= -47) {
            return;
        }
        field_N = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5 = null;
        sg var6 = null;
        ne var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        kc var15 = null;
        kc var16 = null;
        kc var17 = null;
        L0: {
          L1: {
            var13 = Main.field_T;
            var6 = ((pa) this).field_O.a(true);
            if (var6 == tb.field_b) {
              break L1;
            } else {
              if (var6 != a.field_n) {
                var5 = ((pa) this).field_O.b(param2 ^ -26767);
                if (var5 == null) {
                  var5 = ((pa) this).field_P;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                break L1;
              }
            }
          }
          var5 = n.field_C;
          break L0;
        }
        L2: {
          if (var5.equals((Object) (Object) ((pa) this).field_r)) {
            break L2;
          } else {
            ((pa) this).field_r = var5;
            ((pa) this).e((byte) 5);
            break L2;
          }
        }
        L3: {
          super.a(param0, param1, param2 ^ 0, param3);
          var6 = ((pa) this).field_O.a(true);
          var8 = (ne) (Object) ((pa) this).field_v;
          var9 = ((pa) this).field_o + param0;
          var10 = var8.a((lk) this, -1815612287, param1) - -(var8.a((byte) 92, (lk) this).b(0) >> -1542173183);
          if (param2 == -1) {
            break L3;
          } else {
            var14 = null;
            boolean discarded$1 = ((pa) this).a(-10, (lk) null);
            break L3;
          }
        }
        L4: {
          L5: {
            if (tb.field_b == var6) {
              break L5;
            } else {
              if (a.field_n == var6) {
                break L5;
              } else {
                if (pe.field_b == var6) {
                  var16 = gh.field_n[2];
                  var16.b(var9, -(var16.field_o >> -820729919) + var10, 256);
                  break L4;
                } else {
                  if (ii.field_e != var6) {
                    break L4;
                  } else {
                    var15 = gh.field_n[1];
                    var15.b(var9, -(var15.field_o >> 286077697) + var10, 256);
                    break L4;
                  }
                }
              }
            }
          }
          L6: {
            L7: {
              var17 = gh.field_n[0];
              var11 = var17.field_l << 694707649;
              var12 = var17.field_k << 235294849;
              if (((pa) this).field_Q == null) {
                break L7;
              } else {
                if (var11 > ((pa) this).field_Q.field_p) {
                  break L7;
                } else {
                  if (var12 > ((pa) this).field_Q.field_o) {
                    break L7;
                  } else {
                    dl.a(-60, ((pa) this).field_Q);
                    vj.d();
                    break L6;
                  }
                }
              }
            }
            ((pa) this).field_Q = new kc(var11, var12);
            dl.a(-33, ((pa) this).field_Q);
            break L6;
          }
          var17.a(112, 144, var17.field_l << 2055347236, var17.field_k << -331014396, -((pa) this).field_R << 1030662410, 4096);
          gg.a(14756);
          ((pa) this).field_Q.b(var9 + -(var17.field_l >> -2022163295), var10 + -var17.field_k, 256);
          break L4;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "Unfortunately you are not eligible to create an account.";
    }
}
