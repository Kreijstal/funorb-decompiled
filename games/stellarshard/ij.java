/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij extends ib {
    int field_u;
    int field_t;
    int field_s;
    int field_r;
    private boolean field_o;
    int field_p;
    private int field_q;

    final void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = stellarshard.field_B;
        try {
          if (fb.field_n > 0) {
            return;
          }
          var2_int = 0;
          var3 = this.field_j - 1;
          if (s.field_i) {
            var3 -= 3;
            if (!(mk.field_k > 0)) {
              var3--;
              if (var4 != 0 &&
                of.field_A <= 1) {
                var2_int = 1;
              }
            }
          } else {
            if (of.field_A <= 1) {
              var2_int = 1;
            }
          }
          if (tl.field_c == 4) {
            var2_int = 8;
            var3 = 9;
          }
          if (tl.field_c == 1) {
            var3 = 10;
            var2_int = 9;
          }
          if (tl.field_c == 2) {
            var2_int = 8;
            var3 = 10;
          }
          if (tl.field_c == 3) {
            var2_int = 8;
            var3 = 10;
          }
          if (param0 == tl.field_c &&
            gi.field_f == 96) {
            this.field_l = 1;
            if ((var4 != 0) && (tl.field_c == 8 &&
              gi.field_f == 97)) {
              this.field_l = 0;
            }
          } else {
            if (tl.field_c == 8 &&
              gi.field_f == 97) {
              this.field_l = 0;
            }
          }
          if (gi.field_f == 98) {
            if (tl.field_c != 0 &&
              tl.field_c != 4 &&
              tl.field_c != 1 &&
              tl.field_c != 2 &&
              3 != tl.field_c) {
              return;
            }
            this.field_l = this.field_l - 1;
            if (this.field_l == 0 &&
              s.field_i) {
              this.field_l = -1 + var3;
            }
            if (1 == this.field_l &&
              s.field_i) {
              this.field_l = this.field_l - 1;
            }
            if (var2_int > this.field_l &&
              s.field_i) {
              this.field_l = 1;
            }
            if (var2_int <= this.field_l) {
              return;
            }
            this.field_l = var3 - 1;
            if (var4 == 0) {
              return;
            }
          }
          if (gi.field_f == 99) {
            if (tl.field_c != 0 &&
              tl.field_c != 4 &&
              tl.field_c != 1 &&
              2 != tl.field_c &&
              tl.field_c != 3) {
              return;
            }
            this.field_l = this.field_l + 1;
            if (this.field_l == 2 &&
              s.field_i) {
              this.field_l = var2_int;
            }
            if (this.field_l == 1 &&
              s.field_i) {
              this.field_l = this.field_l + 1;
            }
            if (this.field_l >= var3 &&
              s.field_i) {
              this.field_l = 1;
            }
            if (this.field_l < var2_int) {
              this.field_l = var2_int;
            }
            if (var3 > this.field_l) {
              return;
            }
            this.field_l = var2_int;
            if (var4 == 0) {
              return;
            }
          }
          this.c(this.field_l, -3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "ij.I(" + param0 + ')');
        }
    }

    final int a(byte param0, int param1, int param2) {
        boolean discarded$1 = false;
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= this.field_e &&
            param2 < this.field_i &&
            this.field_b <= param1) {
            if (param0 != 59) {
              discarded$1 = this.a(-41, -5, true, 42, true, (String) null, -77);
            }
            var4_int = (param1 - this.field_b) / this.field_a;
            if (this.field_j <= var4_int) {
              stackIn_14_0 = -1;
              return stackIn_14_0;
            }
            if (s.field_i &&
              tl.field_c == 0) {
              if (var4_int >= 1) {
                var4_int++;
              }
              if (var4_int > 4 &&
                mk.field_k <= 0) {
                var4_int = 1;
              }
              if (5 < var4_int &&
                mk.field_k > 0) {
                var4_int = 1;
              }
            }
            stackIn_37_0 = var4_int;
            return stackIn_37_0;
          }
          stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var4), "ij.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, boolean param5) {
        boolean stackIn_41_1 = false;
        boolean stackIn_89_1 = false;
        boolean stackIn_108_0 = false;
        boolean stackIn_134_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = stellarshard.field_B;
        try {
          if (param2 != 8) {
            this.field_o = true;
          }
          if (tl.field_c != 2 ||
            param3 != 8 ||
            ah.a(-1)) {
            if (0 == tl.field_c) {
              if (1 != param3 ||
                s.field_i ||
                !(of.field_A > 1)) {
                if (param3 != 3) {
                  if (4 != param3) {
                    super.a(param0, param1, (byte) 8, param3, param4, param5);
                    if (var8 == 0) {
                      return;
                    }
                  }
                  stackIn_41_1 = (320 <= param1) && (param1 < 420);
                  this.field_o = stackIn_41_1;
                  if (param5) {
                    this.field_o = true;
                  }
                  boolean decompiledFrameRemainder0 = true;
                  if (this.field_o) {
                    ai.field_c = param1 - 320;
                    if (ai.field_c < 0) {
                      ai.field_c = 0;
                    }
                    if (ai.field_c > 100) {
                      ai.field_c = 100;
                    }
                    decompiledFrameRemainder0 = (vf.field_L == null);
                    if (decompiledFrameRemainder0) {
                      vf.field_L = fe.field_c;
                      nj.field_o.a(vf.field_L);
                      decompiledFrameRemainder0 = (var8 != 0);
                    }
                  }
                  if ((decompiledFrameRemainder0) && ((320 - l.field_f.b(of.field_D)) <= param1 &&
                    param1 < 320 &&
                    !param5)) {
                    if (null != vf.field_L) {
                      nj.field_o.b(vf.field_L);
                      vf.field_L.c();
                      vf.field_L = null;
                      if (var8 != 0) {
                        vf.field_L = fe.field_c;
                        nj.field_o.a(vf.field_L);
                      }
                    } else {
                      vf.field_L = fe.field_c;
                      nj.field_o.a(vf.field_L);
                    }
                  }
                  if (vf.field_L == null) {
                    return;
                  }
                  vf.field_L.d(ai.field_c / 2);
                  if (var8 == 0) {
                    return;
                  }
                }
                stackIn_89_1 = (param1 >= 320) && (param1 < 420);
                this.field_o = stackIn_89_1;
                if (param5) {
                  this.field_o = true;
                }
                if (!this.field_o) {
                  if ((!(param1 < (320 - l.field_f.b(vl.field_h)))) &&
                    (!(param1 >= 320)) &&
                    (!param5)) {
                    stackIn_108_0 = !(fe.field_e);
                    fe.field_e = stackIn_108_0;
                    if (var8 != 0) {
                      pk.field_h = param1 - 320;
                      fe.field_e = true;
                      if (pk.field_h < 0) {
                        pk.field_h = 0;
                      }
                      if (pk.field_h > 100) {
                        pk.field_h = 100;
                      }
                    }
                  }
                } else {
                  pk.field_h = param1 - 320;
                  fe.field_e = true;
                  if (pk.field_h < 0) {
                    pk.field_h = 0;
                  }
                  if (pk.field_h > 100) {
                    pk.field_h = 100;
                  }
                }
                if (!fe.field_e) {
                  return;
                }
                if (param5) {
                  return;
                }
                ll.field_c.a(sb.field_e[0], 50, pk.field_h * 2);
                if (var8 == 0) {
                  return;
                }
              }
              stackIn_134_1 = (param1 >= 320) && (param1 < 420);
              this.field_o = stackIn_134_1;
              if (param5) {
                this.field_o = true;
              }
              if (!this.field_o) {
                return;
              }
              var7_int = -320 + param1;
              if (0 > var7_int) {
                var7_int = 0;
              }
              if (100 < var7_int) {
                var7_int = 100;
              }
              qi.field_a = 1 + (-2 + of.field_A * var7_int) / 100;
              if (var8 == 0) {
                return;
              }
            }
            super.a(param0, param1, (byte) 8, param3, param4, param5);
            if (var8 == 0) {
              return;
            }
          }
          if (ni.field_e < 224) {
            si.field_X = 0;
            if (var8 == 0) {
              return;
            }
          }
          if (416 >= ni.field_e) {
            si.field_X = 1;
            if (var8 == 0) {
              return;
            }
          }
          si.field_X = 2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var7), "ij.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void b(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = stellarshard.field_B;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (1 == param0 &&
            !s.field_i &&
            of.field_A > 1 &&
            tl.field_c == 0) {
            qi.field_a = qi.field_a - 1;
            decompiledFrameRemainder0 = !(1 <= qi.field_a);
            if (decompiledFrameRemainder0) {
              qi.field_a = 1;
              decompiledFrameRemainder0 = (var4 != 0);
            }
          }
          if (decompiledFrameRemainder0) {
            if (param0 == 3) {
              pk.field_h = pk.field_h - 12;
              decompiledFrameRemainder0 = !(pk.field_h >= 10);
              if (decompiledFrameRemainder0) {
                pk.field_h = 10;
                fe.field_e = false;
              }
            }
            if ((decompiledFrameRemainder0) &&
              (param0 != 3 ||
              var4 != 0) &&
              (4 == param0)) {
              ai.field_c = ai.field_c - 12;
              if (ai.field_c < 10) {
                ai.field_c = 10;
                if (vf.field_L != null) {
                  nj.field_o.b(vf.field_L);
                  vf.field_L.c();
                  vf.field_L = null;
                }
              }
              if (null != vf.field_L) {
                vf.field_L.d(ai.field_c / 2);
              }
            }
          }
          if (param1 != -1) {
            this.field_s = -58;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3), "ij.B(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1) {
        int stackIn_27_1 = 0;
        boolean stackIn_150_0 = false;
        boolean stackIn_220_0 = false;
        int stackIn_348_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = stellarshard.field_B;
        try {
          if (pk.a(-12663, 0) &&
            fe.field_e) {
            ll.field_c.a(sb.field_e[51 + (int)(Math.random() * 10.0)], (int)(Math.random() * 100.0) + 50, pk.field_h * 2);
          }
          if (param0 != 424) {
            this.a(true, 82);
          }
          if (tl.field_c != 8) {
            if (tl.field_c == 3 && (fb.field_n == 0 ||
              1 == gh.field_c)) {
              if (param1 == 8 &&
                ah.a(param0 ^ -425)) {
                am.a(3, 3, param0 ^ 466);
                if (var4 == 0) {
                  return;
                }
              }
              if (param1 != 8 ||
                !oc.field_d) {
                if (param1 != 9) {
                  return;
                }
                n.field_L = 255;
                if (v.field_e) {
                  this.field_l = -1;
                  if (var4 != 0) {
                    this.field_l = 7;
                  }
                } else {
                  this.field_l = 7;
                }
                tl.field_c = 0;
                if (oa.field_D) {
                  return;
                }
                tl.field_c = 8;
                oa.field_D = true;
                ta.a(v.field_e, 713);
                if (var4 == 0) {
                  return;
                }
              }
              tl.field_c = 2;
              oc.field_d = false;
              n.field_L = 255;
              if (!v.field_e) {
                this.field_l = 9;
                if (var4 == 0) {
                  return;
                }
              }
              this.field_l = -1;
              if (var4 == 0) {
                return;
              }
            }
            if (2 == tl.field_c) {
              if (param1 == 8 &&
                ah.a(-1)) {
                am.a(2, 2, param0 - 544);
                if (var4 == 0) {
                  return;
                }
              }
              if (param1 != 8) {
                if (param1 != 9) {
                  return;
                }
                n.field_L = 255;
                if (!v.field_e) {
                  this.field_l = 6;
                  if (var4 != 0) {
                    this.field_l = -1;
                  }
                } else {
                  this.field_l = -1;
                }
                tl.field_c = 0;
                if (oa.field_D) {
                  return;
                }
                oa.field_D = true;
                tl.field_c = 8;
                ta.a(v.field_e, 713);
                if (var4 == 0) {
                  return;
                }
              }
              si.field_X = si.field_X + 1;
              if (3 > si.field_X) {
                return;
              }
              si.field_X = si.field_X - 3;
              if (var4 == 0) {
                return;
              }
            }
            if (tl.field_c != 1) {
              if (4 == tl.field_c) {
                if (param1 != 8) {
                  return;
                }
                if (!v.field_e) {
                  this.field_l = 9;
                  if (var4 != 0) {
                    this.field_l = -1;
                  }
                } else {
                  this.field_l = -1;
                }
                tl.field_c = 0;
                n.field_L = 255;
                gh.field_d = null;
                if (!ah.a(-1)) {
                  if (0 < ue.field_a) {
                    tl.field_c = 2;
                  }
                  if (oc.field_d) {
                    tl.field_c = 3;
                  }
                  if (tl.field_c == 0) {
                    return;
                  }
                  stackIn_150_0 = !(mk.field_k <= 0);
                  oa.field_D = stackIn_150_0;
                  if (var4 == 0) {
                    return;
                  }
                }
                oc.field_d = false;
                if (var4 == 0) {
                  return;
                }
              }
              if (tl.field_c != 0) {
                return;
              }
              var3_int = this.field_j;
              if (s.field_i) {
                var3_int -= 3;
                if (mk.field_k <= 0) {
                  var3_int--;
                }
              }
              if (var3_int <= param1) {
                return;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param1 != 8 ||
                fb.field_n != 0 &&
                gh.field_c != 1) {
                if (param1 == 0 &&
                  a.field_h[0] != null &&
                  a.field_h[0].field_m == -1) {
                  na.field_j = null;
                  decompiledFrameRemainder0 = (var4 != 0);
                }
                if (decompiledFrameRemainder0) {
                  if ((param1 == 0 && (null == a.field_h[0] ||
                    a.field_h[0].field_m != -1)) &&
                    (decompiledFrameRemainder0 = !(of.field_A <= 1))) {
                    ea.e((byte) 97);
                    vc.field_h.m((byte) 127);
                    na.field_j = null;
                    stellarshard.field_K = false;
                    bi.field_u = null;
                    if (qi.field_a > 0) {
                      qi.field_a = qi.field_a - 1;
                    }
                    nf.field_r = false;
                    s.field_i = true;
                    tl.field_a = 0;
                    decompiledFrameRemainder0 = (qi.field_a == 0);
                    if (decompiledFrameRemainder0) {
                      nf.field_r = true;
                      stellarshard.field_K = true;
                      e.field_c = false;
                      decompiledFrameRemainder0 = (var4 != 0);
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    if (1 != param1) {
                      if (param1 == 3) {
                        stackIn_220_0 = !(fe.field_e);
                        fe.field_e = stackIn_220_0;
                        decompiledFrameRemainder0 = (var4 != 0);
                      }
                      if (decompiledFrameRemainder0) {
                        if (4 == param1) {
                          if (null == vf.field_L) {
                            vf.field_L = fe.field_c;
                            nj.field_o.a(vf.field_L);
                            decompiledFrameRemainder0 = (var4 != 0);
                          }
                          if (decompiledFrameRemainder0) {
                            nj.field_o.b(vf.field_L);
                            vf.field_L.c();
                            vf.field_L = null;
                            decompiledFrameRemainder0 = (var4 != 0);
                          }
                        }
                        if (decompiledFrameRemainder0) {
                          if (param1 == 2) {
                            if (1 != tl.field_c) {
                              n.field_L = 255;
                            }
                            tl.field_c = 1;
                            if (!v.field_e) {
                              this.field_l = 9;
                              decompiledFrameRemainder0 = (var4 != 0);
                            }
                            if (decompiledFrameRemainder0) {
                              this.field_l = -1;
                              decompiledFrameRemainder0 = (var4 != 0);
                            }
                          }
                          if (decompiledFrameRemainder0) {
                            if (param1 == 7) {
                              if (!s.field_i) {
                                if (tl.field_c != 3) {
                                  n.field_L = 255;
                                }
                                if (v.field_e) {
                                  this.field_l = -1;
                                  if (var4 != 0) {
                                    this.field_l = 9;
                                  }
                                } else {
                                  this.field_l = 9;
                                }
                                tl.field_c = 3;
                              }
                              oc.field_d = false;
                              decompiledFrameRemainder0 = (var4 != 0);
                            }
                            if (decompiledFrameRemainder0) {
                              if ((param1 != 6) &&
                                (decompiledFrameRemainder0 = (param1 == 5))) {
                                if (null == s.field_e) {
                                  vc.field_h.l((byte) -119);
                                  decompiledFrameRemainder0 = (var4 != 0);
                                }
                                if (decompiledFrameRemainder0) {
                                  nd.a(-26621, s.field_e);
                                  s.field_e.a(ic.field_d, -105);
                                  s.field_e = null;
                                  qd.field_j.requestFocus();
                                  decompiledFrameRemainder0 = (var4 != 0);
                                }
                              }
                              if ((decompiledFrameRemainder0) &&
                                (decompiledFrameRemainder0 = !(s.field_i))) {
                                if (!ah.a(-1)) {
                                  gh.field_d = bk.a(3, 10, 1, param0 ^ 441, 5);
                                }
                                if (2 != tl.field_c) {
                                  n.field_L = 255;
                                }
                                tl.field_c = 2;
                                if (v.field_e) {
                                  this.field_l = -1;
                                  decompiledFrameRemainder0 = (var4 != 0);
                                }
                                if (decompiledFrameRemainder0) {
                                  this.field_l = 9;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    if ((decompiledFrameRemainder0) &&
                      (1 == param1 ||
                      var4 != 0)) {
                      if (a.field_h[0] == null ||
                        a.field_h[0].field_m != -1) {
                        if (!(of.field_A > 1)) {
                          ea.e((byte) 93);
                          vc.field_h.m((byte) 127);
                          s.field_i = true;
                          qe.field_e = 0;
                          nf.field_r = true;
                          stellarshard.field_K = true;
                          tl.field_a = 0;
                          bi.field_u = null;
                          if (qi.field_a > 0) {
                            qi.field_a = qi.field_a - 1;
                          }
                          na.field_j = null;
                          na.field_j = null;
                          if (var4 != 0) {
                            nc.field_H = 0;
                            a.field_h[0].field_g = -150;
                            na.field_j = null;
                            if (s.field_e != null) {
                              nd.a(-26621, s.field_e);
                              s.field_e.a(ic.field_d, -104);
                              s.field_e = null;
                              qd.field_j.requestFocus();
                            }
                            df.a(false, hf.a((byte) -93));
                          }
                        }
                      } else {
                        nc.field_H = 0;
                        a.field_h[0].field_g = -150;
                        na.field_j = null;
                        if (var4 != 0) {
                          if (s.field_e != null) {
                            nd.a(-26621, s.field_e);
                            s.field_e.a(ic.field_d, -104);
                            s.field_e = null;
                            qd.field_j.requestFocus();
                          }
                          df.a(false, hf.a((byte) -93));
                        }
                      }
                    }
                  }
                }
              } else {
                if (s.field_e != null) {
                  nd.a(-26621, s.field_e);
                  s.field_e.a(ic.field_d, -104);
                  s.field_e = null;
                  qd.field_j.requestFocus();
                }
                df.a(false, hf.a((byte) -93));
              }
              if (var4 == 0) {
                return;
              }
            }
            if (param1 == 9) {
              n.field_L = 255;
              tl.field_c = 0;
              if (v.field_e) {
                this.field_l = -1;
                if (var4 == 0) {
                  return;
                }
              }
              if (1 >= of.field_A &&
                !s.field_i) {
                stackIn_348_1 = 3;
              } else {
                stackIn_348_1 = 2;
              }
              this.field_l = stackIn_348_1;
            }
          } else {
            if (param1 == 0) {
              boolean decompiledSharedTail0 = !(v.field_e);
              if (!decompiledSharedTail0) {
                this.field_l = -1;
                decompiledSharedTail0 = (var4 != 0);
              }
              if (decompiledSharedTail0) {
                if (of.field_A <= 1) {
                  stackIn_27_1 = 1;
                } else {
                  stackIn_27_1 = 0;
                }
                this.field_l = stackIn_27_1;
              }
              n.field_L = 255;
              tl.field_c = 0;
              if (var4 == 0) {
                return;
              }
            }
            if (param1 == 1) {
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3), "ij.F(" + param0 + ',' + param1 + ')');
        }
    }

    ij(stellarshard param0) {
        super(10, 64, 576, 196, 28);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_u = -1;
        this.field_t = -5;
        this.field_s = 30;
        this.field_r = -1;
        this.field_p = 0;
        try {
          nj.field_f = new int[10];
          n.field_L = 255;
          tl.field_c = 0;
          this.field_l = 0;
          if (!s.field_i &&
            of.field_A <= 1) {
            this.field_l = 1;
          }
          vc.field_h = param0;
          if (oc.field_d) {
            this.field_l = 9;
            tl.field_c = 3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_13_0 = runtimeException;
          stackIn_13_1 = new StringBuilder().append("ij.<init>(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int stackIn_120_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = stellarshard.field_B;
        try {
          if (param1 != -9) {
            return;
          }
          if (s.field_i &&
            0 < param2) {
            boolean decompiledSharedTail0 = (param2 == 1);
            if (!decompiledSharedTail0) {
              param3 = param3 - this.field_a;
              decompiledSharedTail0 = (var6 != 0);
            }
            if (decompiledSharedTail0) {
              param3 = param3 + this.field_a * 3;
              if (0 < mk.field_k) {
                param3 = param3 + this.field_a;
              }
            }
          }
          if (tl.field_c == 0) {
            var5_int = 5883647;
            if (param2 == 0) {
              if (a.field_h[0] != null &&
                a.field_h[0].field_m == -1) {
                ic.a(dj.field_c, param2, -1, false, 320, var5_int, param3);
                if (var6 == 0) {
                  return;
                }
              }
              if (1 >= of.field_A) {
                return;
              }
              ic.a(kf.field_c + qi.field_a, param2, -1, false, 320, var5_int, param3);
              if (var6 == 0) {
                return;
              }
            }
            if (1 == param2) {
              if (null != a.field_h[0] &&
                -1 == a.field_h[0].field_m) {
                ic.a(kk.field_n, param2, -1, false, 320, var5_int, param3);
                if (var6 == 0) {
                  return;
                }
              }
              if (of.field_A > 1) {
                ic.a(qf.field_f, param2, -1, false, 320, var5_int, param3);
                fh.field_k[0].e(316, param3 + 3);
                fh.field_k[2].e(418, 3 + param3);
                fh.field_k[1].e(-3 + ((100 * qi.field_a - 100) / (-1 + of.field_A) + 320), 3 + param3);
                if (var6 == 0) {
                  return;
                }
              }
              ic.a(rk.field_b, param2, -1, false, 320, var5_int, param3);
              if (var6 == 0) {
                return;
              }
            }
            if (3 == param2) {
              if (!fe.field_e) {
                ic.a(ch.field_d, param2, -1, false, 320, var5_int, param3);
                if (var6 == 0) {
                  return;
                }
              }
              ic.a(eh.field_b, param2, -1, false, 320, var5_int, param3);
              fh.field_k[0].e(316, 2 + param3);
              fh.field_k[2].e(418, 2 + param3);
              fh.field_k[1].e(320 + pk.field_h - 3, 2 + param3);
              if (var6 == 0) {
                return;
              }
            }
            if (param2 != 4) {
              if (param2 != 5) {
                if (param2 == 2) {
                  ic.a(ig.field_C, param2, -1, false, 320, var5_int, param3);
                  if (var6 == 0) {
                    return;
                  }
                }
                if (param2 != 6) {
                  if (param2 != 7) {
                    if (param2 != 8) {
                      return;
                    }
                    if (s.field_i) {
                      return;
                    }
                    ic.a(il.field_x, param2, -1, false, 320, var5_int, param3);
                    if (var6 == 0) {
                      return;
                    }
                  }
                  if (s.field_i) {
                    return;
                  }
                  ic.a(nl.field_b, param2, -1, false, 320, var5_int, param3);
                  if (var6 == 0) {
                    return;
                  }
                }
                if (s.field_i) {
                  return;
                }
                ic.a(ta.field_r, param2, -1, false, 320, var5_int, param3);
                if (var6 == 0) {
                  return;
                }
              }
              if (s.field_i &&
                mk.field_k <= 0) {
                return;
              }
              if (s.field_e == null) {
                if (!lh.a(ic.field_d, (byte) -119)) {
                  stackIn_120_0 = (param0) ? 16777215 : 8421504;
                  var5_int = stackIn_120_0;
                }
                ic.a(ch.field_a, param2, -1, false, 320, var5_int, param3);
                if (var6 == 0) {
                  return;
                }
              }
              ic.a(ch.field_a, param2, -1, false, 320, var5_int, param3);
              if (var6 == 0) {
                return;
              }
            }
            if (vf.field_L != null) {
              ic.a(fe.field_f, param2, -1, false, 320, var5_int, param3);
              fh.field_k[0].e(316, 2 + param3);
              fh.field_k[2].e(418, param3 + 2);
              fh.field_k[1].e(ai.field_c + 317, 2 + param3);
              if (var6 == 0) {
                return;
              }
            }
            ic.a(rc.field_f, param2, -1, false, 320, var5_int, param3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var5), "ij.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(boolean param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = stellarshard.field_B;
        try {
          if (!param0) {
            this.field_p = -111;
          }
          if (param1 == 1 &&
            !s.field_i &&
            of.field_A > 1 &&
            tl.field_c == 0) {
            qi.field_a = qi.field_a + 1;
            if (qi.field_a <= of.field_A) {
              return;
            }
            qi.field_a = of.field_A;
            if (var4 == 0) {
              return;
            }
          }
          if (param1 != 3) {
            if (param1 != 4) {
              return;
            }
            ai.field_c = ai.field_c + 12;
            if (ai.field_c > 100) {
              ai.field_c = 100;
            }
            if (null == vf.field_L) {
              vf.field_L = fe.field_c;
              nj.field_o.a(vf.field_L);
            }
            if (vf.field_L == null) {
              return;
            }
            vf.field_L.d(ai.field_c / 2);
            if (var4 == 0) {
              return;
            }
          }
          pk.field_h = pk.field_h + 12;
          fe.field_e = true;
          if (pk.field_h > 100) {
            pk.field_h = 100;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3), "ij.A(" + param0 + ',' + param1 + ')');
        }
    }

    private final void c(int param0, int param1) {
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = stellarshard.field_B;
        try {
          if (param1 != -3) {
            this.c(-34, 99);
          }
          if (gi.field_f != 96 ||
            param0 != 8 &&
            tl.field_c == 2) {
            if (97 == gi.field_f && (param0 == 8 ||
              tl.field_c != 2)) {
              si.field_X = si.field_X + 1;
              if (si.field_X >= 3) {
                si.field_X = si.field_X - 3;
              }
              this.a(true, param0);
              if (var4 == 0) {
                return;
              }
            }
            if (gi.field_f != 84 &&
              83 != gi.field_f) {
              return;
            }
            this.a(param1 ^ -427, param0);
            if (var4 == 0) {
              return;
            }
          }
          si.field_X = si.field_X - 1;
          if (si.field_X < 0) {
            si.field_X = si.field_X + 3;
          }
          this.b(param0, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3), "ij.D(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean a(int param0, int param1, boolean param2, int param3, boolean param4, String param5, int param6) {
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        try {
          var8_int = l.field_f.b(param5);
          param3 += 4;
          param0 = param0 + var8_int / 2;
          if (ni.field_e > (-4 - var8_int + param0) &&
            param0 >= ni.field_e &&
            param3 - l.field_f.field_N < eb.field_a &&
            eb.field_a <= param3 &&
            param4) {
            if (param6 != 5883647) {
              param6 = 16748431;
              if (stellarshard.field_B != 0) {
                param6 = 16777215;
              }
            } else {
              param6 = 16777215;
            }
          }
          if (param2) {
            param6 = 16777215;
          }
          l.field_f.b(param5, param0 - 2, param1 + param3, param6, -1);
          if (param6 == 16777215 &&
            0 != fb.field_n &&
            param4) {
            return true;
          }
          if (param6 == 16777215 &&
            si.field_jb[84] &&
            param2) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_45_0 = var8;
          stackIn_45_1 = new StringBuilder().append("ij.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param6).append(')').toString());
        }
    }

    final static jj a(int param0, gk param1, String param2, pf param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        jj stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param3.b(param4, (byte) -118);
          if (param0 != 576) {
            ij.a(-91, (gk) null, (String) null, (pf) null, (String) null);
          }
          var6 = param3.a(var5_int, param2, (byte) -11);
          stackIn_4_0 = ca.a(var5_int, 24325, var6, param3, param1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ij.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void a(byte param0) {
        int incrementValue$0 = 0;
        ub stackIn_104_0 = null;
        boolean stackIn_105_1 = false;
        boolean stackIn_109_2 = false;
        boolean stackIn_113_3 = false;
        int stackIn_116_1 = 0;
        int stackIn_116_2 = 0;
        boolean stackIn_117_3 = false;
        ub stackIn_126_0 = null;
        boolean stackIn_127_1 = false;
        boolean stackIn_131_2 = false;
        int stackIn_134_3;
        boolean stackIn_135_4 = false;
        int stackIn_138_1 = 0;
        int stackIn_138_2 = 0;
        boolean stackIn_139_3 = false;
        ub stackIn_145_0 = null;
        boolean stackIn_146_1 = false;
        boolean stackIn_150_2 = false;
        int stackIn_153_3;
        boolean stackIn_154_4;
        int stackIn_156_0 = 0;
        int stackIn_156_1 = 0;
        int stackIn_196_0 = 0;
        int stackIn_197_0 = 0;
        ub stackIn_255_0;
        String stackIn_255_1;
        int stackIn_255_2;
        int stackIn_255_3;
        int stackIn_256_4 = 0;
        int stackIn_289_0 = 0;
        int stackIn_407_0 = 0;
        int stackIn_407_1 = 0;
        RuntimeException decompiledCaughtException = null;
        double var2_double = 0.0;
        int var2_int = 0;
        ub var2 = null;
        RuntimeException var2_ref = null;
        String var3_ref_String = null;
        int var3 = 0;
        String[] var3_ref_String__ = null;
        double var4_double = 0.0;
        int var4 = 0;
        long[] var4_ref_long__ = null;
        String var5_ref_String = null;
        int[] var5_ref_int__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        nf var8_ref_nf = null;
        int var9 = 0;
        pa var10_ref_pa = null;
        int var10 = 0;
        int var11 = 0;
        int var12_int = 0;
        Object var12 = null;
        bj var13_ref_bj = null;
        int var13 = 0;
        int var14 = 0;
        String var5_ref_StringLifetime1;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var2_intLifetime3;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4Lifetime1;
        int var4Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var2_intLifetime1Lifetime1;
        int var3Lifetime1Lifetime1;
        int var3Lifetime1Lifetime2;
        int var3Lifetime1Lifetime3;
        int var3Lifetime1Lifetime4;
        var14 = stellarshard.field_B;
        try {
          if (tl.field_c == 8) {
            wj.c((byte) 57);
          }
          boolean decompiledFrameRemainder3 = true;
          if (tl.field_c == 6) {
            rj.c((byte) -94);
            tl.field_c = 7;
            decompiledFrameRemainder3 = (var14 != 0);
          }
          if ((decompiledFrameRemainder3) &&
            (tl.field_c == 7)) {
            if (ah.a(-1)) {
              n.field_L = 255;
              tl.field_c = fg.field_O;
              decompiledFrameRemainder3 = (var14 != 0);
            }
            if (decompiledFrameRemainder3) {
              be.field_g = ab.a(-5094, 4);
              tl.field_c = ea.field_p;
              if (tl.field_c == 4) {
                qf.a((byte) -125);
                wh.a(-94);
                vc.field_h.c(param0 + 42, te.field_c);
                oc.field_d = false;
                if (tl.field_a > 0) {
                  oc.field_d = true;
                }
                cl.field_a = cl.field_a + te.field_c;
                te.field_c = 0;
              }
            }
          }
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameRemainder2 = true;
          if ((tl.field_c != 5) &&
            (decompiledFrameRemainder2 = (tl.field_c == 4))) {
            if (this.field_t < 0) {
              return;
            }
            var8 = this.field_t;
            var9 = 0;
            while (var9 <= 50) {
              var2_double = 3.141592653589793 * (double)var9 / 25.0;
              stackIn_156_0 = -26;
              stackIn_156_1 = ~var9;
              if (var14 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
              if (stackIn_156_0 == stackIn_156_1) {
                var10_ref_pa = new pa(rh.field_b, false, false, false, false);
                this.field_q = this.field_q + 1;
                if (this.field_q > 256) {
                  this.field_q = this.field_q - 256;
                }
                var11 = (int)(Math.cos((double)this.field_q * 3.141592653589793 / 128.0) * 65536.0);
                var12_int = (int)(65536.0 * Math.sin(3.141592653589793 * (double)this.field_q / 128.0));
                var10_ref_pa.a(new int[]{0, 0, 0, -65536, 0, 0, 0, -65536, 0, 0, 0, 65536});
                var10_ref_pa.a(new int[]{0, 0, 0, 65536, 0, 0, 0, 0, -65536, 0, 65536, 0});
                var10_ref_pa.a(new int[]{0, 0, 0, 65536, 0, 0, 0, var11, -var12_int, 0, var12_int, var11});
                var10_ref_pa.a(new int[]{0, 0, 0, var11, 0, -var12_int, 0, 65536, 0, var12_int, 0, var11});
                var10_ref_pa.a(new int[]{0, 0, 0, var11, -var12_int, 0, var12_int, var11, 0, 0, 0, 65536});
                var13_ref_bj = var10_ref_pa.a(32, 346, 50, 50, -50);
                var13_ref_bj.a(0, 0, 0, 0, 0, 0, 1000, -1L);
                pd.field_h.a((byte) -107);
              }
              var4_double = (double)(var9 + 1) * 3.141592653589793 / 25.0;
              var6 = (int)(128.0 * Math.cos(var2_double));
              Math.cos(var4_double);
              var7 = (int)(Math.sin(var2_double) * -64.0);
              Math.sin(var4_double);
              if (var8 > 0) {
                if (var8 > var9 &&
                  mg.field_t <= var9) {
                  ti.a(var6 + 320 << 4, 240 + var7 << 4, 256, 255 * var9 / var8, ei.field_I);
                } else if (var8 == var9) {
                  ti.a(320 + var6 << 4, 240 + var7 << 4, 256, var9 * 255 / var8, ei.field_B);
                } else {
                  ti.a(var6 + 320 << 4, var7 + 240 << 4, 128, 64, ei.field_I);
                }
                var6 = var6 * 9 / 10;
                var7 = 9 * var7 / 10;
                if (var8 > var9 &&
                  mg.field_t <= var9) {
                  ti.a(var6 + 320 << 4, 240 + var7 << 4, 192, var9 * 255 / var8, ei.field_I);
                }
                if (var9 == var8) {
                  ti.a(320 + var6 << 4, var7 + 240 << 4, 192, 255 * var9 / var8, ei.field_B);
                }
                var7 = 9 * var7 / 10;
                var6 = 9 * var6 / 10;
                if (var8 > var9 &&
                  var9 >= mg.field_t) {
                  ti.a(320 + var6 << 4, 240 + var7 << 4, 128, var9 * 255 / var8, ei.field_I);
                }
                if (~var9 == ~var8) {
                  ti.a(320 + var6 << 4, var7 + 240 << 4, 128, 255 * var9 / var8, ei.field_B);
                }
                var6 = 9 * var6 / 10;
                var7 = 9 * var7 / 10;
                if (var8 > var9 &&
                  mg.field_t <= var9) {
                  ti.a(var6 + 320 << 4, 240 + var7 << 4, 64, var9 * 255 / var8, ei.field_I);
                }
                if (~var8 == ~var9) {
                  ti.a(var6 + 320 << 4, 240 + var7 << 4, 64, 255 * var9 / var8, ei.field_B);
                }
              }
              var9++;
            }
            if (decompiledFrameCompleted1) {
              var2_int = 5883647;
              if (0 >= tl.field_a) {
                ic.a(dj.field_c, 8, -1, false, 320, var2_int, 415);
                if (var14 != 0) {
                  ic.a(dj.field_c, 8, -1, false, 320, var2_int, 415);
                }
              } else {
                ic.a(dj.field_c, 8, -1, false, 320, var2_int, 415);
              }
              var3_ref_String = sg.field_d + qi.field_a + wc.field_l + ue.field_a;
              l.field_f.a(var3_ref_String, -1, 260, 640, 180, 0, -1, 1, 1, l.field_f.field_N);
              l.field_f.a(var3_ref_String, 1, 260, 640, 180, 0, -1, 1, 1, l.field_f.field_N);
              l.field_f.a(var3_ref_String, 0, 259, 640, 180, 0, -1, 1, 1, l.field_f.field_N);
              l.field_f.a(var3_ref_String, 0, 261, 640, 180, 0, -1, 1, 1, l.field_f.field_N);
              l.field_f.a(var3_ref_String, 0, 260, 640, 180, 10742263, -1, 1, 1, l.field_f.field_N);
              decompiledFrameRemainder2 = (var14 != 0);
            }
          }
          if ((decompiledFrameRemainder2) &&
            (decompiledFrameCompleted1)) {
            var2 = qj.field_a;
            var3 = var2.field_N + 200;
            var4 = 4 + (var2.field_x + var2.field_r);
            ti.b(112, 190, 416, 20 + 5 * var4 + 60, 0, 192);
            ed.a(-6313, 103, 183, fg.field_P, 434, 80 + var4 * 5 + 14);
            var2.c(qj.field_b, 320, var3, 10742263, -1);
            stackIn_104_0 = var2;
            stackIn_105_1 = !(tf.field_a.a(0));
            stackIn_109_2 = (tl.field_a != 0);
            stackIn_113_3 = (0 != te.field_c);
            ((ub) (Object) stackIn_104_0).c(ch.a(stackIn_105_1, stackIn_109_2, stackIn_113_3, 0), 320, var4 + var3, 10742263, -1);
            stackIn_116_1 = 320;
            stackIn_116_2 = -4;
            stackIn_117_3 = (ld.field_F == 0);
            if (this.a(stackIn_116_1, stackIn_116_2, stackIn_117_3, var4 * 3 + var3, v.field_e, wl.field_T, 5883647) &&
              n.field_L <= 0) {
              am.a(5, 4, -122);
            }
            stackIn_126_0 = var2;
            stackIn_127_1 = (te.field_c != 0);
            stackIn_131_2 = !(tf.field_a.a(0));
            stackIn_134_3 = -72;
            stackIn_135_4 = (tl.field_a != 0);
            ((ub) (Object) stackIn_126_0).c(pe.$cfr$intArgs$a$3214d41809e1(stackIn_127_1, stackIn_131_2, stackIn_134_3, stackIn_135_4), 320, 30 + (3 * var4 + var3), 10742263, -1);
            stackIn_138_1 = 320;
            stackIn_138_2 = param0 ^ -87;
            stackIn_139_3 = (ld.field_F == 1);
            if (this.a(stackIn_138_1, stackIn_138_2, stackIn_139_3, 30 + var4 / 2 + (var3 + 4 * var4), v.field_e, sg.field_b, 5883647)) {
              oc.field_d = false;
              tl.field_a = 0;
              ue.field_a = 0;
              ta.a(true, 713);
              ue.field_c.a((byte) -8);
              tf.field_a.a((byte) -8);
              qi.field_a = 0;
              n.field_L = 255;
              tl.field_c = 8;
            }
            stackIn_145_0 = var2;
            stackIn_146_1 = (0 != te.field_c);
            stackIn_150_2 = (tl.field_a != 0);
            stackIn_153_3 = 6;
            stackIn_154_4 = !(tf.field_a.a(param0 - 85));
            ((ub) (Object) stackIn_145_0).c(stellarshard.a(stackIn_146_1, stackIn_150_2, stackIn_153_3, stackIn_154_4), 320, 4 * var4 + var3 + 60, 10742263, -1);
            ti.b(112, 190, 416, 80 + var4 * 5, 16777215, n.field_L);
          }
          if (decompiledFrameCompleted1) {
            stackIn_156_0 = ~tl.field_c;
            stackIn_156_1 = -1;
          }
          if (stackIn_156_0 == stackIn_156_1) {
            this.field_u = -1;
            if (!s.field_i) {
            }
          }
          if (tl.field_c == 1) {
            hk.field_l[1].e(0, 0);
            ti.b(12, 96, 616, 336, 0, 192);
            ed.a(-6313, 3, 89, fg.field_P, 634, 343);
            ic.a(li.field_b, 9, -1, false, 320, 5883647, 439);
            var2_intLifetime1 = 84;
            var3Lifetime1 = 104;
            qj.field_a.c(be.field_a, 320, var3Lifetime1 + 12, 10742263, -1);
            var3Lifetime1 += 14;
            qj.field_a.c(hj.field_c, 320, var3Lifetime1 + 12, 10742263, -1);
            var3Lifetime1 += 22;
            qj.field_a.a(pl.field_V, 160, var3Lifetime1 - 6, 416, 32, 10742263, -1, 0, 0, 13);
            e.field_g[8].e(var2_intLifetime1, -36 + (var3Lifetime1 + 4));
            var3Lifetime1 += 12;
            var2_intLifetime1 -= 64;
            var4Lifetime1 = var3Lifetime1;
            e.field_g[0].e(var2_intLifetime1, var3Lifetime1);
            var3Lifetime1 += 40;
            qj.field_a.a(ei.field_A, var2_intLifetime1 + 68, 12 + var3Lifetime1, 16777215, -1);
            e.field_g[1].e(var2_intLifetime1, var3Lifetime1);
            var3Lifetime1 += 40;
            qj.field_a.a(gf.field_a, var2_intLifetime1 + 68, 12 + var3Lifetime1, 16777215, -1);
            e.field_g[2].e(var2_intLifetime1, var3Lifetime1);
            var3Lifetime1 += 40;
            qj.field_a.a(ka.field_l, var2_intLifetime1 + 68, var3Lifetime1 + 12, 16777215, -1);
            e.field_g[3].e(var2_intLifetime1, var3Lifetime1);
            var3Lifetime1 += 40;
            qj.field_a.a(he.field_l, 68 + var2_intLifetime1, 12 + var3Lifetime1, 16777215, -1);
            e.field_g[4].e(var2_intLifetime1, var3Lifetime1);
            var3Lifetime1 += 40;
            qj.field_a.a(td.field_e, var2_intLifetime1 + 68, var3Lifetime1 + 12, 16777215, -1);
            var2_intLifetime1 += 192;
            var3Lifetime1Lifetime1 = var4Lifetime1;
            e.field_g[5].e(var2_intLifetime1, var3Lifetime1Lifetime1);
            var3Lifetime1Lifetime1 += 40;
            qj.field_a.a(nl.field_f, 68 + var2_intLifetime1, var3Lifetime1Lifetime1 + 12, 16777215, -1);
            e.field_g[6].e(var2_intLifetime1, var3Lifetime1Lifetime1);
            var3Lifetime1Lifetime1 += 40;
            qj.field_a.a(qh.field_h, 68 + var2_intLifetime1, 12 + var3Lifetime1Lifetime1, 16777215, -1);
            e.field_g[7].e(var2_intLifetime1, var3Lifetime1Lifetime1);
            var3Lifetime1Lifetime1 += 40;
            qj.field_a.a(we.field_e, var2_intLifetime1 + 68, 12 + var3Lifetime1Lifetime1, 16777215, -1);
            e.field_g[9].e(var2_intLifetime1, var3Lifetime1Lifetime1);
            var3Lifetime1Lifetime1 += 40;
            qj.field_a.a(te.field_b, 68 + var2_intLifetime1, var3Lifetime1Lifetime1 + 12, 16777215, -1);
            e.field_g[10].e(var2_intLifetime1, var3Lifetime1Lifetime1);
            var3Lifetime1Lifetime1 += 40;
            qj.field_a.a(ha.field_x, var2_intLifetime1 + 68, 12 + var3Lifetime1Lifetime1, 16777215, -1);
            var2_intLifetime1 += 192;
            var3Lifetime1Lifetime2 = var4Lifetime1;
            e.field_g[11].e(var2_intLifetime1, var3Lifetime1Lifetime2);
            var3Lifetime1Lifetime2 += 40;
            qj.field_a.a(fc.field_c, var2_intLifetime1 + 68, 12 + var3Lifetime1Lifetime2, 16777215, -1);
            e.field_g[12].e(var2_intLifetime1, var3Lifetime1Lifetime2);
            var3Lifetime1Lifetime2 += 40;
            qj.field_a.a(wg.field_e, var2_intLifetime1 + 68, var3Lifetime1Lifetime2 + 12, 16777215, -1);
            e.field_g[13].e(var2_intLifetime1, var3Lifetime1Lifetime2);
            var3Lifetime1Lifetime2 += 40;
            qj.field_a.a(nb.field_O, 68 + var2_intLifetime1, var3Lifetime1Lifetime2 + 12, 16777215, -1);
            e.field_g[14].e(var2_intLifetime1, var3Lifetime1Lifetime2);
            var3Lifetime1Lifetime2 += 40;
            qj.field_a.a(ja.field_k, var2_intLifetime1 + 68, var3Lifetime1Lifetime2 + 12, 16777215, -1);
            e.field_g[15].e(var2_intLifetime1, var3Lifetime1Lifetime2);
            var3Lifetime1Lifetime2 += 40;
            qj.field_a.a(rd.field_b, 68 + var2_intLifetime1, 12 + var3Lifetime1Lifetime2, 16777215, -1);
            var2_intLifetime1 += 144;
            var3Lifetime1Lifetime3 = var4Lifetime1;
            var3Lifetime1Lifetime4 = 400;
            var2_intLifetime1Lifetime1 = 320;
            var5_ref_String = nb.field_N;
            qj.field_a.c(var5_ref_String, 1 + var2_intLifetime1Lifetime1, var3Lifetime1Lifetime4, 0, -1);
            qj.field_a.c(var5_ref_String, var2_intLifetime1Lifetime1 - 1, var3Lifetime1Lifetime4, 0, -1);
            qj.field_a.c(var5_ref_String, var2_intLifetime1Lifetime1, var3Lifetime1Lifetime4 + 1, 0, -1);
            qj.field_a.c(var5_ref_String, var2_intLifetime1Lifetime1, var3Lifetime1Lifetime4 - 1, 0, -1);
            qj.field_a.c(var5_ref_String, var2_intLifetime1Lifetime1, var3Lifetime1Lifetime4, 16777215, -1);
            var5_ref_StringLifetime1 = cm.field_e;
            var3Lifetime1Lifetime4 += 16;
            qj.field_a.c(var5_ref_StringLifetime1, 1 + var2_intLifetime1Lifetime1, var3Lifetime1Lifetime4, 0, -1);
            qj.field_a.c(var5_ref_StringLifetime1, var2_intLifetime1Lifetime1 - 1, var3Lifetime1Lifetime4, 0, -1);
            qj.field_a.c(var5_ref_StringLifetime1, var2_intLifetime1Lifetime1, 1 + var3Lifetime1Lifetime4, 0, -1);
            qj.field_a.c(var5_ref_StringLifetime1, var2_intLifetime1Lifetime1, var3Lifetime1Lifetime4 - 1, 0, -1);
            qj.field_a.c(var5_ref_StringLifetime1, var2_intLifetime1Lifetime1, var3Lifetime1Lifetime4, 16777215, -1);
            ti.b(12, 96, 616, 336, 16777215, n.field_L);
          }
          boolean decompiledFrameCompleted0 = true;
          if (tl.field_c == 2) {
            boolean decompiledFrameRemainder1 = true;
            hk.field_l[0].e(0, 0);
            ti.b(128, 105, 384, 295, 0, 192);
            ed.a(-6313, 119, 98, fg.field_P, 402, 302);
            ic.a(li.field_b, 9, -1, false, 320, 5883647, 439);
            if (ah.a(-1)) {
              qj.field_a.c(pd.field_p, 320, 159, 0, -1);
              qj.field_a.c(pd.field_p, 320, 161, 0, -1);
              qj.field_a.c(pd.field_p, 319, 160, 0, -1);
              qj.field_a.c(pd.field_p, 321, 160, 0, -1);
              qj.field_a.c(pd.field_p, 320, 160, 16777215, -1);
              if (ah.a(param0 ^ -86)) {
                qj.field_a.a(hj.field_e, 220, 192, 200, 200, 16777215, 0, 1, 0, qj.field_a.field_N);
              }
              ic.a(wl.field_T, 8, -1, false, 320, 5883647, 411);
              decompiledFrameRemainder1 = (var14 != 0);
            }
            if (decompiledFrameRemainder1) {
              if (gh.field_d == null) {
                gh.field_d = bk.a(3, 10, 1, 17, 5);
              }
              boolean decompiledFrameRemainder0 = true;
              if (!gh.field_d.field_s) {
                qj.field_a.c(wk.field_g, 320, 159, 0, -1);
                qj.field_a.c(wk.field_g, 320, 161, 0, -1);
                qj.field_a.c(wk.field_g, 319, 160, 0, -1);
                qj.field_a.c(wk.field_g, 321, 160, 0, -1);
                qj.field_a.c(wk.field_g, 320, 160, 16777215, -1);
                decompiledFrameRemainder0 = (var14 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (gh.field_d.field_u == null) {
                  qj.field_a.c(ib.field_d, 320, 159, 0, -1);
                  qj.field_a.c(ib.field_d, 320, 161, 0, -1);
                  qj.field_a.c(ib.field_d, 319, 160, 0, -1);
                  qj.field_a.c(ib.field_d, 321, 160, 0, -1);
                  qj.field_a.c(ib.field_d, 320, 160, 16777215, -1);
                  decompiledFrameRemainder0 = (var14 != 0);
                }
                if (decompiledFrameRemainder0) {
                  var3_ref_String__ = gh.field_d.field_u[si.field_X];
                  var4_ref_long__ = gh.field_d.field_w[si.field_X];
                  var5_ref_int__ = gh.field_d.field_o[si.field_X];
                  var6Lifetime1 = 0;
                  var7Lifetime1 = 0;
                  var8_ref_nf = bi.field_u;
                  var9Lifetime1 = 123;
                  var10 = 0;
                  while (true) {
                    boolean decompiledFrameRemainder4 = true;
                    boolean decompiledFrameRemainder5 = true;
                    if (var6Lifetime1 == 0) {
                      stackIn_197_0 = ue.field_a;
                      decompiledFrameRemainder4 = (var14 == 0);
                      if ((decompiledFrameRemainder4) &&
                        (stackIn_197_0 > 0)) {
                        stackIn_196_0 = 11;
                        decompiledFrameRemainder5 = false;
                      }
                    }
                    if ((decompiledFrameRemainder5) &&
                      (decompiledFrameRemainder4)) {
                      stackIn_196_0 = 10;
                    }
                    if (decompiledFrameRemainder4) {
                      stackIn_197_0 = ~stackIn_196_0;
                    }
                    if (stackIn_197_0 < ~var10) {
                      var2_intLifetime2 = 10742263;
                      if (10 > var10 &&
                        var6Lifetime1 == 0 &&
                        var8_ref_nf != null &&
                        hk.a(89, var3_ref_String__[var10]) &&
                        var4_ref_long__[var10] == var8_ref_nf.field_k &&
                        ~var5_ref_int__[var10] == ~ue.field_a) {
                        var6Lifetime1 = 1;
                        var2_intLifetime2 = 16777215;
                      }
                      if (var10 == 10 ||
                        var3_ref_String__[var10] != null) {
                        var7Lifetime1 = 1;
                        var11 = 0;
                        if (var10 < 10) {
                          var11 = var5_ref_int__[var10];
                        }
                        var12 = null;
                        if (10 > var10) {
                          var12 = var3_ref_String__[var10];
                        }
                        var12 = var10 + 1 + "." + (String) (var12);
                        if (var6Lifetime1 == 0 &&
                          var10 == 10 &&
                          0 < ue.field_a) {
                          var11 = ue.field_a;
                          var12 = wf.field_b;
                          var2_intLifetime2 = 16777215;
                          var12 = vg.field_s + (String) (var12);
                        }
                        var13 = 162;
                        qj.field_a.a((String) (var12), var13 + 1, var9Lifetime1 + 16, 0, -1);
                        qj.field_a.a((String) (var12), -1 + var13, var9Lifetime1 + 16, 0, -1);
                        qj.field_a.a((String) (var12), var13, 1 + var9Lifetime1 + 16, 0, -1);
                        qj.field_a.a((String) (var12), var13, -1 + var9Lifetime1 + 16, 0, -1);
                        qj.field_a.a((String) (var12), var13, 16 + var9Lifetime1, var2_intLifetime2, -1);
                        qj.field_a.b("" + var11, 477, var9Lifetime1 + 16, 0, -1);
                        qj.field_a.b("" + var11, 479, 16 + var9Lifetime1, 0, -1);
                        qj.field_a.b("" + var11, 478, var9Lifetime1 - 1 + 16, 0, -1);
                        qj.field_a.b("" + var11, 478, var9Lifetime1 + 1 + 16, 0, -1);
                        qj.field_a.b("" + var11, 478, var9Lifetime1 + 16, var2_intLifetime2, -1);
                      }
                      var9Lifetime1 += 20;
                      var10++;
                      if (var14 == 0) {
                        continue;
                      }
                    }
                    break;
                  }
                  if (var7Lifetime1 == 0) {
                    qj.field_a.c(pd.field_p, 320, 159, 0, -1);
                    qj.field_a.c(pd.field_p, 320, 161, 0, -1);
                    qj.field_a.c(pd.field_p, 319, 160, 0, -1);
                    qj.field_a.c(pd.field_p, 321, 160, 0, -1);
                    qj.field_a.c(pd.field_p, 320, 160, 16777215, -1);
                  }
                  ti.d(129, 0, 511, 479);
                  qj.field_a.c(sj.field_C, 320 - bf.field_c, 366, 0, -1);
                  qj.field_a.c(sj.field_C, -bf.field_c + 320, 368, 0, -1);
                  qj.field_a.c(sj.field_C, 319 - bf.field_c, 367, 0, -1);
                  qj.field_a.c(sj.field_C, -bf.field_c + 321, 367, 0, -1);
                  qj.field_a.c(sj.field_C, 320 - bf.field_c, 367, 16777215, -1);
                  ti.b();
                }
              }
              ic.a("                                                ", 8, -1, false, 320, 5883647, 411);
              var3Lifetime2 = -1;
              while (var3Lifetime2 <= 1) {
                l.field_f.c(od.field_w[1 + var3Lifetime2], 192 * var3Lifetime2 + 319, 435, 0, 0);
                l.field_f.c(od.field_w[1 + var3Lifetime2], 320 + 192 * var3Lifetime2, 434, 0, 0);
                if (var14 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                stackIn_255_0 = l.field_f;
                stackIn_255_1 = od.field_w[var3Lifetime2 + 1];
                stackIn_255_2 = 192 * var3Lifetime2 + 320;
                stackIn_255_3 = 435;
                if (~var3Lifetime2 == ~(si.field_X - 1)) {
                  stackIn_256_4 = 16777215;
                } else {
                  stackIn_256_4 = 5883647;
                }
                ((ub) (Object) stackIn_255_0).c(stackIn_255_1, stackIn_255_2, stackIn_255_3, stackIn_256_4, -1);
                var3Lifetime2++;
              }
            }
            if (decompiledFrameCompleted0) {
              ti.b(128, 105, 384, 295, 16777215, n.field_L);
            }
          }
          if (tl.field_c == 3) {
            this.field_r = -1;
            ti.b(108, 112, 424, 296, 0, 192);
            ed.a(-6313, 99, 105, fg.field_P, 442, 303);
            ti.e(175, 129, 282, 82, 4, 2387345);
            boolean decompiledSharedTail0 = (3 == bb.field_d);
            if (!decompiledSharedTail0) {
              ti.e(130, -96 + (qj.field_a.field_N * 5 / 2 + 321), 380, 132, 4, 2387345);
              decompiledSharedTail0 = (var14 != 0);
            }
            if (decompiledSharedTail0) {
              ti.e(126, -98 + (330 + 5 * qj.field_a.field_N / 2) - 7, 388, 132, 4, 2387345);
            }
            if (oc.field_d) {
              hk.field_l[3].e(0, 0);
              if (var14 != 0) {
                hk.field_l[2].e(0, 0);
              }
            } else {
              hk.field_l[2].e(0, 0);
            }
            ic.a(li.field_b, 9, -1, false, 320, 5883647, 439);
            if (oc.field_d) {
              ic.a(ta.field_r, 8, -1, false, 320, 5883647, 411);
            }
            if (ah.a(param0 - 86)) {
              ic.a(wl.field_T, 8, -1, false, 320, 5883647, 411);
            }
            var2_intLifetime3 = 180;
            var3Lifetime3 = 134;
            if (oc.field_d) {
              stackIn_289_0 = tl.field_a;
            } else {
              if (!ah.a(-1)) {
                stackIn_289_0 = sd.field_d;
              } else {
                stackIn_289_0 = 0;
              }
            }
            var4Lifetime2 = stackIn_289_0;
            var5 = 0;
            var6Lifetime2 = 1;
            var7Lifetime2 = 0;
            while (true) {
              if (rc.field_e.length > var7Lifetime2) {
                stackIn_407_0 = var7Lifetime2;
                stackIn_407_1 = 13;
                if (var14 == 0) {
                  boolean decompiledFrameRemainder6 = true;
                  if (stackIn_407_0 == stackIn_407_1 &&
                    !pk.a(-12663, 0) &&
                    (var4Lifetime2 & 1 << var7Lifetime2) == 0) {
                    var5++;
                  } else {
                    var8Lifetime1 = 0;
                    if (var2_intLifetime3 <= ni.field_e &&
                      ni.field_e <= (32 + var2_intLifetime3) &&
                      eb.field_a >= var3Lifetime3 &&
                      var3Lifetime3 + 32 >= eb.field_a) {
                      this.field_r = var7Lifetime2;
                      var8Lifetime1 = 2;
                      if (this.field_u != -1) {
                        ti.e(var2_intLifetime3 - 2, -2 + var3Lifetime3, 36, 36, 4, 1193544);
                      }
                    }
                    if (~var7Lifetime2 == ~this.field_u) {
                      var8Lifetime1 = 2;
                      ti.e(-3 + var2_intLifetime3, var3Lifetime3 - 3, 38, 38, 4, 2387345);
                    }
                    if (0 == (1 << var7Lifetime2 & var4Lifetime2)) {
                      decompiledFrameRemainder6 = !(oc.field_d);
                      if (decompiledFrameRemainder6) {
                        if (6 == var7Lifetime2 ||
                          var7Lifetime2 == 8 ||
                          !(mk.field_k <= 0)) {
                          uf.field_g.a(-var8Lifetime1 + var2_intLifetime3, -var8Lifetime1 + var3Lifetime3, 2 * var8Lifetime1 + 32, 32 + var8Lifetime1 * 2);
                        } else {
                          ce.field_a.a(var2_intLifetime3 - var8Lifetime1, -var8Lifetime1 + var3Lifetime3, 32 + var8Lifetime1 * 2, 32 + 2 * var8Lifetime1);
                        }
                      }
                    } else {
                      wh.field_e[var7Lifetime2].a(var2_intLifetime3 - var8Lifetime1, -var8Lifetime1 + var3Lifetime3, var8Lifetime1 * 2 + 32, 2 * var8Lifetime1 + 32);
                    }
                    if (decompiledFrameRemainder6) {
                      if (~var7Lifetime2 == ~this.field_u ||
                        this.field_u == -1 &&
                        !(var2_intLifetime3 > ni.field_e) &&
                        !((32 + var2_intLifetime3) < ni.field_e) &&
                        !(var3Lifetime3 > eb.field_a) &&
                        !(eb.field_a > var3Lifetime3 + 32)) {
                        qj.field_a.c(rc.field_e[var7Lifetime2], 320, 230, 16777215, -1);
                        var6Lifetime2 = 0;
                        if ((1 << var7Lifetime2 & var4Lifetime2) != 0) {
                          qj.field_a.c(jg.field_ob, 320, qj.field_a.field_N + 234, 16777215, -1);
                        } else {
                          qj.field_a.c(tf.field_c, 320, 234 + qj.field_a.field_N, 16711680, -1);
                        }
                        var9Lifetime2 = qj.field_a.field_N * 5 / 2 + 323 - 96;
                        if ((1 << var7Lifetime2 & var4Lifetime2) != 0) {
                          wh.field_e[var7Lifetime2].e(132, var9Lifetime2);
                        } else if (var7Lifetime2 != 6 &&
                          8 != var7Lifetime2 &&
                          mk.field_k <= 0) {
                          ce.field_a.e(132, var9Lifetime2);
                        } else {
                          uf.field_g.e(132, var9Lifetime2);
                        }
                        var9Lifetime2 = var9Lifetime2 + qj.field_a.field_N;
                        qj.field_a.a(hc.field_t[var7Lifetime2] + "<br><br>" + bb.field_h + wf.field_d[var7Lifetime2] + "<br><br>" + dd.field_b + am.field_d[var7Lifetime2], 280, -qj.field_a.field_N + var9Lifetime2, 228, 92, 10742263, -1, 1, 1, 2 + qj.field_a.field_N);
                        var10Lifetime1 = am.field_d[var7Lifetime2];
                        var11 = 0;
                        while (var10Lifetime1 > var11) {
                          af.field_n.a(-16 - 4 * (var10Lifetime1 - 1) + 8 * var11 + 394, 126 + var9Lifetime2 - (qj.field_a.field_N + 32));
                          var11++;
                        }
                      }
                      incrementValue$0 = var5;
                      var5++;
                      if (6 != incrementValue$0) {
                        var2_intLifetime3 += 40;
                      } else {
                        var3Lifetime3 += 40;
                        var2_intLifetime3 = 180;
                      }
                    }
                  }
                  var7Lifetime2++;
                  continue;
                }
              } else {
                if (var6Lifetime2 != 0) {
                  var7Lifetime2 = 330 - (-(qj.field_a.field_N * 5 / 2) + 96);
                  var7Lifetime2 = var7Lifetime2 + qj.field_a.field_N;
                  qj.field_a.c(id.field_l, 320, var7Lifetime2, 10742263, -1);
                  if (ah.a(-1)) {
                    qj.field_a.c(hj.field_e, 320, var7Lifetime2 + 100, 10742263, -1);
                  }
                }
                stackIn_407_0 = 108;
                stackIn_407_1 = 80;
              }
              break;
            }
            ti.b(stackIn_407_0, stackIn_407_1, 424, 328, 16777215, n.field_L);
          }
          super.a(param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2_ref), "ij.C(" + param0 + ')');
        }
    }

    static {
    }
}
