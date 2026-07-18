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
                      if (var1_int >= 0) {
                        ((ai) this).field_k.field_f = ((ai) this).field_k.field_f + var1_int;
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (((ai) this).field_k.field_f == ((ai) this).field_k.field_h.length) {
                    throw ai.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + ((ai) this).field_k.field_h.length + " " + (Object) (Object) ((ai) this).field_i));
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
            if (((ai) this).field_d == 0) {
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
                if (((ai) this).field_g.field_a != 1) {
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
            if (((ai) this).field_d == 1) {
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
                if (((ai) this).field_m.field_a != 1) {
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
                    if (((ai) this).field_d != 1) {
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
        return (1 << param1 & v.field_c) != 0 ? true : false;
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        CharSequence var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 82) {
                break L1;
              } else {
                var3 = null;
                boolean discarded$2 = ai.a((byte) -21, (String) null);
                break L1;
              }
            }
            var4 = (CharSequence) (Object) param1;
            stackOut_2_0 = lk.field_b.equals((Object) (Object) fe.a(60136, var4));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("ai.A(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static int a(rh param0, boolean param1, String param2, int param3, rh param4, byte param5, int param6) {
        RuntimeException var7 = null;
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
        int stackIn_7_0 = 0;
        ng stackIn_12_0 = null;
        ng stackIn_13_0 = null;
        ng stackIn_14_0 = null;
        String stackIn_14_1 = null;
        ng stackIn_15_0 = null;
        ng stackIn_16_0 = null;
        ng stackIn_17_0 = null;
        String stackIn_17_1 = null;
        int stackIn_33_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        ng stackOut_11_0 = null;
        ng stackOut_13_0 = null;
        String stackOut_13_1 = null;
        ng stackOut_12_0 = null;
        String stackOut_12_1 = null;
        ng stackOut_14_0 = null;
        ng stackOut_16_0 = null;
        String stackOut_16_1 = null;
        ng stackOut_15_0 = null;
        String stackOut_15_1 = null;
        int stackOut_32_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_66_0 = 0;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var13 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (param5 > 79) {
                break L1;
              } else {
                field_n = null;
                break L1;
              }
            }
            L2: {
              var14 = param0.a((byte) -108);
              var8 = param4.a((byte) -108);
              if (null == oi.field_c) {
                if (te.a((byte) -19, false)) {
                  break L2;
                } else {
                  stackOut_6_0 = -1;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (gj.field_k == cf.field_a) {
                L4: {
                  tp.field_f.field_f = 0;
                  ja.field_f = null;
                  if (param2 != null) {
                    L5: {
                      var9 = 0;
                      if (param1) {
                        var9 = var9 | 1;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
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
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    tp.field_f.b(var11_ref_String, (byte) -23);
                    tg.a(sp.field_c, (ng) (Object) tp.field_f, gn.field_S, -105, lm.field_j);
                    tp.field_f.b(977272835, -var10 + tp.field_f.field_f);
                    break L4;
                  } else {
                    L7: {
                      sp.field_c.field_f = 0;
                      sp.field_c.a(og.field_w.nextInt(), -16384);
                      sp.field_c.a(og.field_w.nextInt(), -16384);
                      stackOut_11_0 = sp.field_c;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (!param0.a(-124)) {
                        stackOut_13_0 = (ng) (Object) stackIn_13_0;
                        stackOut_13_1 = "";
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        break L7;
                      } else {
                        stackOut_12_0 = (ng) (Object) stackIn_12_0;
                        stackOut_12_1 = (String) var14;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        break L7;
                      }
                    }
                    L8: {
                      ((ng) (Object) stackIn_14_0).a(stackIn_14_1, (byte) -93);
                      stackOut_14_0 = sp.field_c;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_15_0 = stackOut_14_0;
                      if (param4.a(-113)) {
                        stackOut_16_0 = (ng) (Object) stackIn_16_0;
                        stackOut_16_1 = (String) var8;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        break L8;
                      } else {
                        stackOut_15_0 = (ng) (Object) stackIn_15_0;
                        stackOut_15_1 = "";
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        break L8;
                      }
                    }
                    ((ng) (Object) stackIn_17_0).a(stackIn_17_1, (byte) -115);
                    tp.field_f.a(true, 16);
                    tp.field_f.field_f = tp.field_f.field_f + 1;
                    var9 = tp.field_f.field_f;
                    tg.a(sp.field_c, (ng) (Object) tp.field_f, gn.field_S, -122, lm.field_j);
                    tp.field_f.c((byte) 46, tp.field_f.field_f - var9);
                    break L4;
                  }
                }
                ak.a(-1, (byte) -48);
                gj.field_k = kp.field_k;
                break L3;
              } else {
                break L3;
              }
            }
            L9: {
              if (gj.field_k != kp.field_k) {
                break L9;
              } else {
                if (!fq.a(1, (byte) -125)) {
                  break L9;
                } else {
                  L10: {
                    var9 = kd.field_n.h(255);
                    kd.field_n.field_f = 0;
                    if (var9 < 100) {
                      break L10;
                    } else {
                      if (var9 <= 105) {
                        gj.field_k = ga.field_F;
                        gj.field_o = new String[-100 + var9];
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  if (248 != var9) {
                    if (var9 != 99) {
                      bf.field_b = var9;
                      rk.field_b = -1;
                      gj.field_k = kf.field_b;
                      break L9;
                    } else {
                      boolean discarded$1 = fq.a(ui.b((byte) -123), (byte) 75);
                      ja.field_f = new Boolean(hm.a((ng) (Object) kd.field_n, -2));
                      kd.field_n.field_f = 0;
                      break L9;
                    }
                  } else {
                    cb.a(1148, le.b((byte) -20));
                    re.field_j = bo.field_m;
                    jj.a(4);
                    ec.field_g = false;
                    stackOut_32_0 = var9;
                    stackIn_33_0 = stackOut_32_0;
                    return stackIn_33_0;
                  }
                }
              }
            }
            L11: {
              if (gj.field_k != ga.field_F) {
                break L11;
              } else {
                var9 = 2;
                if (!fq.a(var9, (byte) -50)) {
                  break L11;
                } else {
                  var10 = kd.field_n.c((byte) -7);
                  kd.field_n.field_f = 0;
                  if (fq.a(var10, (byte) -40)) {
                    var11 = gj.field_o.length;
                    var12 = 0;
                    L12: while (true) {
                      if (var12 >= var11) {
                        jj.a(4);
                        ec.field_g = false;
                        stackOut_45_0 = 100 - -var11;
                        stackIn_46_0 = stackOut_45_0;
                        return stackIn_46_0;
                      } else {
                        gj.field_o[var12] = kd.field_n.d(93);
                        var12++;
                        continue L12;
                      }
                    }
                  } else {
                    break L11;
                  }
                }
              }
            }
            L13: {
              if (gj.field_k == kf.field_b) {
                if (ol.f((byte) 60)) {
                  L14: {
                    if (bf.field_b != 255) {
                      re.field_j = kd.field_n.i(122);
                      break L14;
                    } else {
                      var9_ref_String = kd.field_n.a(0);
                      if (var9_ref_String == null) {
                        break L14;
                      } else {
                        ah.a(-72, var9_ref_String, le.b((byte) -20));
                        break L14;
                      }
                    }
                  }
                  jj.a(4);
                  ec.field_g = false;
                  stackOut_55_0 = bf.field_b;
                  stackIn_56_0 = stackOut_55_0;
                  return stackIn_56_0;
                } else {
                  break L13;
                }
              } else {
                break L13;
              }
            }
            L15: {
              if (null == oi.field_c) {
                if (!ec.field_g) {
                  var9 = fe.field_j;
                  fe.field_j = gj.field_l;
                  ec.field_g = true;
                  gj.field_l = var9;
                  break L15;
                } else {
                  L16: {
                    if (30000L >= wd.d(-1322)) {
                      re.field_j = re.field_k;
                      break L16;
                    } else {
                      re.field_j = jm.field_f;
                      break L16;
                    }
                  }
                  ec.field_g = false;
                  stackOut_63_0 = 249;
                  stackIn_64_0 = stackOut_63_0;
                  return stackIn_64_0;
                }
              } else {
                break L15;
              }
            }
            stackOut_66_0 = -1;
            stackIn_67_0 = stackOut_66_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var7 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) var7;
            stackOut_68_1 = new StringBuilder().append("ai.D(");
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param0 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L17;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L17;
            }
          }
          L18: {
            stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',').append(param1).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param2 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L18;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L18;
            }
          }
          L19: {
            stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
            stackOut_74_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',').append(param3).append(',');
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param4 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L19;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L19;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_77_0, stackIn_77_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_67_0;
    }

    ai(un param0, java.net.URL param1, int param2) {
        try {
            ((ai) this).field_a = param0;
            ((ai) this).field_i = param1;
            ((ai) this).field_k = new ng(param2);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "ai.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
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
