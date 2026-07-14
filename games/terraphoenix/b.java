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
        if (null != ((b) this).field_d) {
            ((b) this).field_d.close();
            ((b) this).field_d = null;
        }
        if (param0 <= 113) {
            Object var3 = null;
            boolean discarded$0 = b.a(false, (String) null);
        }
    }

    protected final void finalize() throws Throwable {
        if (((b) this).field_d != null) {
            System.out.println("");
            ((b) this).a(122);
        }
    }

    final int a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5 = ((b) this).field_d.read(param0, param2, param1);
        if (!(var5 <= 0)) {
            ((b) this).field_a = ((b) this).field_a + (long)var5;
        }
        if (param3 != 12955) {
            Object var6 = null;
            b.a((byte) 62, (String) null);
        }
        return var5;
    }

    final static boolean a(boolean param0, String param1) {
        if (!param0) {
            return true;
        }
        return dd.a((byte) 104, param1) != null ? true : false;
    }

    final long b(byte param0) throws IOException {
        int var2 = -104 % ((-19 - param0) / 37);
        return ((b) this).field_d.length();
    }

    public static void b(int param0) {
        if (param0 != 1) {
            field_c = null;
        }
        field_f = null;
        field_c = null;
        field_g = null;
    }

    final void a(long param0, byte param1) throws IOException {
        ((b) this).field_d.seek(param0);
        ((b) this).field_a = param0;
        if (param1 < 64) {
            Object var5 = null;
            boolean discarded$0 = b.a(true, (String) null);
        }
    }

    final static boolean a(byte param0) {
        wf var1 = null;
        int var2 = 0;
        int var3 = 0;
        wf var4 = null;
        L0: {
          var3 = Terraphoenix.field_V;
          var4 = (wf) (Object) rd.field_k.d(9272);
          var1 = var4;
          if (param0 <= -86) {
            break L0;
          } else {
            boolean discarded$2 = b.a((byte) -125);
            break L0;
          }
        }
        if (var1 == null) {
          return false;
        } else {
          var2 = 0;
          L1: while (true) {
            if (var1.field_p > var2) {
              L2: {
                if (var4.field_s[var2] == null) {
                  break L2;
                } else {
                  if (var4.field_s[var2].field_d != 0) {
                    break L2;
                  } else {
                    return false;
                  }
                }
              }
              if (null != var4.field_j[var2]) {
                if (-1 == (var4.field_j[var2].field_d ^ -1)) {
                  return false;
                } else {
                  var2++;
                  continue L1;
                }
              } else {
                var2++;
                continue L1;
              }
            } else {
              return true;
            }
          }
        }
    }

    final static void a(byte param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var3 = Terraphoenix.field_V;
          ga.field_j = ga.field_j + 1;
          if ((tf.field_k ^ -1) != 0) {
            break L0;
          } else {
            if (-1 == ll.field_a) {
              tf.field_k = ef.field_j;
              ll.field_a = jb.field_b;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          L2: {
            if (param1 != null) {
              if (!param1.equals((Object) (Object) cc.field_j)) {
                break L2;
              } else {
                break L1;
              }
            } else {
              if (null != cc.field_j) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (!uj.field_c) {
              if (qd.field_l <= ga.field_j) {
                if (qd.field_l - -fh.field_h > ga.field_j) {
                  stackOut_15_0 = 1;
                  stackIn_17_0 = stackOut_15_0;
                  break L3;
                } else {
                  stackOut_14_0 = 0;
                  stackIn_17_0 = stackOut_14_0;
                  break L3;
                }
              } else {
                stackOut_12_0 = 0;
                stackIn_17_0 = stackOut_12_0;
                break L3;
              }
            } else {
              stackOut_10_0 = 0;
              stackIn_17_0 = stackOut_10_0;
              break L3;
            }
          }
          L4: {
            var2 = stackIn_17_0;
            if (param1 != null) {
              if (!uj.field_c) {
                if (var2 != 0) {
                  ga.field_j = qd.field_l;
                  break L4;
                } else {
                  ga.field_j = 0;
                  break L4;
                }
              } else {
                ga.field_j = qd.field_l;
                break L4;
              }
            } else {
              ga.field_j = 0;
              break L4;
            }
          }
          L5: {
            if (param1 == null) {
              if (var2 != 0) {
                uj.field_c = true;
                break L5;
              } else {
                break L5;
              }
            } else {
              uj.field_c = false;
              break L5;
            }
          }
          ea.field_m = tf.field_k;
          lb.field_b = ll.field_a;
          break L1;
        }
        L6: {
          if (uj.field_c) {
            break L6;
          } else {
            if (qd.field_l <= ga.field_j) {
              break L6;
            } else {
              if (ja.field_l) {
                ga.field_j = 0;
                lb.field_b = ll.field_a;
                ea.field_m = tf.field_k;
                break L6;
              } else {
                break L6;
              }
            }
          }
        }
        L7: {
          cc.field_j = param1;
          ll.field_a = -1;
          var2 = 92 / ((param0 - -28) / 44);
          if (!uj.field_c) {
            break L7;
          } else {
            if (ga.field_j == dh.field_l) {
              ga.field_j = 0;
              uj.field_c = false;
              break L7;
            } else {
              break L7;
            }
          }
        }
        tf.field_k = -1;
    }

    final void a(int param0, byte[] param1, int param2, byte param3) throws IOException {
        if (param3 >= -62) {
            return;
        }
        if (!((((b) this).field_e ^ -1L) <= ((long)param0 + ((b) this).field_a ^ -1L))) {
            ((b) this).field_d.seek(((b) this).field_e);
            ((b) this).field_d.write(1);
            throw new EOFException();
        }
        ((b) this).field_d.write(param1, param2, param0);
        ((b) this).field_a = ((b) this).field_a + (long)param0;
    }

    final static void a(byte[] param0, byte param1) {
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
        Object var16 = null;
        dh var17 = null;
        dh var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        byte[] var26 = null;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        L0: {
          var15 = Terraphoenix.field_V;
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
            break L0;
          } else {
            var16 = null;
            b.a((byte) 57, (String) null);
            break L0;
          }
        }
        var3 = (255 & var18.a(-16384)) - -1;
        var4 = 0;
        L1: while (true) {
          L2: {
            if (var4 >= kf.field_b) {
              break L2;
            } else {
              ha.field_s[var4] = var17.i(-25578);
              var4++;
              if (0 == 0) {
                continue L1;
              } else {
                break L2;
              }
            }
          }
          var4 = 0;
          L3: while (true) {
            L4: {
              if (kf.field_b <= var4) {
                break L4;
              } else {
                hj.field_K[var4] = var17.i(-25578);
                var4++;
                if (0 == 0) {
                  continue L3;
                } else {
                  break L4;
                }
              }
            }
            var4 = 0;
            L5: while (true) {
              L6: {
                if (kf.field_b <= var4) {
                  break L6;
                } else {
                  sb.field_m[var4] = var17.i(-25578);
                  var4++;
                  if (0 == 0) {
                    continue L5;
                  } else {
                    break L6;
                  }
                }
              }
              var4 = 0;
              L7: while (true) {
                L8: {
                  if (var4 >= kf.field_b) {
                    break L8;
                  } else {
                    rf.field_p[var4] = var17.i(-25578);
                    var4++;
                    if (0 == 0) {
                      continue L7;
                    } else {
                      break L8;
                    }
                  }
                }
                var18.field_k = -((-1 + var3) * 3) + (-7 + param0.length) + -(kf.field_b * 8);
                wb.field_a = new int[var3];
                var4 = 1;
                L9: while (true) {
                  L10: {
                    if (var4 >= var3) {
                      break L10;
                    } else {
                      L11: {
                        wb.field_a[var4] = var17.d((byte) -113);
                        if ((wb.field_a[var4] ^ -1) != -1) {
                          break L11;
                        } else {
                          wb.field_a[var4] = 1;
                          break L11;
                        }
                      }
                      var4++;
                      if (0 == 0) {
                        continue L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  var18.field_k = 0;
                  var4 = 0;
                  L12: while (true) {
                    L13: {
                      if (kf.field_b <= var4) {
                        break L13;
                      } else {
                        var5 = sb.field_m[var4];
                        var6 = rf.field_p[var4];
                        var7 = var6 * var5;
                        var25 = new byte[var7];
                        var23 = var25;
                        var21 = var23;
                        var19 = var21;
                        var8 = var19;
                        qc.field_b[var4] = var25;
                        var26 = new byte[var7];
                        var24 = var26;
                        var22 = var24;
                        var20 = var22;
                        var9 = var20;
                        ug.field_c[var4] = var26;
                        var10 = 0;
                        var11 = var18.a(-16384);
                        stackOut_25_0 = 0;
                        stackOut_25_1 = var11 & 1;
                        stackIn_27_0 = stackOut_25_0;
                        stackIn_27_1 = stackOut_25_1;
                        L14: {
                          L15: {
                            if (stackIn_27_0 == stackIn_27_1) {
                              break L15;
                            } else {
                              var12 = 0;
                              L16: while (true) {
                                L17: {
                                  if (var5 <= var12) {
                                    break L17;
                                  } else {
                                    var13 = 0;
                                    L18: while (true) {
                                      L19: {
                                        if (var6 <= var13) {
                                          break L19;
                                        } else {
                                          var8[var12 + var13 * var5] = var17.f(2);
                                          var13++;
                                          if (0 == 0) {
                                            continue L18;
                                          } else {
                                            break L19;
                                          }
                                        }
                                      }
                                      var12++;
                                      if (0 == 0) {
                                        continue L16;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                }
                                if (0 == (var11 & 2)) {
                                  break L14;
                                } else {
                                  var12 = 0;
                                  L20: while (true) {
                                    L21: {
                                      if (var12 >= var5) {
                                        break L21;
                                      } else {
                                        var13 = 0;
                                        L22: while (true) {
                                          L23: {
                                            if (var13 >= var6) {
                                              break L23;
                                            } else {
                                              L24: {
                                                var9[var12 + var13 * var5] = var17.f(2);
                                                var14 = var17.f(2);
                                                stackOut_40_0 = var10;
                                                stackIn_42_0 = stackOut_40_0;
                                                stackIn_41_0 = stackOut_40_0;
                                                if ((var14 ^ -1) == 0) {
                                                  stackOut_42_0 = stackIn_42_0;
                                                  stackOut_42_1 = 0;
                                                  stackIn_43_0 = stackOut_42_0;
                                                  stackIn_43_1 = stackOut_42_1;
                                                  break L24;
                                                } else {
                                                  stackOut_41_0 = stackIn_41_0;
                                                  stackOut_41_1 = 1;
                                                  stackIn_43_0 = stackOut_41_0;
                                                  stackIn_43_1 = stackOut_41_1;
                                                  break L24;
                                                }
                                              }
                                              var10 = stackIn_43_0 | stackIn_43_1;
                                              var13++;
                                              if (0 == 0) {
                                                continue L22;
                                              } else {
                                                break L23;
                                              }
                                            }
                                          }
                                          var12++;
                                          if (0 == 0) {
                                            continue L20;
                                          } else {
                                            break L21;
                                          }
                                        }
                                      }
                                    }
                                    if (0 == 0) {
                                      break L14;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var12 = 0;
                          L25: while (true) {
                            L26: {
                              if (var12 >= var7) {
                                break L26;
                              } else {
                                var8[var12] = var17.f(2);
                                var12++;
                                if (0 == 0) {
                                  continue L25;
                                } else {
                                  break L26;
                                }
                              }
                            }
                            if (0 == (2 & var11)) {
                              break L14;
                            } else {
                              var12 = 0;
                              L27: while (true) {
                                if (var12 >= var7) {
                                  break L14;
                                } else {
                                  L28: {
                                    var9[var12] = var17.f(2);
                                    var13 = var17.f(2);
                                    stackOut_53_0 = var10;
                                    stackIn_55_0 = stackOut_53_0;
                                    stackIn_54_0 = stackOut_53_0;
                                    if (0 == (var13 ^ -1)) {
                                      stackOut_55_0 = stackIn_55_0;
                                      stackOut_55_1 = 0;
                                      stackIn_56_0 = stackOut_55_0;
                                      stackIn_56_1 = stackOut_55_1;
                                      break L28;
                                    } else {
                                      stackOut_54_0 = stackIn_54_0;
                                      stackOut_54_1 = 1;
                                      stackIn_56_0 = stackOut_54_0;
                                      stackIn_56_1 = stackOut_54_1;
                                      break L28;
                                    }
                                  }
                                  var10 = stackIn_56_0 | stackIn_56_1;
                                  var12++;
                                  if (0 == 0) {
                                    continue L27;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                            }
                          }
                        }
                        aa.field_k[var4] = var10 != 0;
                        var4++;
                        if (0 == 0) {
                          continue L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
          }
        }
    }

    b(File param0, String param1, long param2) throws IOException {
        if (param2 == -1L) {
            param2 = 9223372036854775807L;
        }
        if ((param2 ^ -1L) > (param0.length() ^ -1L)) {
            boolean discarded$0 = param0.delete();
        }
        ((b) this).field_d = new RandomAccessFile(param0, param1);
        ((b) this).field_e = param2;
        ((b) this).field_a = 0L;
        int var5 = ((b) this).field_d.read();
        if (0 != (var5 ^ -1)) {
            if (!param1.equals((Object) (Object) "r")) {
                ((b) this).field_d.seek(0L);
                ((b) this).field_d.write(var5);
            }
        }
        ((b) this).field_d.seek(0L);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Terra Phoenix";
        field_g = new String[]{"Sniper", "Squaddie", "Veteran", "Commando", "Officer", "Soldier's Soldier", "Grenadier", "Demolitions", "Secret Agent", "Reconstruction", "Hunter", "Dominator", "Defender of Civilisation", "Technophobe", "Who Dares, Wins", "Squiddie Basher", "Zombie Basher"};
        field_f = new oa();
    }
}
