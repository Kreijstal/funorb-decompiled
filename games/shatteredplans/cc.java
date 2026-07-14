/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cc extends ml {
    private go field_o;
    static String field_p;
    private go field_q;
    static int field_n;

    cc(go param0, go param1, go param2) {
        super(param0);
        ((cc) this).field_o = param2;
        ((cc) this).field_q = param1;
    }

    private final boolean b(boolean param0, String param1) {
        String var3 = null;
        int var5 = 0;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        String var12 = null;
        String var13 = null;
        var3 = ((cc) this).field_o.field_s.toLowerCase();
        if (param0) {
          var11 = param1.toLowerCase();
          if ((var3.length() ^ -1) < -1) {
            if ((var11.length() ^ -1) < -1) {
              var5 = var3.lastIndexOf("@");
              if (0 <= var5) {
                if (var5 < var3.length() + -1) {
                  var12 = var3.substring(0, var5);
                  var13 = var3.substring(var5 - -1);
                  if (var11.indexOf(var12) < 0) {
                    if (-1 < (var11.indexOf(var13) ^ -1)) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          cc.a(80, -33, 98, true);
          var8 = param1.toLowerCase();
          if ((var3.length() ^ -1) < -1) {
            if ((var8.length() ^ -1) < -1) {
              var5 = var3.lastIndexOf("@");
              if (0 <= var5) {
                if (var5 < var3.length() + -1) {
                  var9 = var3.substring(0, var5);
                  var10 = var3.substring(var5 - -1);
                  if (var8.indexOf(var9) < 0) {
                    if (-1 < (var8.indexOf(var10) ^ -1)) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        int var4 = 0;
        qr var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        qr var10 = null;
        nf var11 = null;
        qr var15 = null;
        qr var16 = null;
        qr var18 = null;
        qr var20 = null;
        nf var22 = null;
        qr var29 = null;
        nf var30 = null;
        qr var31 = null;
        qr var33 = null;
        qr var35 = null;
        qr var39 = null;
        nf var40 = null;
        qr var41 = null;
        qr var43 = null;
        qr var45 = null;
        qr var57 = null;
        nf var58 = null;
        L0: {
          var7 = ShatteredPlansClient.field_F ? 1 : 0;
          if (ed.field_f > pg.field_J) {
            pg.field_J = pg.field_J + 1;
            break L0;
          } else {
            break L0;
          }
        }
        if (pc.field_m == so.field_q.field_d) {
          if (-1 <= (pg.field_J ^ -1)) {
            return;
          } else {
            bq.a(127);
            tg.field_c.a(param3, -20429);
            if (null == wi.field_c) {
              var4 = 0;
              L1: while (true) {
                if (5 <= var4) {
                  L2: {
                    if (-1 != (pr.field_c.field_rb ^ -1)) {
                      tc.field_G = new kh(pr.field_c.field_B, pr.field_c.field_N, pr.field_c.field_K, pr.field_c.field_mb, param1, ho.field_j, un.field_g, po.field_d, ii.field_u, fk.field_i, gn.field_w, (String) null, 0L);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var58 = sh.a(false, param2, tg.field_a, cr.field_c);
                  if (var58 == null) {
                    if (param0 < -99) {
                      L3: {
                        var8 = bk.b(-127);
                        if (var8 != null) {
                          dn.field_k = var8;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      return;
                    } else {
                      L4: {
                        cc.d(34);
                        var8 = bk.b(-127);
                        if (var8 != null) {
                          dn.field_k = var8;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      return;
                    }
                  } else {
                    ks.a(var58, 0);
                    if (param0 < -99) {
                      L5: {
                        var8 = bk.b(-127);
                        if (var8 != null) {
                          dn.field_k = var8;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      return;
                    } else {
                      L6: {
                        cc.d(34);
                        var8 = bk.b(-127);
                        if (var8 != null) {
                          dn.field_k = var8;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  var57 = oq.field_b[var4];
                  if (var57 != null) {
                    L7: {
                      if (var57.field_rb != 0) {
                        cj.a(var4, -127, var57);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var6 = id.a(-7019, var4);
                    mr.field_d[var4].field_pb = bh.field_m[var6];
                    n.field_n[var4].field_z = jf.field_d[var6];
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              if (bg.field_g) {
                boolean discarded$2 = wi.field_c.a(tg.field_c.field_B, param3, tg.field_c.field_N, (byte) 0);
                var4 = 0;
                L8: while (true) {
                  if (5 <= var4) {
                    L9: {
                      if (-1 != (pr.field_c.field_rb ^ -1)) {
                        tc.field_G = new kh(pr.field_c.field_B, pr.field_c.field_N, pr.field_c.field_K, pr.field_c.field_mb, param1, ho.field_j, un.field_g, po.field_d, ii.field_u, fk.field_i, gn.field_w, (String) null, 0L);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    var40 = sh.a(false, param2, tg.field_a, cr.field_c);
                    if (var40 == null) {
                      if (param0 < -99) {
                        L10: {
                          var8 = bk.b(-127);
                          if (var8 != null) {
                            dn.field_k = var8;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        return;
                      } else {
                        L11: {
                          cc.d(34);
                          var8 = bk.b(-127);
                          if (var8 != null) {
                            dn.field_k = var8;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        return;
                      }
                    } else {
                      ks.a(var40, 0);
                      if (param0 >= -99) {
                        L12: {
                          cc.d(34);
                          var8 = bk.b(-127);
                          if (var8 != null) {
                            dn.field_k = var8;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        return;
                      } else {
                        L13: {
                          var8 = bk.b(-127);
                          if (var8 != null) {
                            dn.field_k = var8;
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        return;
                      }
                    }
                  } else {
                    var39 = oq.field_b[var4];
                    var41 = var39;
                    var43 = var41;
                    var45 = var43;
                    var41 = var39;
                    if (var39 != null) {
                      L14: {
                        if (var39.field_rb != 0) {
                          cj.a(var4, -127, var39);
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      var6 = id.a(-7019, var4);
                      mr.field_d[var4].field_pb = bh.field_m[var6];
                      n.field_n[var4].field_z = jf.field_d[var6];
                      var4++;
                      continue L8;
                    } else {
                      var4++;
                      continue L8;
                    }
                  }
                }
              } else {
                wi.field_c = null;
                var4 = 0;
                L15: while (true) {
                  if (5 <= var4) {
                    L16: {
                      if (-1 != (pr.field_c.field_rb ^ -1)) {
                        tc.field_G = new kh(pr.field_c.field_B, pr.field_c.field_N, pr.field_c.field_K, pr.field_c.field_mb, param1, ho.field_j, un.field_g, po.field_d, ii.field_u, fk.field_i, gn.field_w, (String) null, 0L);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    var30 = sh.a(false, param2, tg.field_a, cr.field_c);
                    if (var30 == null) {
                      if (param0 >= -99) {
                        L17: {
                          cc.d(34);
                          var8 = bk.b(-127);
                          if (var8 != null) {
                            dn.field_k = var8;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        return;
                      } else {
                        L18: {
                          var8 = bk.b(-127);
                          if (var8 != null) {
                            dn.field_k = var8;
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        return;
                      }
                    } else {
                      L19: {
                        ks.a(var30, 0);
                        if (param0 < -99) {
                          break L19;
                        } else {
                          cc.d(34);
                          break L19;
                        }
                      }
                      L20: {
                        var8 = bk.b(-127);
                        if (var8 != null) {
                          dn.field_k = var8;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      return;
                    }
                  } else {
                    var29 = oq.field_b[var4];
                    var31 = var29;
                    var33 = var31;
                    var35 = var33;
                    var31 = var29;
                    if (var29 != null) {
                      L21: {
                        if (var29.field_rb != 0) {
                          cj.a(var4, -127, var29);
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      var6 = id.a(-7019, var4);
                      mr.field_d[var4].field_pb = bh.field_m[var6];
                      n.field_n[var4].field_z = jf.field_d[var6];
                      var4++;
                      continue L15;
                    } else {
                      var4++;
                      continue L15;
                    }
                  }
                }
              }
            }
          }
        } else {
          fl.field_f = fl.field_f + (so.field_q.field_d + -pc.field_m);
          pc.field_m = so.field_q.field_d;
          if (-1 <= (pg.field_J ^ -1)) {
            return;
          } else {
            bq.a(127);
            tg.field_c.a(param3, -20429);
            if (null != wi.field_c) {
              L22: {
                if (bg.field_g) {
                  boolean discarded$3 = wi.field_c.a(tg.field_c.field_B, param3, tg.field_c.field_N, (byte) 0);
                  break L22;
                } else {
                  wi.field_c = null;
                  break L22;
                }
              }
              var4 = 0;
              L23: while (true) {
                if (5 <= var4) {
                  L24: {
                    if (-1 != (pr.field_c.field_rb ^ -1)) {
                      tc.field_G = new kh(pr.field_c.field_B, pr.field_c.field_N, pr.field_c.field_K, pr.field_c.field_mb, param1, ho.field_j, un.field_g, po.field_d, ii.field_u, fk.field_i, gn.field_w, (String) null, 0L);
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  var22 = sh.a(false, param2, tg.field_a, cr.field_c);
                  if (var22 != null) {
                    ks.a(var22, 0);
                    if (param0 >= -99) {
                      L25: {
                        cc.d(34);
                        var8 = bk.b(-127);
                        if (var8 != null) {
                          dn.field_k = var8;
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                      return;
                    } else {
                      L26: {
                        var8 = bk.b(-127);
                        if (var8 != null) {
                          dn.field_k = var8;
                          break L26;
                        } else {
                          break L26;
                        }
                      }
                      return;
                    }
                  } else {
                    L27: {
                      if (param0 < -99) {
                        break L27;
                      } else {
                        cc.d(34);
                        break L27;
                      }
                    }
                    L28: {
                      var8 = bk.b(-127);
                      if (var8 != null) {
                        dn.field_k = var8;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    return;
                  }
                } else {
                  var15 = oq.field_b[var4];
                  var16 = var15;
                  var18 = var16;
                  var20 = var18;
                  var16 = var15;
                  if (var15 != null) {
                    L29: {
                      if (var15.field_rb != 0) {
                        cj.a(var4, -127, var15);
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                    var6 = id.a(-7019, var4);
                    mr.field_d[var4].field_pb = bh.field_m[var6];
                    n.field_n[var4].field_z = jf.field_d[var6];
                    var4++;
                    continue L23;
                  } else {
                    var4++;
                    continue L23;
                  }
                }
              }
            } else {
              L30: {
                var4 = 0;
                if (5 <= var4) {
                  break L30;
                } else {
                  L31: {
                    var10 = oq.field_b[var4];
                    var5 = var10;
                    if (var10 != null) {
                      L32: {
                        if (var10.field_rb != 0) {
                          cj.a(var4, -127, var10);
                          break L32;
                        } else {
                          break L32;
                        }
                      }
                      var6 = id.a(-7019, var4);
                      mr.field_d[var4].field_pb = bh.field_m[var6];
                      n.field_n[var4].field_z = jf.field_d[var6];
                      break L31;
                    } else {
                      var4++;
                      break L31;
                    }
                  }
                  var4++;
                  var4++;
                  var4++;
                  break L30;
                }
              }
              L33: {
                if (-1 != (pr.field_c.field_rb ^ -1)) {
                  tc.field_G = new kh(pr.field_c.field_B, pr.field_c.field_N, pr.field_c.field_K, pr.field_c.field_mb, param1, ho.field_j, un.field_g, po.field_d, ii.field_u, fk.field_i, gn.field_w, (String) null, 0L);
                  break L33;
                } else {
                  break L33;
                }
              }
              L34: {
                var11 = sh.a(false, param2, tg.field_a, cr.field_c);
                if (var11 == null) {
                  break L34;
                } else {
                  ks.a(var11, 0);
                  break L34;
                }
              }
              L35: {
                if (param0 < -99) {
                  break L35;
                } else {
                  cc.d(34);
                  break L35;
                }
              }
              L36: {
                var8 = bk.b(-127);
                if (var8 != null) {
                  dn.field_k = var8;
                  break L36;
                } else {
                  break L36;
                }
              }
              return;
            }
          }
        }
    }

    final static bc a(int param0, boolean param1, int param2, int param3, boolean param4, boolean param5) {
        try {
            ua var6 = null;
            IOException var6_ref = null;
            ua var7 = null;
            p var8 = null;
            bc stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            bc stackOut_14_0 = null;
            try {
              L0: {
                if (param3 == 12000) {
                  break L0;
                } else {
                  field_p = null;
                  break L0;
                }
              }
              L1: {
                var6 = null;
                var7 = null;
                if (null == dh.field_a.field_k) {
                  break L1;
                } else {
                  oq.field_g = new ej(dh.field_a.field_k, 5200, 0);
                  dh.field_a.field_k = null;
                  var6 = new ua(255, oq.field_g, new ej(dh.field_a.field_n, 12000, 0), 2097152);
                  break L1;
                }
              }
              L2: {
                if (oq.field_g != null) {
                  L3: {
                    if (tr.field_Eb != null) {
                      break L3;
                    } else {
                      tr.field_Eb = new ej[dh.field_a.field_p.length];
                      break L3;
                    }
                  }
                  L4: {
                    if (tr.field_Eb[param2] != null) {
                      break L4;
                    } else {
                      tr.field_Eb[param2] = new ej(dh.field_a.field_p[param2], 12000, 0);
                      dh.field_a.field_p[param2] = null;
                      break L4;
                    }
                  }
                  var7 = new ua(param2, oq.field_g, tr.field_Eb[param2], 2097152);
                  break L2;
                } else {
                  break L2;
                }
              }
              L5: {
                var8 = lg.field_c.a(false, param2, var6, var7, param1);
                if (param5) {
                  var8.c(255);
                  break L5;
                } else {
                  break L5;
                }
              }
              stackOut_14_0 = new bc((lc) (Object) var8, param4, param0);
              stackIn_15_0 = stackOut_14_0;
            } catch (java.io.IOException decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_15_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    final u b(int param0, String param1) {
        if (param0 != -11196) {
            return null;
        }
        String var3 = ((cc) this).field_q.field_s.toLowerCase();
        String var4 = param1.toLowerCase();
        if (!(var4.length() != 0)) {
            return tj.field_b;
        }
        if (!(gi.a(var4, -12076, var3))) {
            return tj.field_b;
        }
        if (!(!this.b(true, param1))) {
            return tj.field_b;
        }
        return p.field_g;
    }

    public static void d(int param0) {
        field_p = null;
        if (param0 != 255) {
            field_p = null;
        }
    }

    final static boolean e(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) im.field_c;
                    // monitorenter im.field_c
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (tc.field_B == fe.field_J) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        // monitorexit var1
                        stackOut_3_0 = 0;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        oq.field_j = ng.field_a[tc.field_B];
                        ho.field_h = fb.field_yb[tc.field_B];
                        tc.field_B = 1 + tc.field_B & 127;
                        if (param0 == 55) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        // monitorexit var1
                        stackOut_6_0 = 1;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 8: {
                    try {
                        // monitorexit var1
                        stackOut_8_0 = 1;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return stackIn_9_0 != 0;
                }
                case 10: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 11: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void f(byte param0) {
        int var1 = 0;
        if (224 <= tf.field_p) {
            js.a(256, 197126152);
        } else {
            var1 = tf.field_p % 32;
            js.a(-var1 + 32 + tf.field_p, 197126152);
        }
        var1 = -41 % ((param0 - 29) / 57);
    }

    final String a(boolean param0, String param1) {
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        Object stackOut_30_0 = null;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        Object stackOut_11_0 = null;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        var5 = param1;
        var6 = ((cc) this).field_q.field_s.toLowerCase();
        var4 = param1.toLowerCase();
        if (var4.length() != 0) {
          var5 = var4;
          if (cg.a(-76, var5)) {
            return ab.field_b;
          } else {
            if (hb.a(var5, -31654)) {
              return ol.field_d;
            } else {
              if (!pf.a(var5, (byte) 24)) {
                if (!param0) {
                  L0: {
                    stackOut_30_0 = this;
                    stackIn_32_0 = stackOut_30_0;
                    stackIn_31_0 = stackOut_30_0;
                    if (param0) {
                      stackOut_32_0 = this;
                      stackOut_32_1 = 0;
                      stackIn_33_0 = stackOut_32_0;
                      stackIn_33_1 = stackOut_32_1;
                      break L0;
                    } else {
                      stackOut_31_0 = this;
                      stackOut_31_1 = 1;
                      stackIn_33_0 = stackOut_31_0;
                      stackIn_33_1 = stackOut_31_1;
                      break L0;
                    }
                  }
                  if (this.b(stackIn_33_1 != 0, param1)) {
                    return hq.field_d;
                  } else {
                    if (-1 > (var6.length() ^ -1)) {
                      if (va.a(var6, -1, var5)) {
                        return po.field_e;
                      } else {
                        if (ms.a(var5, (byte) -53, var6)) {
                          return qg.field_k;
                        } else {
                          if (na.a(var5, 127, var6)) {
                            return po.field_e;
                          } else {
                            return ab.field_b;
                          }
                        }
                      }
                    } else {
                      return bc.field_l;
                    }
                  }
                } else {
                  L1: {
                    ((cc) this).field_q = null;
                    stackOut_11_0 = this;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_12_0 = stackOut_11_0;
                    if (param0) {
                      stackOut_13_0 = this;
                      stackOut_13_1 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      break L1;
                    } else {
                      stackOut_12_0 = this;
                      stackOut_12_1 = 1;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      break L1;
                    }
                  }
                  if (this.b(stackIn_14_1 != 0, param1)) {
                    return hq.field_d;
                  } else {
                    if (-1 > (var6.length() ^ -1)) {
                      if (va.a(var6, -1, var5)) {
                        return po.field_e;
                      } else {
                        if (ms.a(var5, (byte) -53, var6)) {
                          return qg.field_k;
                        } else {
                          if (na.a(var5, 127, var6)) {
                            return po.field_e;
                          } else {
                            return ab.field_b;
                          }
                        }
                      }
                    } else {
                      return bc.field_l;
                    }
                  }
                }
              } else {
                return no.field_d;
              }
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Unpacking graphics";
        field_n = 56;
    }
}
