/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km extends sq {
    static ao field_W;
    private j field_Y;
    static boolean[] field_ab;
    private String field_bb;
    private ja field_Z;
    private int field_X;
    static int field_cb;

    final void a(int param0, int param1, int param2, int param3) {
        String var5;
        re var6;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        Object var17;
        ja var18;
        Object var22;
        Object var26;
        rk var53;
        ja var19;
        ja var20;
        String var21;
        ja var23;
        ja var24;
        ja var25;
        ja var27;
        ja var28;
        ja var29;
        ja var30;
        ja var31;
        ja var32;
        ja var33;
        ja var36;
        ja var37;
        ja var40;
        ja var41;
        ja var42;
        ja var43;
        ja var44;
        ja var45;
        ja var46;
        ja var47;
        ja var48;
        ja var49;
        ja var50;
        ja var51;
        ja var52;
        rk var54;
        rk var55;
        L0: {
          L1: {
            var17 = null;
            var22 = null;
            var26 = null;
            var13 = ZombieDawnMulti.field_E ? 1 : 0;
            var6 = this.field_Y.d(102);
            if (var6 == h.field_H) {
              var5 = ki.field_n;
              if (var13 == 0) {
                break L0;
              } else {
                break L1;
              }
            } else {
              if (var6 != ua.field_I) {
                break L1;
              } else {
                L2: {
                  var5 = ki.field_n;
                  if (var13 == 0) {
                    break L2;
                  } else {
                    var5 = this.field_Y.c(-120);
                    if (var5 == null) {
                      var5 = this.field_bb;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (!var5.equals(this.field_j)) {
                    this.field_j = var5;
                    this.a((byte) 94);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    L6: {
                      super.a(param0, param1, param2, param3);
                      var6 = this.field_Y.d(97);
                      var53 = (rk) ((Object) this.field_h);
                      var9 = this.field_y + param3;
                      var10 = var53.a((cf) (this), 0, param1) + (var53.a((cf) (this), param0 + -99).a((byte) -111) >> -1436774079);
                      if (h.field_H == var6) {
                        break L6;
                      } else {
                        if (ua.field_I != var6) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      L8: {
                        var18 = rj.field_I[0];
                        var11 = var18.field_z << 1889279009;
                        var12 = var18.field_u << -1362434079;
                        if (this.field_Z == null) {
                          break L8;
                        } else {
                          if (this.field_Z.field_x < var11) {
                            break L8;
                          } else {
                            if (this.field_Z.field_w >= var12) {
                              r.a(0, this.field_Z);
                              oo.b();
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      this.field_Z = new ja(var11, var12);
                      r.a(0, this.field_Z);
                      if (var13 == 0) {
                        break L7;
                      } else {
                        r.a(0, this.field_Z);
                        oo.b();
                        break L7;
                      }
                    }
                    var18.a(112, 144, var18.field_z << -1454164284, var18.field_u << 795996068, -this.field_X << 395113578, 4096);
                    ql.a(true);
                    this.field_Z.e(var9 - (var18.field_z >> -2001476671), var10 + -var18.field_u, 256);
                    if (var13 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                  L9: {
                    if (jq.field_b != var6) {
                      break L9;
                    } else {
                      var19 = rj.field_I[2];
                      var19.e(var9, var10 + -(var19.field_w >> 11199105), 256);
                      if (var13 == 0) {
                        break L4;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (var6 != db.field_b) {
                    break L4;
                  } else {
                    var20 = rj.field_I[1];
                    var20.e(var9, -(var20.field_w >> -1344454175) + var10, 256);
                    break L4;
                  }
                }
                return;
              }
            }
          }
          var21 = this.field_Y.c(-120);
          if (var21 == null) {
            var5 = this.field_bb;
            break L0;
          } else {
            L10: {
              if (!var21.equals(this.field_j)) {
                this.field_j = var21;
                this.a((byte) 94);
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              L12: {
                L13: {
                  super.a(param0, param1, param2, param3);
                  var6 = this.field_Y.d(97);
                  var54 = (rk) ((Object) this.field_h);
                  var9 = this.field_y + param3;
                  var10 = var54.a((cf) (this), 0, param1) + (var54.a((cf) (this), param0 + -99).a((byte) -111) >> -1436774079);
                  if (h.field_H == var6) {
                    break L13;
                  } else {
                    if (ua.field_I != var6) {
                      break L12;
                    } else {
                      break L13;
                    }
                  }
                }
                L14: {
                  L15: {
                    var23 = rj.field_I[0];
                    var11 = var23.field_z << 1889279009;
                    var12 = var23.field_u << -1362434079;
                    if (this.field_Z == null) {
                      break L15;
                    } else {
                      if (this.field_Z.field_x < var11) {
                        break L15;
                      } else {
                        if (this.field_Z.field_w >= var12) {
                          r.a(0, this.field_Z);
                          oo.b();
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                  }
                  this.field_Z = new ja(var11, var12);
                  r.a(0, this.field_Z);
                  if (var13 == 0) {
                    break L14;
                  } else {
                    r.a(0, this.field_Z);
                    oo.b();
                    break L14;
                  }
                }
                var23.a(112, 144, var23.field_z << -1454164284, var23.field_u << 795996068, -this.field_X << 395113578, 4096);
                ql.a(true);
                this.field_Z.e(var9 - (var23.field_z >> -2001476671), var10 + -var23.field_u, 256);
                if (var13 == 0) {
                  break L11;
                } else {
                  break L12;
                }
              }
              L16: {
                if (jq.field_b != var6) {
                  break L16;
                } else {
                  var24 = rj.field_I[2];
                  var24.e(var9, var10 + -(var24.field_w >> 11199105), 256);
                  if (var13 == 0) {
                    break L11;
                  } else {
                    break L16;
                  }
                }
              }
              if (var6 != db.field_b) {
                break L11;
              } else {
                var25 = rj.field_I[1];
                var25.e(var9, -(var25.field_w >> -1344454175) + var10, 256);
                break L11;
              }
            }
            return;
          }
        }
        L17: {
          if (!var5.equals(this.field_j)) {
            this.field_j = var5;
            this.a((byte) 94);
            break L17;
          } else {
            break L17;
          }
        }
        super.a(param0, param1, param2, param3);
        var6 = this.field_Y.d(97);
        var55 = (rk) ((Object) this.field_h);
        var9 = this.field_y + param3;
        var10 = var55.a((cf) (this), 0, param1) + (var55.a((cf) (this), param0 + -99).a((byte) -111) >> -1436774079);
        if (h.field_H == var6) {
          L18: {
            var42 = rj.field_I[0];
            var11 = var42.field_z << 1889279009;
            var12 = var42.field_u << -1362434079;
            if (this.field_Z == null) {
              break L18;
            } else {
              if (this.field_Z.field_x < var11) {
                break L18;
              } else {
                if (this.field_Z.field_w < var12) {
                  this.field_Z = new ja(var11, var12);
                  r.a(0, this.field_Z);
                  if (var13 != 0) {
                    L19: {
                      r.a(0, this.field_Z);
                      oo.b();
                      var42.a(112, 144, var42.field_z << -1454164284, var42.field_u << 795996068, -this.field_X << 395113578, 4096);
                      ql.a(true);
                      this.field_Z.e(var9 - (var42.field_z >> -2001476671), var10 + -var42.field_u, 256);
                      if (jq.field_b != var6) {
                        break L19;
                      } else {
                        var43 = rj.field_I[2];
                        var43.e(var9, var10 + -(var43.field_w >> 11199105), 256);
                        break L19;
                      }
                    }
                    L20: {
                      if (var6 != db.field_b) {
                        break L20;
                      } else {
                        var44 = rj.field_I[1];
                        var44.e(var9, -(var44.field_w >> -1344454175) + var10, 256);
                        break L20;
                      }
                    }
                    return;
                  } else {
                    L21: {
                      var42.a(112, 144, var42.field_z << -1454164284, var42.field_u << 795996068, -this.field_X << 395113578, 4096);
                      ql.a(true);
                      this.field_Z.e(var9 - (var42.field_z >> -2001476671), var10 + -var42.field_u, 256);
                      if (var13 == 0) {
                        break L21;
                      } else {
                        L22: {
                          if (jq.field_b != var6) {
                            break L22;
                          } else {
                            var45 = rj.field_I[2];
                            var45.e(var9, var10 + -(var45.field_w >> 11199105), 256);
                            break L22;
                          }
                        }
                        if (var6 != db.field_b) {
                          break L21;
                        } else {
                          var46 = rj.field_I[1];
                          var46.e(var9, -(var46.field_w >> -1344454175) + var10, 256);
                          break L21;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L23: {
                    r.a(0, this.field_Z);
                    oo.b();
                    var42.a(112, 144, var42.field_z << -1454164284, var42.field_u << 795996068, -this.field_X << 395113578, 4096);
                    ql.a(true);
                    this.field_Z.e(var9 - (var42.field_z >> -2001476671), var10 + -var42.field_u, 256);
                    if (var13 == 0) {
                      break L23;
                    } else {
                      L24: {
                        if (jq.field_b != var6) {
                          break L24;
                        } else {
                          var47 = rj.field_I[2];
                          var47.e(var9, var10 + -(var47.field_w >> 11199105), 256);
                          break L24;
                        }
                      }
                      if (var6 != db.field_b) {
                        break L23;
                      } else {
                        var48 = rj.field_I[1];
                        var48.e(var9, -(var48.field_w >> -1344454175) + var10, 256);
                        break L23;
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
          this.field_Z = new ja(var11, var12);
          r.a(0, this.field_Z);
          if (var13 != 0) {
            L25: {
              r.a(0, this.field_Z);
              oo.b();
              var42.a(112, 144, var42.field_z << -1454164284, var42.field_u << 795996068, -this.field_X << 395113578, 4096);
              ql.a(true);
              this.field_Z.e(var9 - (var42.field_z >> -2001476671), var10 + -var42.field_u, 256);
              if (jq.field_b != var6) {
                break L25;
              } else {
                var49 = rj.field_I[2];
                var49.e(var9, var10 + -(var49.field_w >> 11199105), 256);
                break L25;
              }
            }
            L26: {
              if (var6 != db.field_b) {
                break L26;
              } else {
                var50 = rj.field_I[1];
                var50.e(var9, -(var50.field_w >> -1344454175) + var10, 256);
                break L26;
              }
            }
            return;
          } else {
            L27: {
              var42.a(112, 144, var42.field_z << -1454164284, var42.field_u << 795996068, -this.field_X << 395113578, 4096);
              ql.a(true);
              this.field_Z.e(var9 - (var42.field_z >> -2001476671), var10 + -var42.field_u, 256);
              if (var13 == 0) {
                break L27;
              } else {
                L28: {
                  if (jq.field_b != var6) {
                    break L28;
                  } else {
                    var51 = rj.field_I[2];
                    var51.e(var9, var10 + -(var51.field_w >> 11199105), 256);
                    break L28;
                  }
                }
                if (var6 != db.field_b) {
                  break L27;
                } else {
                  var52 = rj.field_I[1];
                  var52.e(var9, -(var52.field_w >> -1344454175) + var10, 256);
                  break L27;
                }
              }
            }
            return;
          }
        } else {
          if (ua.field_I == var6) {
            var27 = rj.field_I[0];
            var11 = var27.field_z << 1889279009;
            var12 = var27.field_u << -1362434079;
            if (this.field_Z != null) {
              if (this.field_Z.field_x >= var11) {
                if (this.field_Z.field_w < var12) {
                  this.field_Z = new ja(var11, var12);
                  r.a(0, this.field_Z);
                  if (var13 != 0) {
                    L29: {
                      r.a(0, this.field_Z);
                      oo.b();
                      var27.a(112, 144, var27.field_z << -1454164284, var27.field_u << 795996068, -this.field_X << 395113578, 4096);
                      ql.a(true);
                      this.field_Z.e(var9 - (var27.field_z >> -2001476671), var10 + -var27.field_u, 256);
                      if (jq.field_b != var6) {
                        break L29;
                      } else {
                        var36 = rj.field_I[2];
                        var36.e(var9, var10 + -(var36.field_w >> 11199105), 256);
                        break L29;
                      }
                    }
                    L30: {
                      if (var6 != db.field_b) {
                        break L30;
                      } else {
                        var37 = rj.field_I[1];
                        var37.e(var9, -(var37.field_w >> -1344454175) + var10, 256);
                        break L30;
                      }
                    }
                    return;
                  } else {
                    L31: {
                      var27.a(112, 144, var27.field_z << -1454164284, var27.field_u << 795996068, -this.field_X << 395113578, 4096);
                      ql.a(true);
                      this.field_Z.e(var9 - (var27.field_z >> -2001476671), var10 + -var27.field_u, 256);
                      if (var13 == 0) {
                        break L31;
                      } else {
                        L32: {
                          if (jq.field_b != var6) {
                            break L32;
                          } else {
                            var40 = rj.field_I[2];
                            var40.e(var9, var10 + -(var40.field_w >> 11199105), 256);
                            break L32;
                          }
                        }
                        if (var6 != db.field_b) {
                          break L31;
                        } else {
                          var41 = rj.field_I[1];
                          var41.e(var9, -(var41.field_w >> -1344454175) + var10, 256);
                          break L31;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L33: {
                    r.a(0, this.field_Z);
                    oo.b();
                    var27.a(112, 144, var27.field_z << -1454164284, var27.field_u << 795996068, -this.field_X << 395113578, 4096);
                    ql.a(true);
                    this.field_Z.e(var9 - (var27.field_z >> -2001476671), var10 + -var27.field_u, 256);
                    if (var13 == 0) {
                      break L33;
                    } else {
                      L34: {
                        if (jq.field_b != var6) {
                          break L34;
                        } else {
                          var32 = rj.field_I[2];
                          var32.e(var9, var10 + -(var32.field_w >> 11199105), 256);
                          break L34;
                        }
                      }
                      if (var6 != db.field_b) {
                        break L33;
                      } else {
                        var33 = rj.field_I[1];
                        var33.e(var9, -(var33.field_w >> -1344454175) + var10, 256);
                        break L33;
                      }
                    }
                  }
                  return;
                }
              } else {
                L35: {
                  this.field_Z = new ja(var11, var12);
                  r.a(0, this.field_Z);
                  if (var13 == 0) {
                    break L35;
                  } else {
                    r.a(0, this.field_Z);
                    oo.b();
                    break L35;
                  }
                }
                L36: {
                  var27.a(112, 144, var27.field_z << -1454164284, var27.field_u << 795996068, -this.field_X << 395113578, 4096);
                  ql.a(true);
                  this.field_Z.e(var9 - (var27.field_z >> -2001476671), var10 + -var27.field_u, 256);
                  if (var13 == 0) {
                    break L36;
                  } else {
                    L37: {
                      if (jq.field_b != var6) {
                        break L37;
                      } else {
                        var30 = rj.field_I[2];
                        var30.e(var9, var10 + -(var30.field_w >> 11199105), 256);
                        break L37;
                      }
                    }
                    if (var6 != db.field_b) {
                      break L36;
                    } else {
                      var31 = rj.field_I[1];
                      var31.e(var9, -(var31.field_w >> -1344454175) + var10, 256);
                      break L36;
                    }
                  }
                }
                return;
              }
            } else {
              L38: {
                this.field_Z = new ja(var11, var12);
                r.a(0, this.field_Z);
                if (var13 == 0) {
                  break L38;
                } else {
                  r.a(0, this.field_Z);
                  oo.b();
                  break L38;
                }
              }
              L39: {
                var27.a(112, 144, var27.field_z << -1454164284, var27.field_u << 795996068, -this.field_X << 395113578, 4096);
                ql.a(true);
                this.field_Z.e(var9 - (var27.field_z >> -2001476671), var10 + -var27.field_u, 256);
                if (var13 == 0) {
                  break L39;
                } else {
                  L40: {
                    if (jq.field_b != var6) {
                      break L40;
                    } else {
                      var28 = rj.field_I[2];
                      var28.e(var9, var10 + -(var28.field_w >> 11199105), 256);
                      break L40;
                    }
                  }
                  if (var6 != db.field_b) {
                    break L39;
                  } else {
                    var29 = rj.field_I[1];
                    var29.e(var9, -(var29.field_w >> -1344454175) + var10, 256);
                    break L39;
                  }
                }
              }
              return;
            }
          } else {
            L41: {
              L42: {
                if (jq.field_b != var6) {
                  break L42;
                } else {
                  var51 = rj.field_I[2];
                  var51.e(var9, var10 + -(var51.field_w >> 11199105), 256);
                  if (var13 == 0) {
                    break L41;
                  } else {
                    break L42;
                  }
                }
              }
              if (var6 != db.field_b) {
                break L41;
              } else {
                var52 = rj.field_I[1];
                var52.e(var9, -(var52.field_w >> -1344454175) + var10, 256);
                break L41;
              }
            }
            return;
          }
        }
    }

    final static void a(int param0, byte param1) {
        int var2_int = 0;
        br var3 = null;
        int var4 = 0;
        ab var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5 = (ab) ((Object) ig.field_a.c(92));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var5 == null) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_6_0 = 99;
                        stackIn_4_0 = stackIn_6_0;
                        if (var4 != 0) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ih.a((byte) stackIn_4_0, var5, param0);
                        var5 = (ab) ((Object) ig.field_a.b(6));
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = -37 / ((-63 - param1) / 58);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var2_int = stackIn_6_0;
                        var3 = so.field_j.c(48);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var3 == null) {
                            statePc = 14;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        qo.b(true, param0);
                        var3 = so.field_j.b(6);
                        if (var4 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        return;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var4 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var2), "km.D(" + param0 + ',' + param1 + ')');
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, cf param1, int param2, int param3) {
        try {
            this.field_X = this.field_X + 1;
            if (param0 != -5407) {
                km.i(56);
            }
            super.a(param0 ^ 0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "km.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void i(int param0) {
        if (param0 != 0) {
            return;
        }
        field_W = null;
        field_ab = null;
    }

    final static void a(ul param0, byte param1) {
        cj var5 = null;
        cj var6 = null;
        cj var3 = null;
        try {
            pa.field_T = fl.a("basic", "display_name_changed", param0, 11091);
            eg.field_B = new cd(0L, oj.field_Q, iq.field_a, dg.field_I);
            gl.field_L = new cd(0L, oj.field_Q, kg.field_i, qh.field_d);
            pa.field_O = new cj(0L, (cj) null);
            dp.field_b = new cj(0L, vo.field_m);
            dp.field_b.field_R = 1;
            bi.field_f = new cj(0L, vd.field_a, qd.field_r);
            jb.field_c = new cj(0L, pn.field_g, ko.field_h);
            lk.field_J = new cj(0L, cm.field_b);
            if (param1 > -106) {
                km.h(-103);
            }
            pa.field_O.a((byte) 50, dp.field_b);
            pa.field_O.a((byte) 50, bi.field_f);
            pa.field_O.a((byte) 50, jb.field_c);
            pa.field_O.a((byte) 50, eg.field_B);
            pa.field_O.a((byte) 50, lk.field_J);
            eg.field_B.field_Jb.field_Jb.b((byte) -32, vo.field_m);
            eg.field_B.field_Jb.field_Jb.field_lb = 1;
            var5 = eg.field_B.field_Jb.field_Jb;
            var6 = var5;
            var6.field_R = 1;
            gl.field_L.field_Jb.field_Jb.b((byte) -32, vo.field_m);
            gl.field_L.field_Jb.field_Jb.field_lb = 1;
            var3 = gl.field_L.field_Jb.field_Jb;
            var3.field_R = 1;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "km.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String d(byte param0) {
        int var2 = 82 / ((param0 - 53) / 57);
        return null;
    }

    final boolean a(cf param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 0) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("km.S(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final static void h(int param0) {
        if (!(og.field_N)) {
            throw new IllegalStateException();
        }
        hh.field_m = true;
        sc.a(-86, false);
        a.field_b = param0;
    }

    final static ka b(int param0, int param1, int param2, int param3) {
        boolean stackIn_3_0 = false;
        int stackIn_23_0 = 0;
        cj stackIn_26_0 = null;
        cj stackIn_33_0 = null;
        int stackIn_42_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_82_0 = 0;
        boolean stackOut_2_0;
        int statePc = 0;
        Object var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ka var8_ref_ka = null;
        int var8 = 0;
        int var9 = 0;
        ka var9_ref_ka = null;
        int var10 = 0;
        String var10_ref_String = null;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = ZombieDawnMulti.field_E ? 1 : 0;
                    var4 = null;
                    tn.field_A.field_Gb.field_Cb.e(-30986);
                    var5 = 0;
                    var6 = 0;
                    var7 = -1 + uf.field_g;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (-1 < (var7 ^ -1)) {
                        statePc = 22;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var8_ref_ka = uk.field_M[var7];
                    var9 = 0;
                    stackOut_2_0 = nh.field_m;
                    stackIn_23_0 = stackOut_2_0 ? 1 : 0;
                    stackIn_3_0 = stackOut_2_0;
                    if (var13 != 0) {
                        statePc = 23;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (stackIn_3_0) {
                        statePc = 11;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var5 >= sj.field_m) {
                        statePc = 11;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var10 = ga.a(var8_ref_ka.field_l, true);
                    if (var8_ref_ka.a(true) >= var10) {
                        statePc = 7;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var8_ref_ka.field_k) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (hp.a(var8_ref_ka.field_e, 1020)) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var9 = 1;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (var9 != 0) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var8_ref_ka.field_q = null;
                    if (var13 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (var8_ref_ka.field_q == null) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (bn.field_b) {
                        statePc = 17;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (null != var8_ref_ka.field_q) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    id.field_D = id.field_D + 1;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    var10_ref_String = bh.a(-126, var8_ref_ka);
                    var11 = var10_ref_String + fm.c(var8_ref_ka.field_d);
                    var12 = cj.a(var8_ref_ka, (byte) -63);
                    var8_ref_ka.field_q = new cj(0L, qq.field_f, var11);
                    var6 = var6 + param2;
                    var8_ref_ka.field_q.field_xb = (8355711 & qq.field_f.field_xb >> -31419391) + var12 + -((var12 & 16711422) >> -781614975);
                    var8_ref_ka.field_q.field_ob = (8355711 & qq.field_f.field_ob >> 310266561) + (var12 - ((var12 & 16711422) >> 2031205889));
                    var8_ref_ka.field_q.field_yb = w.field_A;
                    var8_ref_ka.field_q.field_M = var12;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    var5++;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    var7--;
                    if (var13 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var7 = 0;
                    stackIn_23_0 = 0;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    var8 = stackIn_23_0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (uf.field_g <= var8) {
                        statePc = 32;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var9_ref_ka = uk.field_M[var8];
                    stackIn_33_0 = var9_ref_ka.field_q;
                    stackIn_26_0 = stackIn_33_0;
                    if (var13 != 0) {
                        statePc = 33;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (stackIn_26_0 != null) {
                        statePc = 28;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 28: {
                    tn.field_A.field_Gb.a((byte) 50, var9_ref_ka.field_q);
                    var9_ref_ka.field_q.a(param2, var7, var9_ref_ka.field_q.e(0), param3, -3344);
                    var7 = var7 + param2;
                    if (0 != var9_ref_ka.field_q.field_T) {
                        statePc = 30;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var4 = var9_ref_ka;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    var8++;
                    if (var13 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var8 = -var7 - (-var6 - (tn.field_A.field_Gb.field_z + tn.field_A.field_Gb.field_I));
                    stackIn_33_0 = tn.field_A.field_Gb;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    stackIn_33_0.field_Q = stackIn_33_0.field_Q + var8;
                    var9 = -121 / ((-54 - param0) / 40);
                    tn.field_A.field_Gb.field_z = tn.field_A.field_Gb.field_z - var8;
                    if (bn.field_b) {
                        statePc = 35;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 35: {
                    tn.field_A.field_Gb.field_z = var7;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    tn.field_A.field_Gb.field_I = var7 - tn.field_A.field_Gb.field_z;
                    if (!bn.field_b) {
                        statePc = 61;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    tn.field_A.field_Gb.field_mb = 0;
                    bn.field_b = false;
                    tn.field_A.field_Gb.field_Q = -tn.field_A.field_Gb.field_z + tn.field_A.field_Jb.field_z;
                    sp.field_h = true;
                    if (sq.field_N) {
                        statePc = 48;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var10 = tn.field_A.field_Jb.field_z + (-tn.field_A.field_Gb.field_z + -tn.field_A.field_Gb.field_I);
                    if (sp.field_h) {
                        statePc = 43;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                    if (tn.field_A.field_Gb.field_Q - -tn.field_A.field_Gb.field_mb != var10) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    stackIn_42_0 = 1;
                    statePc = 42;
                    continue stateLoop;
                }
                case 41: {
                    stackIn_42_0 = 0;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    sp.field_h = stackIn_42_0 != 0;
                    return (ka) (var4);
                }
                case 43: {
                    tn.field_A.field_Gb.field_mb = var10 + -tn.field_A.field_Gb.field_Q;
                    tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                    if (tn.field_A.field_Gb.field_Q - -tn.field_A.field_Gb.field_mb != var10) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    stackIn_46_0 = 1;
                    statePc = 46;
                    continue stateLoop;
                }
                case 45: {
                    stackIn_46_0 = 0;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    sp.field_h = stackIn_46_0 != 0;
                    return (ka) (var4);
                }
                case 48: {
                    if (null != lj.field_v) {
                        statePc = 50;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 50: {
                    sp.field_h = true;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    var10 = tn.field_A.field_Jb.field_z + (-tn.field_A.field_Gb.field_z + -tn.field_A.field_Gb.field_I);
                    if (!sp.field_h) {
                        statePc = 56;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    tn.field_A.field_Gb.field_mb = var10 + -tn.field_A.field_Gb.field_Q;
                    tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                    if (tn.field_A.field_Gb.field_Q - -tn.field_A.field_Gb.field_mb != var10) {
                        statePc = 54;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    stackIn_55_0 = 1;
                    statePc = 55;
                    continue stateLoop;
                }
                case 54: {
                    stackIn_55_0 = 0;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    sp.field_h = stackIn_55_0 != 0;
                    return (ka) (var4);
                }
                case 56: {
                    tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                    if (tn.field_A.field_Gb.field_Q - -tn.field_A.field_Gb.field_mb != var10) {
                        statePc = 58;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    stackIn_59_0 = 1;
                    statePc = 59;
                    continue stateLoop;
                }
                case 58: {
                    stackIn_59_0 = 0;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    sp.field_h = stackIn_59_0 != 0;
                    return (ka) (var4);
                }
                case 61: {
                    if (!sq.field_N) {
                        statePc = 74;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (null != lj.field_v) {
                        statePc = 73;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var10 = tn.field_A.field_Jb.field_z + (-tn.field_A.field_Gb.field_z + -tn.field_A.field_Gb.field_I);
                    if (sp.field_h) {
                        statePc = 68;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                    if (tn.field_A.field_Gb.field_Q - -tn.field_A.field_Gb.field_mb != var10) {
                        statePc = 66;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    stackIn_67_0 = 1;
                    statePc = 67;
                    continue stateLoop;
                }
                case 66: {
                    stackIn_67_0 = 0;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    sp.field_h = stackIn_67_0 != 0;
                    return (ka) (var4);
                }
                case 68: {
                    tn.field_A.field_Gb.field_mb = var10 + -tn.field_A.field_Gb.field_Q;
                    tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                    if (tn.field_A.field_Gb.field_Q - -tn.field_A.field_Gb.field_mb != var10) {
                        statePc = 70;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    stackIn_71_0 = 1;
                    statePc = 71;
                    continue stateLoop;
                }
                case 70: {
                    stackIn_71_0 = 0;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    sp.field_h = stackIn_71_0 != 0;
                    return (ka) (var4);
                }
                case 73: {
                    sp.field_h = true;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    var10 = tn.field_A.field_Jb.field_z + (-tn.field_A.field_Gb.field_z + -tn.field_A.field_Gb.field_I);
                    if (sp.field_h) {
                        statePc = 79;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                    if (tn.field_A.field_Gb.field_Q - -tn.field_A.field_Gb.field_mb != var10) {
                        statePc = 77;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    stackIn_78_0 = 1;
                    statePc = 78;
                    continue stateLoop;
                }
                case 77: {
                    stackIn_78_0 = 0;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    sp.field_h = stackIn_78_0 != 0;
                    return (ka) (var4);
                }
                case 79: {
                    tn.field_A.field_Gb.field_mb = var10 + -tn.field_A.field_Gb.field_Q;
                    tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                    if (tn.field_A.field_Gb.field_Q - -tn.field_A.field_Gb.field_mb != var10) {
                        statePc = 81;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    stackIn_82_0 = 1;
                    statePc = 82;
                    continue stateLoop;
                }
                case 81: {
                    stackIn_82_0 = 0;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    sp.field_h = stackIn_82_0 != 0;
                    return (ka) (var4);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    km(j param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, pa.g((byte) 120));
        try {
            this.field_bb = param1;
            this.field_Y = param0;
            this.b(param2, param3, 28972, param4, param5);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "km.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_W = new ao(4, 1, 1, 1);
        field_cb = 480;
    }
}
