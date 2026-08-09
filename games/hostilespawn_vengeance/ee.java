/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ee {
    static nd field_a;
    private long field_c;
    private RandomAccessFile field_i;
    static nd field_h;
    private long field_f;
    static fk field_b;
    static bd field_g;
    static bd[] field_d;
    static int field_e;

    public static void b(int param0) {
        field_b = null;
        if (param0 != 0) {
            ee.b(121);
        }
        field_a = null;
        field_g = null;
        field_h = null;
        field_d = null;
    }

    final static int a(int param0, int param1, boolean param2) {
        if (param2) {
            return 95;
        }
        if ((ln.field_a.field_o[param1] ^ -1) <= -1) {
            return sa.a((byte) -118, param1) >> -1595378879;
        }
        return sa.a((byte) -115, param1);
    }

    final void c(int param0) throws IOException {
        if (param0 != -1) {
            String var3 = (String) null;
            ee.a(true, 30, true, -25, (String) null, (String) null);
        }
        if (this.field_i != null) {
            this.field_i.close();
            this.field_i = null;
        }
    }

    protected final void finalize() throws Throwable {
        if (!(this.field_i == null)) {
            System.out.println("");
            this.c(-1);
        }
    }

    final void a(int param0, long param1) throws IOException {
        this.field_i.seek(param1);
        if (param0 != -18127) {
            ee.b(35);
        }
        this.field_f = param1;
    }

    final int a(byte[] param0, boolean param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                field_b = (fk) null;
                break L1;
              }
            }
            L2: {
              var5_int = this.field_i.read(param0, param3, param2);
              if (-1 > (var5_int ^ -1)) {
                this.field_f = this.field_f + (long)var5_int;
                break L2;
              } else {
                break L2;
              }
            }
            stackIn_6_0 = var5_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("ee.H(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        if (param0 != 0) {
            return;
        }
        try {
            if (this.field_c < (long)param3 + this.field_f) {
                this.field_i.seek(this.field_c);
                this.field_i.write(1);
                throw new EOFException();
            }
            this.field_i.write(param1, param2, param3);
            this.field_f = this.field_f + (long)param3;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "ee.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static int a(boolean param0, int param1, boolean param2, int param3, String param4, String param5) {
        try {
            int stackIn_5_0 = 0;
            int stackIn_33_0 = 0;
            int stackIn_47_0 = 0;
            int stackIn_50_0 = 0;
            int stackIn_79_0 = 0;
            int stackIn_85_0 = 0;
            int stackIn_90_0 = 0;
            int stackIn_97_0 = 0;
            int stackIn_100_0 = 0;
            RuntimeException stackIn_103_0 = null;
            StringBuilder stackIn_103_1 = null;
            RuntimeException stackIn_104_0 = null;
            StringBuilder stackIn_104_1 = null;
            String stackIn_104_2 = null;
            StringBuilder stackIn_106_1 = null;
            StringBuilder stackIn_107_1 = null;
            String stackIn_107_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var6_int = 0;
            RuntimeException var6 = null;
            int var7 = 0;
            int var8 = 0;
            Throwable var8_ref_Throwable = null;
            int var9 = 0;
            String var10 = null;
            String var11 = null;
            String var12 = null;
            CharSequence var13 = null;
            var9 = HostileSpawn.field_I ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null == ag.field_t) {
                    if (me.a(param0, 107)) {
                      break L1;
                    } else {
                      stackIn_5_0 = -1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param3 <= -85) {
                    break L2;
                  } else {
                    var10 = (String) null;
                    ee.a(true, 46, false, -119, (String) null, (String) null);
                    break L2;
                  }
                }
                L3: {
                  if (rc.field_a != sa.field_c) {
                    break L3;
                  } else {
                    L4: {
                      if (!param0) {
                        t.field_i = mk.a(false, param5, 113, param4);
                        break L4;
                      } else {
                        var11 = (String) null;
                        t.field_i = ul.a(false, (String) null, ib.field_d, param5, 112);
                        break L4;
                      }
                    }
                    s.field_b.field_i = 0;
                    s.field_b.d(94, 14);
                    s.field_b.d(89, t.field_i.a(false).field_a);
                    mb.d(-1, -22370);
                    rc.field_a = ci.field_h;
                    break L3;
                  }
                }
                L5: {
                  if (rc.field_a != ci.field_h) {
                    break L5;
                  } else {
                    if (re.c((byte) 33, 1)) {
                      L6: {
                        var6_int = sc.field_g.l(32270);
                        if (var6_int != 0) {
                          jd.field_q = -1;
                          wa.field_k = var6_int;
                          rc.field_a = bi.field_a;
                          break L6;
                        } else {
                          rc.field_a = dc.field_e;
                          break L6;
                        }
                      }
                      sc.field_g.field_i = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L7: {
                  if (dc.field_e == rc.field_a) {
                    if (!re.c((byte) 33, 8)) {
                      break L7;
                    } else {
                      d.field_y = sc.field_g.c(10818);
                      sc.field_g.field_i = 0;
                      ln.a(t.field_i, (byte) -73, param1, param0, param2);
                      rc.field_a = ej.field_q;
                      break L7;
                    }
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (ej.field_q == rc.field_a) {
                    if (!re.c((byte) 33, 1)) {
                      break L8;
                    } else {
                      L9: {
                        var6_int = sc.field_g.l(32270);
                        wa.field_k = var6_int;
                        sc.field_g.field_i = 0;
                        fl.field_b = null;
                        if (-1 == (var6_int ^ -1)) {
                          break L9;
                        } else {
                          if ((var6_int ^ -1) != -2) {
                            if ((var6_int ^ -1) != -9) {
                              jd.field_q = -1;
                              rc.field_a = bi.field_a;
                              break L8;
                            } else {
                              le.c((byte) 67);
                              jn.field_C = false;
                              stackIn_33_0 = var6_int;
                              decompiledRegionSelector0 = 1;
                              break L0;
                            }
                          } else {
                            break L9;
                          }
                        }
                      }
                      rc.field_a = wj.field_N;
                      jd.field_q = -1;
                      break L8;
                    }
                  } else {
                    break L8;
                  }
                }
                L10: {
                  if (rc.field_a == wj.field_N) {
                    if (eb.a(13372)) {
                      L11: {
                        ib.field_d = sc.field_g.c(10818);
                        li.field_q = sc.field_g.l(32270);
                        sc.field_g.l(32270);
                        wb.field_S = sc.field_g.e(8);
                        var12 = sc.field_g.a((byte) 28);
                        var7 = sc.field_g.l(32270);
                        if (-1 != (1 & var7 ^ -1)) {
                          rd.a(-6);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        if (!param0) {
                          L13: {
                            if ((4 & var7) == 0) {
                              stackIn_47_0 = 0;
                              break L13;
                            } else {
                              stackIn_47_0 = 1;
                              break L13;
                            }
                          }
                          L14: {
                            wg.field_ub = stackIn_47_0 != 0;
                            if ((8 & var7) == 0) {
                              stackIn_50_0 = 0;
                              break L14;
                            } else {
                              stackIn_50_0 = 1;
                              break L14;
                            }
                          }
                          ei.field_t = stackIn_50_0 != 0;
                          if (!ei.field_t) {
                            break L12;
                          } else {
                            break L12;
                          }
                        } else {
                          break L12;
                        }
                      }
                      L15: {
                        if (sd.field_u) {
                          sc.field_g.l(32270);
                          sc.field_g.l(32270);
                          sc.field_g.d(8195);
                          l.field_a = sc.field_g.e(8);
                          qj.field_h = new byte[l.field_a];
                          var8 = 0;
                          L16: while (true) {
                            if (l.field_a <= var8) {
                              break L15;
                            } else {
                              qj.field_h[var8] = sc.field_g.j(0);
                              var8++;
                              continue L16;
                            }
                          }
                        } else {
                          break L15;
                        }
                      }
                      L17: {
                        qg.field_r = sc.field_g.o(32);
                        var13 = (CharSequence) ((Object) qg.field_r);
                        se.field_c = mf.a(false, var13);
                        ca.field_a = sc.field_g.l(32270);
                        rc.field_a = ci.field_d;
                        if (t.field_i.a(false) == uk.field_a) {
                          ub.field_b.a((byte) -126, bn.c(-1));
                          break L17;
                        } else {
                          if (t.field_i.a(false) == ln.field_l) {
                            wh.field_c.a((byte) -109, bn.c(-1));
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                      }
                      L18: {
                        jn.field_C = false;
                        if (var12 != null) {
                          gb.a((byte) 62, bn.c(-1), var12);
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      L19: {
                        L20: {
                          if (0 < wb.field_S) {
                            break L20;
                          } else {
                            if (wg.field_ub) {
                              break L20;
                            } else {
                              try {
                                L21: {
                                  a.a("unzap", bn.c(-1), -124);
                                  break L21;
                                }
                              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                                decompiledCaughtException = decompiledCaughtParameter0;
                                L22: {
                                  var8_ref_Throwable = decompiledCaughtException;
                                  break L22;
                                }
                              }
                              break L19;
                            }
                          }
                        }
                        try {
                          L23: {
                            a.a(bn.c(-1), new Object[]{pm.a(ib.field_d, (byte) 100)}, "zap", -13730);
                            break L23;
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L24: {
                            var8_ref_Throwable = decompiledCaughtException;
                            break L24;
                          }
                        }
                        break L19;
                      }
                      L25: {
                        if (-1 <= (wb.field_S ^ -1)) {
                          break L25;
                        } else {
                          wc.field_g = true;
                          break L25;
                        }
                      }
                      s.field_b.a(he.field_s, 8);
                      var8 = 0;
                      L26: while (true) {
                        if (var8 >= 4) {
                          sc.field_g.a(he.field_s, 8);
                          stackIn_79_0 = wa.field_k;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          he.field_s[var8] = he.field_s[var8] + 50;
                          var8++;
                          continue L26;
                        }
                      }
                    } else {
                      break L10;
                    }
                  } else {
                    break L10;
                  }
                }
                L27: {
                  if (bi.field_a != rc.field_a) {
                    break L27;
                  } else {
                    if (!eb.a(13372)) {
                      break L27;
                    } else {
                      L28: {
                        le.c((byte) 83);
                        if (wa.field_k != 7) {
                          break L28;
                        } else {
                          if (jn.field_C) {
                            break L28;
                          } else {
                            jn.field_C = true;
                            stackIn_85_0 = -1;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          }
                        }
                      }
                      L29: {
                        if (7 == wa.field_k) {
                          wa.field_k = 3;
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                      km.field_x = sc.field_g.o(32);
                      jn.field_C = false;
                      stackIn_90_0 = wa.field_k;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                }
                L30: {
                  if (ag.field_t != null) {
                    break L30;
                  } else {
                    if (!jn.field_C) {
                      var6_int = cb.field_c;
                      cb.field_c = fh.field_b;
                      fh.field_b = var6_int;
                      jn.field_C = true;
                      break L30;
                    } else {
                      L31: {
                        if (m.a(true) <= 30000L) {
                          km.field_x = fl.field_d;
                          break L31;
                        } else {
                          km.field_x = od.field_H;
                          break L31;
                        }
                      }
                      jn.field_C = false;
                      stackIn_97_0 = 3;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  }
                }
                stackIn_100_0 = -1;
                decompiledRegionSelector0 = 6;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L32: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_103_0 = (RuntimeException) (var6);

                stackIn_103_1 = new StringBuilder().append("ee.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

                if (param4 == null) {
                  stackIn_104_0 = (RuntimeException) ((Object) stackIn_103_0);
                  stackIn_104_1 = (StringBuilder) ((Object) stackIn_103_1);
                  stackIn_104_2 = "null";
                  break L32;
                } else {
                  stackIn_104_0 = (RuntimeException) ((Object) stackIn_103_0);
                  stackIn_104_1 = (StringBuilder) ((Object) stackIn_103_1);
                  stackIn_104_2 = "{...}";
                  break L32;
                }
              }
              L33: {


                stackIn_106_1 = ((StringBuilder) (Object) stackIn_104_1).append(stackIn_104_2).append(',');

                if (param5 == null) {
                  stackIn_104_0 = (RuntimeException) ((Object) stackIn_104_0);
                  stackIn_107_1 = (StringBuilder) ((Object) stackIn_106_1);
                  stackIn_107_2 = "null";
                  break L33;
                } else {
                  stackIn_104_0 = (RuntimeException) ((Object) stackIn_104_0);
                  stackIn_107_1 = (StringBuilder) ((Object) stackIn_106_1);
                  stackIn_107_2 = "{...}";
                  break L33;
                }
              }
              throw wg.a((Throwable) ((Object) stackIn_104_0), stackIn_107_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_5_0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return stackIn_33_0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  return stackIn_79_0;
                } else {
                  if (decompiledRegionSelector0 == 3) {
                    return stackIn_85_0;
                  } else {
                    if (decompiledRegionSelector0 == 4) {
                      return stackIn_90_0;
                    } else {
                      if (decompiledRegionSelector0 == 5) {
                        return stackIn_97_0;
                      } else {
                        return stackIn_100_0;
                      }
                    }
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

    final long a(int param0) throws IOException {
        if (param0 != -1) {
            return -92L;
        }
        return this.field_i.length();
    }

    ee(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if ((param2 ^ -1L) == 0L) {
                param2 = 9223372036854775807L;
            }
            if ((param0.length() ^ -1L) < (param2 ^ -1L)) {
                param0.delete();
            }
            this.field_i = new RandomAccessFile(param0, param1);
            this.field_f = 0L;
            this.field_c = param2;
            var5_int = this.field_i.read();
            if ((var5_int ^ -1) != 0 && !param1.equals("r")) {
                this.field_i.seek(0L);
                this.field_i.write(var5_int);
            }
            this.field_i.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "ee.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_a = new nd(15, 0, 1, 0);
        field_h = new nd(8, 0, 4, 1);
        field_b = new fk();
        field_e = 0;
    }
}
