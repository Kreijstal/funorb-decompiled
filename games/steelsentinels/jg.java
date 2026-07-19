/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg {
    static gh[] field_h;
    private sm field_c;
    private int field_i;
    private int field_u;
    private int field_e;
    private boolean field_v;
    private int field_g;
    private int field_m;
    private int field_o;
    private int field_a;
    private int field_w;
    private int field_p;
    private int field_n;
    private float field_s;
    private int field_d;
    static int field_f;
    static int[] field_l;
    private int field_r;
    static boolean field_j;
    private int field_q;
    private int field_b;
    static String[] field_t;
    private int field_k;

    final nn b(int param0) {
        nn var2 = null;
        this.field_g = li.field_A;
        this.field_o = na.field_i;
        this.field_c.a(this.field_b, true, this.field_a);
        if (param0 == 32472) {
          ti.field_x = false;
          var2 = hc.a(0, hb.field_i, 0, this.field_a, 0, this.field_b);
          if (var2 == null) {
            this.a(15481);
            return var2;
          } else {
            return var2;
          }
        } else {
          jg.a(-128, -3);
          ti.field_x = false;
          var2 = hc.a(0, hb.field_i, 0, this.field_a, 0, this.field_b);
          if (var2 != null) {
            return var2;
          } else {
            this.a(15481);
            return var2;
          }
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        var2 = this.field_k;
        var3 = this.field_i;
        if (this.a((byte) 106)) {
          L0: {
            if (this.field_u >= var2) {
              if (this.field_w > var2) {
                var2 = this.field_w;
                break L0;
              } else {
                break L0;
              }
            } else {
              var2 = this.field_u;
              break L0;
            }
          }
          L1: {
            if (this.field_q >= var3) {
              if (this.field_e <= var3) {
                break L1;
              } else {
                var3 = this.field_e;
                break L1;
              }
            } else {
              var3 = this.field_q;
              break L1;
            }
          }
          if (0.0f < this.field_s) {
            var4 = (int)(this.field_s * (float)var3 + 0.5f);
            if (var4 <= var2) {
              L2: {
                if (var2 <= var4) {
                  break L2;
                } else {
                  var2 = var4;
                  break L2;
                }
              }
              if (var2 != na.field_i) {
                L3: {
                  this.field_c.a(var2, true, var3);
                  if (-1 > (this.field_k ^ -1)) {
                    kf.field_p = (this.field_k - na.field_i) / 2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (param0 <= -3) {
                  return;
                } else {
                  this.b(true);
                  return;
                }
              } else {
                if (li.field_A != var3) {
                  L4: {
                    this.field_c.a(var2, true, var3);
                    if (-1 > (this.field_k ^ -1)) {
                      kf.field_p = (this.field_k - na.field_i) / 2;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (param0 <= -3) {
                    return;
                  } else {
                    this.b(true);
                    return;
                  }
                } else {
                  L5: {
                    if (-1 > (this.field_k ^ -1)) {
                      kf.field_p = (this.field_k - na.field_i) / 2;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (param0 <= -3) {
                    return;
                  } else {
                    this.b(true);
                    return;
                  }
                }
              }
            } else {
              var3 = (int)((float)var2 / this.field_s);
              if (var2 != na.field_i) {
                L6: {
                  this.field_c.a(var2, true, var3);
                  if (-1 > (this.field_k ^ -1)) {
                    kf.field_p = (this.field_k - na.field_i) / 2;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                if (param0 > -3) {
                  this.b(true);
                  return;
                } else {
                  return;
                }
              } else {
                if (li.field_A != var3) {
                  L7: {
                    this.field_c.a(var2, true, var3);
                    if (-1 > (this.field_k ^ -1)) {
                      kf.field_p = (this.field_k - na.field_i) / 2;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  if (param0 > -3) {
                    this.b(true);
                    return;
                  } else {
                    return;
                  }
                } else {
                  L8: {
                    if (-1 > (this.field_k ^ -1)) {
                      kf.field_p = (this.field_k - na.field_i) / 2;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  if (param0 > -3) {
                    this.b(true);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          } else {
            if (var2 != na.field_i) {
              L9: {
                this.field_c.a(var2, true, var3);
                if (-1 > (this.field_k ^ -1)) {
                  kf.field_p = (this.field_k - na.field_i) / 2;
                  break L9;
                } else {
                  break L9;
                }
              }
              if (param0 <= -3) {
                return;
              } else {
                this.b(true);
                return;
              }
            } else {
              if (li.field_A != var3) {
                L10: {
                  this.field_c.a(var2, true, var3);
                  if (-1 > (this.field_k ^ -1)) {
                    kf.field_p = (this.field_k - na.field_i) / 2;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                if (param0 <= -3) {
                  return;
                } else {
                  this.b(true);
                  return;
                }
              } else {
                L11: {
                  if (-1 > (this.field_k ^ -1)) {
                    kf.field_p = (this.field_k - na.field_i) / 2;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                if (param0 <= -3) {
                  return;
                } else {
                  this.b(true);
                  return;
                }
              }
            }
          }
        } else {
          this.field_v = false;
          return;
        }
    }

    final static int[] a(boolean param0) {
        if (!param0) {
            jg.a(57, -61);
            return new int[8];
        }
        return new int[8];
    }

    final void b(int param0, byte param1, int param2) {
        this.field_i = param0;
        if (param1 != -114) {
            return;
        }
        this.field_k = param2;
    }

    final static void a(int param0, byte param1, int param2) {
        int var4 = -117 / ((-11 - param1) / 35);
        kj var3 = mm.field_g;
        var3.a(param2, (byte) -117);
        var3.a((byte) 124, 3);
        var3.a((byte) 109, 8);
        var3.d(param0, 80);
    }

    final boolean a(byte param0) {
        int var2 = 0;
        var2 = -28 / ((-8 - param0) / 49);
        if (ed.field_a >= this.field_p) {
          if (-1 <= (rd.field_b ^ -1)) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    public static void b(byte param0) {
        field_h = null;
        field_l = null;
        int var1 = 86 / ((0 - param0) / 63);
        field_t = null;
    }

    final void b(boolean param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        String var3 = null;
        if (wb.field_c == null) {
          if (!param0) {
            L0: {
              if (0 >= rd.field_b) {
                this.field_v = false;
                break L0;
              } else {
                break L0;
              }
            }
            if (!this.field_v) {
              if (na.field_i >= this.field_k) {
                if ((this.field_k ^ -1) >= -1) {
                  if (this.field_r != na.field_i) {
                    this.field_c.a(this.field_r, true, this.field_d);
                    return;
                  } else {
                    if (li.field_A == this.field_d) {
                      return;
                    } else {
                      this.field_c.a(this.field_r, true, this.field_d);
                      return;
                    }
                  }
                } else {
                  kf.field_p = 0;
                  if (this.field_r != na.field_i) {
                    this.field_c.a(this.field_r, true, this.field_d);
                    return;
                  } else {
                    if (li.field_A == this.field_d) {
                      return;
                    } else {
                      this.field_c.a(this.field_r, true, this.field_d);
                      return;
                    }
                  }
                }
              } else {
                kf.field_p = (this.field_k - na.field_i) / 2;
                if (this.field_r != na.field_i) {
                  this.field_c.a(this.field_r, true, this.field_d);
                  return;
                } else {
                  if (li.field_A == this.field_d) {
                    return;
                  } else {
                    this.field_c.a(this.field_r, true, this.field_d);
                    return;
                  }
                }
              }
            } else {
              fieldTemp$2 = this.field_m - 1;
              this.field_m = this.field_m - 1;
              if (fieldTemp$2 > 0) {
                return;
              } else {
                this.field_m = this.field_n;
                if (this.field_p > ed.field_a) {
                  this.field_v = false;
                  return;
                } else {
                  this.c(-95);
                  return;
                }
              }
            }
          } else {
            L1: {
              var3 = (String) null;
              jg.a((String) null, -86);
              if (0 >= rd.field_b) {
                this.field_v = false;
                break L1;
              } else {
                break L1;
              }
            }
            if (!this.field_v) {
              if (na.field_i >= this.field_k) {
                if ((this.field_k ^ -1) < -1) {
                  kf.field_p = 0;
                  if (this.field_r == na.field_i) {
                    if (li.field_A != this.field_d) {
                      this.field_c.a(this.field_r, true, this.field_d);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    this.field_c.a(this.field_r, true, this.field_d);
                    return;
                  }
                } else {
                  if (this.field_r == na.field_i) {
                    if (li.field_A != this.field_d) {
                      this.field_c.a(this.field_r, true, this.field_d);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    this.field_c.a(this.field_r, true, this.field_d);
                    return;
                  }
                }
              } else {
                kf.field_p = (this.field_k - na.field_i) / 2;
                if (this.field_r == na.field_i) {
                  if (li.field_A == this.field_d) {
                    return;
                  } else {
                    this.field_c.a(this.field_r, true, this.field_d);
                    return;
                  }
                } else {
                  this.field_c.a(this.field_r, true, this.field_d);
                  return;
                }
              }
            } else {
              fieldTemp$3 = this.field_m - 1;
              this.field_m = this.field_m - 1;
              if (fieldTemp$3 > 0) {
                return;
              } else {
                this.field_m = this.field_n;
                if (this.field_p > ed.field_a) {
                  this.field_v = false;
                  return;
                } else {
                  this.c(-95);
                  return;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(String param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int discarded$0 = 0;
        try {
            var2_int = oh.field_f;
            var3 = pi.field_c;
            var4 = bd.field_f.field_L.b(param0, 500);
            var5 = 6 + bd.field_f.field_L.a(param0, 500);
            var6 = 2 + db.field_b * var4;
            var7 = dl.a(12, 127, var2_int, var5);
            var8 = ol.a(var3, 0, 20, var6);
            pb.h(var7, var8, var5, var6, 0);
            pb.a(1 + var7, 1 + var8, -2 + var5, var6 + -2, 16777088);
            discarded$0 = bd.field_f.field_L.a(param0, 3 + var7, param1 + var8 - (-km.field_g - -bd.field_f.field_L.field_G), 500, 1000, 0, -1, 0, 0, db.field_b);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "jg.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            var6_int = param5 * pb.field_c + param2;
            if (!param3) {
              var7 = param5;
              L1: while (true) {
                if (param4 <= var7) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var8 = 255 * (param4 + -var7) / (-param5 + param4);
                  var9 = 255 * (var7 + -param5) / (-param5 + param4);
                  var10 = (var8 * param0 + var9 * param1) / 256;
                  pb.field_g[var6_int] = 65793 * var10;
                  var6_int = var6_int + pb.field_c;
                  var7++;
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
          var6 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var6), "jg.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1) {
        ud.field_w = i.field_d[param0];
        jk.field_g = nk.field_X[param0];
        nm.field_t = si.field_j[param0];
        if (param1 != 1000) {
            jg.a(126, (byte) -10, -36);
        }
    }

    final void a(int param0) {
        int[] discarded$2 = null;
        if (param0 != 15481) {
          discarded$2 = jg.a(true);
          this.field_c.a(this.field_o, true, this.field_g);
          return;
        } else {
          this.field_c.a(this.field_o, true, this.field_g);
          return;
        }
    }

    private jg() throws Throwable {
        throw new Error();
    }

    static {
        field_h = new gh[12];
        field_j = false;
        field_t = new String[]{"Ballistics Master", "Missile Assault", "Ballistic Assault", "Missile Defender", "Counter Attack", "Air Defender", "Mechavity", "Perfection", "Smelter", "Master of War", "Tag Rampage", "Gunning for Tags", "Fusion Tag", "Tagged It", "Energising Tag", "Team Tagger", "Destroyer", "Iron Sentinel", "Steel Sentinel", "Alloy Sentinel", "Titanium Sentinel", "Platinum Sentinel", "Adamant Sentinel", "Diamond Sentinel", "Comeback", "And It Costs How Much?", "Vengeance", "Defender", "Master Defender", "Boomerang", "Slingshot", "The Big Red Button", "Ilolian Hero", "Silver Winner", "Gold Winner", "Silver Hero", "Gold Hero", "Conqueror", "Pterocide"};
    }
}
