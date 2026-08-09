/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm extends w {
    w field_Rb;
    static String field_Pb;
    jd field_Sb;
    static boolean field_Qb;
    static int[] field_Nb;
    w field_Ob;

    final static void f(int param0) {
        int var1 = -114 % ((param0 - 79) / 35);
        fj.a(48, (byte) -89, hm.field_d);
    }

    public static void g(int param0) {
        field_Nb = null;
        if (param0 != 48) {
            field_Nb = (int[]) null;
            field_Pb = null;
            return;
        }
        field_Pb = null;
    }

    final static int a(float param0, float param1, boolean param2, float param3) {
        float var4;
        float var5;
        float var6;
        float var7;
        int var8;
        float var9;
        float var10;
        float var11;
        float var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        L0: {
          L1: {
            L2: {
              L3: {
                L4: {
                  L5: {
                    var18 = client.field_A ? 1 : 0;
                    var4 = 0.0f;
                    var5 = 0.0f;
                    var6 = 0.0f;
                    var7 = param0 * 6.0f % 6.0f;
                    var8 = (int)var7;
                    var9 = var7 - (float)var8;
                    var10 = (-param3 + 1.0f) * param1;
                    var11 = (-(var9 * param3) + 1.0f) * param1;
                    var12 = param1 * (-((1.0f - var9) * param3) + 1.0f);
                    var13 = var8;
                    if (var13 != 0) {
                      if ((var13 ^ -1) != -2) {
                        if (-3 == (var13 ^ -1)) {
                          break L4;
                        } else {
                          if ((var13 ^ -1) == -4) {
                            break L3;
                          } else {
                            if (4 != var13) {
                              if (-6 == (var13 ^ -1)) {
                                break L1;
                              } else {
                                if (param2) {
                                  return 25;
                                } else {
                                  var13 = 256;
                                  var14 = Math.min(Math.round((float)var13 * var4), var13 - 1);
                                  var15 = Math.min(Math.round(var5 * (float)var13), -1 + var13);
                                  var16 = Math.min(Math.round((float)var13 * var6), -1 + var13);
                                  var17 = 255 & var16 | (var15 << 457078600 & 65280 | 16711680 & var14 << -1294601872);
                                  return var17;
                                }
                              }
                            } else {
                              if (var18 == 0) {
                                break L2;
                              } else {
                                L6: {
                                  if (-6 == (var13 ^ -1)) {
                                    var4 = param1;
                                    var6 = var11;
                                    var5 = var10;
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                                if (param2) {
                                  return 25;
                                } else {
                                  var13 = 256;
                                  var14 = Math.min(Math.round((float)var13 * var4), var13 - 1);
                                  var15 = Math.min(Math.round(var5 * (float)var13), -1 + var13);
                                  var16 = Math.min(Math.round((float)var13 * var6), -1 + var13);
                                  var17 = 255 & var16 | (var15 << 457078600 & 65280 | 16711680 & var14 << -1294601872);
                                  return var17;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        if (var18 == 0) {
                          break L5;
                        } else {
                          L7: {
                            L8: {
                              L9: {
                                L10: {
                                  if (-3 == (var13 ^ -1)) {
                                    var5 = param1;
                                    var4 = var10;
                                    var6 = var12;
                                    if (var18 == 0) {
                                      break L7;
                                    } else {
                                      break L10;
                                    }
                                  } else {
                                    if ((var13 ^ -1) == -4) {
                                      break L10;
                                    } else {
                                      if (4 == var13) {
                                        if (var18 == 0) {
                                          break L9;
                                        } else {
                                          if (-6 == (var13 ^ -1)) {
                                            break L8;
                                          } else {
                                            if (param2) {
                                              return 25;
                                            } else {
                                              var13 = 256;
                                              var14 = Math.min(Math.round((float)var13 * var4), var13 - 1);
                                              var15 = Math.min(Math.round(var5 * (float)var13), -1 + var13);
                                              var16 = Math.min(Math.round((float)var13 * var6), -1 + var13);
                                              var17 = 255 & var16 | (var15 << 457078600 & 65280 | 16711680 & var14 << -1294601872);
                                              return var17;
                                            }
                                          }
                                        }
                                      } else {
                                        L11: {
                                          if (-6 == (var13 ^ -1)) {
                                            var4 = param1;
                                            var6 = var11;
                                            var5 = var10;
                                            break L11;
                                          } else {
                                            break L11;
                                          }
                                        }
                                        if (param2) {
                                          return 25;
                                        } else {
                                          var13 = 256;
                                          var14 = Math.min(Math.round((float)var13 * var4), var13 - 1);
                                          var15 = Math.min(Math.round(var5 * (float)var13), -1 + var13);
                                          var16 = Math.min(Math.round((float)var13 * var6), -1 + var13);
                                          var17 = 255 & var16 | (var15 << 457078600 & 65280 | 16711680 & var14 << -1294601872);
                                          return var17;
                                        }
                                      }
                                    }
                                  }
                                }
                                var5 = var11;
                                var6 = param1;
                                var4 = var10;
                                if (var18 == 0) {
                                  break L7;
                                } else {
                                  break L9;
                                }
                              }
                              var4 = var12;
                              var6 = param1;
                              var5 = var10;
                              if (var18 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                            var4 = param1;
                            var6 = var11;
                            var5 = var10;
                            break L7;
                          }
                          if (param2) {
                            return 25;
                          } else {
                            var13 = 256;
                            var14 = Math.min(Math.round((float)var13 * var4), var13 - 1);
                            var15 = Math.min(Math.round(var5 * (float)var13), -1 + var13);
                            var16 = Math.min(Math.round((float)var13 * var6), -1 + var13);
                            var17 = 255 & var16 | (var15 << 457078600 & 65280 | 16711680 & var14 << -1294601872);
                            return var17;
                          }
                        }
                      }
                    } else {
                      if (var18 == 0) {
                        var6 = var10;
                        var4 = param1;
                        var5 = var12;
                        if (var18 == 0) {
                          break L0;
                        } else {
                          break L5;
                        }
                      } else {
                        L12: {
                          if ((var13 ^ -1) != -2) {
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        L13: {
                          L14: {
                            L15: {
                              L16: {
                                if (-3 == (var13 ^ -1)) {
                                  var5 = param1;
                                  var4 = var10;
                                  var6 = var12;
                                  if (var18 == 0) {
                                    break L13;
                                  } else {
                                    break L16;
                                  }
                                } else {
                                  if ((var13 ^ -1) == -4) {
                                    break L16;
                                  } else {
                                    if (4 == var13) {
                                      if (var18 == 0) {
                                        break L15;
                                      } else {
                                        if (-6 == (var13 ^ -1)) {
                                          break L14;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    } else {
                                      L17: {
                                        if (-6 == (var13 ^ -1)) {
                                          var4 = param1;
                                          var6 = var11;
                                          var5 = var10;
                                          break L17;
                                        } else {
                                          break L17;
                                        }
                                      }
                                      if (param2) {
                                        return 25;
                                      } else {
                                        var13 = 256;
                                        var14 = Math.min(Math.round((float)var13 * var4), var13 - 1);
                                        var15 = Math.min(Math.round(var5 * (float)var13), -1 + var13);
                                        var16 = Math.min(Math.round((float)var13 * var6), -1 + var13);
                                        var17 = 255 & var16 | (var15 << 457078600 & 65280 | 16711680 & var14 << -1294601872);
                                        return var17;
                                      }
                                    }
                                  }
                                }
                              }
                              var5 = var11;
                              var6 = param1;
                              var4 = var10;
                              if (var18 == 0) {
                                break L13;
                              } else {
                                break L15;
                              }
                            }
                            var4 = var12;
                            var6 = param1;
                            var5 = var10;
                            if (var18 == 0) {
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                          var4 = param1;
                          var6 = var11;
                          var5 = var10;
                          break L13;
                        }
                        if (param2) {
                          return 25;
                        } else {
                          var13 = 256;
                          var14 = Math.min(Math.round((float)var13 * var4), var13 - 1);
                          var15 = Math.min(Math.round(var5 * (float)var13), -1 + var13);
                          var16 = Math.min(Math.round((float)var13 * var6), -1 + var13);
                          var17 = 255 & var16 | (var15 << 457078600 & 65280 | 16711680 & var14 << -1294601872);
                          return var17;
                        }
                      }
                    }
                  }
                  var5 = param1;
                  var4 = var11;
                  var6 = var10;
                  if (var18 == 0) {
                    break L0;
                  } else {
                    break L4;
                  }
                }
                var5 = param1;
                var4 = var10;
                var6 = var12;
                if (var18 == 0) {
                  break L0;
                } else {
                  break L3;
                }
              }
              var5 = var11;
              var6 = param1;
              var4 = var10;
              if (var18 == 0) {
                break L0;
              } else {
                break L2;
              }
            }
            var4 = var12;
            var6 = param1;
            var5 = var10;
            if (var18 == 0) {
              break L0;
            } else {
              break L1;
            }
          }
          var4 = param1;
          var6 = var11;
          var5 = var10;
          break L0;
        }
        if (param2) {
          return 25;
        } else {
          var13 = 256;
          var14 = Math.min(Math.round((float)var13 * var4), var13 - 1);
          var15 = Math.min(Math.round(var5 * (float)var13), -1 + var13);
          var16 = Math.min(Math.round((float)var13 * var6), -1 + var13);
          var17 = 255 & var16 | (var15 << 457078600 & 65280 | 16711680 & var14 << -1294601872);
          return var17;
        }
    }

    private final boolean a(boolean param0, int param1, byte param2, int param3, int param4, int param5, boolean param6) {
        int var8;
        L0: {
          if (param2 == 43) {
            break L0;
          } else {
            this.a(97, true, false, -111);
            break L0;
          }
        }
        if (!param0) {
          if (this.field_jb) {
            if (param6) {
              var8 = 0;
              this.field_Ob.a((byte) -94, param5, this.field_Rb.field_N, var8 != 0);
              this.a(param1, param4, param2 ^ 43, false, param3);
              return var8 != 0;
            } else {
              var8 = 1;
              this.field_Ob.a((byte) -94, param5, this.field_Rb.field_N, var8 != 0);
              this.a(param1, param4, param2 ^ 43, false, param3);
              return var8 != 0;
            }
          } else {
            var8 = 0;
            this.field_Ob.a((byte) -94, param5, this.field_Rb.field_N, var8 != 0);
            this.a(param1, param4, param2 ^ 43, false, param3);
            return var8 != 0;
          }
        } else {
          var8 = 1;
          this.field_Ob.a((byte) -94, param5, this.field_Rb.field_N, var8 != 0);
          this.a(param1, param4, param2 ^ 43, false, param3);
          return var8 != 0;
        }
    }

    private final void b(int param0, int param1, int param2) {
        this.field_Rb.field_mb = -param0 + (this.field_mb - param2);
        this.field_Rb.field_N = this.field_N;
        this.field_Ob.field_vb = param1;
        this.field_Ob.field_mb = -param0 + (this.field_mb + -param2);
        this.field_Sb.a(this.field_mb + -param2, (byte) -32, this.field_N, this.field_Ob.field_N, param2, -this.field_Ob.field_Ib, this.field_Rb.field_N, 0);
    }

    final static ck g(byte param0) {
        int var1 = 0;
        int[] var3 = null;
        int var4 = 0;
        ck var5 = null;
        int var6 = 0;
        byte[] var8 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = client.field_A ? 1 : 0;
                    var1 = tm.field_a[0] * hc.field_c[0];
                    var8 = tc.field_Nb[0];
                    var3 = new int[var1];
                    var4 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var4 < var1) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var4 = -8 % ((param0 - -40) / 42);
                    var5 = new ck(ed.field_f, i.field_d, sg.field_d[0], fh.field_a[0], tm.field_a[0], hc.field_c[0], var3);
                    oa.a(127);
                    return var5;
                }
                case 3: {
                    var3[var4] = mb.field_d[lb.a(255, (int) var8[var4])];
                    var4++;
                    if (var6 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var5 = new ck(ed.field_f, i.field_d, sg.field_d[0], fh.field_a[0], tm.field_a[0], hc.field_c[0], var3);
                    oa.a(127);
                    return var5;
                }
                case 5: {
                    if (var6 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var4 = -8 % ((param0 - -40) / 42);
                    var5 = new ck(ed.field_f, i.field_d, sg.field_d[0], fh.field_a[0], tm.field_a[0], hc.field_c[0], var3);
                    oa.a(127);
                    return var5;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        StringBuilder discarded$0 = null;
        int var3;
        int var4;
        String var4_ref_String;
        int var5;
        String var7;
        String var8;
        int var9;
        int var10;
        int var11;
        String var12;
        String var13;
        String var14;
        String var15;
        String var16;
        String var17;
        String var18;
        String var19;
        String var20;
        Object var21;
        Object var22;
        Object var23;
        Object var24;
        Object var25;
        Object var26;
        Object var27;
        Object var28;
        Object var29;
        Object var30;
        Object var31;
        Object var32;
        Object var33;
        Object var34;
        Object var35;
        Object var36;
        Object var37;
        Object var38;
        Object var39;
        Object var40;
        Object var41;
        Object var42;
        Object var43;
        Object var44;
        CharSequence var45;
        CharSequence var46;
        L0: {
          var21 = null;
          var22 = null;
          var23 = null;
          var24 = null;
          var25 = null;
          var26 = null;
          var27 = null;
          var28 = null;
          var29 = null;
          var30 = null;
          var31 = null;
          var32 = null;
          var33 = null;
          var34 = null;
          var35 = null;
          var36 = null;
          var37 = null;
          var38 = null;
          var39 = null;
          var40 = null;
          var41 = null;
          var42 = null;
          var43 = null;
          var44 = null;
          var11 = client.field_A ? 1 : 0;
          if (param1 == 1) {
            break L0;
          } else {
            field_Qb = true;
            break L0;
          }
        }
        L1: {
          var3 = 1;
          if (sc.field_m) {
            break L1;
          } else {
            if (null != tf.field_gb) {
              break L1;
            } else {
              var3 = 0;
              break L1;
            }
          }
        }
        L2: {
          if (pk.field_r != 0) {
            break L2;
          } else {
            if (null != g.field_N) {
              var3 = 0;
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (2 != pk.field_r) {
            break L3;
          } else {
            if (hl.a((byte) -53)) {
              break L3;
            } else {
              var3 = 0;
              break L3;
            }
          }
        }
        if ((wh.field_c ^ -1) != -85) {
          if (wh.field_c != 85) {
            var4 = el.field_G;
            if (kh.a((char) var4, 8212)) {
              if (var3 != 0) {
                if (80 > dj.field_ab.length()) {
                  L4: {
                    L5: {
                      discarded$0 = dj.field_ab.append((char) var4);
                      var5 = 485;
                      var17 = oa.field_f;
                      var16 = b.a(param1 + 82, var17);
                      var18 = var16;
                      if (pk.field_r == 2) {
                        break L5;
                      } else {
                        L6: {
                          var7 = "";
                          if (pk.field_r != 0) {
                            break L6;
                          } else {
                            L7: {
                              if (cd.field_m != null) {
                                break L7;
                              } else {
                                if (!ii.field_q) {
                                  break L7;
                                } else {
                                  var7 = "[" + uc.field_b + "] ";
                                  break L7;
                                }
                              }
                            }
                            if (null == cd.field_m) {
                              break L6;
                            } else {
                              L8: {
                                if (!wh.field_b) {
                                  var7 = "[" + cm.a((byte) 125, hf.field_a, new String[]{cd.field_m.field_Vb}) + "] ";
                                  if (var11 == 0) {
                                    break L6;
                                  } else {
                                    break L8;
                                  }
                                } else {
                                  if (null != f.field_q) {
                                    break L8;
                                  } else {
                                    L9: {
                                      var7 = "[" + cm.a((byte) 125, hf.field_a, new String[]{cd.field_m.field_Vb}) + "] ";
                                      if (var11 == 0) {
                                        break L9;
                                      } else {
                                        var7 = "[" + f.field_q + "] ";
                                        break L9;
                                      }
                                    }
                                    L10: {
                                      var19 = var7 + var18 + ": ";
                                      var5 = var5 - ff.field_o.a(var19);
                                      if (var11 == 0) {
                                        break L10;
                                      } else {
                                        L11: {
                                          var45 = (CharSequence) ((Object) ed.field_c);
                                          var20 = cm.a((byte) 94, oj.field_b, new String[]{ua.a(var45, true)});
                                          var8 = cm.a((byte) 108, im.field_j, new String[]{var16});
                                          var9 = ff.field_o.a(var20);
                                          var10 = ff.field_o.a(var8);
                                          if (var9 <= var10) {
                                            break L11;
                                          } else {
                                            var5 = var5 - var9;
                                            break L11;
                                          }
                                        }
                                        var5 = var5 - var10;
                                        break L10;
                                      }
                                    }
                                    L12: {
                                      if (ff.field_o.a(dj.field_ab.toString()) > var5) {
                                        vf.a(dj.field_ab, -23510, dj.field_ab.length() + -1, ' ');
                                        break L12;
                                      } else {
                                        break L12;
                                      }
                                    }
                                    return true;
                                  }
                                }
                              }
                              var7 = "[" + f.field_q + "] ";
                              break L6;
                            }
                          }
                        }
                        var19 = var7 + var18 + ": ";
                        var5 = var5 - ff.field_o.a(var19);
                        if (var11 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L13: {
                      var46 = (CharSequence) ((Object) ed.field_c);
                      var20 = cm.a((byte) 94, oj.field_b, new String[]{ua.a(var46, true)});
                      var8 = cm.a((byte) 108, im.field_j, new String[]{var16});
                      var9 = ff.field_o.a(var20);
                      var10 = ff.field_o.a(var8);
                      if (var9 <= var10) {
                        break L13;
                      } else {
                        var5 = var5 - var9;
                        if (var11 == 0) {
                          break L4;
                        } else {
                          break L13;
                        }
                      }
                    }
                    var5 = var5 - var10;
                    break L4;
                  }
                  if (ff.field_o.a(dj.field_ab.toString()) <= var5) {
                    return true;
                  } else {
                    vf.a(dj.field_ab, -23510, dj.field_ab.length() + -1, ' ');
                    return true;
                  }
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
            if (var3 != 0) {
              if (0 < dj.field_ab.length()) {
                vf.a(dj.field_ab, -23510, dj.field_ab.length() - 1, ' ');
                return true;
              } else {
                return true;
              }
            } else {
              return true;
            }
          }
        } else {
          L14: {
            if (var3 == 0) {
              break L14;
            } else {
              L15: {
                if ((dj.field_ab.length() ^ -1) >= -1) {
                  break L15;
                } else {
                  L16: {
                    var4_ref_String = dj.field_ab.toString();
                    if (ue.a(param1 ^ 2049, var4_ref_String)) {
                      break L16;
                    } else {
                      L17: {
                        var5 = pk.field_r;
                        if (var5 != 0) {
                          break L17;
                        } else {
                          if (null == cd.field_m) {
                            break L17;
                          } else {
                            var5 = 1;
                            break L17;
                          }
                        }
                      }
                      L18: {
                        if (-3 != (rf.a(0, var5) ^ -1)) {
                          break L18;
                        } else {
                          eg.a(var5, param2, 1, (byte) 71);
                          break L18;
                        }
                      }
                      ce.a(param0, (byte) -85, pk.field_r, ed.field_c, -1, var4_ref_String);
                      if (var11 == 0) {
                        break L15;
                      } else {
                        break L16;
                      }
                    }
                  }
                  L19: {
                    var13 = (String) null;
                    var12 = (String) null;
                    ca.a((String) null, (String) null, wd.field_a, (byte) 90, 2, 0);
                    var15 = (String) null;
                    var14 = (String) null;
                    ca.a((String) null, (String) null, um.field_e, (byte) 69, 2, 0);
                    qk.a((byte) 94);
                    if (var11 == 0) {
                      break L19;
                    } else {
                      if (0 == pk.field_r) {
                        break L19;
                      } else {
                        qk.a((byte) 94);
                        break L19;
                      }
                    }
                  }
                  return true;
                }
              }
              qk.a((byte) 94);
              if (var11 != 0) {
                break L14;
              } else {
                return true;
              }
            }
          }
          if (0 == pk.field_r) {
            return true;
          } else {
            qk.a((byte) 94);
            return true;
          }
        }
    }

    final boolean a(int param0, int param1, int param2, boolean param3, int param4, boolean param5) {
        if (param2 != -15230) {
            return false;
        }
        return this.a(param3, this.field_Rb.field_N, (byte) 43, param0, param1, param4, param5);
    }

    nm(long param0, w param1, w param2, jd param3) {
        super(param0, (w) null);
        try {
            this.field_Rb = new w(0L, param2);
            this.field_Sb = new jd(0L, param3);
            this.a(this.field_Rb, -16834);
            this.a(this.field_Sb, -16834);
            this.field_Ob = param1;
            this.field_Rb.a(param1, -16834);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "nm.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void h(byte param0) {
        if (param0 != 112) {
            field_Qb = false;
        }
    }

    final void a(int param0, boolean param1, boolean param2, int param3) {
        this.a(this.field_Rb.field_N, param0, 0, param2, param3);
        if (!param1) {
            nm.h((byte) 66);
        }
    }

    final static void e(int param0) {
        if (!(ai.f((byte) -126))) {
            return;
        }
        bl.a(-11, 4, false);
        int var1 = -75 / ((-27 - param0) / 47);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.field_mb = param5;
        if (param0 != 6) {
          return;
        } else {
          this.field_vb = param3;
          this.field_Ib = param1;
          this.field_N = param4;
          this.b(param6, 0, param2);
          return;
        }
    }

    private final void a(int param0, int param1, int param2, boolean param3, int param4) {
        L0: {
          if (!this.field_Sb.i((byte) 7)) {
            break L0;
          } else {
            this.field_Ob.field_Mb = this.field_Ob.field_Mb + param4;
            break L0;
          }
        }
        L1: {
          if (this.field_Sb.h((byte) 78)) {
            this.field_Ob.field_Mb = this.field_Ob.field_Mb - param4;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (!this.field_Sb.g((byte) -127)) {
            break L2;
          } else {
            this.field_Ob.field_Mb = this.field_Ob.field_Mb + param0;
            break L2;
          }
        }
        if (!this.field_Sb.f(param2)) {
          L3: {
            if (this.field_jb) {
              this.field_Ob.field_Mb = this.field_Ob.field_Mb - param1;
              break L3;
            } else {
              break L3;
            }
          }
          if (param3) {
            if (0 <= -(this.field_Ob.field_Ib - -this.field_Ob.field_Mb)) {
              if (this.field_Ob.field_F + (this.field_Ob.field_N + -this.field_Rb.field_N) >= -(this.field_Ob.field_Mb + this.field_Ob.field_Ib)) {
                if (this.field_Sb.j((byte) -2)) {
                  this.field_Ob.field_Ib = -this.field_Sb.a(param3, (byte) 88, this.field_Rb.field_N, this.field_Ob.field_N);
                  this.field_Ob.field_Mb = 0;
                  this.field_Sb.a(this.field_Rb.field_N, this.field_Ob.field_N, 106, -this.field_Ob.field_Ib);
                  return;
                } else {
                  this.field_Sb.a(this.field_Rb.field_N, this.field_Ob.field_N, 106, -this.field_Ob.field_Ib);
                  return;
                }
              } else {
                this.field_Ob.field_Mb = -this.field_Ob.field_Ib + -(-this.field_Rb.field_N + (this.field_Ob.field_F + this.field_Ob.field_N));
                if (this.field_Sb.j((byte) -2)) {
                  this.field_Ob.field_Ib = -this.field_Sb.a(param3, (byte) 88, this.field_Rb.field_N, this.field_Ob.field_N);
                  this.field_Ob.field_Mb = 0;
                  this.field_Sb.a(this.field_Rb.field_N, this.field_Ob.field_N, 106, -this.field_Ob.field_Ib);
                  return;
                } else {
                  this.field_Sb.a(this.field_Rb.field_N, this.field_Ob.field_N, 106, -this.field_Ob.field_Ib);
                  return;
                }
              }
            } else {
              this.field_Ob.field_Mb = -this.field_Ob.field_Ib;
              if (this.field_Ob.field_F + (this.field_Ob.field_N + -this.field_Rb.field_N) >= -(this.field_Ob.field_Mb + this.field_Ob.field_Ib)) {
                if (this.field_Sb.j((byte) -2)) {
                  this.field_Ob.field_Ib = -this.field_Sb.a(param3, (byte) 88, this.field_Rb.field_N, this.field_Ob.field_N);
                  this.field_Ob.field_Mb = 0;
                  this.field_Sb.a(this.field_Rb.field_N, this.field_Ob.field_N, 106, -this.field_Ob.field_Ib);
                  return;
                } else {
                  this.field_Sb.a(this.field_Rb.field_N, this.field_Ob.field_N, 106, -this.field_Ob.field_Ib);
                  return;
                }
              } else {
                this.field_Ob.field_Mb = -this.field_Ob.field_Ib + -(-this.field_Rb.field_N + (this.field_Ob.field_F + this.field_Ob.field_N));
                if (this.field_Sb.j((byte) -2)) {
                  this.field_Ob.field_Ib = -this.field_Sb.a(param3, (byte) 88, this.field_Rb.field_N, this.field_Ob.field_N);
                  this.field_Ob.field_Mb = 0;
                  this.field_Sb.a(this.field_Rb.field_N, this.field_Ob.field_N, 106, -this.field_Ob.field_Ib);
                  return;
                } else {
                  this.field_Sb.a(this.field_Rb.field_N, this.field_Ob.field_N, 106, -this.field_Ob.field_Ib);
                  return;
                }
              }
            }
          } else {
            if (-(this.field_Ob.field_Mb + this.field_Ob.field_Ib) <= this.field_Ob.field_F + this.field_Ob.field_N + -this.field_Rb.field_N) {
              if (-1 < (-(this.field_Ob.field_Ib - -this.field_Ob.field_Mb) ^ -1)) {
                this.field_Ob.field_Mb = -this.field_Ob.field_Ib;
                if (client.field_A) {
                  if (0 <= -(this.field_Ob.field_Ib - -this.field_Ob.field_Mb)) {
                    if (this.field_Ob.field_F + (this.field_Ob.field_N + -this.field_Rb.field_N) >= -(this.field_Ob.field_Mb + this.field_Ob.field_Ib)) {
                      if (this.field_Sb.j((byte) -2)) {
                        this.field_Ob.field_Ib = -this.field_Sb.a(param3, (byte) 88, this.field_Rb.field_N, this.field_Ob.field_N);
                        this.field_Ob.field_Mb = 0;
                        this.field_Sb.a(this.field_Rb.field_N, this.field_Ob.field_N, 106, -this.field_Ob.field_Ib);
                        return;
                      } else {
                        this.field_Sb.a(this.field_Rb.field_N, this.field_Ob.field_N, 106, -this.field_Ob.field_Ib);
                        return;
                      }
                    } else {
                      L4: {
                        this.field_Ob.field_Mb = -this.field_Ob.field_Ib + -(-this.field_Rb.field_N + (this.field_Ob.field_F + this.field_Ob.field_N));
                        if (!this.field_Sb.j((byte) -2)) {
                          break L4;
                        } else {
                          this.field_Ob.field_Ib = -this.field_Sb.a(param3, (byte) 88, this.field_Rb.field_N, this.field_Ob.field_N);
                          this.field_Ob.field_Mb = 0;
                          break L4;
                        }
                      }
                      this.field_Sb.a(this.field_Rb.field_N, this.field_Ob.field_N, 106, -this.field_Ob.field_Ib);
                      return;
                    }
                  } else {
                    L5: {
                      this.field_Ob.field_Mb = -this.field_Ob.field_Ib;
                      if (this.field_Ob.field_F + (this.field_Ob.field_N + -this.field_Rb.field_N) >= -(this.field_Ob.field_Mb + this.field_Ob.field_Ib)) {
                        break L5;
                      } else {
                        this.field_Ob.field_Mb = -this.field_Ob.field_Ib + -(-this.field_Rb.field_N + (this.field_Ob.field_F + this.field_Ob.field_N));
                        break L5;
                      }
                    }
                    L6: {
                      if (!this.field_Sb.j((byte) -2)) {
                        break L6;
                      } else {
                        this.field_Ob.field_Ib = -this.field_Sb.a(param3, (byte) 88, this.field_Rb.field_N, this.field_Ob.field_N);
                        this.field_Ob.field_Mb = 0;
                        break L6;
                      }
                    }
                    this.field_Sb.a(this.field_Rb.field_N, this.field_Ob.field_N, 106, -this.field_Ob.field_Ib);
                    return;
                  }
                } else {
                  if (this.field_Sb.j((byte) -2)) {
                    this.field_Ob.field_Ib = -this.field_Sb.a(param3, (byte) 88, this.field_Rb.field_N, this.field_Ob.field_N);
                    this.field_Ob.field_Mb = 0;
                    this.field_Sb.a(this.field_Rb.field_N, this.field_Ob.field_N, 106, -this.field_Ob.field_Ib);
                    return;
                  } else {
                    this.field_Sb.a(this.field_Rb.field_N, this.field_Ob.field_N, 106, -this.field_Ob.field_Ib);
                    return;
                  }
                }
              } else {
                if (this.field_Sb.j((byte) -2)) {
                  this.field_Ob.field_Ib = -this.field_Sb.a(param3, (byte) 88, this.field_Rb.field_N, this.field_Ob.field_N);
                  this.field_Ob.field_Mb = 0;
                  this.field_Sb.a(this.field_Rb.field_N, this.field_Ob.field_N, 106, -this.field_Ob.field_Ib);
                  return;
                } else {
                  this.field_Sb.a(this.field_Rb.field_N, this.field_Ob.field_N, 106, -this.field_Ob.field_Ib);
                  return;
                }
              }
            } else {
              this.field_Ob.field_Mb = -(-this.field_Rb.field_N + (this.field_Ob.field_N - -this.field_Ob.field_F)) - this.field_Ob.field_Ib;
              if (-1 < (-(this.field_Ob.field_Ib - -this.field_Ob.field_Mb) ^ -1)) {
                this.field_Ob.field_Mb = -this.field_Ob.field_Ib;
                if (!client.field_A) {
                  L7: {
                    if (!this.field_Sb.j((byte) -2)) {
                      break L7;
                    } else {
                      this.field_Ob.field_Ib = -this.field_Sb.a(param3, (byte) 88, this.field_Rb.field_N, this.field_Ob.field_N);
                      this.field_Ob.field_Mb = 0;
                      break L7;
                    }
                  }
                  this.field_Sb.a(this.field_Rb.field_N, this.field_Ob.field_N, 106, -this.field_Ob.field_Ib);
                  return;
                } else {
                  L8: {
                    if (0 <= -(this.field_Ob.field_Ib - -this.field_Ob.field_Mb)) {
                      break L8;
                    } else {
                      this.field_Ob.field_Mb = -this.field_Ob.field_Ib;
                      break L8;
                    }
                  }
                  L9: {
                    if (this.field_Ob.field_F + (this.field_Ob.field_N + -this.field_Rb.field_N) >= -(this.field_Ob.field_Mb + this.field_Ob.field_Ib)) {
                      break L9;
                    } else {
                      this.field_Ob.field_Mb = -this.field_Ob.field_Ib + -(-this.field_Rb.field_N + (this.field_Ob.field_F + this.field_Ob.field_N));
                      break L9;
                    }
                  }
                  L10: {
                    if (!this.field_Sb.j((byte) -2)) {
                      break L10;
                    } else {
                      this.field_Ob.field_Ib = -this.field_Sb.a(param3, (byte) 88, this.field_Rb.field_N, this.field_Ob.field_N);
                      this.field_Ob.field_Mb = 0;
                      break L10;
                    }
                  }
                  this.field_Sb.a(this.field_Rb.field_N, this.field_Ob.field_N, 106, -this.field_Ob.field_Ib);
                  return;
                }
              } else {
                L11: {
                  if (!this.field_Sb.j((byte) -2)) {
                    break L11;
                  } else {
                    this.field_Ob.field_Ib = -this.field_Sb.a(param3, (byte) 88, this.field_Rb.field_N, this.field_Ob.field_N);
                    this.field_Ob.field_Mb = 0;
                    break L11;
                  }
                }
                this.field_Sb.a(this.field_Rb.field_N, this.field_Ob.field_N, 106, -this.field_Ob.field_Ib);
                return;
              }
            }
          }
        } else {
          L12: {
            this.field_Ob.field_Mb = this.field_Ob.field_Mb - param0;
            if (this.field_jb) {
              this.field_Ob.field_Mb = this.field_Ob.field_Mb - param1;
              break L12;
            } else {
              break L12;
            }
          }
          L13: {
            L14: {
              if (param3) {
                break L14;
              } else {
                L15: {
                  if (-(this.field_Ob.field_Mb + this.field_Ob.field_Ib) <= this.field_Ob.field_F + this.field_Ob.field_N + -this.field_Rb.field_N) {
                    break L15;
                  } else {
                    this.field_Ob.field_Mb = -(-this.field_Rb.field_N + (this.field_Ob.field_N - -this.field_Ob.field_F)) - this.field_Ob.field_Ib;
                    break L15;
                  }
                }
                if (-1 >= (-(this.field_Ob.field_Ib - -this.field_Ob.field_Mb) ^ -1)) {
                  break L13;
                } else {
                  this.field_Ob.field_Mb = -this.field_Ob.field_Ib;
                  if (!client.field_A) {
                    break L13;
                  } else {
                    break L14;
                  }
                }
              }
            }
            L16: {
              if (0 <= -(this.field_Ob.field_Ib - -this.field_Ob.field_Mb)) {
                break L16;
              } else {
                this.field_Ob.field_Mb = -this.field_Ob.field_Ib;
                break L16;
              }
            }
            if (this.field_Ob.field_F + (this.field_Ob.field_N + -this.field_Rb.field_N) >= -(this.field_Ob.field_Mb + this.field_Ob.field_Ib)) {
              break L13;
            } else {
              this.field_Ob.field_Mb = -this.field_Ob.field_Ib + -(-this.field_Rb.field_N + (this.field_Ob.field_F + this.field_Ob.field_N));
              break L13;
            }
          }
          L17: {
            if (!this.field_Sb.j((byte) -2)) {
              break L17;
            } else {
              this.field_Ob.field_Ib = -this.field_Sb.a(param3, (byte) 88, this.field_Rb.field_N, this.field_Ob.field_N);
              this.field_Ob.field_Mb = 0;
              break L17;
            }
          }
          this.field_Sb.a(this.field_Rb.field_N, this.field_Ob.field_N, 106, -this.field_Ob.field_Ib);
          return;
        }
    }

    static {
        field_Pb = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_Nb = new int[128];
    }
}
