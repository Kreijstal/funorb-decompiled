/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q implements kg {
    private int field_c;
    private jb field_e;
    static String field_d;
    static String[] field_a;
    private int field_f;
    static ah field_b;

    final static void b(int param0) {
        hm.field_a = af.field_h;
        hd.field_v = param0;
        if (kb.field_t == ed.field_O) {
          return;
        } else {
          if (!qb.a(kb.field_t, (byte) 114)) {
            qe.field_b = nn.field_X;
            if (!tb.field_g) {
              kb.field_t = ed.field_O;
              if (qh.field_k) {
                qi.b((byte) -98);
                re.e((byte) -33);
                ji.h(0);
                qh.field_k = false;
                return;
              } else {
                return;
              }
            } else {
              ud.field_Qb = null;
              aa.field_bc = null;
              tb.field_g = false;
              kb.field_t = ed.field_O;
              if (qh.field_k) {
                qi.b((byte) -98);
                re.e((byte) -33);
                ji.h(0);
                qh.field_k = false;
                return;
              } else {
                return;
              }
            }
          } else {
            kk.field_X[kb.field_t].b(param0 ^ 4);
            qe.field_b = nn.field_X;
            if (tb.field_g) {
              ud.field_Qb = null;
              aa.field_bc = null;
              tb.field_g = false;
              kb.field_t = ed.field_O;
              if (!qh.field_k) {
                return;
              } else {
                qi.b((byte) -98);
                re.e((byte) -33);
                ji.h(0);
                qh.field_k = false;
                return;
              }
            } else {
              kb.field_t = ed.field_O;
              if (qh.field_k) {
                qi.b((byte) -98);
                re.e((byte) -33);
                ji.h(0);
                qh.field_k = false;
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        if (param0 <= 83) {
            field_a = null;
        }
    }

    final static boolean a(boolean param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = TetraLink.field_J;
        if (!param0) {
          var2 = 0;
          L0: while (true) {
            if (param1.length() > var2) {
              var3 = param1.charAt(var2);
              if (ac.a((byte) -103, (char) var3)) {
                var2++;
                var2++;
                continue L0;
              } else {
                if (!fd.a((char) var3, (byte) 81)) {
                  return true;
                } else {
                  var2++;
                  continue L0;
                }
              }
            } else {
              return false;
            }
          }
        } else {
          field_a = null;
          var2 = 0;
          if (param1.length() > var2) {
            var3 = param1.charAt(var2);
            if (!ac.a((byte) -103, (char) var3)) {
              if (!fd.a((char) var3, (byte) 81)) {
                return true;
              } else {
                var2++;
                var2++;
                var2++;
                var2++;
                return false;
              }
            } else {
              var2++;
              var2++;
              var2++;
              var2++;
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(int param0, byte param1, long param2) {
        bc var4 = null;
        int var5 = 0;
        var4 = nd.field_Lb;
        var4.f(param0, (byte) -92);
        if (param1 != -118) {
          q.b(106);
          var4.field_t = var4.field_t + 1;
          var5 = var4.field_t;
          var4.a(6, false);
          var4.a(-1, param2);
          var4.b(var4.field_t - var5, param1 + 116);
          return;
        } else {
          var4.field_t = var4.field_t + 1;
          var5 = var4.field_t;
          var4.a(6, false);
          var4.a(-1, param2);
          var4.b(var4.field_t - var5, param1 + 116);
          return;
        }
    }

    public q() {
        ((q) this).field_c = 1;
        ((q) this).field_e = od.field_S;
        ((q) this).field_f = 1;
    }

    final static int a(byte[] param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        var6 = TetraLink.field_J;
        var4 = -1;
        var5 = param3;
        L0: while (true) {
          if (param2 <= var5) {
            if (param1 != 2) {
              var7 = null;
              q.a((java.applet.Applet) null, -67);
              var4 = var4 ^ -1;
              return var4;
            } else {
              var4 = var4 ^ -1;
              return var4;
            }
          } else {
            var4 = var4 >>> 1389959880 ^ bl.field_Ub[255 & (var4 ^ param0[var5])];
            var5++;
            continue L0;
          }
        }
    }

    q(jb param0, int param1, int param2) {
        ((q) this).field_f = param2;
        ((q) this).field_e = param0;
        ((q) this).field_c = param1;
    }

    public final void a(na param0, int param1, int param2, boolean param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_32_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_31_0 = 0;
        L0: {
          var11 = TetraLink.field_J;
          if (param0.field_r) {
            stackOut_30_0 = 3249872;
            stackIn_32_0 = stackOut_30_0;
            break L0;
          } else {
            if (!param0.c(3)) {
              stackOut_31_0 = 2188450;
              stackIn_32_0 = stackOut_31_0;
              break L0;
            } else {
              var6 = 3249872;
              int discarded$2 = ((q) this).field_e.a("<u=" + Integer.toString(var6, 16) + ">" + param0.field_A + "</u>", param0.field_t + param1, param2 - -param0.field_w, param0.field_F, param0.field_u, var6, -1, ((q) this).field_c, ((q) this).field_f, ((q) this).field_e.field_K + ((q) this).field_e.field_N);
              if (param3) {
                if (param0.c(3)) {
                  var7 = ((q) this).field_e.b(param0.field_A);
                  var8 = ((q) this).field_e.field_N - -((q) this).field_e.field_K;
                  var9 = param0.field_t + param1;
                  var10 = param0.field_w + param2;
                  if (((q) this).field_c != 2) {
                    L1: {
                      if (-2 != (((q) this).field_c ^ -1)) {
                        break L1;
                      } else {
                        var9 = var9 + (-var7 + param0.field_F >> 282912449);
                        break L1;
                      }
                    }
                    if (((q) this).field_f != 2) {
                      if (-2 == (((q) this).field_f ^ -1)) {
                        var10 = var10 + (-var8 + param0.field_u >> 415632929);
                        id.a(4 + var7, var10 - -2, 0, var8, var9 - 2);
                        return;
                      } else {
                        id.a(4 + var7, var10 - -2, 0, var8, var9 - 2);
                        return;
                      }
                    } else {
                      var10 = var10 + (param0.field_u + -var8);
                      id.a(4 + var7, var10 - -2, 0, var8, var9 - 2);
                      return;
                    }
                  } else {
                    L2: {
                      var9 = var9 + (-var7 + param0.field_F);
                      if (((q) this).field_f == 2) {
                        var10 = var10 + (param0.field_u + -var8);
                        break L2;
                      } else {
                        if (-2 != (((q) this).field_f ^ -1)) {
                          break L2;
                        } else {
                          var10 = var10 + (-var8 + param0.field_u >> 415632929);
                          break L2;
                        }
                      }
                    }
                    id.a(4 + var7, var10 - -2, 0, var8, var9 - 2);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                L3: {
                  field_a = null;
                  if (!param0.c(3)) {
                    break L3;
                  } else {
                    L4: {
                      var7 = ((q) this).field_e.b(param0.field_A);
                      var8 = ((q) this).field_e.field_N - -((q) this).field_e.field_K;
                      var9 = param0.field_t + param1;
                      var10 = param0.field_w + param2;
                      if (((q) this).field_c != 2) {
                        if (-2 != (((q) this).field_c ^ -1)) {
                          break L4;
                        } else {
                          var9 = var9 + (-var7 + param0.field_F >> 282912449);
                          break L4;
                        }
                      } else {
                        var9 = var9 + (-var7 + param0.field_F);
                        break L4;
                      }
                    }
                    L5: {
                      if (((q) this).field_f == 2) {
                        var10 = var10 + (param0.field_u + -var8);
                        break L5;
                      } else {
                        if (-2 != (((q) this).field_f ^ -1)) {
                          break L5;
                        } else {
                          var10 = var10 + (-var8 + param0.field_u >> 415632929);
                          break L5;
                        }
                      }
                    }
                    id.a(4 + var7, var10 - -2, 0, var8, var9 - 2);
                    break L3;
                  }
                }
                return;
              }
            }
          }
        }
        var6 = stackIn_32_0;
        int discarded$3 = ((q) this).field_e.a("<u=" + Integer.toString(var6, 16) + ">" + param0.field_A + "</u>", param0.field_t + param1, param2 - -param0.field_w, param0.field_F, param0.field_u, var6, -1, ((q) this).field_c, ((q) this).field_f, ((q) this).field_e.field_K + ((q) this).field_e.field_N);
        if (param3) {
          if (param0.c(3)) {
            var7 = ((q) this).field_e.b(param0.field_A);
            var8 = ((q) this).field_e.field_N - -((q) this).field_e.field_K;
            var9 = param0.field_t + param1;
            var10 = param0.field_w + param2;
            if (((q) this).field_c != 2) {
              L6: {
                if (-2 != (((q) this).field_c ^ -1)) {
                  break L6;
                } else {
                  var9 = var9 + (-var7 + param0.field_F >> 282912449);
                  break L6;
                }
              }
              if (((q) this).field_f != 2) {
                if (-2 != (((q) this).field_f ^ -1)) {
                  id.a(4 + var7, var10 - -2, 0, var8, var9 - 2);
                  return;
                } else {
                  var10 = var10 + (-var8 + param0.field_u >> 415632929);
                  id.a(4 + var7, var10 - -2, 0, var8, var9 - 2);
                  return;
                }
              } else {
                var10 = var10 + (param0.field_u + -var8);
                id.a(4 + var7, var10 - -2, 0, var8, var9 - 2);
                return;
              }
            } else {
              var9 = var9 + (-var7 + param0.field_F);
              if (((q) this).field_f != 2) {
                if (-2 != (((q) this).field_f ^ -1)) {
                  id.a(4 + var7, var10 - -2, 0, var8, var9 - 2);
                  return;
                } else {
                  var10 = var10 + (-var8 + param0.field_u >> 415632929);
                  id.a(4 + var7, var10 - -2, 0, var8, var9 - 2);
                  return;
                }
              } else {
                var10 = var10 + (param0.field_u + -var8);
                id.a(4 + var7, var10 - -2, 0, var8, var9 - 2);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          field_a = null;
          if (param0.c(3)) {
            var7 = ((q) this).field_e.b(param0.field_A);
            var8 = ((q) this).field_e.field_N - -((q) this).field_e.field_K;
            var9 = param0.field_t + param1;
            var10 = param0.field_w + param2;
            if (((q) this).field_c != 2) {
              L7: {
                if (-2 != (((q) this).field_c ^ -1)) {
                  break L7;
                } else {
                  var9 = var9 + (-var7 + param0.field_F >> 282912449);
                  break L7;
                }
              }
              if (((q) this).field_f != 2) {
                if (-2 == (((q) this).field_f ^ -1)) {
                  var10 = var10 + (-var8 + param0.field_u >> 415632929);
                  id.a(4 + var7, var10 - -2, 0, var8, var9 - 2);
                  return;
                } else {
                  id.a(4 + var7, var10 - -2, 0, var8, var9 - 2);
                  return;
                }
              } else {
                var10 = var10 + (param0.field_u + -var8);
                id.a(4 + var7, var10 - -2, 0, var8, var9 - 2);
                return;
              }
            } else {
              L8: {
                var9 = var9 + (-var7 + param0.field_F);
                if (((q) this).field_f == 2) {
                  var10 = var10 + (param0.field_u + -var8);
                  break L8;
                } else {
                  if (-2 != (((q) this).field_f ^ -1)) {
                    break L8;
                  } else {
                    var10 = var10 + (-var8 + param0.field_u >> 415632929);
                    break L8;
                  }
                }
              }
              id.a(4 + var7, var10 - -2, 0, var8, var9 - 2);
              return;
            }
          } else {
            return;
          }
        }
    }

    final static byte[] a(int param0, CharSequence param1) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = TetraLink.field_J;
        var2 = param1.length();
        var3 = new byte[var2];
        var4 = 53 / ((-77 - param0) / 34);
        var5 = 0;
        L0: while (true) {
          if (var2 <= var5) {
            return var3;
          } else {
            L1: {
              L2: {
                L3: {
                  var6 = param1.charAt(var5);
                  if (var6 <= 0) {
                    break L3;
                  } else {
                    if (var6 < 128) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var6 < 160) {
                    break L4;
                  } else {
                    if (var6 > 255) {
                      break L4;
                    } else {
                      break L2;
                    }
                  }
                }
                if (var6 != 8364) {
                  if (var6 != 8218) {
                    if (var6 != 402) {
                      if (var6 != 8222) {
                        if (var6 != 8230) {
                          if (8224 == var6) {
                            var3[var5] = (byte)-122;
                            break L1;
                          } else {
                            if (var6 != 8225) {
                              if (710 != var6) {
                                if (8240 != var6) {
                                  if (var6 == 352) {
                                    var3[var5] = (byte)-118;
                                    break L1;
                                  } else {
                                    if (var6 == 8249) {
                                      var3[var5] = (byte)-117;
                                      break L1;
                                    } else {
                                      if (338 == var6) {
                                        var3[var5] = (byte)-116;
                                        break L1;
                                      } else {
                                        if (var6 == 381) {
                                          var3[var5] = (byte)-114;
                                          break L1;
                                        } else {
                                          if (var6 != 8216) {
                                            if (var6 == 8217) {
                                              var3[var5] = (byte)-110;
                                              break L1;
                                            } else {
                                              if (8220 == var6) {
                                                var3[var5] = (byte)-109;
                                                break L1;
                                              } else {
                                                if (var6 != 8221) {
                                                  if (var6 != 8226) {
                                                    if (var6 != 8211) {
                                                      if (8212 != var6) {
                                                        if (var6 != 732) {
                                                          if (var6 != 8482) {
                                                            if (var6 == 353) {
                                                              var3[var5] = (byte)-102;
                                                              break L1;
                                                            } else {
                                                              if (var6 != 8250) {
                                                                if (var6 != 339) {
                                                                  if (var6 == 382) {
                                                                    var3[var5] = (byte)-98;
                                                                    break L1;
                                                                  } else {
                                                                    if (var6 == 376) {
                                                                      var3[var5] = (byte)-97;
                                                                      break L1;
                                                                    } else {
                                                                      var3[var5] = (byte)63;
                                                                      break L1;
                                                                    }
                                                                  }
                                                                } else {
                                                                  var3[var5] = (byte)-100;
                                                                  break L1;
                                                                }
                                                              } else {
                                                                var3[var5] = (byte)-101;
                                                                break L1;
                                                              }
                                                            }
                                                          } else {
                                                            var3[var5] = (byte)-103;
                                                            break L1;
                                                          }
                                                        } else {
                                                          var3[var5] = (byte)-104;
                                                          break L1;
                                                        }
                                                      } else {
                                                        var3[var5] = (byte)-105;
                                                        break L1;
                                                      }
                                                    } else {
                                                      var3[var5] = (byte)-106;
                                                      break L1;
                                                    }
                                                  } else {
                                                    var3[var5] = (byte)-107;
                                                    break L1;
                                                  }
                                                } else {
                                                  var3[var5] = (byte)-108;
                                                  break L1;
                                                }
                                              }
                                            }
                                          } else {
                                            var3[var5] = (byte)-111;
                                            break L1;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var3[var5] = (byte)-119;
                                  break L1;
                                }
                              } else {
                                var3[var5] = (byte)-120;
                                break L1;
                              }
                            } else {
                              var3[var5] = (byte)-121;
                              break L1;
                            }
                          }
                        } else {
                          var3[var5] = (byte)-123;
                          break L1;
                        }
                      } else {
                        var3[var5] = (byte)-124;
                        break L1;
                      }
                    } else {
                      var3[var5] = (byte)-125;
                      break L1;
                    }
                  } else {
                    var3[var5] = (byte)-126;
                    break L1;
                  }
                } else {
                  var3[var5] = (byte)-128;
                  break L1;
                }
              }
              var3[var5] = (byte)var6;
              var5++;
              break L1;
            }
            var5++;
            continue L0;
          }
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            java.net.URL var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var4 = param0.getCodeBase();
                if (param1 > 60) {
                  var3 = ai.a(var4, (byte) -120, param0).getFile();
                  Object discarded$6 = ii.a(new Object[2], 6760, "updatelinks", param0);
                  Object discarded$7 = ii.a(new Object[2], 6760, "updatelinks", param0);
                  Object discarded$8 = ii.a(new Object[2], 6760, "updatelinks", param0);
                  Object discarded$9 = ii.a(new Object[2], 6760, "updatelinks", param0);
                  Object discarded$10 = ii.a(new Object[2], 6760, "updatelinks", param0);
                  Object discarded$11 = ii.a(new Object[2], 6760, "updatelinks", param0);
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2 = decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "No";
    }
}
