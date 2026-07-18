/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb extends ql {
    private oj field_i;
    private int field_h;
    static int field_l;
    private v field_u;
    private oc field_k;
    private oc field_p;
    private oc field_r;
    private oc field_j;
    private oc field_q;
    static int field_f;
    private boolean field_s;
    private qm field_n;
    private oc field_t;
    private int field_e;
    private oc[] field_d;
    private qm field_o;
    private int field_g;
    private v field_m;

    final boolean a(byte param0) {
        int var2 = 0;
        L0: {
          if (((fb) this).field_s) {
            break L0;
          } else {
            if (ha.field_t != 3) {
              break L0;
            } else {
              var2 = -24 % ((57 - param0) / 47);
              return true;
            }
          }
        }
        return false;
    }

    final void d(int param0) {
        oc var3 = null;
        int var4 = 0;
        int var5 = 0;
        oj var5_ref_oj = null;
        int var6 = 0;
        oj var7 = null;
        int var8 = 0;
        oj var9 = null;
        oj var10 = null;
        oj var11 = null;
        p var12 = null;
        oc var13 = null;
        oc stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        oc stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        oc stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        oc stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        oc stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        oc stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        L0: {
          var8 = HostileSpawn.field_I ? 1 : 0;
          var11 = mm.field_m[0];
          var3 = var11.field_j;
          if (((fb) this).field_o == null) {
            break L0;
          } else {
            L1: {
              L2: {
                ((fb) this).field_o.field_j.a((byte) 46, var3);
                ((fb) this).field_o.field_l.a(var11.field_l.field_a - 0.5, var11.field_l.field_f - 0.5, param0 + 2);
                ((fb) this).field_o.field_c = var11.field_c;
                if (32.0 > var11.field_c) {
                  break L2;
                } else {
                  if (var11.field_c <= 224.0) {
                    if (var11.field_c < 96.0) {
                      ((fb) this).field_o.field_c = 64.0;
                      break L1;
                    } else {
                      if (var11.field_c >= 160.0) {
                        ((fb) this).field_o.field_c = 192.0;
                        break L1;
                      } else {
                        ((fb) this).field_o.field_c = 128.0;
                        break L1;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
              }
              ((fb) this).field_o.field_c = 0.0;
              break L1;
            }
            ((fb) this).field_o.field_l.a(25, (byte) 94, var11.field_c);
            ((fb) this).field_o.b((byte) 117);
            break L0;
          }
        }
        L3: {
          if (ha.field_t != 3) {
            break L3;
          } else {
            if (((fb) this).field_s) {
              break L3;
            } else {
              L4: {
                ((fb) this).field_i.field_n = false;
                var4 = -((fb) this).field_k.field_e + var3.field_e;
                var5 = var3.field_g + -((fb) this).field_k.field_g;
                if (var4 <= -2) {
                  break L4;
                } else {
                  if (var4 >= 2) {
                    break L4;
                  } else {
                    if (var5 < 0) {
                      ((fb) this).field_s = true;
                      ((fb) this).field_i.field_n = true;
                      nh.field_E.a(-1, 8360, -1);
                      ((fb) this).field_k.field_g = ((fb) this).field_k.field_g + 1;
                      var6 = ((fb) this).field_k.b(-4);
                      ln.field_a.field_c[var6] = 4;
                      ln.field_a.field_c[var6 + -1] = 4;
                      ln.field_a.field_c[var6 - -1] = 4;
                      int fieldTemp$5 = dk.field_o;
                      dk.field_o = dk.field_o + 1;
                      vj.field_w[fieldTemp$5] = new qm(ln.field_a, ((fb) this).field_k, 145, rl.field_c, 0, false);
                      tb.field_N = 150;
                      int discarded$6 = 1;
                      tk.a(1, jc.field_c, 31);
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              nh.field_E.a((byte) 46, ((fb) this).field_i.field_j);
              break L3;
            }
          }
        }
        L5: {
          if (!((fb) this).field_s) {
            break L5;
          } else {
            L6: {
              if (0 != (15 & ng.field_u)) {
                break L6;
              } else {
                if (null == ((fb) this).field_d) {
                  break L6;
                } else {
                  var4 = 3 & ng.field_u / 16;
                  if (kc.a((byte) -127, ((fb) this).field_d[var4])) {
                    break L6;
                  } else {
                    var9 = new oj(((fb) this).field_d[var4], 18, rl.field_c);
                    var5_ref_oj = var9;
                    var5_ref_oj.field_M = 0;
                    int fieldTemp$7 = el.field_j;
                    el.field_j = el.field_j + 1;
                    mm.field_m[fieldTemp$7] = var9;
                    break L6;
                  }
                }
              }
            }
            L7: {
              if (((fb) this).field_i.field_I <= 0) {
                break L7;
              } else {
                if (((fb) this).field_i.field_i != 8) {
                  break L7;
                } else {
                  break L5;
                }
              }
            }
            L8: {
              cm.a(((fb) this).field_k, false);
              var4 = ((fb) this).field_k.b(-4);
              ln.field_a.field_c[var4] = 0;
              ln.field_a.field_c[var4 - 1] = 0;
              ln.field_a.field_c[1 + var4] = 0;
              if (0 < wa.field_p) {
                kd.a(16, 1);
                nh.field_E.a((byte) 46, ((fb) this).field_p);
                break L8;
              } else {
                kd.a(17, param0 + 2);
                nh.field_E.a((byte) 46, ((fb) this).field_r);
                break L8;
              }
            }
            le.field_D = 9000;
            ((fb) this).field_h = 500;
            tb.field_N = le.field_D;
            ti.a(235, (byte) 86, 20);
            ((fb) this).field_s = false;
            if (!pm.field_h) {
              break L5;
            } else {
              if (((fb) this).field_j == null) {
                break L5;
              } else {
                if (((fb) this).field_j.field_e > 18) {
                  L9: {
                    var5 = ((fb) this).field_j.b(-4);
                    ln.field_a.field_c[var5] = 0;
                    ln.field_a.field_c[var5 - -1] = 0;
                    stackOut_34_0 = ((fb) this).field_j;
                    stackOut_34_1 = 18;
                    stackOut_34_2 = 8360;
                    stackIn_36_0 = stackOut_34_0;
                    stackIn_36_1 = stackOut_34_1;
                    stackIn_36_2 = stackOut_34_2;
                    stackIn_35_0 = stackOut_34_0;
                    stackIn_35_1 = stackOut_34_1;
                    stackIn_35_2 = stackOut_34_2;
                    if (om.field_b) {
                      stackOut_36_0 = (oc) (Object) stackIn_36_0;
                      stackOut_36_1 = stackIn_36_1;
                      stackOut_36_2 = stackIn_36_2;
                      stackOut_36_3 = 237;
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      stackIn_37_2 = stackOut_36_2;
                      stackIn_37_3 = stackOut_36_3;
                      break L9;
                    } else {
                      stackOut_35_0 = (oc) (Object) stackIn_35_0;
                      stackOut_35_1 = stackIn_35_1;
                      stackOut_35_2 = stackIn_35_2;
                      stackOut_35_3 = -1;
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_37_1 = stackOut_35_1;
                      stackIn_37_2 = stackOut_35_2;
                      stackIn_37_3 = stackOut_35_3;
                      break L9;
                    }
                  }
                  ((oc) (Object) stackIn_37_0).a(stackIn_37_1, stackIn_37_2, stackIn_37_3);
                  break L5;
                } else {
                  break L5;
                }
              }
            }
          }
        }
        L10: {
          if (ha.field_t != 16) {
            break L10;
          } else {
            if (null != ((fb) this).field_o) {
              break L10;
            } else {
              if (0 <= ((fb) this).field_g) {
                break L10;
              } else {
                var4 = ih.a(var3, (byte) -90, ((fb) this).field_p);
                if (4 > var4) {
                  ca.a((double)(((fb) this).field_p.field_e - -1), 0, (double)(((fb) this).field_p.field_g - -3), true, 0);
                  ((fb) this).field_o = new qm(ln.field_a, var3, 230, rl.field_c, 0, false);
                  ((fb) this).field_o.field_c = var11.field_c;
                  int fieldTemp$8 = dk.field_o;
                  dk.field_o = dk.field_o + 1;
                  vj.field_w[fieldTemp$8] = ((fb) this).field_o;
                  break L10;
                } else {
                  break L10;
                }
              }
            }
          }
        }
        L11: {
          if (null == ((fb) this).field_o) {
            break L11;
          } else {
            if (dn.field_i != of.field_d) {
              ((fb) this).field_n = ((fb) this).field_o;
              ((fb) this).field_g = 1000;
              ((fb) this).field_o = null;
              kd.a(17, param0 + 2);
              nh.field_E.a(-1, 8360, -1);
              break L11;
            } else {
              break L11;
            }
          }
        }
        L12: {
          if (0 > ((fb) this).field_g) {
            break L12;
          } else {
            ((fb) this).field_g = ((fb) this).field_g - 1;
            if (((fb) this).field_g == 0) {
              L13: {
                cm.a(((fb) this).field_p, false);
                ((fb) this).field_n.field_u = null;
                ((fb) this).field_n.field_i = -1;
                kd.a(14, 1);
                nh.field_E.a((byte) 46, ((fb) this).field_q);
                var4 = ((fb) this).field_p.b(-4);
                ln.field_a.field_c[var4] = 0;
                ln.field_a.field_c[var4 + 1] = 0;
                ln.field_a.field_c[var4 - ln.field_a.field_d] = 0;
                ln.field_a.field_c[-ln.field_a.field_d + var4 + 1] = 0;
                if (uj.field_l != 1) {
                  break L13;
                } else {
                  if (ej.d((byte) 86)) {
                    eh.field_c.a(lm.field_A[17], 100, uh.field_i);
                    break L13;
                  } else {
                    break L13;
                  }
                }
              }
              var5 = 1;
              L14: while (true) {
                if (var5 >= 5) {
                  break L12;
                } else {
                  var6 = 0;
                  L15: while (true) {
                    if (256 < var6) {
                      var5++;
                      continue L14;
                    } else {
                      var12 = jn.field_F[ib.field_c];
                      var12.field_c = (double)var6;
                      var12.field_j.a((byte) 46, ((fb) this).field_n.field_j);
                      var12.field_l.a(0.0, 0.0, 1);
                      var12.field_i = 8;
                      var12.field_h = var5;
                      var12.field_e = 0;
                      var12.field_l.a(4 * var5, (byte) 94, var12.field_c);
                      var12.a(225, -10.0 + (var12.field_c + Math.random() * 20.0), 50);
                      ib.field_c = ib.field_c + 1;
                      var6 += 16;
                      continue L15;
                    }
                  }
                }
              }
            } else {
              break L12;
            }
          }
        }
        if (param0 == -1) {
          L16: {
            if (ha.field_t == 17) {
              if (var3.field_e < ((fb) this).field_r.field_e + -7) {
                break L16;
              } else {
                if (((fb) this).field_r.field_e - -4 <= var3.field_e) {
                  break L16;
                } else {
                  L17: {
                    var4 = 24 * (((fb) this).field_r.field_g - 5);
                    if (uj.field_p.field_g >= var4) {
                      break L17;
                    } else {
                      uj.field_p.field_g = var4;
                      break L17;
                    }
                  }
                  L18: {
                    if (dl.field_l) {
                      break L18;
                    } else {
                      if (var3.field_g <= 5 + ((fb) this).field_r.field_g) {
                        dl.field_l = true;
                        nh.field_E.a(-1, param0 ^ -8361, -1);
                        ((fb) this).field_e = 300;
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                  }
                  L19: {
                    if (~(-10 + ((fb) this).field_r.field_g) < ~var3.field_g) {
                      var3.field_g = ((fb) this).field_r.field_g + -10;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    L21: {
                      if (!dl.field_l) {
                        break L21;
                      } else {
                        if (~var3.field_e <= ~((fb) this).field_r.field_e) {
                          break L21;
                        } else {
                          var11.field_l.field_f = var11.field_l.field_f + 0.2;
                          break L20;
                        }
                      }
                    }
                    if (!dl.field_l) {
                      break L20;
                    } else {
                      if (~((fb) this).field_r.field_e > ~var3.field_e) {
                        var11.field_l.field_f = var11.field_l.field_f - 0.2;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                  }
                  L22: {
                    if (dl.field_l) {
                      if (((fb) this).field_e <= 0) {
                        mf.a(false, 3);
                        break L22;
                      } else {
                        ((fb) this).field_e = ((fb) this).field_e - 1;
                        break L22;
                      }
                    } else {
                      break L22;
                    }
                  }
                  if (!dl.field_l) {
                    break L16;
                  } else {
                    if ((7 & 300 + -((fb) this).field_e) == 0) {
                      L23: {
                        var13 = new oc(((fb) this).field_t);
                        var13.field_e = var13.field_e + ((int)(4.0 * Math.random()) + -1);
                        var13.field_g = var13.field_g + (-2 + (int)(4.0 * Math.random()));
                        var6 = 18;
                        if (((fb) this).field_e != 300) {
                          if (Math.random() < 0.4) {
                            var6 = 1;
                            break L23;
                          } else {
                            break L23;
                          }
                        } else {
                          var13.a((byte) 46, ((fb) this).field_t);
                          var6 = 27;
                          var13.field_g = var13.field_g - 4;
                          break L23;
                        }
                      }
                      L24: {
                        var10 = new oj(var13, var6, rl.field_c);
                        var7 = var10;
                        if (var6 != 1) {
                          break L24;
                        } else {
                          var7.field_B = 100;
                          break L24;
                        }
                      }
                      int fieldTemp$9 = el.field_j;
                      el.field_j = el.field_j + 1;
                      mm.field_m[fieldTemp$9] = var10;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                }
              }
            } else {
              break L16;
            }
          }
          L25: {
            if (ha.field_t != 14) {
              break L25;
            } else {
              L26: {
                if (var3.field_g >= ((fb) this).field_q.field_g - -7) {
                  break L26;
                } else {
                  if (((fb) this).field_q.field_e + 10 > var3.field_e) {
                    var4 = -640 + 24 * (((fb) this).field_q.field_e + 10);
                    if (~uj.field_p.field_e >= ~var4) {
                      break L26;
                    } else {
                      uj.field_p.field_e = var4;
                      break L26;
                    }
                  } else {
                    break L26;
                  }
                }
              }
              var4 = ih.a(((fb) this).field_q, (byte) -127, var3);
              if (var4 < 3) {
                ng.field_k = true;
                mf.a(false, 3);
                ti.a(225, (byte) -110, 30);
                break L25;
              } else {
                break L25;
              }
            }
          }
          L27: {
            if (0 >= ((fb) this).field_h) {
              break L27;
            } else {
              ((fb) this).field_h = ((fb) this).field_h - 1;
              break L27;
            }
          }
          L28: {
            if (!pm.field_h) {
              break L28;
            } else {
              if (!om.field_b) {
                break L28;
              } else {
                if (((fb) this).field_j != null) {
                  if (ln.field_a.field_g[var3.b(-4)] != 2) {
                    break L28;
                  } else {
                    ti.a(((fb) this).field_j.field_g, (byte) -111, ((fb) this).field_j.field_e);
                    ((fb) this).field_j = null;
                    ((fb) this).field_u.field_a = 1;
                    break L28;
                  }
                } else {
                  break L28;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void b(byte param0) {
        if (17 == ha.field_t) {
            if (!(0 >= ((fb) this).field_h)) {
                ((fb) this).field_m.field_d = -((fb) this).field_m.field_h + (480 + uj.field_p.field_g + -50);
                ((fb) this).field_m.field_l = (-((fb) this).field_m.field_m + 640) / 2 + uj.field_p.field_e;
                boolean discarded$0 = ((fb) this).field_m.a((byte) -76);
            }
        }
        if (((fb) this).field_u.field_a == 1) {
            boolean discarded$1 = ((fb) this).field_u.a((byte) -127);
        }
        int var2 = 76 % ((-48 - param0) / 38);
    }

    final void e(int param0) {
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        L0: {
          var4 = HostileSpawn.field_I ? 1 : 0;
          var13 = ln.field_a.field_v;
          var11 = var13;
          var9 = var11;
          var7 = var9;
          var5 = var7;
          var14 = var5;
          var12 = var14;
          var10 = var12;
          var8 = var10;
          var2 = var8;
          ((fb) this).field_i = vi.field_p[param0];
          if (var13.length < 12) {
            ((fb) this).field_k = new oc();
            ((fb) this).field_p = new oc();
            ((fb) this).field_r = new oc();
            ((fb) this).field_q = new oc();
            ((fb) this).field_t = new oc();
            break L0;
          } else {
            ((fb) this).field_k = new oc(var13[2], var13[3]);
            ((fb) this).field_p = new oc(var13[4], var13[5]);
            ((fb) this).field_r = new oc(var13[6], var13[7]);
            ((fb) this).field_q = new oc(var13[8], var13[9]);
            ((fb) this).field_t = new oc(var13[10], var13[11]);
            break L0;
          }
        }
        L1: {
          if (var14.length < 20) {
            ((fb) this).field_d = null;
            break L1;
          } else {
            var3 = 0;
            L2: while (true) {
              if (4 <= var3) {
                break L1;
              } else {
                ((fb) this).field_d[var3] = new oc(var2[2 * var3 - -12], var2[1 + 2 * var3 - -12]);
                var3++;
                continue L2;
              }
            }
          }
        }
        L3: {
          ((fb) this).field_m = new v(je.field_b, 24 * ((fb) this).field_k.field_e, 24 + ((fb) this).field_k.field_g * 24);
          kd.a(3, 1);
          ((fb) this).field_g = -1;
          ((fb) this).field_s = false;
          if (!pm.field_h) {
            break L3;
          } else {
            if (var14.length > 20) {
              ((fb) this).field_j = new oc(var14[20], var14[21]);
              break L3;
            } else {
              break L3;
            }
          }
        }
        L4: {
          if (22 < var14.length) {
            ((fb) this).field_u = new v(qh.field_c, 24 * var14[22], 24 * var14[23]);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (!om.field_b) {
            var6 = 0;
            var3 = var6;
            L6: while (true) {
              if (ln.field_a.field_g.length <= var6) {
                break L5;
              } else {
                if (2 == ln.field_a.field_g[var6]) {
                  if (4 != ln.field_a.field_c[var6]) {
                    if (2 == ln.field_a.field_c[var6]) {
                      ln.field_a.field_c[var6] = 4;
                      var6++;
                      continue L6;
                    } else {
                      var6++;
                      continue L6;
                    }
                  } else {
                    ln.field_a.field_c[var6] = 0;
                    var6++;
                    continue L6;
                  }
                } else {
                  var6++;
                  continue L6;
                }
              }
            }
          } else {
            break L5;
          }
        }
    }

    final static void a() {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var5_int = 430;
            var6 = 32;
            L1: while (true) {
              if (var6 >= var5_int) {
                break L0;
              } else {
                si.e(32, var6, 576, 65793, 96);
                var6 += 2;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var5, "fb.A(" + 32 + ',' + 398 + ',' + 11992 + ',' + 32 + ',' + 576 + ')');
        }
    }

    final void c(int param0) {
        if (param0 != 0) {
            return;
        }
        if (!om.field_b) {
            ti.a(224, (byte) 40, 31);
        } else {
            ti.a(214, (byte) -114, 41);
        }
    }

    final String a(boolean param0) {
        if (3 != ha.field_t) {
            return cj.field_K;
        }
        if (((fb) this).field_s) {
            return en.field_v;
        }
        if (param0) {
            ((fb) this).b((byte) 80);
        }
        return o.field_l;
    }

    final boolean a(oc param0, boolean param1, byte param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param2 == 109) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("fb.BA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final static boolean a(double param0, byte param1, double param2, double param3, double param4, double param5, double param6, double param7, double param8) {
        double var17 = -param8 + param3;
        double var19 = -param5 + param7;
        double var21 = -param4 + param3;
        double var23 = -param0 + param7;
        double var25 = -param6 + param3;
        double var27 = param7 - param2;
        if ((-(var25 * var19) + var27 * var17) * (-(var19 * var21) + var23 * var17) >= 0.0) {
            return false;
        }
        var21 = -param8 + param6;
        var27 = -param7 + param2;
        var23 = param2 - param5;
        var25 = -param3 + param6;
        var19 = -param0 + param2;
        var17 = -param4 + param6;
        if (0.0 <= (-(var25 * var19) + var27 * var17) * (var23 * var17 - var19 * var21)) {
            return false;
        }
        return true;
    }

    public fb() {
        ((fb) this).field_d = new oc[4];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 480;
        field_l = 0;
    }
}
