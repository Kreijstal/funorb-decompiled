/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class b {
    private RandomAccessFile field_d;
    static oa field_f;
    static String field_c;
    static String[] field_g;
    private long field_a;
    private long field_e;
    static int field_b;

    final void a(int param0) throws IOException {
        if (null != this.field_d) {
            this.field_d.close();
            this.field_d = null;
        }
        if (param0 <= 113) {
            String var3 = (String) null;
            b.a(false, (String) null);
        }
    }

    protected final void finalize() throws Throwable {
        if (this.field_d != null) {
            System.out.println("");
            this.a(122);
        }
    }

    final int a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        String var6 = null;
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
              var5_int = this.field_d.read(param0, param2, param1);
              if (var5_int > 0) {
                this.field_a = this.field_a + (long)var5_int;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param3 == 12955) {
                break L2;
              } else {
                var6 = (String) null;
                b.a((byte) 62, (String) null);
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

            stackIn_9_1 = new StringBuilder().append("b.A(");

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
          throw qk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final static boolean a(boolean param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0) {
              L1: {
                if (dd.a((byte) 104, param1) == null) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("b.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    final long b(byte param0) throws IOException {
        int var2 = -104 % ((-19 - param0) / 37);
        return this.field_d.length();
    }

    public static void b(int param0) {
        if (param0 != 1) {
            field_c = (String) null;
        }
        field_f = null;
        field_c = null;
        field_g = null;
    }

    final void a(long param0, byte param1) throws IOException {
        this.field_d.seek(param0);
        this.field_a = param0;
        if (param1 < 64) {
            String var5 = (String) null;
            b.a(true, (String) null);
        }
    }

    final static boolean a(byte param0) {
        wf var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        wf var4 = null;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var4 = (wf) ((Object) rd.field_k.d(9272));
              var1 = var4;
              if (param0 <= -86) {
                break L1;
              } else {
                b.a((byte) -125);
                break L1;
              }
            }
            if (var1 == null) {
              stackIn_6_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var2 = 0;
              L2: while (true) {
                if (var1.field_p <= var2) {
                  stackIn_19_0 = 1;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  L3: {
                    if (var4.field_s[var2] == null) {
                      break L3;
                    } else {
                      if (var4.field_s[var2].field_d != 0) {
                        break L3;
                      } else {
                        stackIn_12_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  L4: {
                    if (null == var4.field_j[var2]) {
                      break L4;
                    } else {
                      if (-1 != (var4.field_j[var2].field_d ^ -1)) {
                        break L4;
                      } else {
                        stackIn_16_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                  var2++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1_ref), "b.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              return stackIn_19_0 != 0;
            }
          }
        }
    }

    final static void a(byte param0, String param1) {
        int stackIn_18_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              ga.field_j = ga.field_j + 1;
              if ((tf.field_k ^ -1) != 0) {
                break L1;
              } else {
                if (-1 == ll.field_a) {
                  tf.field_k = ef.field_j;
                  ll.field_a = jb.field_b;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (param1 != null) {
                  if (!param1.equals(cc.field_j)) {
                    break L3;
                  } else {
                    break L2;
                  }
                } else {
                  if (null != cc.field_j) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!uj.field_c) {
                  if (qd.field_l <= ga.field_j) {
                    if (qd.field_l - -fh.field_h > ga.field_j) {
                      stackIn_18_0 = 1;
                      break L4;
                    } else {
                      stackIn_18_0 = 0;
                      break L4;
                    }
                  } else {
                    stackIn_18_0 = 0;
                    break L4;
                  }
                } else {
                  stackIn_18_0 = 0;
                  break L4;
                }
              }
              L5: {
                L6: {
                  var2_int = stackIn_18_0;
                  if (param1 == null) {
                    break L6;
                  } else {
                    L7: {
                      if (uj.field_c) {
                        break L7;
                      } else {
                        if (var2_int != 0) {
                          break L7;
                        } else {
                          break L6;
                        }
                      }
                    }
                    ga.field_j = qd.field_l;
                    break L5;
                  }
                }
                ga.field_j = 0;
                break L5;
              }
              L8: {
                if (param1 == null) {
                  if (var2_int != 0) {
                    uj.field_c = true;
                    break L8;
                  } else {
                    break L8;
                  }
                } else {
                  uj.field_c = false;
                  break L8;
                }
              }
              ea.field_m = tf.field_k;
              lb.field_b = ll.field_a;
              break L2;
            }
            L9: {
              if (uj.field_c) {
                break L9;
              } else {
                if (qd.field_l <= ga.field_j) {
                  break L9;
                } else {
                  if (ja.field_l) {
                    ga.field_j = 0;
                    lb.field_b = ll.field_a;
                    ea.field_m = tf.field_k;
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
            }
            L10: {
              cc.field_j = param1;
              ll.field_a = -1;
              var2_int = 92 / ((param0 - -28) / 44);
              if (!uj.field_c) {
                break L10;
              } else {
                if (ga.field_j == dh.field_l) {
                  ga.field_j = 0;
                  uj.field_c = false;
                  break L10;
                } else {
                  break L10;
                }
              }
            }
            tf.field_k = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var2);

            stackIn_43_1 = new StringBuilder().append("b.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L11;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L11;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ')');
        }
    }

    final void a(int param0, byte[] param1, int param2, byte param3) throws IOException {
        if (param3 >= -62) {
            return;
        }
        try {
            if (!((this.field_e ^ -1L) <= ((long)param0 + this.field_a ^ -1L))) {
                this.field_d.seek(this.field_e);
                this.field_d.write(1);
                throw new EOFException();
            }
            this.field_d.write(param1, param2, param0);
            this.field_a = this.field_a + (long)param0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "b.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(byte[] param0, byte param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        dh var17 = null;
        dh var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        var15 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var17 = new dh(param0);
              var18 = var17;
              var18.field_k = -2 + param0.length;
              kf.field_b = var18.i(-25578);
              ug.field_c = new byte[kf.field_b][];
              sb.field_m = new int[kf.field_b];
              hj.field_K = new int[kf.field_b];
              ha.field_s = new int[kf.field_b];
              aa.field_k = new boolean[kf.field_b];
              qc.field_b = new byte[kf.field_b][];
              rf.field_p = new int[kf.field_b];
              var18.field_k = param0.length + (-7 - kf.field_b * 8);
              ah.field_A = var18.i(-25578);
              sb.field_j = var18.i(-25578);
              if (param1 <= -58) {
                break L1;
              } else {
                var16 = (String) null;
                b.a((byte) 57, (String) null);
                break L1;
              }
            }
            var3 = (255 & var18.a(-16384)) - -1;
            var4 = 0;
            L2: while (true) {
              if (var4 >= kf.field_b) {
                var4 = 0;
                L3: while (true) {
                  if (kf.field_b <= var4) {
                    var4 = 0;
                    L4: while (true) {
                      if (kf.field_b <= var4) {
                        var4 = 0;
                        L5: while (true) {
                          if (var4 >= kf.field_b) {
                            var18.field_k = -((-1 + var3) * 3) + (-7 + param0.length) + -(kf.field_b * 8);
                            wb.field_a = new int[var3];
                            var4 = 1;
                            L6: while (true) {
                              if (var4 >= var3) {
                                var18.field_k = 0;
                                var4 = 0;
                                L7: while (true) {
                                  if (kf.field_b <= var4) {
                                    break L0;
                                  } else {
                                    var5 = sb.field_m[var4];
                                    var6 = rf.field_p[var4];
                                    var7 = var6 * var5;
                                    var21 = new byte[var7];
                                    var19 = var21;
                                    var8 = var19;
                                    qc.field_b[var4] = var21;
                                    var22 = new byte[var7];
                                    var20 = var22;
                                    var9 = var20;
                                    ug.field_c[var4] = var22;
                                    var10 = 0;
                                    var11 = var18.a(-16384);
                                    stackIn_24_0 = 0;
                                    stackIn_24_1 = var11 & 1;
                                    L8: {
                                      if (stackIn_24_0 == stackIn_24_1) {
                                        var12 = 0;
                                        L9: while (true) {
                                          if (var12 >= var7) {
                                            if (0 == (2 & var11)) {
                                              break L8;
                                            } else {
                                              var12 = 0;
                                              L10: while (true) {
                                                if (var12 >= var7) {
                                                  break L8;
                                                } else {
                                                  L11: {
                                                    dupTemp$0 = var18.f(2);
                                                    var9[var12] = dupTemp$0;
                                                    var13 = dupTemp$0;
                                                    stackIn_49_0 = var10;

                                                    if (0 == (var13 ^ -1)) {
                                                      stackIn_50_0 = stackIn_49_0;
                                                      stackIn_50_1 = 0;
                                                      break L11;
                                                    } else {
                                                      stackIn_50_0 = stackIn_49_0;
                                                      stackIn_50_1 = 1;
                                                      break L11;
                                                    }
                                                  }
                                                  var10 = stackIn_50_0 | stackIn_50_1;
                                                  var12++;
                                                  continue L10;
                                                }
                                              }
                                            }
                                          } else {
                                            var8[var12] = var18.f(2);
                                            var12++;
                                            continue L9;
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L12: while (true) {
                                          if (var5 <= var12) {
                                            if (0 == (var11 & 2)) {
                                              break L8;
                                            } else {
                                              var12 = 0;
                                              L13: while (true) {
                                                if (var12 >= var5) {
                                                  break L8;
                                                } else {
                                                  var13 = 0;
                                                  L14: while (true) {
                                                    if (var13 >= var6) {
                                                      var12++;
                                                      continue L13;
                                                    } else {
                                                      L15: {
                                                        dupTemp$1 = var18.f(2);
                                                        var9[var12 + var13 * var5] = dupTemp$1;
                                                        var14 = dupTemp$1;
                                                        stackIn_38_0 = var10;

                                                        if ((var14 ^ -1) == 0) {
                                                          stackIn_39_0 = stackIn_38_0;
                                                          stackIn_39_1 = 0;
                                                          break L15;
                                                        } else {
                                                          stackIn_39_0 = stackIn_38_0;
                                                          stackIn_39_1 = 1;
                                                          break L15;
                                                        }
                                                      }
                                                      var10 = stackIn_39_0 | stackIn_39_1;
                                                      var13++;
                                                      continue L14;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            var13 = 0;
                                            L16: while (true) {
                                              if (var6 <= var13) {
                                                var12++;
                                                continue L12;
                                              } else {
                                                var8[var12 + var13 * var5] = var18.f(2);
                                                var13++;
                                                continue L16;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    aa.field_k[var4] = var10 != 0;
                                    var4++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L17: {
                                  wb.field_a[var4] = var18.d((byte) -113);
                                  if ((wb.field_a[var4] ^ -1) != -1) {
                                    break L17;
                                  } else {
                                    wb.field_a[var4] = 1;
                                    break L17;
                                  }
                                }
                                var4++;
                                continue L6;
                              }
                            }
                          } else {
                            rf.field_p[var4] = var18.i(-25578);
                            var4++;
                            continue L5;
                          }
                        }
                      } else {
                        sb.field_m[var4] = var18.i(-25578);
                        var4++;
                        continue L4;
                      }
                    }
                  } else {
                    hj.field_K[var4] = var18.i(-25578);
                    var4++;
                    continue L3;
                  }
                }
              } else {
                ha.field_s[var4] = var17.i(-25578);
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var2 = decompiledCaughtException;
            stackIn_55_0 = (RuntimeException) (var2);

            stackIn_55_1 = new StringBuilder().append("b.I(");

            if (param0 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "null";
              break L18;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "{...}";
              break L18;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ',' + param1 + ')');
        }
    }

    b(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if ((param2 ^ -1L) > (param0.length() ^ -1L)) {
                param0.delete();
            }
            this.field_d = new RandomAccessFile(param0, param1);
            this.field_e = param2;
            this.field_a = 0L;
            var5_int = this.field_d.read();
            if (0 != (var5_int ^ -1) && !param1.equals("r")) {
                this.field_d.seek(0L);
                this.field_d.write(var5_int);
            }
            this.field_d.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "b.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_c = "Terra Phoenix";
        field_g = new String[]{"Sniper", "Squaddie", "Veteran", "Commando", "Officer", "Soldier's Soldier", "Grenadier", "Demolitions", "Secret Agent", "Reconstruction", "Hunter", "Dominator", "Defender of Civilisation", "Technophobe", "Who Dares, Wins", "Squiddie Basher", "Zombie Basher"};
        field_f = new oa();
    }
}
