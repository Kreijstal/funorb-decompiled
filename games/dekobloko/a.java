/*
 * Decompiled by CFR-JS 0.4.0.
 */
class a implements gl, nl {
    int field_i;
    int field_q;
    static int[] field_r;
    mm field_z;
    int field_m;
    int field_o;
    static String field_e;
    static lm field_t;
    static int[] field_u;
    private int field_a;
    int field_b;
    int field_c;
    int field_s;
    static int[] field_j;
    int field_f;
    private boolean field_w;
    int field_y;
    static int field_g;
    int field_v;
    private static long[] field_d;
    static int field_k;
    static String field_x;
    static ck[] field_n;
    static String field_l;
    static ck field_p;
    static int field_h;

    private final int c(ce param0, byte param1) {
        if (param1 >= -124) {
            Object var4 = null;
            int discarded$0 = this.b((ce) null, 125, -17, 115);
        }
        return param0.field_y - (((a) this).field_m - -((a) this).field_y);
    }

    public final int a(ce param0, int param1) {
        cf discarded$0 = ((a) this).a(param0, (byte) 83);
        int var3 = -78 / ((-85 - param1) / 36);
        return param0.field_n.b(-1) - -((a) this).field_m - -((a) this).field_y;
    }

    public final cf a(ce param0, byte param1) {
        if (!(null != param0.field_n)) {
            param0.field_n = (cf) (Object) new ea();
        }
        if (!((a) this).field_w) {
            this.c(param0, 18580);
        } else {
            ((ea) (Object) param0.field_n).a(((a) this).b(param0, (byte) 121), ((a) this).field_o, ((a) this).field_z, ((a) this).a(false, param0), this.c(param0, (byte) -128), ((a) this).field_f, 86, ((a) this).field_b);
        }
        if (param1 < 38) {
            Object var4 = null;
            int discarded$0 = ((a) this).a((byte) -75, (ce) null, 115);
        }
        return param0.field_n;
    }

