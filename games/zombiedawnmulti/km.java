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
        String var5 = null;
        re var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var17 = null;
        ja var18 = null;
        ja var19 = null;
        ja var20 = null;
        String var21 = null;
        Object var22 = null;
        ja var23 = null;
        ja var24 = null;
        ja var25 = null;
        Object var26 = null;
        ja var27 = null;
        ja var28 = null;
        ja var29 = null;
        ja var30 = null;
        ja var31 = null;
        ja var32 = null;
        ja var33 = null;
        ja var36 = null;
        ja var37 = null;
        ja var40 = null;
        ja var41 = null;
        ja var42 = null;
        ja var43 = null;
        ja var44 = null;
        ja var45 = null;
        ja var46 = null;
        ja var47 = null;
        ja var48 = null;
        ja var49 = null;
        ja var50 = null;
        ja var51 = null;
        ja var52 = null;
        rk var53 = null;
        rk var54 = null;
        rk var55 = null;
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
        RuntimeException var2 = null;
        br var3 = null;
        int var4 = 0;
        ab var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var5 = (ab) ((Object) ig.field_a.c(92));
            L1: while (true) {
              L2: {
                L3: {
                  if (var5 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = 99;
                    stackIn_6_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      ih.a((byte) stackIn_4_0, var5, param0);
                      var5 = (ab) ((Object) ig.field_a.b(6));
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_5_0 = -37 / ((-63 - param1) / 58);
                stackIn_6_0 = stackOut_5_0;
                break L2;
              }
              var2_int = stackIn_6_0;
              var3 = so.field_j.c(48);
              L4: while (true) {
                if (var3 == null) {
                  break L0;
                } else {
                  qo.b(true, param0);
                  var3 = so.field_j.b(6);
                  if (var4 == 0) {
                    continue L4;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "km.D(" + param0 + ',' + param1 + ')');
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
        RuntimeException var2 = null;
        cj var3 = null;
        cj var5 = null;
        cj var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              pa.field_T = fl.a("basic", "display_name_changed", param0, 11091);
              eg.field_B = new cd(0L, oj.field_Q, iq.field_a, dg.field_I);
              gl.field_L = new cd(0L, oj.field_Q, kg.field_i, qh.field_d);
              pa.field_O = new cj(0L, (cj) null);
              dp.field_b = new cj(0L, vo.field_m);
              dp.field_b.field_R = 1;
              bi.field_f = new cj(0L, vd.field_a, qd.field_r);
              jb.field_c = new cj(0L, pn.field_g, ko.field_h);
              lk.field_J = new cj(0L, cm.field_b);
              if (param1 <= -106) {
                break L1;
              } else {
                km.h(-103);
                break L1;
              }
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("km.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
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
            if (param1 == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("km.S(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
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
        boolean stackOut_2_0 = false;
        int stackOut_22_0 = 0;
        cj stackOut_25_0 = null;
        cj stackOut_32_0 = null;
        int stackOut_70_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = null;
        tn.field_A.field_Gb.field_Cb.e(-30986);
        var5 = 0;
        var6 = 0;
        var7 = -1 + uf.field_g;
        L0: while (true) {
          L1: {
            L2: {
              if (-1 < (var7 ^ -1)) {
                break L2;
              } else {
                var8_ref_ka = uk.field_M[var7];
                var9 = 0;
                stackOut_2_0 = nh.field_m;
                stackIn_23_0 = stackOut_2_0 ? 1 : 0;
                stackIn_3_0 = stackOut_2_0;
                if (var13 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0) {
                      break L3;
                    } else {
                      if (var5 >= sj.field_m) {
                        break L3;
                      } else {
                        var10 = ga.a(var8_ref_ka.field_l, true);
                        if (var8_ref_ka.a(true) >= var10) {
                          L4: {
                            if (var8_ref_ka.field_k) {
                              break L4;
                            } else {
                              if (hp.a(var8_ref_ka.field_e, 1020)) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var9 = 1;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (var9 != 0) {
                        break L6;
                      } else {
                        var8_ref_ka.field_q = null;
                        if (var13 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      L8: {
                        if (var8_ref_ka.field_q == null) {
                          break L8;
                        } else {
                          if (bn.field_b) {
                            break L8;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L9: {
                        if (null != var8_ref_ka.field_q) {
                          break L9;
                        } else {
                          id.field_D = id.field_D + 1;
                          break L9;
                        }
                      }
                      var10_ref_String = bh.a(-126, var8_ref_ka);
                      var11 = var10_ref_String + fm.c(var8_ref_ka.field_d);
                      var12 = cj.a(var8_ref_ka, (byte) -63);
                      var8_ref_ka.field_q = new cj(0L, qq.field_f, var11);
                      var6 = var6 + param2;
                      var8_ref_ka.field_q.field_xb = (8355711 & qq.field_f.field_xb >> -31419391) + var12 + -((var12 & 16711422) >> -781614975);
                      var8_ref_ka.field_q.field_ob = (8355711 & qq.field_f.field_ob >> 310266561) + (var12 - ((var12 & 16711422) >> 2031205889));
                      var8_ref_ka.field_q.field_yb = w.field_A;
                      var8_ref_ka.field_q.field_M = var12;
                      break L7;
                    }
                    var5++;
                    break L5;
                  }
                  var7--;
                  if (var13 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var7 = 0;
            stackOut_22_0 = 0;
            stackIn_23_0 = stackOut_22_0;
            break L1;
          }
          var8 = stackIn_23_0;
          L10: while (true) {
            L11: {
              L12: {
                if (uf.field_g <= var8) {
                  break L12;
                } else {
                  var9_ref_ka = uk.field_M[var8];
                  stackOut_25_0 = var9_ref_ka.field_q;
                  stackIn_33_0 = stackOut_25_0;
                  stackIn_26_0 = stackOut_25_0;
                  if (var13 != 0) {
                    break L11;
                  } else {
                    L13: {
                      if (stackIn_26_0 != null) {
                        tn.field_A.field_Gb.a((byte) 50, var9_ref_ka.field_q);
                        var9_ref_ka.field_q.a(param2, var7, var9_ref_ka.field_q.e(0), param3, -3344);
                        var7 = var7 + param2;
                        if (0 != var9_ref_ka.field_q.field_T) {
                          var4 = var9_ref_ka;
                          break L13;
                        } else {
                          break L13;
                        }
                      } else {
                        break L13;
                      }
                    }
                    var8++;
                    if (var13 == 0) {
                      continue L10;
                    } else {
                      break L12;
                    }
                  }
                }
              }
              var8 = -var7 - (-var6 - (tn.field_A.field_Gb.field_z + tn.field_A.field_Gb.field_I));
              stackOut_32_0 = tn.field_A.field_Gb;
              stackIn_33_0 = stackOut_32_0;
              break L11;
            }
            L14: {
              stackIn_33_0.field_Q = stackIn_33_0.field_Q + var8;
              var9 = -121 / ((-54 - param0) / 40);
              tn.field_A.field_Gb.field_z = tn.field_A.field_Gb.field_z - var8;
              if (bn.field_b) {
                tn.field_A.field_Gb.field_z = var7;
                break L14;
              } else {
                break L14;
              }
            }
            tn.field_A.field_Gb.field_I = var7 - tn.field_A.field_Gb.field_z;
            if (!bn.field_b) {
              L15: {
                if (!sq.field_N) {
                  break L15;
                } else {
                  if (null != lj.field_v) {
                    sp.field_h = true;
                    break L15;
                  } else {
                    var10 = tn.field_A.field_Jb.field_z + (-tn.field_A.field_Gb.field_z + -tn.field_A.field_Gb.field_I);
                    if (sp.field_h) {
                      L16: {
                        tn.field_A.field_Gb.field_mb = var10 + -tn.field_A.field_Gb.field_Q;
                        tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                        if (tn.field_A.field_Gb.field_Q - -tn.field_A.field_Gb.field_mb != var10) {
                          stackOut_70_0 = 0;
                          stackIn_71_0 = stackOut_70_0;
                          break L16;
                        } else {
                          stackOut_69_0 = 1;
                          stackIn_71_0 = stackOut_69_0;
                          break L16;
                        }
                      }
                      sp.field_h = stackIn_71_0 != 0;
                      return (ka) (var4);
                    } else {
                      L17: {
                        tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                        if (tn.field_A.field_Gb.field_Q - -tn.field_A.field_Gb.field_mb != var10) {
                          stackOut_66_0 = 0;
                          stackIn_67_0 = stackOut_66_0;
                          break L17;
                        } else {
                          stackOut_65_0 = 1;
                          stackIn_67_0 = stackOut_65_0;
                          break L17;
                        }
                      }
                      sp.field_h = stackIn_67_0 != 0;
                      return (ka) (var4);
                    }
                  }
                }
              }
              var10 = tn.field_A.field_Jb.field_z + (-tn.field_A.field_Gb.field_z + -tn.field_A.field_Gb.field_I);
              if (sp.field_h) {
                L18: {
                  tn.field_A.field_Gb.field_mb = var10 + -tn.field_A.field_Gb.field_Q;
                  tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                  if (tn.field_A.field_Gb.field_Q - -tn.field_A.field_Gb.field_mb != var10) {
                    stackOut_81_0 = 0;
                    stackIn_82_0 = stackOut_81_0;
                    break L18;
                  } else {
                    stackOut_80_0 = 1;
                    stackIn_82_0 = stackOut_80_0;
                    break L18;
                  }
                }
                sp.field_h = stackIn_82_0 != 0;
                return (ka) (var4);
              } else {
                L19: {
                  tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                  if (tn.field_A.field_Gb.field_Q - -tn.field_A.field_Gb.field_mb != var10) {
                    stackOut_77_0 = 0;
                    stackIn_78_0 = stackOut_77_0;
                    break L19;
                  } else {
                    stackOut_76_0 = 1;
                    stackIn_78_0 = stackOut_76_0;
                    break L19;
                  }
                }
                sp.field_h = stackIn_78_0 != 0;
                return (ka) (var4);
              }
            } else {
              tn.field_A.field_Gb.field_mb = 0;
              bn.field_b = false;
              tn.field_A.field_Gb.field_Q = -tn.field_A.field_Gb.field_z + tn.field_A.field_Jb.field_z;
              sp.field_h = true;
              if (sq.field_N) {
                L20: {
                  if (null != lj.field_v) {
                    sp.field_h = true;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                var10 = tn.field_A.field_Jb.field_z + (-tn.field_A.field_Gb.field_z + -tn.field_A.field_Gb.field_I);
                if (!sp.field_h) {
                  L21: {
                    tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                    if (tn.field_A.field_Gb.field_Q - -tn.field_A.field_Gb.field_mb != var10) {
                      stackOut_58_0 = 0;
                      stackIn_59_0 = stackOut_58_0;
                      break L21;
                    } else {
                      stackOut_57_0 = 1;
                      stackIn_59_0 = stackOut_57_0;
                      break L21;
                    }
                  }
                  sp.field_h = stackIn_59_0 != 0;
                  return (ka) (var4);
                } else {
                  L22: {
                    tn.field_A.field_Gb.field_mb = var10 + -tn.field_A.field_Gb.field_Q;
                    tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                    if (tn.field_A.field_Gb.field_Q - -tn.field_A.field_Gb.field_mb != var10) {
                      stackOut_54_0 = 0;
                      stackIn_55_0 = stackOut_54_0;
                      break L22;
                    } else {
                      stackOut_53_0 = 1;
                      stackIn_55_0 = stackOut_53_0;
                      break L22;
                    }
                  }
                  sp.field_h = stackIn_55_0 != 0;
                  return (ka) (var4);
                }
              } else {
                var10 = tn.field_A.field_Jb.field_z + (-tn.field_A.field_Gb.field_z + -tn.field_A.field_Gb.field_I);
                if (sp.field_h) {
                  L23: {
                    tn.field_A.field_Gb.field_mb = var10 + -tn.field_A.field_Gb.field_Q;
                    tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                    if (tn.field_A.field_Gb.field_Q - -tn.field_A.field_Gb.field_mb != var10) {
                      stackOut_45_0 = 0;
                      stackIn_46_0 = stackOut_45_0;
                      break L23;
                    } else {
                      stackOut_44_0 = 1;
                      stackIn_46_0 = stackOut_44_0;
                      break L23;
                    }
                  }
                  sp.field_h = stackIn_46_0 != 0;
                  return (ka) (var4);
                } else {
                  L24: {
                    tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                    if (tn.field_A.field_Gb.field_Q - -tn.field_A.field_Gb.field_mb != var10) {
                      stackOut_41_0 = 0;
                      stackIn_42_0 = stackOut_41_0;
                      break L24;
                    } else {
                      stackOut_40_0 = 1;
                      stackIn_42_0 = stackOut_40_0;
                      break L24;
                    }
                  }
                  sp.field_h = stackIn_42_0 != 0;
                  return (ka) (var4);
                }
              }
            }
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
