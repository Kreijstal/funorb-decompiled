/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ai implements Runnable {
    private gb field_m;
    static int[] field_j;
    private ng field_k;
    private gb field_g;
    private DataInputStream field_e;
    private gb field_f;
    static int[] field_c;
    static dl field_b;
    private int field_d;
    private un field_a;
    static vc field_h;
    static String field_n;
    static String field_l;
    private java.net.URL field_i;

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
            var4 = CrazyCrystals.field_B;
            try {
              L0: {
                L1: while (true) {
                  L2: {
                    if (((ai) this).field_k.field_f >= ((ai) this).field_k.field_h.length) {
                      break L2;
                    } else {
                      var1_int = ((ai) this).field_e.read(((ai) this).field_k.field_h, ((ai) this).field_k.field_f, -((ai) this).field_k.field_f + ((ai) this).field_k.field_h.length);
                      if (-1 >= (var1_int ^ -1)) {
                        ((ai) this).field_k.field_f = ((ai) this).field_k.field_f + var1_int;
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (((ai) this).field_k.field_f == ((ai) this).field_k.field_h.length) {
                    throw ai.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + ((ai) this).field_k.field_h.length + " " + ((ai) this).field_i));
                  } else {
                    var1 = this;
                    synchronized (var1) {
                      L3: {
                        ((ai) this).finalize();
                        ((ai) this).field_d = 3;
                        break L3;
                      }
                    }
                    break L0;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L4: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref = this;
                synchronized (var2_ref) {
                  L5: {
                    ((ai) this).finalize();
                    ((ai) this).field_d = ((ai) this).field_d + 1;
                    break L5;
                  }
                }
                break L4;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected final void finalize() {
        if (null != ((ai) this).field_g) {
            if (((ai) this).field_g.field_b != null) {
                try {
                    ((DataInputStream) ((ai) this).field_g.field_b).close();
                } catch (Exception exception) {
                }
            }
            ((ai) this).field_g = null;
        }
        if (!(((ai) this).field_m == null)) {
            if (!(((ai) this).field_m.field_b == null)) {
                try {
                    ((java.net.Socket) ((ai) this).field_m.field_b).close();
                } catch (Exception exception) {
                }
            }
            ((ai) this).field_m = null;
        }
        if (((ai) this).field_e != null) {
            try {
                ((ai) this).field_e.close();
            } catch (Exception exception) {
            }
            ((ai) this).field_e = null;
        }
        ((ai) this).field_f = null;
    }

    final ng a(byte param0) {
        if (!(3 != ((ai) this).field_d)) {
            return ((ai) this).field_k;
        }
        if (param0 == -111) {
            return null;
        }
        return null;
    }

    public static void a(int param0) {
        field_h = null;
        field_b = null;
        field_j = null;
        field_c = null;
        if (param0 != 8076) {
            return;
        }
        field_n = null;
        field_l = null;
    }

    final synchronized boolean b(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        Throwable decompiledCaughtException = null;
        if (((ai) this).field_d >= 2) {
          return true;
        } else {
          L0: {
            if (-1 == (((ai) this).field_d ^ -1)) {
              L1: {
                if (((ai) this).field_g != null) {
                  break L1;
                } else {
                  ((ai) this).field_g = ((ai) this).field_a.a(5, ((ai) this).field_i);
                  break L1;
                }
              }
              if (0 == ((ai) this).field_g.field_a) {
                return false;
              } else {
                if ((((ai) this).field_g.field_a ^ -1) != -2) {
                  ((ai) this).field_g = null;
                  ((ai) this).field_d = ((ai) this).field_d + 1;
                  return false;
                } else {
                  break L0;
                }
              }
            } else {
              break L0;
            }
          }
          L2: {
            if ((((ai) this).field_d ^ -1) == -2) {
              L3: {
                if (null == ((ai) this).field_m) {
                  ((ai) this).field_m = ((ai) this).field_a.a(443, false, ((ai) this).field_i.getHost());
                  break L3;
                } else {
                  break L3;
                }
              }
              if (((ai) this).field_m.field_a == 0) {
                return false;
              } else {
                if ((((ai) this).field_m.field_a ^ -1) != -2) {
                  ((ai) this).field_d = ((ai) this).field_d + 1;
                  ((ai) this).field_m = null;
                  return false;
                } else {
                  break L2;
                }
              }
            } else {
              break L2;
            }
          }
          L4: {
            if (null == ((ai) this).field_e) {
              try {
                L5: {
                  L6: {
                    if (0 == ((ai) this).field_d) {
                      ((ai) this).field_e = (DataInputStream) ((ai) this).field_g.field_b;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if ((((ai) this).field_d ^ -1) != -2) {
                      break L7;
                    } else {
                      var4 = (java.net.Socket) ((ai) this).field_m.field_b;
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) (Object) ("JAGGRAB " + ((ai) this).field_i.getFile() + "\n\n");
                      var3.write(sn.a(var5, 83));
                      ((ai) this).field_e = new DataInputStream(var4.getInputStream());
                      break L7;
                    }
                  }
                  ((ai) this).field_k.field_f = 0;
                  break L5;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L8: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  ((ai) this).finalize();
                  ((ai) this).field_d = ((ai) this).field_d + 1;
                  break L8;
                }
              }
              break L4;
            } else {
              break L4;
            }
          }
          L9: {
            if (((ai) this).field_f == null) {
              ((ai) this).field_f = ((ai) this).field_a.a((Runnable) this, param0 ^ 2, 5);
              break L9;
            } else {
              break L9;
            }
          }
          if (((ai) this).field_f.field_a != param0) {
            if (((ai) this).field_f.field_a == 1) {
              return false;
            } else {
              ((ai) this).finalize();
              ((ai) this).field_d = ((ai) this).field_d + 1;
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static boolean a(int param0, int param1) {
        if (!(-1 != param1)) {
            return true;
        }
        if (param0 != 100) {
            Object var3 = null;
            int discarded$0 = ai.a((rh) null, false, (String) null, 83, (rh) null, (byte) -124, -103);
        }
        return (1 << param1 & v.field_c) != 0 ? true : false;
    }

    final static boolean a(byte param0, String param1) {
        if (param0 != 82) {
            Object var3 = null;
            boolean discarded$0 = ai.a((byte) -21, (String) null);
        }
        CharSequence var4 = (CharSequence) (Object) param1;
        return lk.field_b.equals((Object) (Object) fe.a(60136, var4));
    }

    final static int a(rh param0, boolean param1, String param2, int param3, rh param4, byte param5, int param6) {
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
        ng stackIn_10_0 = null;
        ng stackIn_11_0 = null;
        ng stackIn_12_0 = null;
        String stackIn_12_1 = null;
        ng stackIn_13_0 = null;
        ng stackIn_14_0 = null;
        ng stackIn_15_0 = null;
        String stackIn_15_1 = null;
        ng stackOut_9_0 = null;
        ng stackOut_11_0 = null;
        String stackOut_11_1 = null;
        ng stackOut_10_0 = null;
        String stackOut_10_1 = null;
        ng stackOut_12_0 = null;
        ng stackOut_14_0 = null;
        String stackOut_14_1 = null;
        ng stackOut_13_0 = null;
        String stackOut_13_1 = null;
        L0: {
          var13 = CrazyCrystals.field_B;
          if (param5 > 79) {
            break L0;
          } else {
            field_n = null;
            break L0;
          }
        }
        L1: {
          var14 = param0.a((byte) -108);
          var8 = param4.a((byte) -108);
          if (null == oi.field_c) {
            if (te.a((byte) -19, false)) {
              break L1;
            } else {
              return -1;
            }
          } else {
            break L1;
          }
        }
        L2: {
          if (gj.field_k == cf.field_a) {
            L3: {
              tp.field_f.field_f = 0;
              ja.field_f = null;
              if (param2 != null) {
                L4: {
                  var9 = 0;
                  if (param1) {
                    var9 = var9 | 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  sp.field_c.field_f = 0;
                  sp.field_c.a(og.field_w.nextInt(), -16384);
                  sp.field_c.a(og.field_w.nextInt(), -16384);
                  sp.field_c.a(var14, (byte) -103);
                  sp.field_c.a(var8, (byte) -99);
                  var15 = (CharSequence) (Object) param2;
                  sp.field_c.a(ba.a(48, var15), (byte) -120);
                  sp.field_c.c(-161478600, param3);
                  sp.field_c.a(true, param6);
                  sp.field_c.a(true, var9);
                  tp.field_f.a(true, 18);
                  tp.field_f.field_f = tp.field_f.field_f + 2;
                  var10 = tp.field_f.field_f;
                  var11_ref_String = mf.a(le.b((byte) -20), -28697);
                  if (var11_ref_String == null) {
                    var11_ref_String = "";
                    break L5;
                  } else {
                    break L5;
                  }
                }
                tp.field_f.b(var11_ref_String, (byte) -23);
                tg.a(sp.field_c, (ng) (Object) tp.field_f, gn.field_S, -105, lm.field_j);
                tp.field_f.b(977272835, -var10 + tp.field_f.field_f);
                break L3;
              } else {
                L6: {
                  sp.field_c.field_f = 0;
                  sp.field_c.a(og.field_w.nextInt(), -16384);
                  sp.field_c.a(og.field_w.nextInt(), -16384);
                  stackOut_9_0 = sp.field_c;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (!param0.a(-124)) {
                    stackOut_11_0 = (ng) (Object) stackIn_11_0;
                    stackOut_11_1 = "";
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    break L6;
                  } else {
                    stackOut_10_0 = (ng) (Object) stackIn_10_0;
                    stackOut_10_1 = (String) var14;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    break L6;
                  }
                }
                L7: {
                  ((ng) (Object) stackIn_12_0).a(stackIn_12_1, (byte) -93);
                  stackOut_12_0 = sp.field_c;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_13_0 = stackOut_12_0;
                  if (param4.a(-113)) {
                    stackOut_14_0 = (ng) (Object) stackIn_14_0;
                    stackOut_14_1 = (String) var8;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    break L7;
                  } else {
                    stackOut_13_0 = (ng) (Object) stackIn_13_0;
                    stackOut_13_1 = "";
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    break L7;
                  }
                }
                ((ng) (Object) stackIn_15_0).a(stackIn_15_1, (byte) -115);
                tp.field_f.a(true, 16);
                tp.field_f.field_f = tp.field_f.field_f + 1;
                var9 = tp.field_f.field_f;
                tg.a(sp.field_c, (ng) (Object) tp.field_f, gn.field_S, -122, lm.field_j);
                tp.field_f.c((byte) 46, tp.field_f.field_f - var9);
                break L3;
              }
            }
            ak.a(-1, (byte) -48);
            gj.field_k = kp.field_k;
            break L2;
          } else {
            break L2;
          }
        }
        L8: {
          if (gj.field_k != kp.field_k) {
            break L8;
          } else {
            if (!fq.a(1, (byte) -125)) {
              break L8;
            } else {
              L9: {
                var9 = kd.field_n.h(255);
                kd.field_n.field_f = 0;
                if (var9 < 100) {
                  break L9;
                } else {
                  if (var9 > 105) {
                    break L9;
                  } else {
                    gj.field_k = ga.field_F;
                    gj.field_o = new String[-100 + var9];
                    break L8;
                  }
                }
              }
              if (248 != var9) {
                if (-100 != (var9 ^ -1)) {
                  bf.field_b = var9;
                  rk.field_b = -1;
                  gj.field_k = kf.field_b;
                  break L8;
                } else {
                  boolean discarded$1 = fq.a(ui.b((byte) -123), (byte) 75);
                  ja.field_f = new Boolean(hm.a((ng) (Object) kd.field_n, -2));
                  kd.field_n.field_f = 0;
                  break L8;
                }
              } else {
                cb.a(1148, le.b((byte) -20));
                re.field_j = bo.field_m;
                jj.a(4);
                ec.field_g = false;
                return var9;
              }
            }
          }
        }
        L10: {
          if (gj.field_k != ga.field_F) {
            break L10;
          } else {
            var9 = 2;
            if (!fq.a(var9, (byte) -50)) {
              break L10;
            } else {
              var10 = kd.field_n.c((byte) -7);
              kd.field_n.field_f = 0;
              if (fq.a(var10, (byte) -40)) {
                var11 = gj.field_o.length;
                var12 = 0;
                L11: while (true) {
                  if (var12 >= var11) {
                    jj.a(4);
                    ec.field_g = false;
                    return 100 - -var11;
                  } else {
                    gj.field_o[var12] = kd.field_n.d(93);
                    var12++;
                    continue L11;
                  }
                }
              } else {
                break L10;
              }
            }
          }
        }
        L12: {
          if (gj.field_k == kf.field_b) {
            if (ol.f((byte) 60)) {
              L13: {
                if (-256 != (bf.field_b ^ -1)) {
                  re.field_j = kd.field_n.i(122);
                  break L13;
                } else {
                  var9_ref_String = kd.field_n.a(0);
                  if (var9_ref_String == null) {
                    break L13;
                  } else {
                    ah.a(-72, var9_ref_String, le.b((byte) -20));
                    break L13;
                  }
                }
              }
              jj.a(4);
              ec.field_g = false;
              return bf.field_b;
            } else {
              break L12;
            }
          } else {
            break L12;
          }
        }
        L14: {
          if (null == oi.field_c) {
            if (!ec.field_g) {
              var9 = fe.field_j;
              fe.field_j = gj.field_l;
              ec.field_g = true;
              gj.field_l = var9;
              break L14;
            } else {
              L15: {
                if (30000L >= wd.d(-1322)) {
                  re.field_j = re.field_k;
                  break L15;
                } else {
                  re.field_j = jm.field_f;
                  break L15;
                }
              }
              ec.field_g = false;
              return 249;
            }
          } else {
            break L14;
          }
        }
        return -1;
    }

    ai(un param0, java.net.URL param1, int param2) {
        ((ai) this).field_a = param0;
        ((ai) this).field_i = param1;
        ((ai) this).field_k = new ng(param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[256];
        field_n = "Tutorial";
        field_j = new int[12];
        field_l = "Email address is unavailable";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