    a(mm param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final int b(ce param0, int param1, int param2, int param3) {
        if (param2 < 72) {
            return -124;
        }
        return param1 + (((a) this).field_s + (param0.field_u + param3)) + param0.field_x;
    }

    public final void a(ce param0, int param1, int param2, int param3, int param4) {
        cf var13 = null;
        cf var14 = null;
        int var7 = 0;
        nf var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (!(!param0.a(true))) {
            var13 = ((a) this).a(param0, (byte) 53);
            var14 = var13;
            var7 = var14.a(false, param1);
            var8 = var13.field_a[var7];
            var9 = var14.a((byte) -94, param1);
            var10 = this.b(param0, var9, param2 + 110, param3);
            var11 = ((a) this).a(param4, 0, param0) + Math.max(0, var8.field_c);
            var12 = ((a) this).a(param4, 0, param0) + Math.min(this.c(param0, (byte) -128), Math.min(var8.field_i, var14.field_a.length <= 1 + var7 ? var8.field_i : var13.field_a[var7 - -1].field_c));
            gg.a(param4 + param0.field_D, 20763, param0.field_u + (param3 + param0.field_t), param0.field_u + param3, param0.field_D + param4 - -param0.field_y);
            bf.field_x.a(var10, var11, var10, ((a) this).field_v, (byte) 64, var12);
            mk.a((byte) -5);
        }
        if (param2 != 1) {
            ((a) this).field_c = -31;
        }
    }

    public void a(boolean param0, int param1, int param2, byte param3, ce param4) {
        if (param3 >= -60) {
            Object var7 = null;
            int discarded$0 = this.b((ce) null, 118, -123, 71);
        }
        if (null == ((a) this).field_z) {
            return;
        }
        this.a(param2, param4, (byte) -102, param1);
    }

    public final int b(ce param0, int param1) {
        cf discarded$6 = ((a) this).a(param0, (byte) 60);
        if (param1 != 0) {
            ((a) this).field_z = null;
        }
        return param0.field_n.a(false) + ((a) this).field_s + ((a) this).field_i;
    }

    final static void a(int param0, boolean param1, boolean param2) {
        pf var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        wb var3 = ma.a(param0, param1, (byte) 99);
        if (var3 != null) {
            w.field_H.a(false, 29072);
            var4 = w.field_H;
            var5_ref_String = fl.field_e;
            var4.field_h.a(var5_ref_String, 5, 68);
            var4 = w.field_H;
            var5 = he.field_S;
            var6 = nf.field_h;
            var4.field_h.b(var6, var5, 63, 0, 0);
        }
        he.a(param2, param1, param0);
    }

    final static void a(String param0, boolean param1, java.applet.Applet param2) {
        try {
            String var7 = null;
            rb.field_l = param0;
            String var6 = param2.getParameter("cookieprefix");
            String var5 = var6;
            var5 = var6;
            String var4 = param2.getParameter("cookiehost");
            var5 = var4;
            var5 = var4;
            if (param1) {
                return;
            }
            try {
                var7 = var6 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
                var5 = var7;
                var5 = var7;
                if (-1 != (param0.length() ^ -1)) {
                    var5 = var7 + "; Expires=" + uf.a((byte) 60, ik.a(4) + 94608000000L) + "; Max-Age=" + 94608000L;
                } else {
                    var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                nc.a((byte) -51, param2, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable throwable) {
            }
            me.a((byte) 127, param2);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final int a(boolean param0, ce param1) {
        if (param0) {
            int discarded$0 = ((a) this).a((byte) 94);
        }
        return param1.field_t + -((a) this).field_s + -((a) this).field_i;
    }

    public final int a(byte param0, ce param1, int param2) {
        if (param0 <= 6) {
            Object var5 = null;
            int discarded$0 = this.c((ce) null, (byte) -126);
        }
        return this.b(param1, 0, 97, param2);
    }

    public final void a(int param0, int param1, int param2, int param3, int param4, ce param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        nf var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        cf var17 = null;
        cf var18 = null;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        var16 = client.field_A ? 1 : 0;
        if (param1 != param0) {
          L0: {
            if (param5.a(true)) {
              L1: {
                var17 = ((a) this).a(param5, (byte) 100);
                var18 = var17;
                if (param0 < param1) {
                  var9 = param1;
                  var8 = param0;
                  break L1;
                } else {
                  var9 = param0;
                  var8 = param1;
                  break L1;
                }
              }
              var10 = var18.a(false, var8);
              var11 = var18.a(false, var9);
              gg.a(param2 - -param5.field_D, 20763, param5.field_t + param3 - -param5.field_u, param5.field_u + param3, param2 + (param5.field_D - -param5.field_y));
              var12 = var10;
              L2: while (true) {
                if (var12 > var11) {
                  mk.a((byte) -5);
                  break L0;
                } else {
                  L3: {
                    var13 = var17.field_a[var12];
                    if (var12 == var10) {
                      stackOut_11_0 = var18.a((byte) -94, var8);
                      stackIn_12_0 = stackOut_11_0;
                      break L3;
                    } else {
                      stackOut_10_0 = var13.field_a[0];
                      stackIn_12_0 = stackOut_10_0;
                      break L3;
                    }
                  }
                  L4: {
                    var14 = stackIn_12_0;
                    if (var12 != var11) {
                      if (var13 != null) {
                        stackOut_16_0 = var13.field_a[-1 + var13.field_a.length];
                        stackIn_17_0 = stackOut_16_0;
                        break L4;
                      } else {
                        stackOut_15_0 = 0;
                        stackIn_17_0 = stackOut_15_0;
                        break L4;
                      }
                    } else {
                      stackOut_13_0 = var18.a((byte) -94, var9);
                      stackIn_17_0 = stackOut_13_0;
                      break L4;
                    }
                  }
                  var15 = stackIn_17_0;
                  bf.field_x.a((byte) -115, var13.field_c + param5.field_F + (param2 - (-param5.field_D - ((a) this).field_m)), ((a) this).field_c >>> 211015160, -var14 + var15, var13.field_i, ((a) this).field_c, this.b(param5, var14, 96, param3));
                  var12++;
                  continue L2;
                }
              }
            } else {
              break L0;
            }
          }
          L5: {
            if (param4 <= -89) {
              break L5;
            } else {
              ((a) this).field_i = -114;
              break L5;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final int a(ce param0, int param1, int param2, int param3) {
        if (param1 != 20881) {
            ((a) this).field_v = 65;
        }
        return param2 + (((a) this).field_m + (param0.field_D + param3)) + param0.field_F;
    }

    private final void c(ce param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = client.field_A ? 1 : 0;
          if (null != param0.field_n) {
            break L0;
          } else {
            param0.field_n = (cf) (Object) new ea();
            break L0;
          }
        }
        L1: {
          var3 = ((a) this).a(false, param0);
          var4 = this.c(param0, (byte) -127);
          if (param1 == 18580) {
            break L1;
          } else {
            var8 = null;
            ((a) this).a(-13, (a) null);
            break L1;
          }
        }
        L2: {
          var6 = ((a) this).field_o;
          if (-1 != var6) {
            if (var6 == -3) {
              var5 = -((a) this).field_z.field_K + var4;
              break L2;
            } else {
              L3: {
                if (-4 != var6) {
                  if (-2 != var6) {
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              var5 = (-((a) this).field_z.field_K + var4 + -((a) this).field_z.field_R >> -1764590527) + ((a) this).field_z.field_R;
              break L2;
            }
          } else {
            var5 = ((a) this).field_z.field_R;
            break L2;
          }
        }
        L4: {
          L5: {
            var6 = ((a) this).field_f;
            if (-1 == (var6 ^ -1)) {
              break L5;
            } else {
              if (var6 != 3) {
                if ((var6 ^ -1) != -2) {
                  if (2 != var6) {
                    break L4;
                  } else {
                    if (!(param0.field_n instanceof ea)) {
                      break L4;
                    } else {
                      ((ea) (Object) param0.field_n).a(param1 ^ 18580, ((a) this).field_z, var3, var5, ((a) this).b(param0, (byte) 122));
                      break L4;
                    }
                  }
                } else {
                  if (!(param0.field_n instanceof ea)) {
                    break L4;
                  } else {
                    ((ea) (Object) param0.field_n).a(var5, var3 >> 2108713153, ((a) this).b(param0, (byte) 116), (byte) 8, ((a) this).field_z);
                    break L4;
                  }
                }
              } else {
                break L5;
              }
            }
          }
          if (!(param0.field_n instanceof ea)) {
            break L4;
          } else {
            ((ea) (Object) param0.field_n).a(0, ((a) this).field_z, ((a) this).b(param0, (byte) 127), var5, 25);
            break L4;
          }
        }
    }

    String b(ce param0, byte param1) {
        int var3 = -9 % ((param1 - 59) / 53);
        return param0.field_E;
    }

    private final void a(int param0, int param1, int param2, int param3, ce param4, boolean param5, int param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = client.field_A ? 1 : 0;
        gg.a(param4.field_D + param7, 20763, param4.field_t + (param4.field_u + param3), param3 - -param4.field_u, param7 + param4.field_D - -param4.field_y);
        if (param5) {
          L0: {
            var9 = ((a) this).a(false, param4);
            var10 = this.c(param4, (byte) -125);
            if (((a) this).field_w) {
              int discarded$1 = ((a) this).field_z.a(((a) this).b(param4, (byte) -36), this.b(param4, param0, 74, param3), this.a(param4, 20881, param6, param7), var9, var10, param1, param2, ((a) this).field_f, ((a) this).field_o, ((a) this).field_b);
              break L0;
            } else {
              L1: {
                var12 = ((a) this).field_o;
                if (var12 == 0) {
                  var11 = ((a) this).field_z.field_R;
                  break L1;
                } else {
                  if (2 != var12) {
                    L2: {
                      if (var12 == 3) {
                        break L2;
                      } else {
                        if ((var12 ^ -1) != -2) {
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var11 = (-((a) this).field_z.field_R + var10 - ((a) this).field_z.field_K >> 1767974529) + ((a) this).field_z.field_R;
                    break L1;
                  } else {
                    var11 = -((a) this).field_z.field_K + var10;
                    break L1;
                  }
                }
              }
              L3: {
                var12 = ((a) this).field_f;
                if (0 != var12) {
                  if (-4 == var12) {
                    break L3;
                  } else {
                    if (-2 == var12) {
                      ((a) this).field_z.b(((a) this).b(param4, (byte) -67), this.b(param4, param0, 122, param3) - -(var9 >> 505266145), var11 + this.a(param4, 20881, param6, param7), param1, param2);
                      break L0;
                    } else {
                      if ((var12 ^ -1) != -3) {
                        break L0;
                      } else {
                        ((a) this).field_z.c(((a) this).b(param4, (byte) 123), var9 + this.b(param4, param0, 78, param3), this.a(param4, 20881, param6, param7) - -var11, param1, param2);
                        break L0;
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              ((a) this).field_z.a(((a) this).b(param4, (byte) -50), this.b(param4, param0, 81, param3), var11 + this.a(param4, 20881, param6, param7), param1, param2);
              break L0;
            }
          }
          mk.a((byte) -5);
          return;
        } else {
          return;
        }
    }

    final static String a(java.applet.Applet param0, byte param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            Object var9 = null;
            String var10 = null;
            String stackIn_8_0 = null;
            Throwable decompiledCaughtException = null;
            String stackOut_7_0 = null;
            var8 = client.field_A ? 1 : 0;
            try {
              L0: {
                if (param1 > 110) {
                  break L0;
                } else {
                  var9 = null;
                  a.a((String) null, false, (java.applet.Applet) null);
                  break L0;
                }
              }
              var10 = param0.getParameter("cookieprefix");
              var3 = var10 + "settings";
              var4 = (String) nc.a(true, "getcookies", param0);
              var5 = ji.a(';', (byte) 66, var4);
              var6 = 0;
              L1: while (true) {
                if (var5.length <= var6) {
                  break L1;
                } else {
                  L2: {
                    var7 = var5[var6].indexOf('=');
                    if ((var7 ^ -1) > -1) {
                      break L2;
                    } else {
                      if (!var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
                        break L2;
                      } else {
                        stackOut_7_0 = var5[var6].substring(var7 - -1).trim();
                        stackIn_8_0 = stackOut_7_0;
                        return stackIn_8_0;
                      }
                    }
                  }
                  var6++;
                  continue L1;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (null == rb.field_l) {
              return param0.getParameter("settings");
            } else {
              return rb.field_l;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        field_e = null;
        field_l = null;
        field_x = null;
        field_n = null;
        field_d = null;
        field_u = null;
        field_r = null;
        field_j = null;
        field_t = null;
        field_p = null;
    }

    public final int a(byte param0) {
        if (param0 > -4) {
            return -27;
        }
        return ((a) this).field_z.field_K + ((a) this).field_z.field_R;
    }

    private final void a(int param0, ce param1, byte param2, int param3) {
        if (param2 >= -1) {
            Object var6 = null;
            this.c((ce) null, 109);
        }
        this.a(0, ((a) this).field_q, ((a) this).field_a, param3, param1, true, 0, param0);
    }

    public final int a(int param0, int param1, ce param2, int param3, int param4, int param5) {
        if (param1 != -257) {
            return -101;
        }
        cf discarded$0 = ((a) this).a(param2, (byte) 46);
        return param2.field_n.a(param5 + -((a) this).a((byte) 81, param2, param0), param4 - ((a) this).a(param3, 0, param2), param1 ^ 32172);
    }

    final static pi b(int param0) {
        pi var1 = new pi(ed.field_f, i.field_d, sg.field_d[0], fh.field_a[0], tm.field_a[0], hc.field_c[0], tc.field_Nb[param0], mb.field_d);
        oa.a(127);
        return var1;
    }

    protected a() {
    }

    final static void a(int param0, int param1, ud param2, int param3, int param4) {
        int var5 = (int)(0.5 + (double)(param4 * param2.field_p) * Math.pow(2.0, 0.0008333333333333334 * (double)param0) / (double)en.field_o);
        dg.field_c.a(param2, var5, pb.field_d * param1, param3 << 1104899142);
    }

    a(mm param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        ((a) this).field_m = param3;
        ((a) this).field_a = param6;
        ((a) this).field_b = param9;
        ((a) this).field_i = param2;
        ((a) this).field_q = param5;
        ((a) this).field_f = param7;
        ((a) this).field_y = param4;
        ((a) this).field_v = param10;
        ((a) this).field_s = param1;
        ((a) this).field_z = param0;
        ((a) this).field_o = param8;
        ((a) this).field_c = param11;
        ((a) this).field_w = param12 ? true : false;
    }

    final void a(int param0, a param1) {
        param1.field_i = ((a) this).field_i;
        param1.field_a = ((a) this).field_a;
        param1.field_m = ((a) this).field_m;
        param1.field_q = ((a) this).field_q;
        param1.field_c = ((a) this).field_c;
        if (param0 != -12253) {
            ((a) this).field_s = -80;
        }
        param1.field_s = ((a) this).field_s;
        param1.field_b = ((a) this).field_b;
        param1.field_o = ((a) this).field_o;
        param1.field_y = ((a) this).field_y;
        param1.field_f = ((a) this).field_f;
        param1.field_z = ((a) this).field_z;
        param1.field_w = ((a) this).field_w;
        param1.field_v = ((a) this).field_v;
    }

    public final int a(int param0, int param1, ce param2) {
        if (param1 != 0) {
            Object var5 = null;
            int discarded$0 = this.c((ce) null, (byte) 33);
        }
        return this.a(param2, 20881, 0, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0_int = 0;
        long var0 = 0L;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        field_e = "<%0><br>IS OUT!";
        field_r = new int[1024];
        field_g = 128;
        field_j = new int[256];
        var1 = 0;
        L0: while (true) {
          if (var1 <= -257) {
            field_d = new long[256];
            field_x = "Theme";
            field_l = "Invite";
            var2 = 0;
            L1: while (true) {
              if (256 <= var2) {
              } else {
                var0 = (long)var2;
                var3 = 0;
                L2: while (true) {
                  if (var3 >= 8) {
                    field_d[var2] = var0;
                    var2++;
                    continue L1;
                  } else {
                    if (-2L != (var0 & 1L ^ -1L)) {
                      var0 = var0 >>> 1;
                      var3++;
                      continue L2;
                    } else {
                      var0 = var0 >>> 1676111105 ^ -3932672073523589310L;
                      var3++;
                      continue L2;
                    }
                  }
                }
              }
            }
          } else {
            var0_int = var1;
            var2 = 0;
            L3: while (true) {
              if (var2 >= 8) {
                field_j[var1] = var0_int;
                var1++;
                continue L0;
              } else {
                if (-2 == (1 & var0_int)) {
                  var0_int = -306674912 ^ var0_int >>> 73361217;
                  var2++;
                  continue L3;
                } else {
                  var0_int = var0_int >>> 1;
                  var2++;
                  continue L3;
                }
              }
            }
          }
        }
    }
}
