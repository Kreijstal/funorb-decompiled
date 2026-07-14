/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.String;

final class pf extends ee implements ga, pl {
    private String field_L;
    static rh field_O;
    private dj field_P;
    private boolean field_C;
    private hk field_G;
    private static gk field_K;
    static boolean field_D;
    private boolean field_I;
    private hk field_M;
    private dj field_J;
    private hk field_E;
    static String field_H;
    private boolean field_N;

    final static boolean a(int param0, char param1) {
        Object var3 = null;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          if (param0 == -123) {
            break L0;
          } else {
            var3 = null;
            pf.a(-108, (pk) null);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (param1 < 48) {
                break L3;
              } else {
                if (param1 <= 57) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param1 < 65) {
                break L4;
              } else {
                if (param1 <= 90) {
                  break L2;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (param1 < 97) {
                break L5;
              } else {
                if (param1 > 122) {
                  break L5;
                } else {
                  break L2;
                }
              }
            }
            stackOut_12_0 = 0;
            stackIn_13_0 = stackOut_12_0;
            break L1;
          }
          stackOut_11_0 = 1;
          stackIn_13_0 = stackOut_11_0;
          break L1;
        }
        return stackIn_13_0 != 0;
    }

    final static void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        ea var4_ref_ea = null;
        int var4 = 0;
        se var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        pk var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        L0: {
          var8 = Geoblox.field_C;
          var9 = eh.field_d;
          var2 = var9.c((byte) 34);
          var3 = var9.c((byte) 34);
          if (0 != var2) {
            if (var2 != 1) {
              gi.a((Throwable) null, "LR1: " + og.e(55), (byte) 125);
              jl.a((byte) -123);
              break L0;
            } else {
              var4 = var9.h(76);
              var5 = (se) (Object) sj.field_g.g(0);
              L1: while (true) {
                L2: {
                  if (var5 == null) {
                    break L2;
                  } else {
                    L3: {
                      if (var5.field_g != var3) {
                        break L3;
                      } else {
                        if (var5.field_j != var4) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var5 = (se) (Object) sj.field_g.d(1);
                    continue L1;
                  }
                }
                if (var5 != null) {
                  var5.a(false);
                  break L0;
                } else {
                  jl.a((byte) -116);
                  return;
                }
              }
            }
          } else {
            var4_ref_ea = (ea) (Object) ea.field_g.g(0);
            if (var4_ref_ea != null) {
              L4: {
                var5_int = -var9.field_f + p.field_k;
                var13 = var4_ref_ea.field_h;
                var12 = var13;
                var11 = var12;
                var10 = var11;
                var6 = var10;
                if (var5_int <= var13.length << -2069078526) {
                  break L4;
                } else {
                  var5_int = var13.length << -652131070;
                  break L4;
                }
              }
              var7 = 0;
              L5: while (true) {
                if (var5_int <= var7) {
                  var4_ref_ea.a(false);
                  break L0;
                } else {
                  var6[var7 >> 166716578] = var6[var7 >> 166716578] + (var9.c((byte) 34) << cd.a(var7 << 901222056, 768));
                  var7++;
                  continue L5;
                }
              }
            } else {
              jl.a((byte) -116);
              return;
            }
          }
        }
        L6: {
          if (param0 < -95) {
            break L6;
          } else {
            field_O = null;
            break L6;
          }
        }
    }

    public static void a(byte param0) {
        field_H = null;
        field_K = null;
        field_O = null;
        if (param0 >= -18) {
            pf.a((byte) -108);
        }
    }

    public final void a(dj param0, int param1) {
        if (param0 == ((pf) this).field_J) {
            boolean discarded$0 = ((pf) this).field_P.a((byte) -69, (el) this);
        }
        if (!(((pf) this).field_P != param0)) {
            this.g(param1 ^ -18649);
        }
        if (param1 != -18649) {
            field_O = null;
        }
    }

    final void a(String param0, int param1) {
        dj var3 = ((pf) this).field_J;
        String var4 = param0;
        var3.a(param1 ^ 2, var4, false);
        if (param1 != 0) {
            ((pf) this).i(114);
        }
        ((pf) this).field_P.i((byte) 110);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (!(((pf) this).field_L == null)) {
            int discarded$0 = ng.field_F.a(((pf) this).field_L, ((pf) this).field_v + param0 - -20, 15 + ((pf) this).field_m + param1, -40 + ((pf) this).field_r, ((pf) this).field_h, 16777215, -1, 1, 0, ng.field_F.field_o);
        }
        if (null != ((pf) this).field_M) {
            vb.c(10 + param0, 134 + param1, -20 + ((pf) this).field_r, 4210752);
        }
        int var5 = 20 / ((param2 - 1) / 43);
        super.a(param0, param1, (byte) -48, param3);
    }

    public final void a(dj param0, byte param1) {
        if (param1 != 74) {
            field_H = null;
        }
    }

    final boolean a(int param0, int param1, char param2, el param3) {
        if (super.a(param0, param1, param2, param3)) {
            return true;
        }
        if (98 == param0) {
            return ((pf) this).a(7305, param3);
        }
        if (-100 != (param0 ^ -1)) {
            return false;
        }
        return ((pf) this).a(param3, -109);
    }

    final String h(int param0) {
        if (null == ((pf) this).field_J.field_s) {
            return "";
        }
        if (param0 < 62) {
            Object var3 = null;
            boolean discarded$0 = ((pf) this).a(28, 70, '"', (el) null);
        }
        return ((pf) this).field_J.field_s;
    }

    final static int a(int param0, int param1, mb param2, mb param3, String param4, boolean param5, int param6) {
        String var8 = null;
        int var9 = 0;
        String var9_ref = null;
        int var10 = 0;
        String var11_ref = null;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        CharSequence var14 = null;
        qc stackIn_7_0 = null;
        qc stackIn_8_0 = null;
        qc stackIn_9_0 = null;
        String stackIn_9_1 = null;
        qc stackIn_10_0 = null;
        qc stackIn_11_0 = null;
        qc stackIn_12_0 = null;
        String stackIn_12_1 = null;
        qc stackOut_6_0 = null;
        qc stackOut_8_0 = null;
        String stackOut_8_1 = null;
        qc stackOut_7_0 = null;
        String stackOut_7_1 = null;
        qc stackOut_9_0 = null;
        qc stackOut_11_0 = null;
        String stackOut_11_1 = null;
        qc stackOut_10_0 = null;
        String stackOut_10_1 = null;
        L0: {
          var13 = param2.b(16925);
          var8 = param3.b(16925);
          if (oc.field_e != null) {
            break L0;
          } else {
            if (!w.a(false, 52)) {
              return -1;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (gi.field_d != pk.field_l) {
            break L1;
          } else {
            L2: {
              fj.field_q.field_f = 0;
              fi.field_b = null;
              if (param4 != null) {
                L3: {
                  var9 = 0;
                  fc.field_d.field_f = 0;
                  if (param5) {
                    var9 = var9 | 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  fc.field_d.c((byte) 95, bh.field_d.nextInt());
                  fc.field_d.c((byte) 95, bh.field_d.nextInt());
                  fc.field_d.a(var13, (byte) -126);
                  fc.field_d.a(var8, (byte) -126);
                  var14 = (CharSequence) (Object) param4;
                  fc.field_d.a(sl.a(var14, 48), (byte) -126);
                  fc.field_d.e(param0, 28695);
                  fc.field_d.d((byte) -94, param1);
                  fc.field_d.d((byte) 123, var9);
                  fj.field_q.d((byte) 127, 18);
                  fj.field_q.field_f = fj.field_q.field_f + 2;
                  var10 = fj.field_q.field_f;
                  var11_ref = s.a(-1, k.c(105));
                  if (var11_ref == null) {
                    var11_ref = "";
                    break L4;
                  } else {
                    break L4;
                  }
                }
                fj.field_q.a(var11_ref, 0);
                el.a(false, fc.field_d, (qc) (Object) fj.field_q, ld.field_c, vl.field_l);
                fj.field_q.a(-var10 + fj.field_q.field_f, true);
                break L2;
              } else {
                L5: {
                  fc.field_d.field_f = 0;
                  fc.field_d.c((byte) 95, bh.field_d.nextInt());
                  fc.field_d.c((byte) 95, bh.field_d.nextInt());
                  stackOut_6_0 = fc.field_d;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (!param2.a((byte) 97)) {
                    stackOut_8_0 = (qc) (Object) stackIn_8_0;
                    stackOut_8_1 = "";
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L5;
                  } else {
                    stackOut_7_0 = (qc) (Object) stackIn_7_0;
                    stackOut_7_1 = (String) var13;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    break L5;
                  }
                }
                L6: {
                  ((qc) (Object) stackIn_9_0).a(stackIn_9_1, (byte) -126);
                  stackOut_9_0 = fc.field_d;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (!param3.a((byte) 126)) {
                    stackOut_11_0 = (qc) (Object) stackIn_11_0;
                    stackOut_11_1 = "";
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    break L6;
                  } else {
                    stackOut_10_0 = (qc) (Object) stackIn_10_0;
                    stackOut_10_1 = (String) var8;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    break L6;
                  }
                }
                ((qc) (Object) stackIn_12_0).a(stackIn_12_1, (byte) -126);
                fj.field_q.d((byte) 124, 16);
                fj.field_q.field_f = fj.field_q.field_f + 1;
                var9 = fj.field_q.field_f;
                el.a(false, fc.field_d, (qc) (Object) fj.field_q, ld.field_c, vl.field_l);
                fj.field_q.f(11700, fj.field_q.field_f - var9);
                break L2;
              }
            }
            cm.a(-1, -1);
            pk.field_l = field_K;
            break L1;
          }
        }
        L7: {
          if (field_K == pk.field_l) {
            if (el.b(30000, 1)) {
              L8: {
                var9 = eh.field_d.c((byte) 34);
                eh.field_d.field_f = 0;
                if (-101 < (var9 ^ -1)) {
                  break L8;
                } else {
                  if (var9 >= -106) {
                    pk.field_l = v.field_l;
                    si.field_i = new String[var9 - 100];
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              if (-249 != var9) {
                if (99 != var9) {
                  pk.field_l = qh.field_F;
                  p.field_k = -1;
                  me.field_l = var9;
                  break L7;
                } else {
                  boolean discarded$1 = el.b(30000, rc.d(112));
                  fi.field_b = new Boolean(jl.a((qc) (Object) eh.field_d, 0));
                  eh.field_d.field_f = 0;
                  break L7;
                }
              } else {
                sj.a(k.c(124), (byte) 123);
                kh.field_a = ph.field_k;
                jl.a((byte) -124);
                ck.field_e = false;
                return var9;
              }
            } else {
              break L7;
            }
          } else {
            break L7;
          }
        }
        L9: {
          if (pk.field_l == v.field_l) {
            var9 = 2;
            if (el.b(30000, var9)) {
              var10 = eh.field_d.b(true);
              eh.field_d.field_f = 0;
              if (!el.b(30000, var10)) {
                break L9;
              } else {
                var11 = si.field_i.length;
                var12 = 0;
                L10: while (true) {
                  if (var12 >= var11) {
                    jl.a((byte) -114);
                    ck.field_e = false;
                    return var11 + 100;
                  } else {
                    si.field_i[var12] = eh.field_d.f(27425);
                    var12++;
                    continue L10;
                  }
                }
              }
            } else {
              break L9;
            }
          } else {
            break L9;
          }
        }
        L11: {
          if (pk.field_l != qh.field_F) {
            break L11;
          } else {
            if (nf.a(false)) {
              L12: {
                if ((me.field_l ^ -1) != -256) {
                  kh.field_a = eh.field_d.e((byte) 98);
                  break L12;
                } else {
                  var9_ref = eh.field_d.i((byte) 53);
                  if (var9_ref == null) {
                    break L12;
                  } else {
                    tc.a(-128, var9_ref, k.c(106));
                    break L12;
                  }
                }
              }
              jl.a((byte) -114);
              ck.field_e = false;
              return me.field_l;
            } else {
              break L11;
            }
          }
        }
        L13: {
          if (param6 >= 56) {
            break L13;
          } else {
            field_K = null;
            break L13;
          }
        }
        L14: {
          if (oc.field_e != null) {
            break L14;
          } else {
            if (!ck.field_e) {
              var9 = sd.field_x;
              sd.field_x = ac.field_s;
              ck.field_e = true;
              ac.field_s = var9;
              break L14;
            } else {
              L15: {
                if ((ll.a((byte) 12) ^ -1L) >= -30001L) {
                  kh.field_a = uj.field_e;
                  break L15;
                } else {
                  kh.field_a = hf.field_e;
                  break L15;
                }
              }
              ck.field_e = false;
              return 249;
            }
          }
        }
        return -1;
    }

    public final void a(int param0, byte param1, int param2, int param3, hk param4) {
        int var7 = 0;
        L0: {
          var7 = Geoblox.field_C;
          if (param1 == -20) {
            break L0;
          } else {
            ((pf) this).field_E = null;
            break L0;
          }
        }
        L1: {
          if (((pf) this).field_E == param4) {
            this.g(0);
            break L1;
          } else {
            if (((pf) this).field_M == param4) {
              jf.a((byte) 108);
              break L1;
            } else {
              if (((pf) this).field_G == param4) {
                if (!((pf) this).field_N) {
                  if (!((pf) this).field_I) {
                    hg.b(param1 + -23718);
                    break L1;
                  } else {
                    qc.g(0);
                    break L1;
                  }
                } else {
                  sd.h(param1 ^ -60);
                  break L1;
                }
              } else {
                break L1;
              }
            }
          }
        }
    }

    final static void a(int param0, pk param1) {
        try {
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            ClassNotFoundException var7 = null;
            InvalidClassException var7_ref = null;
            StreamCorruptedException var7_ref2 = null;
            OptionalDataException var7_ref3 = null;
            IllegalAccessException var7_ref4 = null;
            IllegalArgumentException var7_ref5 = null;
            java.lang.reflect.InvocationTargetException var7_ref6 = null;
            SecurityException var7_ref7 = null;
            IOException var7_ref8 = null;
            NullPointerException var7_ref9 = null;
            Exception var7_ref10 = null;
            Throwable var7_ref11 = null;
            int var7_int = 0;
            java.lang.reflect.Field var8 = null;
            int var9 = 0;
            Object[] var10 = null;
            int var11_int = 0;
            Object var11 = null;
            ObjectInputStream var12 = null;
            eg var13 = null;
            java.lang.reflect.Field var14 = null;
            java.lang.reflect.Field var15 = null;
            eg var17 = null;
            Object var18 = null;
            Object var19 = null;
            Object var21 = null;
            byte[][] var24 = null;
            java.lang.reflect.Field var25 = null;
            java.lang.reflect.Method var26 = null;
            java.lang.reflect.Method var27 = null;
            Throwable decompiledCaughtException = null;
            var18 = null;
            var19 = null;
            var21 = null;
            var13 = (eg) (Object) sl.field_k.g(0);
            var17 = var13;
            if (var17 == null) {
              return;
            } else {
              var4 = 2 % ((param0 - -26) / 62);
              var3 = 0;
              var5 = 0;
              L0: while (true) {
                if (var5 >= var17.field_f) {
                  if (var3 != 0) {
                    return;
                  } else {
                    var5 = param1.field_f;
                    param1.c((byte) 95, var17.field_m);
                    var6 = 0;
                    L1: while (true) {
                      if (var6 >= var17.field_f) {
                        var6++;
                      } else {
                        L2: {
                          if (var13.field_j[var6] != 0) {
                            param1.d((byte) 6, var13.field_j[var6]);
                            break L2;
                          } else {
                            try {
                              L3: {
                                var7_int = var13.field_k[var6];
                                if (-1 == (var7_int ^ -1)) {
                                  var15 = (java.lang.reflect.Field) var13.field_n[var6].field_b;
                                  var9 = var15.getInt((Object) null);
                                  param1.d((byte) 3, 0);
                                  param1.c((byte) 95, var9);
                                  break L3;
                                } else {
                                  if ((var7_int ^ -1) == -2) {
                                    var14 = (java.lang.reflect.Field) var13.field_n[var6].field_b;
                                    var8 = var14;
                                    var14.setInt((Object) null, var13.field_g[var6]);
                                    param1.d((byte) 124, 0);
                                    break L3;
                                  } else {
                                    if (2 == var7_int) {
                                      var25 = (java.lang.reflect.Field) var13.field_n[var6].field_b;
                                      var9 = var25.getModifiers();
                                      param1.d((byte) 126, 0);
                                      param1.c((byte) 95, var9);
                                      break L3;
                                    } else {
                                      break L3;
                                    }
                                  }
                                }
                              }
                              L4: {
                                if ((var7_int ^ -1) == -4) {
                                  var27 = (java.lang.reflect.Method) var13.field_i[var6].field_b;
                                  var24 = var13.field_o[var6];
                                  var10 = new Object[var24.length];
                                  var11_int = 0;
                                  L5: while (true) {
                                    if (var11_int >= var24.length) {
                                      var11 = var27.invoke((Object) null, var10);
                                      if (var11 != null) {
                                        if (!(var11 instanceof Number)) {
                                          if (var11 instanceof String) {
                                            param1.d((byte) 121, 2);
                                            param1.a((String) var11, 0);
                                            break L4;
                                          } else {
                                            param1.d((byte) -86, 4);
                                            break L4;
                                          }
                                        } else {
                                          param1.d((byte) 126, 1);
                                          param1.b((byte) 116, ((Number) var11).longValue());
                                          break L4;
                                        }
                                      } else {
                                        param1.d((byte) -88, 0);
                                        break L4;
                                      }
                                    } else {
                                      var12 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var24[var11_int]));
                                      var10[var11_int] = var12.readObject();
                                      var11_int++;
                                      continue L5;
                                    }
                                  }
                                } else {
                                  if ((var7_int ^ -1) != -5) {
                                    break L4;
                                  } else {
                                    var26 = (java.lang.reflect.Method) var13.field_i[var6].field_b;
                                    var9 = var26.getModifiers();
                                    param1.d((byte) 123, 0);
                                    param1.c((byte) 95, var9);
                                    break L4;
                                  }
                                }
                              }
                            } catch (java.lang.IllegalArgumentException decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var7_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                              param1.d((byte) 4, -14);
                            } catch (java.io.IOException decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var7_ref7 = (SecurityException) (Object) decompiledCaughtException;
                              param1.d((byte) 126, -17);
                            } catch (java.lang.NullPointerException decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var7_ref8 = (IOException) (Object) decompiledCaughtException;
                              param1.d((byte) 121, -18);
                            } catch (java.lang.Exception decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var7_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                              param1.d((byte) -100, -19);
                            } catch (java.lang.Throwable decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var7_ref10 = (Exception) (Object) decompiledCaughtException;
                              param1.d((byte) -74, -20);
                            }
                            break L2;
                          }
                        }
                        var7_ref11 = decompiledCaughtException;
                        param1.d((byte) -37, -21);
                        continue L1;
                      }
                    }
                  }
                } else {
                  L6: {
                    if (var13.field_n[var5] != null) {
                      L7: {
                        if (-3 != (var13.field_n[var5].field_a ^ -1)) {
                          break L7;
                        } else {
                          var13.field_j[var5] = -5;
                          break L7;
                        }
                      }
                      if (var13.field_n[var5].field_a != 0) {
                        break L6;
                      } else {
                        var3 = 1;
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                  if (var13.field_i[var5] != null) {
                    L8: {
                      if (2 == var13.field_i[var5].field_a) {
                        var13.field_j[var5] = -6;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    if (var13.field_i[var5].field_a == 0) {
                      var3 = 1;
                      var5++;
                      continue L0;
                    } else {
                      var5++;
                      continue L0;
                    }
                  } else {
                    var5++;
                    continue L0;
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void g(int param0) {
        if (!wh.e(param0)) {
            // ifle L56
            // if_icmplt L37
        } else {
            ef.a(((pf) this).field_P.field_s, (byte) 66, ((pf) this).field_J.field_s);
        }
    }

    pf(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (dh) null);
        ml var6 = null;
        m var7 = null;
        String var8 = null;
        od var9 = null;
        hd var12 = null;
        hd var13 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_16_0 = null;
        hk stackIn_16_1 = null;
        hk stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        hk stackIn_17_1 = null;
        hk stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        hk stackIn_18_1 = null;
        hk stackIn_18_2 = null;
        String stackIn_18_3 = null;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_15_0 = null;
        hk stackOut_15_1 = null;
        hk stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        hk stackOut_17_1 = null;
        hk stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        hk stackOut_16_1 = null;
        hk stackOut_16_2 = null;
        String stackOut_16_3 = null;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param3) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((pf) this).field_C = stackIn_3_1 != 0;
          ((pf) this).field_L = param1;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param2) {
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
        L2: {
          ((pf) this).field_N = stackIn_6_1 != 0;
          stackOut_6_0 = this;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (!param4) {
            stackOut_8_0 = this;
            stackOut_8_1 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            break L2;
          } else {
            stackOut_7_0 = this;
            stackOut_7_1 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            break L2;
          }
        }
        L3: {
          ((pf) this).field_I = stackIn_9_1 != 0;
          if (!((pf) this).field_N) {
            break L3;
          } else {
            L4: {
              if (((pf) this).field_C) {
                break L4;
              } else {
                if (!((pf) this).field_I) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            throw new IllegalStateException();
          }
        }
        L5: {
          ((pf) this).field_J = (dj) (Object) new hc(param0, (bb) this, 100);
          ((pf) this).field_P = (dj) (Object) new hc("", (bb) this, 20);
          if (!((pf) this).field_N) {
            L6: {
              ((pf) this).field_E = new hk(k.field_k, (bb) null);
              stackOut_15_0 = this;
              stackOut_15_1 = null;
              stackOut_15_2 = null;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              if (((pf) this).field_I) {
                stackOut_17_0 = this;
                stackOut_17_1 = null;
                stackOut_17_2 = null;
                stackOut_17_3 = ok.field_d;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                stackIn_18_3 = stackOut_17_3;
                break L6;
              } else {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = ll.field_b;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_18_2 = stackOut_16_2;
                stackIn_18_3 = stackOut_16_3;
                break L6;
              }
            }
            new hk(stackIn_18_3, (bb) null);
            ((pf) this).field_G = stackIn_18_1;
            if (!((pf) this).field_C) {
              break L5;
            } else {
              ((pf) this).field_M = new hk(se.field_m, (bb) this);
              break L5;
            }
          } else {
            ((pf) this).field_E = new hk(a.field_b, (bb) null);
            ((pf) this).field_G = new hk(rj.field_e, (bb) null);
            ((pf) this).field_J.field_D = false;
            break L5;
          }
        }
        L7: {
          ((pf) this).field_J.field_q = (dh) (Object) new ac(10000536);
          ((pf) this).field_P.field_q = (dh) (Object) new uh(10000536);
          var6 = new ml();
          ((pf) this).field_E.field_q = (dh) (Object) var6;
          if (((pf) this).field_G == null) {
            break L7;
          } else {
            ((pf) this).field_G.field_q = (dh) (Object) var6;
            break L7;
          }
        }
        L8: {
          if (((pf) this).field_M == null) {
            break L8;
          } else {
            ((pf) this).field_M.field_q = (dh) (Object) var6;
            break L8;
          }
        }
        L9: {
          ((pf) this).field_J.field_j = kk.field_v;
          if (null == ((pf) this).field_M) {
            break L9;
          } else {
            ((pf) this).field_M.field_j = ic.field_b;
            break L9;
          }
        }
        L10: {
          if (((pf) this).field_N) {
            ((pf) this).field_G.field_j = j.field_jb;
            break L10;
          } else {
            if (!((pf) this).field_I) {
              ((pf) this).field_G.field_q = (dh) (Object) new fh();
              break L10;
            } else {
              ((pf) this).field_G.field_j = vi.field_F;
              ((pf) this).field_G.field_q = (dh) (Object) new fh();
              break L10;
            }
          }
        }
        L11: {
          ((pf) this).field_m = 15;
          var7 = ng.field_F;
          if (((pf) this).field_L == null) {
            break L11;
          } else {
            ((pf) this).field_m = ((pf) this).field_m + (var7.b(((pf) this).field_L, ((pf) this).field_r + -40, var7.field_o) + 5);
            break L11;
          }
        }
        L12: {
          var8 = jj.field_c;
          var9 = th.a(k.c(120), 200);
          if (var9 != mb.field_b) {
            if (var9 != rl.field_W) {
              break L12;
            } else {
              var8 = bk.field_c;
              break L12;
            }
          } else {
            var8 = sl.field_b;
            break L12;
          }
        }
        L13: {
          var12 = new hd(10, ((pf) this).field_m, -20 + ((pf) this).field_r, 25, (el) (Object) ((pf) this).field_J, false, 80, 3, var7, 16777215, var8);
          ((pf) this).b((byte) -110, (el) (Object) new hd(10, ((pf) this).field_m, -20 + ((pf) this).field_r, 25, (el) (Object) ((pf) this).field_J, false, 80, 3, var7, 16777215, var8));
          ((pf) this).field_m = ((pf) this).field_m + (((el) (Object) var12).field_h - -5);
          var13 = new hd(10, ((pf) this).field_m, ((pf) this).field_r + -20, 25, (el) (Object) ((pf) this).field_P, false, 80, 3, var7, 16777215, qg.field_b);
          ((pf) this).b((byte) -120, (el) (Object) new hd(10, ((pf) this).field_m, ((pf) this).field_r + -20, 25, (el) (Object) ((pf) this).field_P, false, 80, 3, var7, 16777215, qg.field_b));
          ((pf) this).field_E.field_u = (bb) this;
          ((pf) this).field_m = ((pf) this).field_m + (((el) (Object) var13).field_h - -5);
          if (((pf) this).field_M == null) {
            break L13;
          } else {
            ((pf) this).field_M.field_u = (bb) this;
            break L13;
          }
        }
        L14: {
          if (((pf) this).field_G == null) {
            break L14;
          } else {
            ((pf) this).field_G.field_u = (bb) this;
            break L14;
          }
        }
        L15: {
          if (((pf) this).field_M != null) {
            ((pf) this).field_E.a(30, ((pf) this).field_r - 95, (byte) -92, ((pf) this).field_m, 85);
            ((pf) this).field_m = ((pf) this).field_m + 60;
            break L15;
          } else {
            ((pf) this).field_E.a(30, -10 + ((pf) this).field_r + -6, (byte) -33, ((pf) this).field_m, 8);
            ((pf) this).field_m = ((pf) this).field_m + 35;
            break L15;
          }
        }
        L16: {
          if (((pf) this).field_M == null) {
            break L16;
          } else {
            ((pf) this).field_M.a(30, -10 + ((pf) this).field_r - 6, (byte) -42, ((pf) this).field_m, 8);
            ((pf) this).field_m = ((pf) this).field_m + 35;
            break L16;
          }
        }
        L17: {
          if (((pf) this).field_G == null) {
            break L17;
          } else {
            L18: {
              if (((pf) this).field_N) {
                break L18;
              } else {
                if (((pf) this).field_I) {
                  break L18;
                } else {
                  ((pf) this).field_G.a(20, 40, (byte) -55, ((pf) this).field_m, 8);
                  ((pf) this).field_m = ((pf) this).field_m + 25;
                  break L17;
                }
              }
            }
            ((pf) this).field_G.a(30, -10 + (((pf) this).field_r - 6), (byte) -64, ((pf) this).field_m, 8);
            ((pf) this).field_m = ((pf) this).field_m + 35;
            break L17;
          }
        }
        L19: {
          ((pf) this).a(3 + ((pf) this).field_m, ((pf) this).field_r, (byte) -17, 0, 0);
          ((pf) this).b((byte) -83, (el) (Object) ((pf) this).field_E);
          if (null == ((pf) this).field_M) {
            break L19;
          } else {
            ((pf) this).b((byte) -111, (el) (Object) ((pf) this).field_M);
            break L19;
          }
        }
        L20: {
          if (((pf) this).field_G == null) {
            break L20;
          } else {
            ((pf) this).b((byte) -127, (el) (Object) ((pf) this).field_G);
            break L20;
          }
        }
    }

    final static mb h(byte param0) {
        if (param0 != -42) {
            mb discarded$0 = pf.h((byte) -98);
        }
        return new mb(vh.f(100), jg.d(7));
    }

    final void i(int param0) {
        ((pf) this).field_J.i((byte) 48);
        ((pf) this).field_P.i((byte) 116);
        int var2 = 40 % ((param0 - 17) / 38);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = false;
        field_H = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_K = new gk();
    }
}
