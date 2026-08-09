/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve extends ak {
    static String field_Jb;
    static ak field_Ib;
    static String field_Gb;
    private StringBuilder field_Eb;
    static int field_Kb;
    private ak field_Lb;
    private ak field_Fb;
    private int field_Hb;

    public static void b(byte param0) {
        if (param0 != -70) {
            return;
        }
        field_Ib = null;
        field_Jb = null;
        field_Gb = null;
    }

    final boolean c(byte param0) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        int var2;
        int var3;
        if (this.field_Hb == 0) {
          if (-86 == (ke.field_a ^ -1)) {
            if (-1 > (this.field_Eb.length() ^ -1)) {
              nk.a(this.field_Eb, this.field_Eb.length() - 1, ' ', 16736352);
              var2 = 17 / ((-8 - param0) / 50);
              if (this.field_Eb.length() >= 12) {
                if ((ke.field_a ^ -1) != -85) {
                  if (ke.field_a != 13) {
                    return true;
                  } else {
                    this.field_Hb = 1;
                    return true;
                  }
                } else {
                  if (this.field_Eb.length() <= 0) {
                    this.field_Hb = 1;
                    if (ke.field_a != 13) {
                      return true;
                    } else {
                      this.field_Hb = 1;
                      return true;
                    }
                  } else {
                    this.field_cb = this.field_Eb.toString();
                    this.field_Hb = 2;
                    if (ke.field_a != 13) {
                      return true;
                    } else {
                      this.field_Hb = 1;
                      return true;
                    }
                  }
                }
              } else {
                L0: {
                  var3 = Character.toLowerCase(nj.field_f);
                  if (var3 == 32) {
                    var3 = 95;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                L1: {
                  if (var3 != 95) {
                    break L1;
                  } else {
                    if (this.field_Eb.length() <= 0) {
                      break L1;
                    } else {
                      discarded$0 = this.field_Eb.append((char) var3);
                      break L1;
                    }
                  }
                }
                if (tk.a(-66, (char) var3)) {
                  L2: {
                    discarded$1 = this.field_Eb.append((char) var3);
                    if ((ke.field_a ^ -1) != -85) {
                      break L2;
                    } else {
                      if (this.field_Eb.length() <= 0) {
                        this.field_Hb = 1;
                        break L2;
                      } else {
                        this.field_cb = this.field_Eb.toString();
                        this.field_Hb = 2;
                        break L2;
                      }
                    }
                  }
                  if (ke.field_a != 13) {
                    return true;
                  } else {
                    this.field_Hb = 1;
                    return true;
                  }
                } else {
                  if (ti.a(124, (char) var3)) {
                    discarded$2 = this.field_Eb.append((char) var3);
                    if ((ke.field_a ^ -1) != -85) {
                      if (ke.field_a != 13) {
                        return true;
                      } else {
                        this.field_Hb = 1;
                        return true;
                      }
                    } else {
                      if (this.field_Eb.length() <= 0) {
                        this.field_Hb = 1;
                        if (ke.field_a != 13) {
                          return true;
                        } else {
                          this.field_Hb = 1;
                          return true;
                        }
                      } else {
                        this.field_cb = this.field_Eb.toString();
                        this.field_Hb = 2;
                        if (ke.field_a != 13) {
                          return true;
                        } else {
                          this.field_Hb = 1;
                          return true;
                        }
                      }
                    }
                  } else {
                    L3: {
                      if ((ke.field_a ^ -1) != -85) {
                        break L3;
                      } else {
                        if (this.field_Eb.length() <= 0) {
                          this.field_Hb = 1;
                          break L3;
                        } else {
                          this.field_cb = this.field_Eb.toString();
                          this.field_Hb = 2;
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (ke.field_a != 13) {
                        break L4;
                      } else {
                        this.field_Hb = 1;
                        break L4;
                      }
                    }
                    return true;
                  }
                }
              }
            } else {
              var2 = 17 / ((-8 - param0) / 50);
              if (this.field_Eb.length() >= 12) {
                if ((ke.field_a ^ -1) != -85) {
                  if (ke.field_a != 13) {
                    return true;
                  } else {
                    this.field_Hb = 1;
                    return true;
                  }
                } else {
                  if (this.field_Eb.length() <= 0) {
                    this.field_Hb = 1;
                    if (ke.field_a == 13) {
                      this.field_Hb = 1;
                      return true;
                    } else {
                      return true;
                    }
                  } else {
                    this.field_cb = this.field_Eb.toString();
                    this.field_Hb = 2;
                    if (ke.field_a != 13) {
                      return true;
                    } else {
                      this.field_Hb = 1;
                      return true;
                    }
                  }
                }
              } else {
                L5: {
                  var3 = Character.toLowerCase(nj.field_f);
                  if (var3 == 32) {
                    var3 = 95;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (var3 != 95) {
                    break L6;
                  } else {
                    if (this.field_Eb.length() <= 0) {
                      break L6;
                    } else {
                      discarded$3 = this.field_Eb.append((char) var3);
                      break L6;
                    }
                  }
                }
                if (!tk.a(-66, (char) var3)) {
                  if (!ti.a(124, (char) var3)) {
                    L7: {
                      if ((ke.field_a ^ -1) != -85) {
                        break L7;
                      } else {
                        if (this.field_Eb.length() <= 0) {
                          this.field_Hb = 1;
                          break L7;
                        } else {
                          this.field_cb = this.field_Eb.toString();
                          this.field_Hb = 2;
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (ke.field_a != 13) {
                        break L8;
                      } else {
                        this.field_Hb = 1;
                        break L8;
                      }
                    }
                    return true;
                  } else {
                    L9: {
                      discarded$4 = this.field_Eb.append((char) var3);
                      if ((ke.field_a ^ -1) != -85) {
                        break L9;
                      } else {
                        if (this.field_Eb.length() <= 0) {
                          this.field_Hb = 1;
                          break L9;
                        } else {
                          this.field_cb = this.field_Eb.toString();
                          this.field_Hb = 2;
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (ke.field_a != 13) {
                        break L10;
                      } else {
                        this.field_Hb = 1;
                        break L10;
                      }
                    }
                    return true;
                  }
                } else {
                  L11: {
                    discarded$5 = this.field_Eb.append((char) var3);
                    if ((ke.field_a ^ -1) != -85) {
                      break L11;
                    } else {
                      if (this.field_Eb.length() <= 0) {
                        this.field_Hb = 1;
                        break L11;
                      } else {
                        this.field_cb = this.field_Eb.toString();
                        this.field_Hb = 2;
                        break L11;
                      }
                    }
                  }
                  L12: {
                    if (ke.field_a != 13) {
                      break L12;
                    } else {
                      this.field_Hb = 1;
                      break L12;
                    }
                  }
                  return true;
                }
              }
            }
          } else {
            var2 = 17 / ((-8 - param0) / 50);
            if (this.field_Eb.length() >= 12) {
              if ((ke.field_a ^ -1) != -85) {
                if (ke.field_a == 13) {
                  this.field_Hb = 1;
                  return true;
                } else {
                  return true;
                }
              } else {
                if (this.field_Eb.length() > 0) {
                  L13: {
                    this.field_cb = this.field_Eb.toString();
                    this.field_Hb = 2;
                    if (ke.field_a != 13) {
                      break L13;
                    } else {
                      this.field_Hb = 1;
                      break L13;
                    }
                  }
                  return true;
                } else {
                  L14: {
                    this.field_Hb = 1;
                    if (ke.field_a != 13) {
                      break L14;
                    } else {
                      this.field_Hb = 1;
                      break L14;
                    }
                  }
                  return true;
                }
              }
            } else {
              L15: {
                var3 = Character.toLowerCase(nj.field_f);
                if (var3 == 32) {
                  var3 = 95;
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                if (var3 != 95) {
                  break L16;
                } else {
                  if (this.field_Eb.length() <= 0) {
                    break L16;
                  } else {
                    discarded$6 = this.field_Eb.append((char) var3);
                    break L16;
                  }
                }
              }
              if (!tk.a(-66, (char) var3)) {
                if (!ti.a(124, (char) var3)) {
                  L17: {
                    if ((ke.field_a ^ -1) != -85) {
                      break L17;
                    } else {
                      if (this.field_Eb.length() <= 0) {
                        this.field_Hb = 1;
                        break L17;
                      } else {
                        this.field_cb = this.field_Eb.toString();
                        this.field_Hb = 2;
                        break L17;
                      }
                    }
                  }
                  if (ke.field_a == 13) {
                    this.field_Hb = 1;
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  L18: {
                    discarded$7 = this.field_Eb.append((char) var3);
                    if ((ke.field_a ^ -1) != -85) {
                      break L18;
                    } else {
                      if (this.field_Eb.length() <= 0) {
                        this.field_Hb = 1;
                        break L18;
                      } else {
                        this.field_cb = this.field_Eb.toString();
                        this.field_Hb = 2;
                        break L18;
                      }
                    }
                  }
                  L19: {
                    if (ke.field_a != 13) {
                      break L19;
                    } else {
                      this.field_Hb = 1;
                      break L19;
                    }
                  }
                  return true;
                }
              } else {
                L20: {
                  discarded$8 = this.field_Eb.append((char) var3);
                  if ((ke.field_a ^ -1) != -85) {
                    break L20;
                  } else {
                    if (this.field_Eb.length() <= 0) {
                      this.field_Hb = 1;
                      break L20;
                    } else {
                      this.field_cb = this.field_Eb.toString();
                      this.field_Hb = 2;
                      break L20;
                    }
                  }
                }
                L21: {
                  if (ke.field_a != 13) {
                    break L21;
                  } else {
                    this.field_Hb = 1;
                    break L21;
                  }
                }
                return true;
              }
            }
          }
        } else {
          return false;
        }
    }

    final static tf[] a(boolean param0, boolean param1, int param2, int param3, boolean param4, int param5) {
        int[] var6;
        int var7;
        int var8;
        tf var9;
        Object var10;
        Object var11;
        int[] var12;
        int[] var15;
        int[] var16;
        tf var17;
        tf var18;
        tf var19;
        tf var20;
        var16 = t.field_k;
        var15 = var16;
        var12 = var15;
        var6 = var12;
        var7 = t.field_j;
        var8 = t.field_d;
        var9 = new tf(16, param3);
        var9.c();
        if (!param4) {
          L0: {
            field_Kb = 20;
            t.g(0, 0, 16, param3, param5, param2);
            var10 = null;
            if (param0) {
              var17 = var9.a();
              var10 = var17;
              var17.c();
              t.b(0, 0, 5, 0);
              t.b(0, 1, 3, 0);
              t.b(0, 2, 2, 0);
              t.b(0, 3, 1, 0);
              t.b(0, 4, 1, 0);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var11 = null;
            if (param1) {
              var18 = var9.a();
              var11 = var18;
              var18.c();
              t.b(11, 0, 5, 0);
              t.b(13, 1, 3, 0);
              t.b(14, 2, 2, 0);
              t.b(15, 3, 1, 0);
              t.b(15, 4, 1, 0);
              break L1;
            } else {
              break L1;
            }
          }
          t.a(var16, var7, var8);
          return new tf[]{null, null, null, (tf) (var10), var9, (tf) (var11), null, null, null};
        } else {
          L2: {
            t.g(0, 0, 16, param3, param5, param2);
            var10 = null;
            if (param0) {
              var19 = var9.a();
              var10 = var19;
              var19.c();
              t.b(0, 0, 5, 0);
              t.b(0, 1, 3, 0);
              t.b(0, 2, 2, 0);
              t.b(0, 3, 1, 0);
              t.b(0, 4, 1, 0);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            var11 = null;
            if (param1) {
              var20 = var9.a();
              var11 = var20;
              var20.c();
              t.b(11, 0, 5, 0);
              t.b(13, 1, 3, 0);
              t.b(14, 2, 2, 0);
              t.b(15, 3, 1, 0);
              t.b(15, 4, 1, 0);
              break L3;
            } else {
              break L3;
            }
          }
          t.a(var16, var7, var8);
          return new tf[]{null, null, null, (tf) (var10), var9, (tf) (var11), null, null, null};
        }
    }

    final int b(int param0, boolean param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var4;
        var4 = Pixelate.field_H ? 1 : 0;
        this.a(-28476, param1);
        if (param0 < -92) {
          if (param1) {
            L0: while (true) {
              if (bh.b((byte) 108)) {
                L1: {
                  if (-86 != (ke.field_a ^ -1)) {
                    break L1;
                  } else {
                    if (-1 > (this.field_Eb.length() ^ -1)) {
                      nk.a(this.field_Eb, -1 + this.field_Eb.length(), ' ', 16736352);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (aq.a(nj.field_f, (CharSequence) ((Object) this.field_Eb), (byte) -117)) {
                    discarded$0 = this.field_Eb.append(nj.field_f);
                    break L2;
                  } else {
                    L3: {
                      if (this.field_Eb.length() != 0) {
                        break L3;
                      } else {
                        if (nj.field_f == 91) {
                          discarded$1 = this.field_Eb.append(nj.field_f);
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (-2 != (this.field_Eb.length() ^ -1)) {
                        break L4;
                      } else {
                        if (nj.field_f == 35) {
                          discarded$2 = this.field_Eb.append(nj.field_f);
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (nj.field_f != 93) {
                      break L2;
                    } else {
                      discarded$3 = this.field_Eb.append(nj.field_f);
                      break L2;
                    }
                  }
                }
                if (84 != ke.field_a) {
                  if (13 == ke.field_a) {
                    return 1;
                  } else {
                    continue L0;
                  }
                } else {
                  if ((this.field_Eb.length() ^ -1) < -1) {
                    this.field_cb = this.field_Eb.toString();
                    return 2;
                  } else {
                    return 1;
                  }
                }
              } else {
                this.field_Lb.field_cb = this.field_Eb.toString();
                if (param1) {
                  if (nm.field_c != 0) {
                    if (this.field_P == 0) {
                      this.field_Hb = 1;
                      return this.field_Hb;
                    } else {
                      return this.field_Hb;
                    }
                  } else {
                    return this.field_Hb;
                  }
                } else {
                  return this.field_Hb;
                }
              }
            }
          } else {
            this.field_Lb.field_cb = this.field_Eb.toString();
            return this.field_Hb;
          }
        } else {
          return 124;
        }
    }

    ve(int param0, int param1, int param2, int param3, String param4, ak param5, ak param6, ak param7) {
        super(0L, param5);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        this.field_Hb = 0;
        try {
          L0: {
            this.field_Fb = new ak(0L, param6, param4);
            this.a(this.field_Fb, (byte) 26);
            this.field_Lb = new ak(0L, param7);
            this.field_Lb.field_N = 16764006;
            this.a(this.field_Lb, (byte) 26);
            this.field_Lb.field_qb = "|";
            this.field_Eb = new StringBuilder(12);
            var9_int = this.field_Fb.g(0);
            this.field_Fb.a(3, fq.field_q, 5, 256, var9_int);
            this.field_Lb.a(3 - -fq.field_q, fq.field_q, 5, 256, var9_int);
            var10 = var9_int + 10;
            var11 = 6 + 2 * fq.field_q;
            var12 = ui.a(param2, param0, var10, (byte) -1);
            var13 = pj.a(var11, param1, param3, (byte) 67);
            this.a(var13, var11, var12, 256, var10);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var9);

            stackIn_5_1 = new StringBuilder().append("ve.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param5 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param6 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param7 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), stackIn_15_2 + ')');
        }
    }

    final static void j(int param0) {
        cd.field_e = new String[d.field_b];
        cd.field_e[17] = ap.field_i;
        cd.field_e[20] = sh.field_c;
        cd.field_e[21] = nk.field_g;
        cd.field_e[5] = wf.field_a;
        cd.field_e[18] = gp.field_Eb;
        cd.field_e[15] = dq.field_d;
        cd.field_e[7] = uc.field_m;
        cd.field_e[19] = nk.field_h;
        cd.field_e[4] = ch.field_G;
        if (param0 != 1565) {
          return;
        } else {
          cd.field_e[11] = nj.field_d;
          cd.field_e[13] = no.field_n;
          cd.field_e[9] = ke.field_c;
          cd.field_e[6] = ae.field_j;
          cd.field_e[16] = w.field_u;
          return;
        }
    }

    static {
        field_Jb = "Withdraw request to join <%0>'s game";
        field_Gb = "You have withdrawn your request to join.";
    }
}
