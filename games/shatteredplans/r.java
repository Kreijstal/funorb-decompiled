/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class r implements Runnable {
    private ob field_k;
    private qb field_l;
    static String field_f;
    static int field_c;
    private pb field_b;
    static int[] field_j;
    private DataInputStream field_g;
    private int field_h;
    private java.net.URL field_e;
    private pb field_a;
    static boolean field_d;
    private pb field_i;

    final static void a() {
        RuntimeException var1 = null;
        int var2 = 0;
        gr var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        String[][] var7 = null;
        int[][] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        sl var16 = null;
        RuntimeException decompiledCaughtException = null;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var16 = sa.field_a;
            var2 = var16.j(-102);
            var3 = (gr) (Object) qa.field_r.d(0);
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.field_k != var2) {
                    var3 = (gr) (Object) qa.field_r.a((byte) -71);
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3 == null) {
                q.g(-119);
                return;
              } else {
                L3: {
                  var4 = 0;
                  var5 = var16.j(-87);
                  if (var5 != 0) {
                    var6 = var3.field_j;
                    wb.field_a[0] = ln.field_o;
                    var7_int = 1;
                    L4: while (true) {
                      if (var5 <= var7_int) {
                        vd.a(var6, var5, (byte) 18);
                        var7_int = 0;
                        L5: while (true) {
                          if (var5 <= var7_int) {
                            bh.a(var6, (byte) -111);
                            String[][] dupTemp$5 = new String[2][var6];
                            var3.field_n = dupTemp$5;
                            var7 = dupTemp$5;
                            int[][] dupTemp$6 = new int[2][4 * var6];
                            var3.field_m = dupTemp$6;
                            var8 = dupTemp$6;
                            var9 = wm.field_c;
                            var10 = 0;
                            var11 = 0;
                            L6: while (true) {
                              if (var9 <= var10) {
                                var14 = 0;
                                var10 = var14;
                                var15 = 0;
                                var11 = var15;
                                L7: while (true) {
                                  if (var9 <= var14) {
                                    break L3;
                                  } else {
                                    L8: {
                                      var12 = lg.field_d[var14 + var6];
                                      var7[1][var15] = wb.field_a[var12];
                                      var8[1][4 * var15] = kf.field_f[var12];
                                      var8[1][4 * var15 + 1] = fb.field_zb[var12];
                                      var8[1][var15 * 4 + 2] = aj.field_d[var12];
                                      var8[1][var15 * 4 - -3] = f.field_y[var12];
                                      int discarded$7 = -105;
                                      if (!jp.a(wb.field_a[var12])) {
                                        break L8;
                                      } else {
                                        if (0 != fb.field_zb[var12] + aj.field_d[var12] + f.field_y[var12]) {
                                          break L8;
                                        } else {
                                          var7[1][var15] = null;
                                          var15--;
                                          break L8;
                                        }
                                      }
                                    }
                                    var14++;
                                    var15++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L9: {
                                  var12 = lg.field_d[var10];
                                  var7[0][var11] = wb.field_a[var12];
                                  var8[0][4 * var11] = kf.field_f[var12];
                                  var8[0][var11 * 4 - -1] = fb.field_zb[var12];
                                  var8[0][2 + var11 * 4] = aj.field_d[var12];
                                  var8[0][var11 * 4 - -3] = f.field_y[var12];
                                  int discarded$8 = -105;
                                  if (!jp.a(wb.field_a[var12])) {
                                    break L9;
                                  } else {
                                    if (f.field_y[var12] + aj.field_d[var12] + fb.field_zb[var12] != 0) {
                                      break L9;
                                    } else {
                                      var7[0][var11] = null;
                                      var11--;
                                      break L9;
                                    }
                                  }
                                }
                                var11++;
                                var10++;
                                continue L6;
                              }
                            }
                          } else {
                            L10: {
                              int discarded$9 = 0;
                              qg.a((ob) (Object) var16);
                              if (var7_int != 0) {
                                ul.a(0, na.field_L, np.field_j, gp.field_c, var7_int, ig.field_d);
                                var7_int++;
                                break L10;
                              } else {
                                var3.field_i = np.field_j;
                                var3.field_l = na.field_L;
                                var3.field_h = ig.field_d;
                                var3.field_r = gp.field_c;
                                ul.a(0, na.field_L, np.field_j, gp.field_c, var7_int, ig.field_d);
                                var7_int++;
                                var7_int++;
                                break L10;
                              }
                            }
                            var7_int++;
                            continue L5;
                          }
                        }
                      } else {
                        wb.field_a[var7_int] = var16.e(-1);
                        var7_int++;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                var3.field_q = true;
                var3.b((byte) -106);
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "r.E(" + 67 + 41);
        }
    }

    protected final void finalize() {
        if (null != ((r) this).field_b) {
            if (!(null == ((r) this).field_b.field_e)) {
                try {
                    ((DataInputStream) ((r) this).field_b.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((r) this).field_b = null;
        }
        if (!(((r) this).field_i == null)) {
            if (!(null == ((r) this).field_i.field_e)) {
                try {
                    ((java.net.Socket) ((r) this).field_i.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((r) this).field_i = null;
        }
        if (((r) this).field_g != null) {
            try {
                ((r) this).field_g.close();
            } catch (Exception exception) {
            }
            ((r) this).field_g = null;
        }
        ((r) this).field_a = null;
    }

    final static void b() {
        bi var1 = null;
        bi var2 = null;
        int var3 = 0;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
            var1 = new bi(540, 140);
            aq.a((byte) 117, var1);
            wn.c();
            gf.b();
            js.field_j = 0;
            gq.e(-65);
            var2 = var1.g();
            int var4 = 5;
            for (var3 = 0; 15 > var3; var3++) {
                var2.e(-2, -2, 16777215);
                gf.b(4, 4, 0, 0, 540, 140);
            }
            rf.field_h.e();
            var1.d(0, 0);
            ln.f((byte) -70);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "r.D(" + -112 + 41);
        }
    }

    final static void a(byte param0, boolean param1) {
        if (null != lg.field_e) {
            lg.field_e.b(param1, 125);
            return;
        }
    }

    final static fk a(byte[] param0) {
        fk var3 = null;
        RuntimeException var3_ref = null;
        fk stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        fk stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3 = new fk(param0);
            tr.field_vb.a((byte) -113, (oh) (Object) var3);
            int discarded$2 = 13;
            dn.a(6, var3);
            stackOut_0_0 = (fk) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("r.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + -78 + 44 + 6 + 41);
        }
        return stackIn_1_0;
    }

    public final void run() {
        try {
            int var1_int = 0;
            Object var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = ShatteredPlansClient.field_F ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  if (((r) this).field_k.field_h.length <= ((r) this).field_k.field_j) {
                    break L1;
                  } else {
                    var1_int = ((r) this).field_g.read(((r) this).field_k.field_h, ((r) this).field_k.field_j, ((r) this).field_k.field_h.length + -((r) this).field_k.field_j);
                    if (var1_int >= 0) {
                      ((r) this).field_k.field_j = ((r) this).field_k.field_j + var1_int;
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
                if (((r) this).field_k.field_j != ((r) this).field_k.field_h.length) {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      ((r) this).finalize();
                      ((r) this).field_h = 3;
                      break L2;
                    }
                  }
                  return;
                } else {
                  throw r.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + ((r) this).field_k.field_h.length + " " + ((r) this).field_e));
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref = this;
              synchronized (var2_ref) {
                L3: {
                  ((r) this).finalize();
                  ((r) this).field_h = ((r) this).field_h + 1;
                  break L3;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final ob a(boolean param0) {
        if (!(3 != ((r) this).field_h)) {
            return ((r) this).field_k;
        }
        if (param0) {
            return null;
        }
        return null;
    }

    final synchronized boolean b(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        if (-3 >= ((r) this).field_h) {
          return true;
        } else {
          L0: {
            if (-1 != ((r) this).field_h) {
              break L0;
            } else {
              L1: {
                if (null == ((r) this).field_b) {
                  ((r) this).field_b = ((r) this).field_l.a(((r) this).field_e, false);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (((r) this).field_b.field_d != 0) {
                if (((r) this).field_b.field_d != 1) {
                  ((r) this).field_h = ((r) this).field_h + 1;
                  ((r) this).field_b = null;
                  return false;
                } else {
                  break L0;
                }
              } else {
                return false;
              }
            }
          }
          L2: {
            if (param0 == 10000) {
              break L2;
            } else {
              ((r) this).field_h = 77;
              break L2;
            }
          }
          L3: {
            if (((r) this).field_h == 1) {
              L4: {
                if (((r) this).field_i == null) {
                  ((r) this).field_i = ((r) this).field_l.a(65535, 443, ((r) this).field_e.getHost());
                  break L4;
                } else {
                  break L4;
                }
              }
              if (((r) this).field_i.field_d != 0) {
                if (((r) this).field_i.field_d == 1) {
                  break L3;
                } else {
                  ((r) this).field_h = ((r) this).field_h + 1;
                  ((r) this).field_i = null;
                  return false;
                }
              } else {
                return false;
              }
            } else {
              break L3;
            }
          }
          L5: {
            if (((r) this).field_g != null) {
              break L5;
            } else {
              try {
                L6: {
                  L7: {
                    if (((r) this).field_h == 0) {
                      ((r) this).field_g = (DataInputStream) ((r) this).field_b.field_e;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (1 == ((r) this).field_h) {
                      var4 = (java.net.Socket) ((r) this).field_i.field_e;
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) (Object) ("JAGGRAB " + ((r) this).field_e.getFile() + "\n\n");
                      var3.write(se.a((byte) 80, var5));
                      ((r) this).field_g = new DataInputStream(var4.getInputStream());
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  ((r) this).field_k.field_j = 0;
                  decompiledRegionSelector0 = 0;
                  break L6;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L9: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  ((r) this).finalize();
                  ((r) this).field_h = ((r) this).field_h + 1;
                  decompiledRegionSelector0 = 1;
                  break L9;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                L10: {
                  if (null != ((r) this).field_a) {
                    break L10;
                  } else {
                    ((r) this).field_a = ((r) this).field_l.a(true, 5, (Runnable) this);
                    break L10;
                  }
                }
                if (((r) this).field_a.field_d != 0) {
                  if (1 == ((r) this).field_a.field_d) {
                    return false;
                  } else {
                    ((r) this).finalize();
                    ((r) this).field_h = ((r) this).field_h + 1;
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                break L5;
              }
            }
          }
          if (null != ((r) this).field_a) {
            if (((r) this).field_a.field_d == 0) {
              return false;
            } else {
              L11: {
                if (1 != ((r) this).field_a.field_d) {
                  ((r) this).finalize();
                  ((r) this).field_h = ((r) this).field_h + 1;
                  break L11;
                } else {
                  break L11;
                }
              }
              return false;
            }
          } else {
            ((r) this).field_a = ((r) this).field_l.a(true, 5, (Runnable) this);
            if (((r) this).field_a.field_d == 0) {
              return false;
            } else {
              L12: {
                if (1 != ((r) this).field_a.field_d) {
                  ((r) this).finalize();
                  ((r) this).field_h = ((r) this).field_h + 1;
                  break L12;
                } else {
                  break L12;
                }
              }
              return false;
            }
          }
        }
    }

    final static rg a(Throwable param0, String param1) {
        rg var2 = null;
        if (param0 instanceof rg) {
            var2 = (rg) (Object) param0;
            var2.field_b = var2.field_b + 32 + param1;
        } else {
            var2 = new rg(param0, param1);
        }
        return var2;
    }

    r(qb param0, java.net.URL param1, int param2) {
        try {
            ((r) this).field_e = param1;
            ((r) this).field_l = param0;
            ((r) this).field_k = new ob(param2);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "r.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[]{-65536, -65536, -65536, 0, -65536};
        field_f = "Invite more players, or alternatively try changing the '<%0>' setting.";
        field_d = false;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
