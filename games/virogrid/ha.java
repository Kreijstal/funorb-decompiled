/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha {
    private oa[] field_b;
    static String field_e;
    private java.math.BigInteger field_a;
    private dk field_f;
    static String field_d;
    static String field_g;
    private java.math.BigInteger field_j;
    private sb field_i;
    private ub field_h;
    private jc field_c;

    public static void a(int param0) {
        if (param0 < 22) {
            field_g = null;
        }
        field_g = null;
        field_e = null;
        field_d = null;
    }

    ha(dk param0, sb param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final static void a(int param0, boolean param1, boolean param2, int param3, boolean param4, int param5, int param6, boolean param7, boolean param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Virogrid.field_F ? 1 : 0;
          if (param2) {
            break L0;
          } else {
            L1: {
              if (eb.field_f != df.field_e) {
                break L1;
              } else {
                if (df.field_f == f.field_b) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (ca.field_M.field_b != df.field_f) {
              break L0;
            } else {
              if (ca.field_M.field_c != df.field_e) {
                break L0;
              } else {
                if (null == wl.field_d) {
                  if (la.field_h != null) {
                    hm.a(true, true);
                    break L0;
                  } else {
                    id.b(-124);
                    break L0;
                  }
                } else {
                  hm.a(false, true);
                  break L0;
                }
              }
            }
          }
        }
        L2: {
          if (!param2) {
            oh.field_f = (-640 + eb.field_f) / 2;
            break L2;
          } else {
            oh.field_f = o.field_e;
            break L2;
          }
        }
        L3: {
          ca.b(param2, -116);
          if (0 < kh.field_d) {
            of.a(param0, false, param2, param8);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          jk.field_b.field_z = da.field_n.field_z;
          jk.field_b.field_lb = 1;
          if (-1 <= (hn.field_h ^ -1)) {
            break L4;
          } else {
            eb.a(false, param2, param0, param8);
            break L4;
          }
        }
        L5: {
          if (th.field_z <= 0) {
            break L5;
          } else {
            qk.a(param2, param0, (byte) 80, param8, param7);
            break L5;
          }
        }
        L6: {
          L7: {
            if (!ad.field_h) {
              break L7;
            } else {
              if (wl.field_d.field_ic >= wl.field_d.field_vc) {
                uf.field_j.field_Eb.field_V = oc.field_h;
                ij.field_m.field_Y = false;
                ak.a(16377, uf.field_j.field_Jb);
                break L6;
              } else {
                break L7;
              }
            }
          }
          uf.field_j.field_Eb.field_V = null;
          ij.field_m.field_Y = true;
          lb.a(param6, param0, uf.field_j, param1, 21547);
          break L6;
        }
        pi.a(param4, param6, param9, (byte) -106, param5, param0, param1);
        lb.a(param6, param0, wm.field_r, param1, 21547);
        var10 = 92 / ((24 - param3) / 45);
        rl.field_y = rl.field_y + 1;
    }

    final oa a(int param0, int param1, boolean param2, gl param3, gl param4) {
        if (!(null != ((ha) this).field_c)) {
            throw new RuntimeException();
        }
        if (0 <= param1) {
            // if_icmple L36
        } else {
            throw new RuntimeException();
        }
        if (null != ((ha) this).field_b[param1]) {
            return ((ha) this).field_b[param1];
        }
        ((ha) this).field_c.field_l = param0 * param1 + 6;
        int var6 = ((ha) this).field_c.d((byte) 120);
        int var7 = ((ha) this).field_c.d((byte) 114);
        byte[] var11 = new byte[64];
        ((ha) this).field_c.a(0, 64, true, var11);
        oa var9 = new oa(param1, param4, param3, ((ha) this).field_f, ((ha) this).field_i, var6, var11, var7, param2);
        ((ha) this).field_b[param1] = var9;
        return var9;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 86 % ((param1 - 19) / 49);
        if (-1 == param2) {
            if (param0 == 0) {
                return 0;
            }
            if (0 <= param0) {
                return 2048;
            }
            return -2048;
        }
        if (0 > param2) {
            if (-1 == param0) {
                return 4096;
            }
            if (0 > param0) {
                return -4096 + ph.a(-param2, -param0, -1550172208);
            }
            return 4096 + -ph.a(-param2, param0, -1550172208);
        }
        if (0 == param0) {
            return 0;
        }
        if (param0 >= 0) {
            return ph.a(param2, param0, -1550172208);
        }
        return -ph.a(param2, -param0, -1550172208);
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            if (param0 != 39) {
                field_d = null;
            }
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                param1.getAppletContext().showDocument(og.a(-1, param1, var2), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = Virogrid.field_F ? 1 : 0;
        if (null != ((ha) this).field_b) {
          var2 = 0;
          L0: while (true) {
            if (var2 >= ((ha) this).field_b.length) {
              L1: {
                if (param0 <= -111) {
                  break L1;
                } else {
                  ((ha) this).field_h = null;
                  break L1;
                }
              }
              var4 = 0;
              var2 = var4;
              L2: while (true) {
                if (var4 >= ((ha) this).field_b.length) {
                  return;
                } else {
                  if (((ha) this).field_b[var4] != null) {
                    ((ha) this).field_b[var4].b((byte) -28);
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                }
              }
            } else {
              if (((ha) this).field_b[var2] != null) {
                ((ha) this).field_b[var2].c(0);
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, da param1, byte param2) {
        hg var5 = gk.field_g;
        var5.g(param0, 8);
        var5.field_l = var5.field_l + 1;
        int var4 = var5.field_l;
        var5.a(1, 84);
        var5.a(param1.field_p, 68);
        var5.c(param1.field_q, (byte) -102);
        if (param2 >= -22) {
            field_d = null;
        }
        var5.a(param1.field_o, (byte) -42);
        var5.a(param1.field_l, (byte) -42);
        var5.a(param1.field_j, (byte) -42);
        var5.a(param1.field_m, (byte) -42);
        int discarded$0 = var5.b((byte) -111, var4);
        var5.b(var5.field_l + -var4, -1);
    }

    final boolean a(byte param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref = null;
        int var7 = 0;
        int var8 = 0;
        jc var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var8 = Virogrid.field_F ? 1 : 0;
        if (null == ((ha) this).field_c) {
          L0: {
            if (null == ((ha) this).field_h) {
              if (((ha) this).field_f.c((byte) 113)) {
                return false;
              } else {
                ((ha) this).field_h = ((ha) this).field_f.a((byte) 0, 255, true, -1150070304, 255);
                break L0;
              }
            } else {
              break L0;
            }
          }
          if (!((ha) this).field_h.field_t) {
            L1: {
              var10 = new jc(((ha) this).field_h.b((byte) 39));
              var10.field_l = 5;
              var3 = var10.g(param0 + 11113);
              var10.field_l = var10.field_l + 72 * var3;
              if (param0 == 19) {
                break L1;
              } else {
                ((ha) this).field_b = null;
                break L1;
              }
            }
            L2: {
              L3: {
                var16 = new byte[var10.field_g.length + -var10.field_l];
                var14 = var16;
                var13 = var14;
                var11 = var13;
                var4 = var11;
                var10.a(0, var16.length, true, var16);
                if (((ha) this).field_j == null) {
                  break L3;
                } else {
                  if (((ha) this).field_a == null) {
                    break L3;
                  } else {
                    var12 = new java.math.BigInteger(var16);
                    var7_ref = var12.modPow(((ha) this).field_j, ((ha) this).field_a);
                    var5 = var7_ref.toByteArray();
                    break L2;
                  }
                }
              }
              var5 = var4;
              break L2;
            }
            if (-66 != (var5.length ^ -1)) {
              throw new RuntimeException();
            } else {
              var17 = ug.a(var10.field_g, var10.field_l - (var16.length - -5), 5, false);
              var7 = 0;
              L4: while (true) {
                if (64 <= var7) {
                  ((ha) this).field_b = new oa[var3];
                  ((ha) this).field_c = var10;
                  return true;
                } else {
                  if (var17[var7] == var5[1 + var7]) {
                    var7++;
                    continue L4;
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    private ha(dk param0, sb param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((ha) this).field_a = param3;
        ((ha) this).field_i = param1;
        ((ha) this).field_f = param0;
        ((ha) this).field_j = param2;
        if (!((ha) this).field_f.c((byte) 113)) {
            ((ha) this).field_h = ((ha) this).field_f.a((byte) 0, 255, true, -1150070304, 255);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Account created successfully!";
        field_g = "Enter multiplayer lobby";
        field_d = "Send private message to <%0>";
    }
}
