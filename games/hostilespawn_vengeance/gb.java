/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb {
    static gb field_a;
    private wc field_g;
    static int field_b;
    private int field_m;
    static int field_h;
    private boolean field_i;
    static String[] field_k;
    private Object[] field_d;
    static nd field_f;
    static bd field_l;
    private uk field_c;
    private Object[][] field_j;
    static long field_e;

    private final synchronized boolean a(byte param0, int param1) {
        if (param0 >= -16) {
            boolean discarded$0 = ((gb) this).a(107, -109, (byte) 42);
        }
        if (!(((gb) this).a(-15879))) {
            return false;
        }
        if (param1 >= 0) {
            if (((gb) this).field_g.field_p.length > param1) {
                if (0 != ((gb) this).field_g.field_p[param1]) {
                    return true;
                }
            }
        }
        if (um.field_f) {
            throw new IllegalArgumentException(Integer.toString(param1));
        }
        return false;
    }

    private final synchronized boolean a(int param0, byte param1, int param2) {
        L0: {
          if (param1 >= 8) {
            break L0;
          } else {
            field_h = 43;
            break L0;
          }
        }
        if (((gb) this).a(-15879)) {
          L1: {
            if (-1 < (param0 ^ -1)) {
              break L1;
            } else {
              if (0 > param2) {
                break L1;
              } else {
                if (param0 >= ((gb) this).field_g.field_p.length) {
                  break L1;
                } else {
                  if (param2 < ((gb) this).field_g.field_p[param0]) {
                    return true;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          if (um.field_f) {
            throw new IllegalArgumentException(param0 + " " + param2);
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final int b(int param0, String param1) {
        if (!((gb) this).a(-15879)) {
            return 0;
        }
        int var4 = 120 / ((param0 - 77) / 40);
        param1 = param1.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param1;
        int var3 = ((gb) this).field_g.field_l.a(true, ci.a(-114, var5));
        return ((gb) this).b(-8102, var3);
    }

    final synchronized boolean a(int param0) {
        if (param0 != -15879) {
            field_k = (String[]) ((gb) this).field_d[4];
        }
        if (null == ((gb) this).field_g) {
            ((gb) this).field_g = ((gb) this).field_c.c(3);
            if (!(null != ((gb) this).field_g)) {
                return false;
            }
            ((gb) this).field_d = new Object[((gb) this).field_g.field_c];
            ((gb) this).field_j = new Object[((gb) this).field_g.field_c][];
        }
        return true;
    }

    final int c(int param0, int param1) {
        if (!(this.a((byte) -40, param1))) {
            return 0;
        }
        if (param0 != 0) {
            return ((int[]) ((Object[]) ((gb) this).field_d[9])[14])[6];
        }
        return ((gb) this).field_g.field_p[param1];
    }

    final synchronized byte[] a(int param0, int param1) {
        if (!((gb) this).a(-15879)) {
            return null;
        }
        if (!(-2 != (((gb) this).field_g.field_p.length ^ -1))) {
            return ((gb) this).a(false, param0, 0);
        }
        if (!this.a((byte) -55, param0)) {
            return null;
        }
        if (!(param1 != (((gb) this).field_g.field_p[param0] ^ -1))) {
            return ((gb) this).a(false, 0, param0);
        }
        throw new RuntimeException();
    }

    final synchronized boolean a(int param0, int param1, byte param2) {
        if (!this.a(param1, (byte) 36, param0)) {
            return false;
        }
        if (((gb) this).field_j[param1] != null) {
            if (null != ((gb) this).field_j[param1][param0]) {
                return true;
            }
        }
        if (!(((gb) this).field_d[param1] == null)) {
            return true;
        }
        if (param2 <= 65) {
            gb.a(true, (java.awt.Canvas) null, ((boolean[]) ((Object[]) ((Object[]) ((gb) this).field_d[36])[3])[4])[0]);
        }
        this.d(20529, param1);
        if (null == ((gb) this).field_d[param1]) {
            return false;
        }
        return true;
    }

    final byte[] a(boolean param0, int param1, int param2) {
        if (param0) {
            return (byte[]) ((Object[]) ((gb) this).field_d[9])[4];
        }
        return this.a(param2, (int[]) null, param1, -2);
    }

    final int f(int param0) {
        if (param0 >= -111) {
            Object var3 = null;
            boolean discarded$0 = ((gb) this).a((String) null, (byte) 90);
        }
        if (!(((gb) this).a(-15879))) {
            return -1;
        }
        return ((gb) this).field_g.field_p.length;
    }

    final static void a(gb param0, int param1) {
        bd var2 = new bd(param0.a("", "final_frame.jpg", 0), (java.awt.Component) (Object) se.field_h);
        int var3 = var2.field_z;
        int var4 = var2.field_A;
        pf.b(param1 ^ -11731);
        ob.field_C = new bd(var3, 3 * var4 / 4);
        ob.field_C.a();
        var2.c(0, 0);
        if (param1 != -11310) {
            return;
        }
        ki.field_e = new bd(var3, -ob.field_C.field_A + var4);
        ki.field_e.a();
        var2.c(0, -ob.field_C.field_A);
        ki.field_e.field_y = ob.field_C.field_A;
        eh.b(false);
    }

    final static void a(byte param0, java.applet.Applet param1, String param2) {
        try {
            String var6 = null;
            String var5 = null;
            String var4 = null;
            String var7 = null;
            if (param0 < 57) {
                field_h = -122;
            }
            bi.field_g = param2;
            try {
                var6 = param1.getParameter("cookieprefix");
                var5 = var6;
                var5 = var6;
                var4 = param1.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                var7 = var6 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
                var5 = var7;
                var5 = var7;
                if (0 == param2.length()) {
                    var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var5 = var7 + "; Expires=" + dk.a((byte) -41, 94608000000L + hn.a((byte) 80)) + "; Max-Age=" + 94608000L;
                }
                a.a(param1, 17467, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable throwable) {
            }
            e.a(23148, param1);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void d(int param0) {
        if (param0 <= 14) {
            return;
        }
        ik.field_d = new mk();
        ke.field_s.b((ag) (Object) ik.field_d, (byte) 110);
    }

    final static void a(int param0, byte param1, p param2, int param3) {
        int var5 = 0;
        Object var6 = null;
        bd var7 = null;
        bd var8 = null;
        L0: {
          var5 = HostileSpawn.field_I ? 1 : 0;
          if (param2.field_e < -1) {
            if (param2.field_e <= 5) {
              pe.field_fb[6].a(true, 128, (int)param2.field_c, 8 + param3, 8 + param0);
              break L0;
            } else {
              if (-11 > (param2.field_e ^ -1)) {
                break L0;
              } else {
                pe.field_fb[7].a(true, 128, (int)param2.field_c, 8 + param3, param0 + 8);
                break L0;
              }
            }
          } else {
            if (-21 == param2.field_i) {
              var7 = new bd(64, 64);
              var8 = var7;
              var7.a();
              pe.field_fb[12].a(true, 128, (int)param2.field_c, 32, 32);
              o.field_n.b((byte) 119);
              var8.b(-32 + param3, -32 + param0, 64);
              pe.field_fb[8].a(true, 128, (int)param2.field_c, param3, param0);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param1 == 81) {
            break L1;
          } else {
            var6 = null;
            gb.a((gb) null, 120);
            break L1;
          }
        }
    }

    final static void a(boolean param0, java.awt.Canvas param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = HostileSpawn.field_I ? 1 : 0;
          if (pb.field_Kb < 10) {
            L1: {
              var3 = 0;
              if (!pc.field_a) {
                break L1;
              } else {
                var3 = 1;
                pc.field_a = false;
                break L1;
              }
            }
            ki.a(var3 != 0, nb.j(96), cc.a(74), re.field_A, (byte) 44);
            break L0;
          } else {
            if (uk.a(27301)) {
              if (fa.field_c == 0) {
                cf.a(false, param2, (byte) 28);
                ui.a(0, param1, (byte) -78, 0);
                break L0;
              } else {
                ad.a(param1, param0);
                break L0;
              }
            } else {
              si.d();
              dc.a((byte) 11, 240, 320);
              ui.a(0, param1, (byte) -29, 0);
              break L0;
            }
          }
        }
        L2: {
          if (!param0) {
            break L2;
          } else {
            var5 = null;
            gb.a((byte) 10, (java.applet.Applet) null, (String) null);
            break L2;
          }
        }
    }

    final boolean a(int param0, String param1, String param2) {
        if (!((gb) this).a(-15879)) {
            return false;
        }
        if (param0 > -104) {
            field_b = ((int[]) ((gb) this).field_d[9])[0];
        }
        param1 = param1.toLowerCase();
        param2 = param2.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param1;
        int var4 = ((gb) this).field_g.field_l.a(true, ci.a(-49, var6));
        if (!(this.a((byte) -113, var4))) {
            return false;
        }
        CharSequence var7 = (CharSequence) (Object) param2;
        int var5 = ((gb) this).field_g.field_h[var4].a(true, ci.a(-118, var7));
        return ((gb) this).a(var5, var4, (byte) 107);
    }

    final boolean a(String param0, byte param1) {
        if (!(((gb) this).a(-15879))) {
            return false;
        }
        param0 = param0.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param0;
        int var3 = ((gb) this).field_g.field_l.a(true, ci.a(-118, var5));
        int var4 = 66 % ((param1 - 60) / 54);
        if (-1 >= (var3 ^ -1)) {
            return true;
        }
        return false;
    }

    final synchronized boolean e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = HostileSpawn.field_I ? 1 : 0;
        if (!((gb) this).a(-15879)) {
          return false;
        } else {
          var2 = 1;
          var3 = param0;
          L0: while (true) {
            if (var3 >= ((gb) this).field_g.field_t.length) {
              return var2 != 0;
            } else {
              var4 = ((gb) this).field_g.field_t[var3];
              if (null == ((gb) this).field_d[var4]) {
                this.d(param0 ^ 20529, var4);
                if (null == ((gb) this).field_d[var4]) {
                  var2 = 0;
                  var3++;
                  continue L0;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        }
    }

    final synchronized byte[] a(String param0, String param1, int param2) {
        if (!((gb) this).a(param2 ^ -15879)) {
            return null;
        }
        param1 = param1.toLowerCase();
        param0 = param0.toLowerCase();
        CharSequence var6 = (CharSequence) (Object) param1;
        int var4 = ((gb) this).field_g.field_l.a(true, ci.a(-57, var6));
        if (!this.a((byte) -62, var4)) {
            return null;
        }
        CharSequence var7 = (CharSequence) (Object) param0;
        int var5 = ((gb) this).field_g.field_h[var4].a(true, ci.a(-86, var7));
        if (param2 != 0) {
            return null;
        }
        return ((gb) this).a(false, var5, var4);
    }

    public static void b(int param0) {
        field_a = null;
        field_k = null;
        field_l = null;
        if (param0 != -16199) {
            Object var2 = null;
            gb.a((gb) null, 78);
        }
        field_f = null;
    }

    private final synchronized boolean a(int[] param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        byte[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var15 = null;
        int var15_int = 0;
        int var16_int = 0;
        byte[][] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        byte[] var24 = null;
        int[] var25 = null;
        vi var27 = null;
        byte[] var28 = null;
        vi var30 = null;
        vi var32 = null;
        int[] var33 = null;
        byte[][] var34 = null;
        int[] var35 = null;
        byte[] var37 = null;
        byte[] var38 = null;
        int[] var41 = null;
        byte[][] var42 = null;
        int[] var43 = null;
        byte[] var45 = null;
        byte[] var46 = null;
        int[] var49 = null;
        byte[][] var50 = null;
        int[] var51 = null;
        byte[] var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        int[] var57 = null;
        byte[][] var58 = null;
        var23 = HostileSpawn.field_I ? 1 : 0;
        if (!this.a((byte) -77, param1)) {
          return false;
        } else {
          if (null != ((gb) this).field_d[param1]) {
            L0: {
              var5 = ((gb) this).field_g.field_o[param1];
              var51 = ((gb) this).field_g.field_b[param1];
              var43 = var51;
              var35 = var43;
              var25 = var35;
              var6 = var25;
              if (null == ((gb) this).field_j[param1]) {
                ((gb) this).field_j[param1] = new Object[((gb) this).field_g.field_p[param1]];
                break L0;
              } else {
                break L0;
              }
            }
            var7 = ((gb) this).field_j[param1];
            var8 = 1;
            var9 = -77 % ((35 - param2) / 39);
            var10_int = 0;
            L1: while (true) {
              L2: {
                if (var10_int >= var5) {
                  break L2;
                } else {
                  L3: {
                    if (var6 != null) {
                      var11 = var51[var10_int];
                      break L3;
                    } else {
                      var11 = var10_int;
                      break L3;
                    }
                  }
                  if (null != var7[var11]) {
                    var10_int++;
                    continue L1;
                  } else {
                    var8 = 0;
                    break L2;
                  }
                }
              }
              if (var8 == 0) {
                L4: {
                  L5: {
                    if (param0 == null) {
                      break L5;
                    } else {
                      L6: {
                        if (0 != param0[0]) {
                          break L6;
                        } else {
                          if (-1 != (param0[1] ^ -1)) {
                            break L6;
                          } else {
                            if (0 != param0[2]) {
                              break L6;
                            } else {
                              if (param0[3] == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                      var52 = sb.a(true, ((gb) this).field_d[param1], true);
                      var27 = new vi(var52);
                      var27.a(var27.field_n.length, (byte) -126, 5, param0);
                      var53 = var52;
                      break L4;
                    }
                  }
                  var53 = sb.a(true, ((gb) this).field_d[param1], false);
                  var45 = var53;
                  var37 = var45;
                  var10 = var37;
                  break L4;
                }
                L7: {
                  var54 = ml.a(var53, (byte) -76);
                  var46 = var54;
                  var38 = var46;
                  var28 = var38;
                  var24 = var28;
                  var55 = var24;
                  if (((gb) this).field_i) {
                    ((gb) this).field_d[param1] = null;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (1 < var5) {
                    var54 = var46;
                    if (2 != ((gb) this).field_m) {
                      var12 = var54.length;
                      var12--;
                      var13 = 255 & var24[var12];
                      var12 = var12 - 4 * (var13 * var5);
                      var32 = new vi(var55);
                      var57 = new int[var5];
                      var49 = var57;
                      var41 = var49;
                      var33 = var41;
                      var15 = var33;
                      var32.field_i = var12;
                      var16_int = 0;
                      L9: while (true) {
                        if (var16_int >= var13) {
                          var58 = new byte[var5][];
                          var50 = var58;
                          var42 = var50;
                          var34 = var42;
                          var16 = var34;
                          var17 = 0;
                          L10: while (true) {
                            if (var5 <= var17) {
                              var32.field_i = var12;
                              var17 = 0;
                              var18 = 0;
                              L11: while (true) {
                                if (var13 <= var18) {
                                  var18 = 0;
                                  L12: while (true) {
                                    if (var5 <= var18) {
                                      break L8;
                                    } else {
                                      L13: {
                                        if (var6 == null) {
                                          var19 = var18;
                                          break L13;
                                        } else {
                                          var19 = var51[var18];
                                          break L13;
                                        }
                                      }
                                      if (((gb) this).field_m == 0) {
                                        var7[var19] = ej.a(false, var58[var18], 117);
                                        var18++;
                                        continue L12;
                                      } else {
                                        var7[var19] = (Object) (Object) var58[var18];
                                        var18++;
                                        continue L12;
                                      }
                                    }
                                  }
                                } else {
                                  var19 = 0;
                                  var20 = 0;
                                  L14: while (true) {
                                    if (var20 >= var5) {
                                      var18++;
                                      continue L11;
                                    } else {
                                      var19 = var19 + var32.d(8195);
                                      kf.a(var55, var17, var58[var20], var57[var20], var19);
                                      var15[var20] = var15[var20] + var19;
                                      var17 = var17 + var19;
                                      var20++;
                                      continue L14;
                                    }
                                  }
                                }
                              }
                            } else {
                              var16[var17] = new byte[var57[var17]];
                              var57[var17] = 0;
                              var17++;
                              continue L10;
                            }
                          }
                        } else {
                          var17 = 0;
                          var18 = 0;
                          L15: while (true) {
                            if (var18 >= var5) {
                              var16_int++;
                              continue L9;
                            } else {
                              var17 = var17 + var32.d(8195);
                              var15[var18] = var15[var18] + var17;
                              var18++;
                              continue L15;
                            }
                          }
                        }
                      }
                    } else {
                      var12 = var54.length;
                      var12--;
                      var13 = 255 & var24[var12];
                      var12 = var12 - 4 * var5 * var13;
                      var30 = new vi(var55);
                      var15_int = 0;
                      var16_int = 0;
                      var30.field_i = var12;
                      var17 = 0;
                      L16: while (true) {
                        if (var13 <= var17) {
                          if (var15_int == 0) {
                            return true;
                          } else {
                            var56 = new byte[var15_int];
                            var15_int = 0;
                            var30.field_i = var12;
                            var18 = 0;
                            var19 = 0;
                            L17: while (true) {
                              if (var19 >= var13) {
                                var7[var16_int] = (Object) (Object) var56;
                                break L8;
                              } else {
                                var20 = 0;
                                var21 = 0;
                                L18: while (true) {
                                  if (var21 >= var5) {
                                    var19++;
                                    continue L17;
                                  } else {
                                    L19: {
                                      var20 = var20 + var30.d(8195);
                                      if (var6 != null) {
                                        var22 = var51[var21];
                                        break L19;
                                      } else {
                                        var22 = var21;
                                        break L19;
                                      }
                                    }
                                    L20: {
                                      if (param3 != var22) {
                                        break L20;
                                      } else {
                                        kf.a(var55, var18, var56, var15_int, var20);
                                        var15_int = var15_int + var20;
                                        break L20;
                                      }
                                    }
                                    var18 = var18 + var20;
                                    var21++;
                                    continue L18;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var18 = 0;
                          var19 = 0;
                          L21: while (true) {
                            if (var5 <= var19) {
                              var17++;
                              continue L16;
                            } else {
                              L22: {
                                var18 = var18 + var30.d(8195);
                                if (var6 != null) {
                                  var20 = var51[var19];
                                  break L22;
                                } else {
                                  var20 = var19;
                                  break L22;
                                }
                              }
                              if (var20 == param3) {
                                var16_int = var20;
                                var15_int = var15_int + var18;
                                var19++;
                                continue L21;
                              } else {
                                var19++;
                                continue L21;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    L23: {
                      if (var6 != null) {
                        var54 = var46;
                        var12 = var51[0];
                        break L23;
                      } else {
                        var12 = 0;
                        break L23;
                      }
                    }
                    var54 = var46;
                    if (((gb) this).field_m == 0) {
                      var7[var12] = ej.a(false, var55, 112);
                      break L8;
                    } else {
                      var7[var12] = (Object) (Object) var54;
                      return true;
                    }
                  }
                }
                return true;
              } else {
                return true;
              }
            }
          } else {
            return false;
          }
        }
    }

    final int a(byte param0, String param1) {
        if (!((gb) this).a(-15879)) {
            return -1;
        }
        param1 = param1.toLowerCase();
        if (param0 != -2) {
            field_a = null;
        }
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((gb) this).field_g.field_l.a(true, ci.a(-34, var4));
        if (!(this.a((byte) -71, var3))) {
            return -1;
        }
        return var3;
    }

    final int a(int param0, String param1, int param2) {
        if (!(this.a((byte) -79, param0))) {
            return -1;
        }
        param1 = param1.toLowerCase();
        if (param2 != -1) {
            byte[] discarded$0 = ((gb) this).a(false, -33, ((int[]) ((gb) this).field_d[32])[0]);
        }
        CharSequence var5 = (CharSequence) (Object) param1;
        int var4 = ((gb) this).field_g.field_h[param0].a(true, ci.a(param2 ^ 120, var5));
        if (!this.a(param0, (byte) 26, var4)) {
            return -1;
        }
        return var4;
    }

    private final synchronized void d(int param0, int param1) {
        if (param0 != 20529) {
            int discarded$0 = ((gb) this).a((byte) -10, (String) ((gb) this).field_d[0]);
        }
        if (!((gb) this).field_i) {
            ((gb) this).field_d[param1] = ej.a(false, ((gb) this).field_c.a((byte) -50, param1), param0 + -20418);
        } else {
            ((gb) this).field_d[param1] = (Object) (Object) ((gb) this).field_c.a((byte) -50, param1);
        }
    }

    final synchronized int b(int param0, int param1) {
        if (param0 != -8102) {
            return 60;
        }
        if (!this.a((byte) -120, param1)) {
            return 0;
        }
        if (!(null == ((gb) this).field_d[param1])) {
            return 100;
        }
        return ((gb) this).field_c.b(-23, param1);
    }

    final boolean a(int param0, String param1) {
        if (!((gb) this).a(-15879)) {
            return false;
        }
        if (param0 != -8088) {
            ((gb) this).field_d = null;
        }
        param1 = param1.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((gb) this).field_g.field_l.a(true, ci.a(-46, var4));
        return ((gb) this).a(var3, (byte) 8);
    }

    final synchronized boolean a(int param0, byte param1) {
        if (!this.a((byte) -62, param0)) {
            return false;
        }
        if (null != ((gb) this).field_d[param0]) {
            return true;
        }
        if (param1 != 8) {
            ((Object[]) ((gb) this).field_d[5])[12] = null;
        }
        this.d(param1 + 20521, param0);
        if (null == ((gb) this).field_d[param0]) {
            return false;
        }
        return true;
    }

    gb(uk param0, boolean param1, int param2) {
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
          ((gb) this).field_g = null;
          if (0 > param2) {
            break L0;
          } else {
            if ((param2 ^ -1) >= -3) {
              L1: {
                ((gb) this).field_m = param2;
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
              ((gb) this).field_i = stackIn_6_1 != 0;
              ((gb) this).field_c = param0;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("");
    }

    private final synchronized byte[] a(int param0, int[] param1, int param2, int param3) {
        Object var5 = null;
        byte[] var5_array = null;
        byte[] var7 = null;
        if (this.a(param0, (byte) 121, param2)) {
          L0: {
            if (param3 == -2) {
              break L0;
            } else {
              ((gb) this).field_g = null;
              break L0;
            }
          }
          L1: {
            L2: {
              var5 = null;
              if (null == ((gb) this).field_j[param0]) {
                break L2;
              } else {
                if (null != ((gb) this).field_j[param0][param2]) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (!this.a(param1, param0, (byte) 93, param2)) {
              this.d(param3 + 20531, param0);
              if (this.a(param1, param0, (byte) -61, param2)) {
                break L1;
              } else {
                return null;
              }
            } else {
              break L1;
            }
          }
          if (null != ((gb) this).field_j[param0]) {
            L3: {
              if (((gb) this).field_j[param0][param2] == null) {
                break L3;
              } else {
                var7 = sb.a(true, ((gb) this).field_j[param0][param2], false);
                var5_array = var7;
                if (var7 == null) {
                  throw new RuntimeException("");
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (var5_array != null) {
                if (((gb) this).field_m != -2) {
                  if (2 == ((gb) this).field_m) {
                    ((gb) this).field_j[param0] = null;
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  ((gb) this).field_j[param0][param2] = null;
                  if (-2 == ((gb) this).field_g.field_p[param0]) {
                    ((gb) this).field_j[param0] = null;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              } else {
                break L4;
              }
            }
            return var5_array;
          } else {
            throw new RuntimeException("");
          }
        } else {
          return null;
        }
    }

    final synchronized int c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = HostileSpawn.field_I ? 1 : 0;
        if (((gb) this).a(-15879)) {
          var2 = param0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (((gb) this).field_d.length <= var4) {
              if (var2 != 0) {
                var4 = var3 * 100 / var2;
                return var4;
              } else {
                return 100;
              }
            } else {
              if (0 < ((gb) this).field_g.field_o[var4]) {
                var3 = var3 + ((gb) this).b(param0 + -8102, var4);
                var2 += 100;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 49;
        field_k = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_h = 0;
        field_f = new nd(11, 0, 1, 2);
    }
}
