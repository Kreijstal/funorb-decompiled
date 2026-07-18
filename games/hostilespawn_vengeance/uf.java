/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf extends ql {
    static int[] field_d;
    static pg[] field_g;
    static bd[] field_i;
    static int[] field_e;
    static int[] field_f;
    static boolean field_h;

    final void b(byte param0) {
        int var2 = 0;
        if (-2 == vg.field_e[0].field_a) {
          if (70 < ng.field_u) {
            vg.field_e[0].e(-106);
            if (-2 == vg.field_e[1].field_a) {
              if (!vg.field_e[1].a((byte) -121)) {
                vg.field_e[1].field_a = 0;
                var2 = 52 / ((-48 - param0) / 38);
                if (vg.field_e[2].field_a != 1) {
                  L0: {
                    if (vg.field_e[3].field_a != 1) {
                      break L0;
                    } else {
                      if (vg.field_e[3].a((byte) -65)) {
                        break L0;
                      } else {
                        vg.field_e[3].field_a = 0;
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  L1: {
                    vg.field_e[2].e(-118);
                    if (vg.field_e[3].field_a != 1) {
                      break L1;
                    } else {
                      if (vg.field_e[3].a((byte) -65)) {
                        break L1;
                      } else {
                        vg.field_e[3].field_a = 0;
                        break L1;
                      }
                    }
                  }
                  return;
                }
              } else {
                var2 = 52 / ((-48 - param0) / 38);
                if (vg.field_e[2].field_a != 1) {
                  if (vg.field_e[3].field_a == 1) {
                    if (!vg.field_e[3].a((byte) -65)) {
                      vg.field_e[3].field_a = 0;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  vg.field_e[2].e(-118);
                  if (vg.field_e[3].field_a == 1) {
                    if (vg.field_e[3].a((byte) -65)) {
                      return;
                    } else {
                      vg.field_e[3].field_a = 0;
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            } else {
              var2 = 52 / ((-48 - param0) / 38);
              if (-2 != vg.field_e[2].field_a) {
                if (vg.field_e[3].field_a == 1) {
                  if (vg.field_e[3].a((byte) -65)) {
                    return;
                  } else {
                    vg.field_e[3].field_a = 0;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                vg.field_e[2].e(-118);
                if (vg.field_e[3].field_a == 1) {
                  if (!vg.field_e[3].a((byte) -65)) {
                    vg.field_e[3].field_a = 0;
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            L2: {
              if (vg.field_e[1].field_a != 1) {
                break L2;
              } else {
                if (vg.field_e[1].a((byte) -121)) {
                  break L2;
                } else {
                  L3: {
                    vg.field_e[1].field_a = 0;
                    var2 = 52 / ((-48 - param0) / 38);
                    if (vg.field_e[2].field_a != 1) {
                      break L3;
                    } else {
                      vg.field_e[2].e(-118);
                      break L3;
                    }
                  }
                  L4: {
                    if (vg.field_e[3].field_a != 1) {
                      break L4;
                    } else {
                      if (vg.field_e[3].a((byte) -65)) {
                        break L4;
                      } else {
                        vg.field_e[3].field_a = 0;
                        break L4;
                      }
                    }
                  }
                  return;
                }
              }
            }
            var2 = 52 / ((-48 - param0) / 38);
            if (vg.field_e[2].field_a != 1) {
              if (vg.field_e[3].field_a == 1) {
                if (!vg.field_e[3].a((byte) -65)) {
                  vg.field_e[3].field_a = 0;
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              vg.field_e[2].e(-118);
              if (vg.field_e[3].field_a == 1) {
                if (!vg.field_e[3].a((byte) -65)) {
                  vg.field_e[3].field_a = 0;
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          L5: {
            if (-2 != vg.field_e[1].field_a) {
              break L5;
            } else {
              if (vg.field_e[1].a((byte) -121)) {
                break L5;
              } else {
                L6: {
                  vg.field_e[1].field_a = 0;
                  var2 = 52 / ((-48 - param0) / 38);
                  if (vg.field_e[2].field_a != 1) {
                    break L6;
                  } else {
                    vg.field_e[2].e(-118);
                    break L6;
                  }
                }
                L7: {
                  if (vg.field_e[3].field_a != 1) {
                    break L7;
                  } else {
                    if (vg.field_e[3].a((byte) -65)) {
                      break L7;
                    } else {
                      vg.field_e[3].field_a = 0;
                      break L7;
                    }
                  }
                }
                return;
              }
            }
          }
          var2 = 52 / ((-48 - param0) / 38);
          if (vg.field_e[2].field_a != 1) {
            if (vg.field_e[3].field_a == 1) {
              if (!vg.field_e[3].a((byte) -65)) {
                vg.field_e[3].field_a = 0;
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            L8: {
              vg.field_e[2].e(-118);
              if (vg.field_e[3].field_a != 1) {
                break L8;
              } else {
                if (vg.field_e[3].a((byte) -65)) {
                  break L8;
                } else {
                  vg.field_e[3].field_a = 0;
                  break L8;
                }
              }
            }
            return;
          }
        }
    }

    final void e(int param0) {
        ih.field_y = new oc[3];
        ih.field_y[0] = new oc(ln.field_a.field_v[0], ln.field_a.field_v[1]);
        ih.field_y[1] = new oc(ln.field_a.field_v[2], ln.field_a.field_v[3]);
        ih.field_y[2] = new oc(ln.field_a.field_v[4], ln.field_a.field_v[5]);
        kd.a(6, 1);
        nh.field_E.a((byte) 46, ih.field_y[0]);
        vg.field_e = new v[4];
        vg.field_e[0] = new v(tm.field_s, -120 + (ti.field_f.field_e * 24 + 50), 24 * (-7 + ti.field_f.field_g) - 20, 200, false);
        vg.field_e[1] = new v(el.field_g, 24 * ih.field_y[0].field_e + -140, ih.field_y[0].field_g * 24, 200, false);
        vg.field_e[2] = new v(im.field_d, 24 + (24 * ih.field_y[1].field_e - 100), -90 + ih.field_y[1].field_g * 24, 200, false);
        vg.field_e[3] = new v(ih.field_z, ih.field_y[2].field_e * 24 + 64, 40 + 24 * ih.field_y[2].field_g, 200, false);
        vg.field_e[param0].field_a = 1;
    }

    final boolean a(oj param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (ha.field_t == 0) {
                break L1;
              } else {
                if (!param0.field_j.a(ih.field_y[2], 108)) {
                  break L1;
                } else {
                  stackOut_2_0 = 1;
                  stackIn_3_0 = stackOut_2_0;
                  return stackIn_3_0 != 0;
                }
              }
            }
            L2: {
              if (param1 == -5) {
                break L2;
              } else {
                ((uf) this).c(-111);
                break L2;
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("uf.P(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static void a(am param0, am param1, byte param2) {
        try {
            if (!(param0.field_f == null)) {
                param0.b(-124);
            }
            param0.field_g = param1;
            param0.field_f = param1.field_f;
            int var3_int = 105 % ((-18 - param2) / 33);
            param0.field_f.field_g = param0;
            param0.field_g.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "uf.M(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final String a(boolean param0) {
        int var2 = 0;
        Object var3 = null;
        if (!param0) {
          var2 = ha.field_t;
          if (var2 != 6) {
            if (var2 == 9) {
              return sm.field_a;
            } else {
              if (var2 == 0) {
                return wk.field_f;
              } else {
                return null;
              }
            }
          } else {
            return vb.field_Fb;
          }
        } else {
          var3 = null;
          uf.a((am) null, (am) null, (byte) 16);
          var2 = ha.field_t;
          if (var2 != 6) {
            if (var2 == 9) {
              return sm.field_a;
            } else {
              if (var2 == 0) {
                return wk.field_f;
              } else {
                return null;
              }
            }
          } else {
            return vb.field_Fb;
          }
        }
    }

    public uf() {
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        var14 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (param5 >= param4) {
              return;
            } else {
              if (param1 > param5 - -1) {
                L1: {
                  if (5 + param5 >= param1) {
                    break L1;
                  } else {
                    if (param0 == param6) {
                      break L1;
                    } else {
                      var7_int = (1 & (param6 & param0)) + (param6 >> 1) + (param0 >> 1);
                      var8 = param5;
                      var9 = param0;
                      var10 = param6;
                      var11 = param5;
                      L2: while (true) {
                        if (param1 <= var11) {
                          uf.a(param0, var8, param2, param3, param4, param5, var9);
                          uf.a(var10, param1, param2, param3, param4, var8, param6);
                          break L0;
                        } else {
                          L3: {
                            var12 = db.field_s[var11];
                            if (param3) {
                              stackOut_23_0 = qa.field_d[var12];
                              stackIn_24_0 = stackOut_23_0;
                              break L3;
                            } else {
                              stackOut_22_0 = hi.field_n[var12];
                              stackIn_24_0 = stackOut_22_0;
                              break L3;
                            }
                          }
                          L4: {
                            var13 = stackIn_24_0;
                            if (var13 > var7_int) {
                              L5: {
                                db.field_s[var11] = db.field_s[var8];
                                if (var13 < var9) {
                                  var9 = var13;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              int incrementValue$1 = var8;
                              var8++;
                              db.field_s[incrementValue$1] = var12;
                              break L4;
                            } else {
                              if (var10 >= var13) {
                                break L4;
                              } else {
                                var10 = var13;
                                break L4;
                              }
                            }
                          }
                          var11++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
                var7_int = param1 + -1;
                L6: while (true) {
                  if (param5 >= var7_int) {
                    return;
                  } else {
                    var8 = param5;
                    L7: while (true) {
                      if (var7_int <= var8) {
                        var7_int--;
                        continue L6;
                      } else {
                        L8: {
                          var9 = db.field_s[var8];
                          var10 = db.field_s[var8 + 1];
                          if (bl.a(var9, param3, (byte) -72, var10)) {
                            db.field_s[var8] = var10;
                            db.field_s[1 + var8] = var9;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var8++;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var7, "uf.O(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void c(int param0) {
        if (param0 != 0) {
            field_f = null;
            ti.a(234, (byte) 73, 21);
            return;
        }
        ti.a(234, (byte) 73, 21);
    }

    final void d(int param0) {
        int var3 = 0;
        oc var4 = null;
        var4 = new oc(mm.field_m[0].field_j);
        if (param0 == -1) {
          if (0 != ha.field_t) {
            if (vg.field_e[1].field_a == 0) {
              var3 = ih.a(var4, (byte) -82, ih.field_y[0]);
              if (var3 < 2) {
                kd.a(9, 1);
                vg.field_e[1].field_a = 1;
                nh.field_E.a((byte) 46, ih.field_y[1]);
                var3 = ih.a(var4, (byte) -105, ih.field_y[1]);
                if (2 <= var3) {
                  if (0 == vg.field_e[3].field_a) {
                    if (Math.abs(var4.field_e + -ih.field_y[2].field_e) < 2) {
                      if (Math.abs(var4.field_g - ih.field_y[2].field_g) >= 2) {
                        return;
                      } else {
                        vg.field_e[3].field_a = 1;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  ca.a(0.5 + (double)ih.field_y[1].field_e, 1, 1.0 + (double)ih.field_y[1].field_g, true, 64);
                  kd.a(0, 1);
                  nh.field_E.a((byte) 46, ih.field_y[0]);
                  vg.field_e[2].field_a = 1;
                  if (0 == vg.field_e[3].field_a) {
                    if (Math.abs(var4.field_e + -ih.field_y[2].field_e) < 2) {
                      if (Math.abs(var4.field_g - ih.field_y[2].field_g) < 2) {
                        vg.field_e[3].field_a = 1;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                var3 = ih.a(var4, (byte) -105, ih.field_y[1]);
                if (2 <= var3) {
                  if (0 == vg.field_e[3].field_a) {
                    if (Math.abs(var4.field_e + -ih.field_y[2].field_e) < 2) {
                      if (Math.abs(var4.field_g - ih.field_y[2].field_g) < 2) {
                        vg.field_e[3].field_a = 1;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  ca.a(0.5 + (double)ih.field_y[1].field_e, 1, 1.0 + (double)ih.field_y[1].field_g, true, 64);
                  kd.a(0, 1);
                  nh.field_E.a((byte) 46, ih.field_y[0]);
                  vg.field_e[2].field_a = 1;
                  if (0 == vg.field_e[3].field_a) {
                    if (Math.abs(var4.field_e + -ih.field_y[2].field_e) < 2) {
                      if (Math.abs(var4.field_g - ih.field_y[2].field_g) >= 2) {
                        return;
                      } else {
                        vg.field_e[3].field_a = 1;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            } else {
              var3 = ih.a(var4, (byte) -105, ih.field_y[1]);
              if (2 <= var3) {
                if (0 == vg.field_e[3].field_a) {
                  if (Math.abs(var4.field_e + -ih.field_y[2].field_e) < 2) {
                    if (Math.abs(var4.field_g - ih.field_y[2].field_g) >= 2) {
                      return;
                    } else {
                      vg.field_e[3].field_a = 1;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                ca.a(0.5 + (double)ih.field_y[1].field_e, 1, 1.0 + (double)ih.field_y[1].field_g, true, 64);
                kd.a(0, 1);
                nh.field_E.a((byte) 46, ih.field_y[0]);
                vg.field_e[2].field_a = 1;
                if (0 == vg.field_e[3].field_a) {
                  if (Math.abs(var4.field_e + -ih.field_y[2].field_e) < 2) {
                    if (Math.abs(var4.field_g - ih.field_y[2].field_g) >= 2) {
                      return;
                    } else {
                      vg.field_e[3].field_a = 1;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            super.d(param0);
            return;
          }
        } else {
          return;
        }
    }

    public static void g() {
        field_f = null;
        field_g = null;
        field_d = null;
        field_e = null;
        field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var2 = 0;
        int var0 = 0;
        int var1 = 0;
        field_f = new int[128];
        field_d = new int[128];
        field_e = new int[128];
        field_i = new bd[5];
        for (var2 = 0; field_f.length > var2; var2++) {
            var0 = 1114111;
            var1 = (var0 & 16711935) * ((var2 + 1) * 255 / 128);
            field_f[var2] = ua.a(16711680, -var1 + var0 * ((255 * var2 + 255) / 128)) + ua.a(var1, -16711936) >>> 8;
            field_d[var2] = var2 * 65793;
            var0 = 40960;
            var1 = (255 + var2 * 255) / 128 * (var0 & 16711935);
            field_e[var2] = ua.a(var1, -16711936) + ua.a(var0 * (255 * (var2 - -1) / 128) + -var1, 16711680) >>> 8;
        }
        field_h = false;
    }
}
