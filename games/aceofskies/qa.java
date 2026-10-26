/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa {
    static vd[] field_a;
    static eg field_b;
    static String field_c;

    public static void a(int param0) {
        if (param0 == -7) {
          field_c = null;
          field_b = null;
          field_a = null;
          return;
        }
        field_a = (vd[]) null;
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final static void b(int param0) {
        int var3 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        String stackIn_30_0 = null;
        String stackIn_37_0 = null;
        boolean stackIn_42_0 = false;
        String stackIn_42_1 = null;
        boolean stackIn_43_2 = false;
        mg stackIn_47_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        mg var9 = null;
        int var10 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var1_int = pt.field_a;
          var2 = 0;
          if (2 == ol.field_c) {
            var3_long = kh.a(-71) - PacketBuffer.field_e;
            var2 = (int)((10999L - var3_long) / 1000L);
            if (var2 < 0) {
              var2 = 0;
            }
          }
          for (var3 = 0; ne.field_g.length > var3; var3++) {
            var4 = rn.field_a[var3];
            if (var4 < 0) {
              var5 = nl.field_t;
            } else {
              if (var4 != pr.field_b.field_g) {
                var5 = so.field_b;
              } else {
                var5 = hn.field_a;
              }
            }
            var6 = ne.field_g[var3];
            if (ol.field_c == 2 &&
              var2 == 1) {
              if (es.field_a.length >= cn.field_z.length) {
                stackIn_21_0 = es.field_a.length;
              } else {
                stackIn_21_0 = cn.field_z.length;
              }
              var7 = stackIn_21_0;
              if (cc.field_b.length < gp.field_v.length) {
                stackIn_24_0 = gp.field_v.length;
              } else {
                stackIn_24_0 = cc.field_b.length;
              }
              var8 = stackIn_24_0;
              if (var3 >= 6 &&
                6 + var7 > var3) {
                if (var3 - (6 - es.field_a.length) - var7 >= 0) {
                  stackIn_30_0 = es.field_a[var3 - 6 - (-es.field_a.length + var7)];
                } else {
                  stackIn_30_0 = "";
                }
                var6 = stackIn_30_0;
              }
              if (var7 + 7 <= var3 &&
                var8 + (7 + var7) > var3) {
                if (cc.field_b.length <= -var7 + (var3 - 7)) {
                  stackIn_37_0 = "";
                } else {
                  stackIn_37_0 = cc.field_b[-var7 + var3 - 7];
                }
                var6 = stackIn_37_0;
              }
            }
            if (-2 == var4) {
              var6 = Integer.toString(var2);
            }
            stackIn_42_0 = true;
            stackIn_42_1 = var6;
            stackIn_43_2 = !(0 > var4);
            var7Lifetime1 = IntrusiveDeque.a(stackIn_42_0, stackIn_42_1, stackIn_43_2);
            var8Lifetime1 = -(var7Lifetime1 >> 1) + ri.field_a;
            if (var4 >= 0) {
              var1_int = var1_int + pp.field_a;
              if (pr.field_b.field_g != var4) {
                stackIn_47_0 = ej.field_a;
              } else {
                stackIn_47_0 = u.field_g;
              }
              var9 = stackIn_47_0;
              if (var9 != null) {
                var9.a(-652, (ud.field_g << 1) + var7Lifetime1, lp.field_h + (as.field_c << 1), var1_int, -ud.field_g + var8Lifetime1);
              }
              var1_int = var1_int + as.field_c;
            }
            if (var4 >= 0) {
              FlightSession.field_e.b(var6, var8Lifetime1, ke.field_b + var1_int, var5, -1);
              var1_int = var1_int + (pp.field_a + as.field_c + lp.field_h);
            } else {
              nh.field_c.b(var6, var8Lifetime1, tf.field_b + var1_int, var5, -1);
              var1_int = var1_int + ce.field_u;
            }
          }
          if (param0 > -25) {
            qa.a(-84);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "qa.C(" + param0 + ')');
        }
    }

    final static void a(int param0, byte param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var7Lifetime5;
        int var7Lifetime6;
        int var7Lifetime7;
        int var7Lifetime8;
        int var6Lifetime5;
        int var7Lifetime9;
        int var6Lifetime1Lifetime1;
        int var6Lifetime2Lifetime1;
        int var7Lifetime1Lifetime1;
        int var7Lifetime2Lifetime1;
        int var7Lifetime5Lifetime1;
        int var7Lifetime10;
        int var7Lifetime2Lifetime2;
        var8 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (0 > it.field_c) {
          return;
        }
        var3 = -135 + param2;
        var4 = -35 + param0;
        var5 = 256;
        if (it.field_c < 75) {
          var5 = (it.field_c << 8) / 75;
        }
        if (it.field_c > 200) {
          var5 = (250 - it.field_c << 8) / 50;
        }
        cm.a(wd.field_v, -14492);
        re.a();
        vp.a();
        wj.e((byte) -124);
        if (var5 < 256) {
          vp.b(0, 0, vp.field_i, vp.field_c, 0, -var5 + 256);
          sl.c(2765);
          if (it.field_c < 150) {
            wd.field_v.d(var3, var4);
          } else {
            gl.field_d.a(var3 + 15, var4 + 10, var5);
          }
          if (param1 != -4) {
            qa.b(109);
          }
          var6 = it.field_c - 125;
          if (0 < var6) {
            if (var6 >= 50) {
              var6 = -140 + it.field_c;
              if (var6 > 0) {
                var7 = 256;
                if (var6 < 20) {
                  var7 = 256 * var6 / 20;
                }
                gt.field_o.a(15 + var3, 10 + var4, var5 * var7 >> 8);
              }
              return;
            }
            if (20 > var6) {
              var7Lifetime10 = var6 * 256 / 20;
              oo.field_W.d(var3, var4, var7Lifetime10);
            } else {
              if (var6 < 30) {
                oo.field_W.d(var3, var4, 256);
              } else {
                var7Lifetime10 = (12800 - var6 * 256) / 20;
                oo.field_W.d(var3, var4, var7Lifetime10);
              }
            }
          }
          var6Lifetime5 = -140 + it.field_c;
          if (var6Lifetime5 > 0) {
            var7Lifetime9 = 256;
            if (var6Lifetime5 < 20) {
              var7Lifetime9 = 256 * var6Lifetime5 / 20;
            }
            gt.field_o.a(15 + var3, 10 + var4, var5 * var7Lifetime9 >> 8);
          }
          return;
        }
        sl.c(2765);
        if (it.field_c >= 150) {
          gl.field_d.a(var3 + 15, var4 + 10, var5);
          if (param1 != -4) {
            qa.b(109);
          }
          var6Lifetime1 = it.field_c - 125;
          if (0 < var6Lifetime1 &&
            var6Lifetime1 < 50) {
            if (20 > var6Lifetime1) {
              var7Lifetime1 = var6Lifetime1 * 256 / 20;
              oo.field_W.d(var3, var4, var7Lifetime1);
            } else {
              if (var6Lifetime1 < 30) {
                oo.field_W.d(var3, var4, 256);
              } else {
                var7Lifetime1 = (12800 - var6Lifetime1 * 256) / 20;
                oo.field_W.d(var3, var4, var7Lifetime1);
              }
            }
          }
          var6Lifetime1Lifetime1 = -140 + it.field_c;
          if (var6Lifetime1Lifetime1 > 0) {
            var7Lifetime1Lifetime1 = 256;
            if (var6Lifetime1Lifetime1 < 20) {
              var7Lifetime1Lifetime1 = 256 * var6Lifetime1Lifetime1 / 20;
            }
            gt.field_o.a(15 + var3, 10 + var4, var5 * var7Lifetime1Lifetime1 >> 8);
          }
          return;
        }
        wd.field_v.d(var3, var4);
        if (param1 == -4) {
          var6Lifetime2 = it.field_c - 125;
          if (0 < var6Lifetime2) {
            if (var6Lifetime2 >= 50) {
              var6Lifetime2 = -140 + it.field_c;
              if (var6Lifetime2 > 0) {
                var7Lifetime2 = 256;
                if (var6Lifetime2 < 20) {
                  var7Lifetime2 = 256 * var6Lifetime2 / 20;
                }
                gt.field_o.a(15 + var3, 10 + var4, var5 * var7Lifetime2 >> 8);
              }
              return;
            }
            if (20 > var6Lifetime2) {
              var7Lifetime2Lifetime2 = var6Lifetime2 * 256 / 20;
              oo.field_W.d(var3, var4, var7Lifetime2Lifetime2);
            } else {
              if (var6Lifetime2 < 30) {
                oo.field_W.d(var3, var4, 256);
              } else {
                var7Lifetime2Lifetime2 = (12800 - var6Lifetime2 * 256) / 20;
                oo.field_W.d(var3, var4, var7Lifetime2Lifetime2);
              }
            }
          }
          var6Lifetime2Lifetime1 = -140 + it.field_c;
          if (var6Lifetime2Lifetime1 > 0) {
            var7Lifetime2Lifetime1 = 256;
            if (var6Lifetime2Lifetime1 < 20) {
              var7Lifetime2Lifetime1 = 256 * var6Lifetime2Lifetime1 / 20;
            }
            gt.field_o.a(15 + var3, 10 + var4, var5 * var7Lifetime2Lifetime1 >> 8);
          }
          return;
        }
        qa.b(109);
        var6Lifetime3 = it.field_c - 125;
        if (0 >= var6Lifetime3) {
          var6Lifetime3 = -140 + it.field_c;
          if (var6Lifetime3 > 0) {
            var7Lifetime3 = 256;
            if (var6Lifetime3 < 20) {
              var7Lifetime3 = 256 * var6Lifetime3 / 20;
            }
            gt.field_o.a(15 + var3, 10 + var4, var5 * var7Lifetime3 >> 8);
          }
          return;
        }
        if (var6Lifetime3 >= 50) {
          var6Lifetime3 = -140 + it.field_c;
          if (var6Lifetime3 > 0) {
            var7Lifetime4 = 256;
            if (var6Lifetime3 < 20) {
              var7Lifetime4 = 256 * var6Lifetime3 / 20;
            }
            gt.field_o.a(15 + var3, 10 + var4, var5 * var7Lifetime4 >> 8);
          }
          return;
        }
        if (20 > var6Lifetime3) {
          var7Lifetime5 = var6Lifetime3 * 256 / 20;
          oo.field_W.d(var3, var4, var7Lifetime5);
          var6Lifetime3 = -140 + it.field_c;
          if (var6Lifetime3 > 0) {
            var7Lifetime5Lifetime1 = 256;
            if (var6Lifetime3 < 20) {
              var7Lifetime5Lifetime1 = 256 * var6Lifetime3 / 20;
            }
            gt.field_o.a(15 + var3, 10 + var4, var5 * var7Lifetime5Lifetime1 >> 8);
          }
          return;
        }
        if (var6Lifetime3 < 30) {
          oo.field_W.d(var3, var4, 256);
          var6Lifetime3 = -140 + it.field_c;
          if (var6Lifetime3 > 0) {
            var7Lifetime6 = 256;
            if (var6Lifetime3 < 20) {
              var7Lifetime6 = 256 * var6Lifetime3 / 20;
            }
            gt.field_o.a(15 + var3, 10 + var4, var5 * var7Lifetime6 >> 8);
          }
          return;
        }
        var7Lifetime7 = (12800 - var6Lifetime3 * 256) / 20;
        oo.field_W.d(var3, var4, var7Lifetime7);
        var6Lifetime4 = -140 + it.field_c;
        if (var6Lifetime4 > 0) {
          var7Lifetime8 = 256;
          if (var6Lifetime4 < 20) {
            var7Lifetime8 = 256 * var6Lifetime4 / 20;
          }
          gt.field_o.a(15 + var3, 10 + var4, var5 * var7Lifetime8 >> 8);
        }
        return;
    }

    static {
        field_b = new eg();
        field_c = "This password is part of your Player Name, and would be easy to guess";
    }
}
