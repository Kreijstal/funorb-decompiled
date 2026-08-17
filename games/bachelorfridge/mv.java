/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mv extends at {
    gj field_l;
    static String field_m;
    vja field_k;
    static int field_n;
    int field_j;

    final void d(byte param0) {
        int stackIn_95_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        aga var3 = null;
        Object var4 = null;
        pp var4_ref = null;
        Object var5 = null;
        t var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        wia var8 = null;
        int var8_int = 0;
        fga var9 = null;
        int var10 = 0;
        kj var11 = null;
        fa var11_ref = null;
        qla var11_ref2 = null;
        int var11_int = 0;
        ad var12 = null;
        bn var13 = null;
        int var14 = 0;
        sl var15 = null;
        aga var16 = null;
        at var17 = null;
        ad var18 = null;
        aga var19 = null;
        ad var20 = null;
        sl var21 = null;
        var4 = null;
        var5 = null;
        var14 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var2_int = -128 / ((-44 - param0) / 40);
              if (this.field_k.field_r) {
                break L1;
              } else {
                if (this.field_k.field_n) {
                  break L1;
                } else {
                  var3 = this.field_k.field_l.a(67, this.field_l.field_h);
                  if (var3.i(87)) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var4_ref = (pp) ((Object) this.field_k.field_o.b((byte) 90));
                    var5_ref = (t) ((Object) al.a(106, this.field_k.field_k));
                    var6 = 0;
                    L2: while (true) {
                      if (var4_ref == null) {
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        L3: {
                          if (!(var4_ref instanceof iv)) {
                            if (var4_ref instanceof sl) {
                              L4: {
                                var15 = (sl) ((Object) var4_ref);
                                var21 = var15;
                                var8 = this.field_l.field_h.field_a[var15.field_i][var15.field_l];
                                var9 = new fga(this.field_l, var21.field_i, var21.field_l, var21.field_f);
                                ((kj) ((Object) var9)).a(0);
                                if ((var8.field_n ^ -1) != -29) {
                                  stackIn_95_0 = 0;
                                  break L4;
                                } else {
                                  stackIn_95_0 = 1;
                                  break L4;
                                }
                              }
                              L5: {
                                var10 = stackIn_95_0;
                                if (var10 == 0) {
                                  break L5;
                                } else {
                                  if (var8.field_h <= var21.field_f) {
                                    var11 = (kj) ((Object) new uaa(this.field_l, var21, var3));
                                    var11.field_b = ((kj) ((Object) var9)).field_b;
                                    ((kj) ((Object) var9)).field_b = var11;
                                    break L3;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              var21.a(var3, this.field_l.field_h, 12);
                              break L3;
                            } else {
                              if (var4_ref instanceof ro) {
                                ((ro) ((Object) var4_ref)).a(var3, this.field_l.field_h, 12);
                                break L3;
                              } else {
                                if (var4_ref instanceof o) {
                                  var7 = 0;
                                  L6: while (true) {
                                    if (this.field_l.field_h.field_z <= var7) {
                                      this.field_l.field_s.a(-1907, 20);
                                      ((o) ((Object) var4_ref)).a(var3, this.field_l.field_h, 12);
                                      break L3;
                                    } else {
                                      var8_int = 0;
                                      L7: while (true) {
                                        if (this.field_l.field_h.field_B <= var8_int) {
                                          var7++;
                                          continue L6;
                                        } else {
                                          var19 = this.field_l.field_h.field_a[var7][var8_int].field_l;
                                          if (var19 != null) {
                                            var20 = new nq(var19).a(-27449, this.field_l);
                                            this.a(27799, new ek(this.field_l, var20, var4_ref.field_f));
                                            var8_int++;
                                            continue L7;
                                          } else {
                                            var8_int++;
                                            continue L7;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  if (!(var4_ref instanceof bm)) {
                                    break L3;
                                  } else {
                                    ((bm) ((Object) var4_ref)).a(var3, this.field_l.field_h, 12);
                                    break L3;
                                  }
                                }
                              }
                            }
                          } else {
                            L8: {
                              var16 = var4_ref.field_h.a(54, this.field_l.field_h);
                              if (var16.a(13, (byte) 104)) {
                                var3.a(5, var16, (byte) 2);
                                this.a(27799, new ek(this.field_l, this.field_k.field_l.a(-27449, this.field_l), 5));
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            L9: {
                              var8_int = this.field_k.field_q;
                              if (this instanceof ba) {
                                var8_int = nn.a(var16, var3, (byte) 104);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            L10: {
                              var17 = ((iv) ((Object) var4_ref)).a(this.field_k.field_l.a(-27449, this.field_l), this.field_l, false, var8_int);
                              if (var17 != null) {
                                this.a(27799, var17);
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            L11: {
                              var18 = var4_ref.field_h.a(-27449, this.field_l);
                              if ((this.field_k.field_k ^ -1) != -62) {
                                if (-63 != (this.field_k.field_k ^ -1)) {
                                  if (-64 != (this.field_k.field_k ^ -1)) {
                                    var18.b(-1, 6);
                                    break L11;
                                  } else {
                                    var18.b(-1, 7);
                                    break L11;
                                  }
                                } else {
                                  var18.b(-1, 7);
                                  break L11;
                                }
                              } else {
                                var18.b(-1, 7);
                                break L11;
                              }
                            }
                            L12: {
                              if (!((iv) ((Object) var4_ref)).field_j) {
                                if (0 >= var4_ref.field_f) {
                                  L13: {
                                    if ((var5_ref.field_p ^ -1) != -5) {
                                      break L13;
                                    } else {
                                      if (var4_ref.field_f == 0) {
                                        break L12;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  this.a(27799, new ek(this.field_l, var18, var4_ref.field_f));
                                  break L12;
                                } else {
                                  this.a(27799, new ek(this.field_l, var18, var4_ref.field_f));
                                  var11_ref = new fa(this.field_l, var18.field_s.field_x, var18.field_s.field_J, var18.field_f);
                                  ((kj) ((Object) var11_ref)).a(0);
                                  break L12;
                                }
                              } else {
                                L14: {
                                  var18.a(16777215, 106, bja.field_n);
                                  if (-5 != (var5_ref.field_p ^ -1)) {
                                    break L14;
                                  } else {
                                    if (0 == var4_ref.field_f) {
                                      break L12;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                this.a(27799, new ek(this.field_l, var18, var4_ref.field_f));
                                break L12;
                              }
                            }
                            L15: {
                              if (0 == var5_ref.field_u) {
                                break L15;
                              } else {
                                if (15 == var5_ref.field_u) {
                                  break L15;
                                } else {
                                  if (var5_ref.field_u == 45) {
                                    break L15;
                                  } else {
                                    if (var5_ref.field_u == 46) {
                                      break L15;
                                    } else {
                                      if (23 == var5_ref.field_u) {
                                        break L15;
                                      } else {
                                        if (-21 == (var5_ref.field_u ^ -1)) {
                                          break L15;
                                        } else {
                                          L16: {
                                            if ((var18.field_s.field_y ^ -1) != -33) {
                                              break L16;
                                            } else {
                                              if (var5_ref.c(27863)) {
                                                break L16;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                          if (!var18.field_s.g((byte) 85)) {
                                            var18.a(24831, 14, kna.field_g[var5_ref.field_u]);
                                            if ((pna.field_zb[var5_ref.field_u].field_i ^ -1) == 0) {
                                              break L15;
                                            } else {
                                              if (var5_ref.field_u == 9) {
                                                break L15;
                                              } else {
                                                var11_ref2 = new qla(this.field_l, var18.field_s.field_x, var18.field_s.field_J, pna.field_zb[var5_ref.field_u].field_i);
                                                ((kj) ((Object) var11_ref2)).a(0);
                                                break L15;
                                              }
                                            }
                                          } else {
                                            var18.a(24831, 87, lma.field_A);
                                            break L15;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L17: {
                              var6 = var4_ref.field_f;
                              c.a(1220394217, var16.field_o.field_e);
                              var11_int = ((t) ((Object) al.a(112, this.field_k.field_k))).field_s;
                              if (this.field_k.field_p != 31) {
                                break L17;
                              } else {
                                var11_int = 0;
                                break L17;
                              }
                            }
                            L18: {
                              if (this.field_k.field_k == 68) {
                                break L18;
                              } else {
                                if ((this.field_k.field_k ^ -1) == -70) {
                                  break L18;
                                } else {
                                  if (70 == this.field_k.field_k) {
                                    break L18;
                                  } else {
                                    if (var11_int == 0) {
                                      break L3;
                                    } else {
                                      var3.a(var11_int, var3, (byte) 2);
                                      if (this.field_k.field_l.a(-27449, this.field_l) != null) {
                                        this.field_k.field_l.a(-27449, this.field_l).a(65280, 121, Integer.toString(-var11_int));
                                        break L3;
                                      } else {
                                        var4_ref = (pp) ((Object) this.field_k.field_o.c(0));
                                        continue L2;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var3.a(-var6, var3, (byte) 2);
                            if (null == this.field_k.field_l.a(-27449, this.field_l)) {
                              break L3;
                            } else {
                              if (-1 == (var6 ^ -1)) {
                                break L3;
                              } else {
                                var12 = this.field_k.field_l.a(-27449, this.field_l);
                                this.field_k.field_l.a(-27449, this.field_l).a(65280, 9, Integer.toString(var6));
                                var13 = new bn(this.field_l, var12.field_s.field_x, var12.field_s.field_J);
                                ((kj) ((Object) var13)).a(0);
                                break L3;
                              }
                            }
                          }
                        }
                        var4_ref = (pp) ((Object) this.field_k.field_o.c(0));
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "mv.H(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    void d(int param0) {
        if (param0 <= 16) {
            return;
        }
        aga var2 = this.field_k.field_l.a(44, this.field_l.field_h);
        if (var2.i(-85)) {
            return;
        }
        try {
            this.field_k.field_l.a(-27449, this.field_l).b(false);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "mv.B(" + param0 + ')');
        }
    }

    boolean c(byte param0) {
        int fieldTemp$0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_51_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        aga var4 = null;
        ad var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        t var8_ref = null;
        var8 = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var3 = 14 % ((71 - param0) / 47);
              var8_ref = (t) ((Object) al.a(88, this.field_k.field_k));
              var4 = this.field_k.field_l.a(72, this.field_l.field_h);
              var5 = this.field_k.field_l.a(-27449, this.field_l);
              this.field_l.field_s.a((byte) -57, var4.field_J, var4.field_x);
              var6 = ok.c(var8_ref.field_n, -26684) + 12;
              if ((var6 ^ -1) > -101) {
                break L1;
              } else {
                var6 = 99;
                break L1;
              }
            }
            fieldTemp$0 = this.field_j - 1;
            this.field_j = this.field_j - 1;
            if (-1 >= (fieldTemp$0 ^ -1)) {
              L2: {
                if (var6 == this.field_j) {
                  mk.a(var8_ref.field_n, -101);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (this.field_j != 25) {
                  break L3;
                } else {
                  if (!this.field_k.d((byte) -70)) {
                    this.d((byte) -111);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (this.field_j != 25) {
                  break L4;
                } else {
                  if (this.field_k.d((byte) -73)) {
                    break L4;
                  } else {
                    this.f(87);
                    break L4;
                  }
                }
              }
              L5: {
                if (15 != this.field_j) {
                  break L5;
                } else {
                  if (this.field_k.d((byte) -112)) {
                    break L5;
                  } else {
                    if (4 != var8_ref.field_r) {
                      break L5;
                    } else {
                      this.field_l.field_fb.a(new ha(this.field_l, var5), true);
                      break L5;
                    }
                  }
                }
              }
              L6: {
                if ((this.field_j ^ -1) != -36) {
                  break L6;
                } else {
                  if (this.field_k.d((byte) -81)) {
                    break L6;
                  } else {
                    L7: {
                      if (this.field_k.field_k == 31) {
                        break L7;
                      } else {
                        if (-33 == (this.field_k.field_k ^ -1)) {
                          break L7;
                        } else {
                          if ((this.field_k.field_k ^ -1) == -34) {
                            break L7;
                          } else {
                            if (var8_ref.field_r != 6) {
                              if (-9 == (var8_ref.field_r ^ -1)) {
                                this.field_l.field_fb.a(new ah(this.field_l, var5, this.field_k.field_q, 2), true);
                                break L6;
                              } else {
                                if (-8 != (var8_ref.field_r ^ -1)) {
                                  break L6;
                                } else {
                                  this.field_l.field_fb.a(new gja(this.field_l, var5, this.field_k.field_q), true);
                                  break L6;
                                }
                              }
                            } else {
                              this.field_l.field_fb.a(new jv(this.field_l, var5, this.field_k.field_q), true);
                              break L6;
                            }
                          }
                        }
                      }
                    }
                    this.field_l.field_fb.a(new ut(this.field_l, var5, this.field_k.field_q, this.field_k.field_p), true);
                    break L6;
                  }
                }
              }
              L8: {
                if (this.field_j >= 25) {
                  break L8;
                } else {
                  if (!this.field_k.d((byte) -53)) {
                    this.e(-32);
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                if (50 != this.field_j) {
                  break L9;
                } else {
                  if (!this.field_k.d((byte) -120)) {
                    var5.b(-1, var8_ref.field_o);
                    id.e(49, var5.field_s.field_o.field_e);
                    break L9;
                  } else {
                    return false;
                  }
                }
              }
              stackIn_49_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.d(30);
              stackIn_51_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "mv.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_49_0 != 0;
        } else {
          return stackIn_51_0 != 0;
        }
    }

    void e(int param0) {
        pp var2 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        ad var3 = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            if ((this.field_k.field_p ^ -1) != param0) {
              var2 = (pp) ((Object) this.field_k.field_o.b((byte) 90));
              L1: while (true) {
                if (var2 == null) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    if (var2 instanceof iv) {
                      var3 = var2.field_h.a(-27449, this.field_l);
                      if (var3.field_f.field_u.field_e) {
                        var3.b(false);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  var2 = (pp) ((Object) this.field_k.field_o.c(0));
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2_ref), "mv.I(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void f(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        aga var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        int var17 = 0;
        op var19 = null;
        int[][] var22 = null;
        var17 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              al.a(91, this.field_k.field_k);
              var19 = this.field_l.field_h;
              var3 = this.field_k.field_l.a(84, this.field_l.field_h);
              var22 = haa.b(1, var3.d(124, this.field_k.field_k), this.field_k.field_q);
              var5 = var3.field_x;
              var6 = var3.field_J;
              if (this.field_k.field_q == 2) {
                var5 = var5 - this.field_k.field_p;
                break L1;
              } else {
                if (4 != this.field_k.field_q) {
                  if (1 == this.field_k.field_q) {
                    var6 = var6 - this.field_k.field_p;
                    break L1;
                  } else {
                    if ((this.field_k.field_q ^ -1) == -4) {
                      var6 = var6 + this.field_k.field_p;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  var5 = var5 + this.field_k.field_p;
                  break L1;
                }
              }
            }
            L2: {
              if (31 == this.field_k.field_p) {
                var22[8][8] = 1;
                break L2;
              } else {
                break L2;
              }
            }
            var7 = 17;
            var8 = 17;
            var9 = -1 + var7 >> 1963478689;
            var11 = -31 / ((param0 - 27) / 42);
            var10 = -1 + var8 >> 1845594753;
            var12 = 0;
            L3: while (true) {
              if (var7 <= var12) {
                break L0;
              } else {
                var13 = 0;
                L4: while (true) {
                  if (var8 <= var13) {
                    var12++;
                    continue L3;
                  } else {
                    if (1 == var22[var12][var13]) {
                      var14 = var12 - (var9 - var5);
                      var15 = var6 - -var13 - var10;
                      if (var14 >= 0) {
                        if (var14 < var19.field_z) {
                          if ((var15 ^ -1) <= -1) {
                            L5: {
                              if (var19.field_B > var15) {
                                if (this.field_l.field_h.field_a[var14][var15].e(-88)) {
                                  L6: {
                                    L7: {
                                      var16 = null;
                                      if ((this.field_k.field_k ^ -1) == -62) {
                                        break L7;
                                      } else {
                                        if (62 == this.field_k.field_k) {
                                          break L7;
                                        } else {
                                          if (63 != this.field_k.field_k) {
                                            L8: {
                                              if (this.field_k.field_k == 24) {
                                                break L8;
                                              } else {
                                                if (-26 == (this.field_k.field_k ^ -1)) {
                                                  break L8;
                                                } else {
                                                  if (this.field_k.field_k == 26) {
                                                    break L8;
                                                  } else {
                                                    if (this.field_l.field_h.field_a[var14][var15].field_l != null) {
                                                      break L6;
                                                    } else {
                                                      var16 = new uea(this.field_l, var14, var15, 16711680);
                                                      break L6;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            var16 = null;
                                            break L6;
                                          } else {
                                            break L7;
                                          }
                                        }
                                      }
                                    }
                                    var16 = new bn(this.field_l, var14, var15);
                                    break L6;
                                  }
                                  if (var16 != null) {
                                    ((kj) (var16)).a(0);
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  break L5;
                                }
                              } else {
                                break L5;
                              }
                            }
                            var13++;
                            continue L4;
                          } else {
                            var13++;
                            continue L4;
                          }
                        } else {
                          var13++;
                          continue L4;
                        }
                      } else {
                        var13++;
                        continue L4;
                      }
                    } else {
                      var13++;
                      continue L4;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "mv.F(" + param0 + ')');
        }
    }

    public static void e(byte param0) {
        try {
            field_m = null;
            if (param0 <= 0) {
                field_m = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "mv.G(" + param0 + ')');
        }
    }

    mv(gj param0, vja param1) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        ad var4 = null;
        t var6 = null;
        try {
          L0: {
            L1: {
              this.field_k = param1;
              this.field_l = param0;
              var6 = (t) ((Object) al.a(-91, this.field_k.field_k));
              var4 = this.field_k.field_l.a(-27449, this.field_l);
              if (var6.field_p == 2) {
                break L1;
              } else {
                if (-4 != (var6.field_p ^ -1)) {
                  this.a(27799, new taa(this.field_l, var4));
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (var4.field_s.i(-120)) {
                break L2;
              } else {
                this.field_j = 100;
                if (this.field_k.field_s) {
                  var4.a(16777152, 72, qfa.field_w);
                  break L2;
                } else {
                  if (!this.field_k.field_r) {
                    if (!this.field_k.field_n) {
                      var4.a(12648384, 43, var6.a((byte) 37));
                      this.field_j = 100;
                      var4.field_s.d(this.field_k.field_k, (byte) -120);
                      break L2;
                    } else {
                      var4.a(16761024, 84, dc.field_o);
                      break L2;
                    }
                  } else {
                    var4.a(16777152, 41, m.field_c);
                    break L2;
                  }
                }
              }
            }
            L3: {
              if (this.field_k.field_q == 0) {
                break L3;
              } else {
                var4.field_s.field_s = this.field_k.field_q;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var3);

            stackIn_23_1 = new StringBuilder().append("mv.<init>(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          L5: {
            stackIn_27_0 = (RuntimeException) ((Object) stackIn_24_0);

            stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L5;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    static {
        field_m = "Create unrated game";
    }
}
