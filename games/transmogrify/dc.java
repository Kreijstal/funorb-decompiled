/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc {
    static int field_a;

    final static void a(int param0, boolean param1) {
        int var3_int = 0;
        StringBuilder discarded$0 = null;
        boolean stackIn_8_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        sj var11 = null;
        int var12 = 0;
        byte[] var13 = null;
        sj var14 = null;
        sj var15 = null;
        byte[] var16 = null;
        int var6Lifetime1;
        int var10Lifetime1;
        var12 = Transmogrify.field_A ? 1 : 0;
        try {
          if (null != sg.field_d) {
            qi.a((byte) 117);
          }
          var2_int = ni.a((byte) -113);
          if (var2_int == 0) {
            stackIn_8_0 = !(ad.field_e);
            ad.field_e = stackIn_8_0;
            if (ad.field_e) {
              vk.a((byte) 115, dg.field_d[7]);
              a.field_S.a(kk.a(param0 + 23327, oa.field_j, bk.field_a), 1, (byte) -112, param1);
              return;
            }
          }
          if (var2_int >= 0) {
            if (wl.a(false, 0)) {
              for (var3_int = 0; var3_int < ua.field_a.length; var3_int++) {
                if (ua.field_a[var3_int].equalsIgnoreCase(of.field_e.toString())) {
                  fi.b(0, 240, 15);
                }
              }
            }
            discarded$0 = vi.field_g[n.field_a].append((CharSequence) ((Object) of.field_e));
            vi.field_a[n.field_a] = var2_int;
            hf.field_j = hf.field_j + (var2_int << 6);
            eh.field_a = eh.field_a + var2_int;
            var16 = dg.field_d[10].field_l;
            var13 = var16;
            var3 = var13;
            var4 = var3[(2147483647 & bc.field_b) % var16.length];
            nc.field_t = nc.field_t + var4 * jk.field_B;
            gh.field_l = gh.field_l + var4;
            vk.a((byte) 123, dg.field_d[1]);
            var5 = var2_int;
            if (var2_int > 0) {
              var6 = 0;
              for (var7 = 0; gd.field_n.length > var7; var7++) {
                if (gd.field_n[var7] > field_a) {
                  var6++;
                  continue;
                }
                break;
              }
              wk.field_d = wk.field_d + var6;
              var7 = gj.a((byte) -39, vi.field_g[n.field_a].toString(), true);
              if (!(0 >= n.field_a)) {
                eh.field_a = eh.field_a + var7;
                var5 = var5 + var7;
                ce.field_c = ce.field_c + var7;
                hf.field_j = hf.field_j + (var7 << 6);
              }
            }
            L10: {
              boolean decompiledFrameCompleted0 = true;
              boolean decompiledFrameRemainder0 = true;
              n.field_a = n.field_a + 1;
              rb.field_a = rb.field_a + field_a;
              re.field_A = 0;
              eg.field_b = 0;
              field_a = 0;
              var6Lifetime1 = 0;
              if (n.field_a == 10) {
                rb.field_a = rb.field_a / 10;
                var7 = 0;
                for (var8 = 0; var8 < gd.field_n.length; var8++) {
                  if (gd.field_n[var8] > rb.field_a) {
                    var7 += 5;
                    continue;
                  }
                  break;
                }
                var8 = 0;
                for (var9 = 0; 10 > var9; var9++) {
                  if (vi.field_a[var9] > 0) {
                    var8++;
                  }
                }
                var7 = var8 * var7 / 10;
                wk.field_d = wk.field_d + var7;
                vh.field_n = vh.field_n - (wk.field_d << 5);
                eh.field_a = eh.field_a + wk.field_d;
                hf.field_j = hf.field_j + (wk.field_d << 5);
                ug.b(true);
                if (100 <= wk.field_d) {
                  if (fi.b(0, 243, 12)) {
                    var6Lifetime1++;
                  }
                  if (wk.field_d >= 150 &&
                    fi.b(0, 242, 13)) {
                    var6Lifetime1++;
                  }
                  if (eh.field_a >= 600 &&
                    fi.b(0, 241, 14)) {
                    var6Lifetime1++;
                  }
                }
                var9 = 0;
                for (var10 = 0; var10 < 12; var10++) {
                  var11 = od.field_g.field_e[var10];
                  if (var11 != null) {
                    if (var11.field_l == 9 &&
                      qi.field_c.field_d.indexOf((int) var11.field_i) == -1) {
                      var9++;
                    }
                    continue;
                  }
                  break;
                }
                if (var9 >= 1) {
                  if (fi.b(0, 249, 6)) {
                    var6Lifetime1++;
                  }
                  if (var9 >= 2 &&
                    fi.b(0, 248, 7)) {
                    var6Lifetime1++;
                  }
                  if (eh.field_a >= 300) {
                    var6Lifetime1 = var6Lifetime1 + (-200 + eh.field_a) / 100;
                  }
                  if (800 > eh.field_a) {
                    if (400 > eh.field_a) {
                      wd.a(17099, false, bd.field_u[9]);
                    } else {
                      wd.a(17099, false, bd.field_u[8]);
                    }
                  } else {
                    wd.a(17099, false, bd.field_u[7]);
                  }
                  if ((var6Lifetime1 == 0)) {
                    var6Lifetime1++;
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  if (eh.field_a >= 300) {
                    var6Lifetime1 = var6Lifetime1 + (-200 + eh.field_a) / 100;
                  }
                  if (800 > eh.field_a) {
                    if (400 > eh.field_a) {
                      wd.a(17099, false, bd.field_u[9]);
                    } else {
                      wd.a(17099, false, bd.field_u[8]);
                    }
                  } else {
                    wd.a(17099, false, bd.field_u[7]);
                  }
                  if (var6Lifetime1 == 0) {
                    var6Lifetime1++;
                  }
                  if (eh.field_a >= 600) {
                    if (fi.b(0, 255, 0)) {
                      var6Lifetime1++;
                    }
                    if (1000 <= eh.field_a &&
                      fi.b(param0 + 22991, 254, 1)) {
                      var6Lifetime1++;
                    }
                  }
                  if (100 <= var2_int &&
                    fi.b(0, 244, 11)) {
                    var6Lifetime1++;
                  }
                  var8 = 2147483647;
                  var9 = 0;
                  for (var7 = 0; var7 < 12; var7++) {
                    var14 = od.field_g.field_e[var7];
                    if (var14 == null) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    if (var14.field_l > 0) {
                      var9++;
                    }
                    if (var14.field_h < var8) {
                      var8 = var14.field_h;
                    }
                  }
                  if (decompiledFrameCompleted0) {
                    break L10;
                  }
                }
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameCompleted0)) {
                if (var5 > 100) {
                  var6Lifetime1 += 4;
                } else {
                  if (75 >= var5) {
                    if (var5 > 50) {
                      var6Lifetime1 += 2;
                    } else {
                      if (var5 > 20) {
                        var6Lifetime1++;
                      }
                    }
                  } else {
                    var6Lifetime1 += 3;
                  }
                }
              }
              if (decompiledFrameCompleted0) {
                if (eh.field_a >= 600) {
                  if (fi.b(0, 255, 0)) {
                    var6Lifetime1++;
                  }
                  if (1000 <= eh.field_a &&
                    fi.b(param0 + 22991, 254, 1)) {
                    var6Lifetime1++;
                  }
                }
                if (100 <= var2_int &&
                  fi.b(0, 244, 11)) {
                  var6Lifetime1++;
                }
                var8 = 2147483647;
                var9 = 0;
                for (var7 = 0; var7 < 12; var7++) {
                  var15 = od.field_g.field_e[var7];
                  if (var15 == null) {
                    break;
                  }
                  if (var15.field_l > 0) {
                    var9++;
                  }
                  if (var15.field_h < var8) {
                    var8 = var15.field_h;
                  }
                }
              }
            }
            if (var7 >= 10) {
              if (fi.b(0, 247, 8)) {
                var6Lifetime1++;
              }
              if (var7 == 12 &&
                fi.b(0, 246, 9)) {
                var6Lifetime1++;
              }
            }
            if (0 < var7 &&
              var8 >= 2) {
              if (fi.b(0, 251, 4)) {
                var6Lifetime1++;
              }
              if (var8 >= 3 &&
                fi.b(0, 250, 5)) {
                var6Lifetime1++;
              }
            }
            if (1 < n.field_a) {
              var10Lifetime1 = vi.field_g[-2 + n.field_a].length();
              if (var10Lifetime1 == var9) {
                if (var7 != var10Lifetime1) {
                  if (var7 >= 3 + var10Lifetime1 &&
                    var10Lifetime1 >= 4 &&
                    fi.b(0, 245, 10)) {
                    var6Lifetime1++;
                  }
                } else {
                  if (var7 >= 6) {
                    if (fi.b(0, 253, 2)) {
                      var6Lifetime1++;
                    }
                    if (var7 >= 9 &&
                      fi.b(param0 ^ -22991, 252, 3)) {
                      var6Lifetime1++;
                    }
                  }
                }
              }
            }
            if (var6Lifetime1 != 1) {
              if (var6Lifetime1 == 2) {
                jj.a((byte) 105, 0, dg.field_d[11]);
                jj.a((byte) 95, 256, dg.field_d[8]);
                fa.a(256, dg.field_d[11], (byte) 125, 40);
                fa.a(0, dg.field_d[8], (byte) 127, 40);
              } else {
                if (3 == var6Lifetime1) {
                  jj.a((byte) 90, 0, dg.field_d[9]);
                  fa.a(256, dg.field_d[9], (byte) 125, 40);
                } else {
                  if (var6Lifetime1 == 4) {
                    jj.a((byte) 85, 0, dg.field_d[12]);
                    fa.a(256, dg.field_d[12], (byte) 125, 40);
                  } else {
                    if (var6Lifetime1 == 5) {
                      jj.a((byte) 105, 0, dg.field_d[10]);
                      fa.a(256, dg.field_d[10], (byte) 127, 40);
                    } else {
                      if (var6Lifetime1 > 0) {
                        jj.a((byte) 115, 0, dg.field_d[12]);
                        jj.a((byte) 119, 256, dg.field_d[10]);
                        fa.a(256, dg.field_d[12], (byte) 127, 40);
                        fa.a(0, dg.field_d[10], (byte) 126, 40);
                      }
                    }
                  }
                }
              }
            } else {
              jj.a((byte) 78, 0, dg.field_d[11]);
              fa.a(256, dg.field_d[11], (byte) 127, 40);
            }
            if (n.field_a > 1 &&
              0 == var6Lifetime1) {
              hi.field_a = 4;
            }
            if (4 > var6Lifetime1) {
              if (var6Lifetime1 >= 2) {
                hi.field_a = 1;
              }
            } else {
              hi.field_a = 17;
            }
            bg.field_m = 1500;
            if (10 == n.field_a) {
              hi.field_a = 28;
            }
          } else {
            vk.a((byte) 98, dg.field_d[2]);
          }
          if (param0 != -22991) {
            field_a = -122;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2), "dc.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        hi.field_c = param4;
        fi.field_x = param3;
        if (param2 > -35) {
          field_a = -68;
        }
        pi.field_k = param1;
        hd.field_d = param0;
    }

    static {
    }
}
