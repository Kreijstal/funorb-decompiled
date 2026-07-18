/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sc implements Runnable {
    private vi field_m;
    private kk field_f;
    private java.net.URL field_o;
    static int field_c;
    private fd field_e;
    static String field_p;
    static String field_h;
    private DataInputStream field_d;
    static bd field_a;
    static String field_i;
    static String field_k;
    static bd field_l;
    static en field_g;
    private kk field_n;
    private int field_b;
    private kk field_j;

    protected final void finalize() {
        if (null != ((sc) this).field_n) {
            if (!(null == ((sc) this).field_n.field_c)) {
                try {
                    ((DataInputStream) ((sc) this).field_n.field_c).close();
                } catch (Exception exception) {
                }
            }
            ((sc) this).field_n = null;
        }
        if (!(((sc) this).field_j == null)) {
            if (((sc) this).field_j.field_c != null) {
                try {
                    ((java.net.Socket) ((sc) this).field_j.field_c).close();
                } catch (Exception exception) {
                }
            }
            ((sc) this).field_j = null;
        }
        if (null != ((sc) this).field_d) {
            try {
                ((sc) this).field_d.close();
            } catch (Exception exception) {
            }
            ((sc) this).field_d = null;
        }
        ((sc) this).field_f = null;
    }

    final vi b(byte param0) {
        if (((sc) this).field_b == 3) {
            return ((sc) this).field_m;
        }
        if (param0 >= 123) {
            return null;
        }
        return null;
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
            var4 = HostileSpawn.field_I ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  L2: {
                    if (((sc) this).field_m.field_n.length <= ((sc) this).field_m.field_i) {
                      break L2;
                    } else {
                      var1_int = ((sc) this).field_d.read(((sc) this).field_m.field_n, ((sc) this).field_m.field_i, ((sc) this).field_m.field_n.length + -((sc) this).field_m.field_i);
                      if (var1_int < 0) {
                        break L2;
                      } else {
                        ((sc) this).field_m.field_i = ((sc) this).field_m.field_i + var1_int;
                        continue L1;
                      }
                    }
                  }
                  if (((sc) this).field_m.field_n.length == ((sc) this).field_m.field_i) {
                    throw sc.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + ((sc) this).field_m.field_n.length + " " + (Object) (Object) ((sc) this).field_o));
                  } else {
                    var1 = this;
                    synchronized (var1) {
                      L3: {
                        ((sc) this).finalize();
                        ((sc) this).field_b = 3;
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
                    ((sc) this).finalize();
                    ((sc) this).field_b = ((sc) this).field_b + 1;
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

    public static void a(int param0) {
        field_h = null;
        int var1 = -6;
        field_g = null;
        field_k = null;
        field_l = null;
        field_p = null;
        field_a = null;
        field_i = null;
    }

    final synchronized boolean b(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        Throwable decompiledCaughtException = null;
        if (((sc) this).field_b < 2) {
          L0: {
            if (param0 == 24) {
              break L0;
            } else {
              boolean discarded$1 = ((sc) this).b(58);
              break L0;
            }
          }
          L1: {
            if (((sc) this).field_b == 0) {
              L2: {
                if (null != ((sc) this).field_n) {
                  break L2;
                } else {
                  ((sc) this).field_n = ((sc) this).field_e.a(30085, ((sc) this).field_o);
                  break L2;
                }
              }
              if (((sc) this).field_n.field_f != 0) {
                if (((sc) this).field_n.field_f != 1) {
                  ((sc) this).field_n = null;
                  ((sc) this).field_b = ((sc) this).field_b + 1;
                  return false;
                } else {
                  break L1;
                }
              } else {
                return false;
              }
            } else {
              break L1;
            }
          }
          L3: {
            if (((sc) this).field_b == 1) {
              L4: {
                if (((sc) this).field_j != null) {
                  break L4;
                } else {
                  ((sc) this).field_j = ((sc) this).field_e.a(((sc) this).field_o.getHost(), 96, 443);
                  break L4;
                }
              }
              if (0 != ((sc) this).field_j.field_f) {
                if (1 == ((sc) this).field_j.field_f) {
                  break L3;
                } else {
                  ((sc) this).field_b = ((sc) this).field_b + 1;
                  ((sc) this).field_j = null;
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
            if (((sc) this).field_d == null) {
              try {
                L6: {
                  L7: {
                    if (((sc) this).field_b != 0) {
                      break L7;
                    } else {
                      ((sc) this).field_d = (DataInputStream) ((sc) this).field_n.field_c;
                      break L7;
                    }
                  }
                  L8: {
                    if (((sc) this).field_b != 1) {
                      break L8;
                    } else {
                      var4 = (java.net.Socket) ((sc) this).field_j.field_c;
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) (Object) ("JAGGRAB " + ((sc) this).field_o.getFile() + "\n\n");
                      var3.write(lf.a((byte) 113, var5));
                      ((sc) this).field_d = new DataInputStream(var4.getInputStream());
                      break L8;
                    }
                  }
                  ((sc) this).field_m.field_i = 0;
                  break L6;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L9: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  ((sc) this).finalize();
                  ((sc) this).field_b = ((sc) this).field_b + 1;
                  break L9;
                }
              }
              break L5;
            } else {
              break L5;
            }
          }
          L10: {
            if (((sc) this).field_f == null) {
              ((sc) this).field_f = ((sc) this).field_e.a(5, (Runnable) this, -102);
              break L10;
            } else {
              break L10;
            }
          }
          if (((sc) this).field_f.field_f == 0) {
            return false;
          } else {
            if (1 == ((sc) this).field_f.field_f) {
              return false;
            } else {
              ((sc) this).finalize();
              ((sc) this).field_b = ((sc) this).field_b + 1;
              return false;
            }
          }
        } else {
          return true;
        }
    }

    final static void a(byte param0) {
        u.field_f = new String[34];
        u.field_f[4] = fh.field_e;
        u.field_f[16] = ch.field_d;
        u.field_f[1] = hn.field_d;
        u.field_f[14] = ob.field_E;
        u.field_f[12] = na.field_q;
        u.field_f[0] = lg.field_l;
        u.field_f[2] = lg.field_h;
        u.field_f[6] = ej.field_o;
        u.field_f[3] = il.field_d;
        u.field_f[7] = jh.field_bb;
        u.field_f[15] = ed.field_d;
        u.field_f[13] = wc.field_s;
        u.field_f[11] = mm.field_h;
        u.field_f[5] = ej.field_o;
        u.field_f[18] = field_p;
        u.field_f[28] = ia.field_k;
        u.field_f[29] = aj.field_g;
        u.field_f[23] = bl.field_e;
        u.field_f[17] = ui.field_d;
        u.field_f[32] = f.field_c;
        u.field_f[22] = il.field_d;
        u.field_f[26] = jf.field_e;
        u.field_f[25] = em.field_b;
        u.field_f[33] = ln.field_h;
        u.field_f[24] = gn.field_l;
        u.field_f[10] = m.field_m[2];
        u.field_f[31] = og.field_e;
        u.field_f[21] = ed.field_d;
        u.field_f[9] = m.field_m[1];
        u.field_f[30] = c.field_b;
        u.field_f[8] = m.field_m[0];
    }

    sc(fd param0, java.net.URL param1, int param2) {
        try {
            ((sc) this).field_o = param1;
            ((sc) this).field_e = param0;
            ((sc) this).field_m = new vi(param2);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "sc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0, p param1, int[] param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        oj var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        int stackIn_18_0 = 0;
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
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
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
        var13 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            var5 = 0;
            L1: while (true) {
              if (0 != param1.field_e) {
                L2: {
                  if (param3 == 1) {
                    break L2;
                  } else {
                    var14 = null;
                    sc.a(69, (p) null, (int[]) null, -89);
                    break L2;
                  }
                }
                L3: {
                  if (param1.field_e <= 0) {
                    break L3;
                  } else {
                    param1.field_e = param1.field_e + 1;
                    break L3;
                  }
                }
                L4: {
                  if (param1.field_e > 32) {
                    param1.field_i = -1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                break L0;
              } else {
                L5: {
                  jn.field_F[ib.field_c].field_c = 256.0 * Math.random();
                  var4_int++;
                  jn.field_F[ib.field_c].field_j.a((byte) 46, param1.field_j);
                  jn.field_F[ib.field_c].field_l.a(param1.field_l, -28860);
                  jn.field_F[ib.field_c].field_e = -var4_int;
                  jn.field_F[ib.field_c].field_h = 0;
                  jn.field_F[ib.field_c].field_i = 6;
                  ib.field_c = ib.field_c + 1;
                  param1.field_l.a(5, (byte) 94, param1.field_c);
                  param1.a(8573);
                  param2[param0] = 0;
                  if (2 != param2[param1.field_j.b(-4)]) {
                    break L5;
                  } else {
                    param1.field_e = 1;
                    param1.field_l.a(15, (byte) 94, param1.field_c);
                    break L5;
                  }
                }
                var6 = 1;
                L6: while (true) {
                  if (~rc.field_e >= ~var6) {
                    param2[param0] = 3;
                    continue L1;
                  } else {
                    L7: {
                      var7 = 0;
                      var8 = 0;
                      var9 = re.field_n[var6];
                      var10 = var9.field_i;
                      var8 = (int)(((double)var9.field_j.field_g + var9.field_l.field_a - (double)param1.field_j.field_g - param1.field_l.field_a) * 24.0);
                      var7 = (int)(24.0 * ((double)var9.field_j.field_e + var9.field_l.field_f - (double)param1.field_j.field_e - param1.field_l.field_f));
                      var11 = 24;
                      if (-var11 > var7) {
                        break L7;
                      } else {
                        if (~var7 < ~var11) {
                          break L7;
                        } else {
                          if (~-var11 < ~var8) {
                            break L7;
                          } else {
                            if (~var11 >= ~var8) {
                              break L7;
                            } else {
                              if (var9.field_I <= 0) {
                                break L7;
                              } else {
                                L8: {
                                  if (var10 < 12) {
                                    break L8;
                                  } else {
                                    if (var10 >= 18) {
                                      break L8;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                L9: {
                                  jn.field_F[ib.field_c - 1].field_i = 1;
                                  if (var9.field_I <= 0) {
                                    stackOut_17_0 = 0;
                                    stackIn_18_0 = stackOut_17_0;
                                    break L9;
                                  } else {
                                    stackOut_16_0 = 1;
                                    stackIn_18_0 = stackOut_16_0;
                                    break L9;
                                  }
                                }
                                L10: {
                                  var12 = stackIn_18_0;
                                  if (var9.a(param1.field_i, -101)) {
                                    L11: {
                                      if (param1.field_i != 5) {
                                        var9.field_I = var9.field_I - 16;
                                        break L11;
                                      } else {
                                        var9.field_I = var9.field_I - 8;
                                        break L11;
                                      }
                                    }
                                    if (!var9.field_b) {
                                      break L10;
                                    } else {
                                      if (var9.field_I > 0) {
                                        tk.a(8, jc.field_c, 1, true);
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  } else {
                                    break L10;
                                  }
                                }
                                L12: {
                                  L13: {
                                    if (var10 == 8) {
                                      break L13;
                                    } else {
                                      if (var10 == 5) {
                                        break L13;
                                      } else {
                                        if (var10 == 10) {
                                          break L13;
                                        } else {
                                          if (var10 == 11) {
                                            break L13;
                                          } else {
                                            if (var10 == 128) {
                                              break L13;
                                            } else {
                                              if (var10 == 129) {
                                                break L13;
                                              } else {
                                                if (var10 == 130) {
                                                  break L13;
                                                } else {
                                                  if (var10 == 131) {
                                                    break L13;
                                                  } else {
                                                    if (132 == var10) {
                                                      break L13;
                                                    } else {
                                                      if (var10 == 133) {
                                                        break L13;
                                                      } else {
                                                        if (var10 == 20) {
                                                          break L13;
                                                        } else {
                                                          if (22 == var10) {
                                                            break L13;
                                                          } else {
                                                            if (!var9.a((byte) 54)) {
                                                              break L12;
                                                            } else {
                                                              break L13;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (!var9.a(param1.field_i, -119)) {
                                    break L12;
                                  } else {
                                    if (param1.field_i != 5) {
                                      var9.field_I = var9.field_I - 192;
                                      break L12;
                                    } else {
                                      var9.field_I = var9.field_I - 48;
                                      if (0 != bm.field_c) {
                                        break L12;
                                      } else {
                                        if (8 == var10) {
                                          param1.field_e = 1;
                                          break L12;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                  }
                                }
                                L14: {
                                  var9.field_F = 255;
                                  jn.field_F[-1 + ib.field_c].field_e = 1;
                                  if (var9.field_I <= 0) {
                                    L15: {
                                      var9.field_I = 0;
                                      if (!var9.field_b) {
                                        break L15;
                                      } else {
                                        if (var12 == 0) {
                                          break L15;
                                        } else {
                                          if (var9.field_i != 27) {
                                            L16: {
                                              al.field_U[3] = al.field_U[3] + 1;
                                              if (al.field_U[3] + 1 != 30) {
                                                break L16;
                                              } else {
                                                ti.a(247, (byte) 67, 8);
                                                break L16;
                                              }
                                            }
                                            var5++;
                                            if (var5 == 5) {
                                              ti.a(245, (byte) -6, 10);
                                              break L15;
                                            } else {
                                              break L15;
                                            }
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                    }
                                    jn.field_F[-1 + ib.field_c].field_i = 3;
                                    break L14;
                                  } else {
                                    break L14;
                                  }
                                }
                                nh.a(var9, -29966);
                                break L7;
                              }
                            }
                          }
                        }
                      }
                    }
                    var6++;
                    continue L6;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var4 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) var4;
            stackOut_71_1 = new StringBuilder().append("sc.D(").append(param0).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param1 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L17;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L17;
            }
          }
          L18: {
            stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
            stackOut_74_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',');
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param2 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L18;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L18;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_77_0, stackIn_77_2 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Next";
        field_h = "Before you start your mission you should check your systems.<br><br>Use <img=2> or <img=1> to move to the door.  The two sets of keys operate slightly differently, so choose the combination that feels most intuitive.<br>Press <img=5> to swap the keys' effects.";
        field_k = "Quit to website";
        field_i = "Cancel";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
