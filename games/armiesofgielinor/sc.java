/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc implements TaggedFieldReader {
    static String field_i;
    int field_j;
    int field_k;
    static mp field_g;
    MapTile[] field_c;
    static BitmapFont field_b;
    int field_e;
    static String field_d;
    static RgbSprite[] field_f;
    int field_a;
    static String field_h;

    final static void a(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var6Lifetime3;
        int var7Lifetime4;
        int var7Lifetime1Lifetime1;
        if (ib.field_j < 0) {
          return;
        }
        int var3 = -135 + param1;
        int var4 = param0 - 35;
        int var5 = 256;
        if (!(ib.field_j >= 75)) {
          var5 = (ib.field_j << 8) / 75;
        }
        if (!(ib.field_j <= 200)) {
          var5 = (250 - ib.field_j << 8) / 50;
        }
        vn.a(dc.field_n, 3);
        tm.a();
        SoftwareRaster.b();
        rb.e(9);
        if (var5 < 256) {
          SoftwareRaster.b(0, 0, SoftwareRaster.field_l, SoftwareRaster.field_g, 0, -var5 + 256);
          rf.b(-18862);
          if (param2 > -60) {
            return;
          }
          if (150 <= ib.field_j) {
            wd.field_k.e(var3 + 15, var4 + 10, var5);
          } else {
            dc.field_n.h(var3, var4);
          }
          var6 = -125 + ib.field_j;
          if (var6 > 0) {
            if (50 <= var6) {
              var6 = ib.field_j - 140;
              if (var6 > 0) {
                var7 = 256;
                if (var6 < 20) {
                  var7 = var6 * 256 / 20;
                }
                vt.field_k.e(var3 + 15, var4 + 10, var7 * var5 >> 8);
              }
            } else {
              if (20 > var6) {
                var7 = var6 * 256 / 20;
                kq.field_P.f(var3, var4, var7);
              } else {
                if (var6 < 30) {
                  kq.field_P.f(var3, var4, 256);
                } else {
                  var7 = (-var6 + 50) * 256 / 20;
                  kq.field_P.f(var3, var4, var7);
                }
              }
              var6 = ib.field_j - 140;
              if (var6 > 0) {
                var7 = 256;
                if (var6 < 20) {
                  var7 = var6 * 256 / 20;
                }
                vt.field_k.e(var3 + 15, var4 + 10, var7 * var5 >> 8);
              }
            }
            return;
          }
          var6Lifetime3 = ib.field_j - 140;
          if (var6Lifetime3 > 0) {
            var7Lifetime4 = 256;
            if (var6Lifetime3 < 20) {
              var7Lifetime4 = var6Lifetime3 * 256 / 20;
            }
            vt.field_k.e(var3 + 15, var4 + 10, var7Lifetime4 * var5 >> 8);
          }
          return;
        }
        rf.b(-18862);
        if (param2 > -60) {
          return;
        }
        if (150 <= ib.field_j) {
          wd.field_k.e(var3 + 15, var4 + 10, var5);
          var6Lifetime1 = -125 + ib.field_j;
          if (var6Lifetime1 <= 0) {
            var6Lifetime1 = ib.field_j - 140;
            if (var6Lifetime1 > 0) {
              var7Lifetime1 = 256;
              if (var6Lifetime1 < 20) {
                var7Lifetime1 = var6Lifetime1 * 256 / 20;
              }
              vt.field_k.e(var3 + 15, var4 + 10, var7Lifetime1 * var5 >> 8);
            }
            return;
          }
          if (50 <= var6Lifetime1) {
            var6Lifetime1 = ib.field_j - 140;
            if (var6Lifetime1 > 0) {
              var7Lifetime1Lifetime1 = 256;
              if (var6Lifetime1 < 20) {
                var7Lifetime1Lifetime1 = var6Lifetime1 * 256 / 20;
              }
              vt.field_k.e(var3 + 15, var4 + 10, var7Lifetime1Lifetime1 * var5 >> 8);
            }
          } else {
            if (20 > var6Lifetime1) {
              var7Lifetime1Lifetime1 = var6Lifetime1 * 256 / 20;
              kq.field_P.f(var3, var4, var7Lifetime1Lifetime1);
              var6Lifetime1 = ib.field_j - 140;
              if (var6Lifetime1 > 0) {
                var7Lifetime1Lifetime1 = 256;
                if (var6Lifetime1 < 20) {
                  var7Lifetime1Lifetime1 = var6Lifetime1 * 256 / 20;
                }
                vt.field_k.e(var3 + 15, var4 + 10, var7Lifetime1Lifetime1 * var5 >> 8);
              }
              return;
            }
            if (var6Lifetime1 >= 30) {
              var7Lifetime1Lifetime1 = (-var6Lifetime1 + 50) * 256 / 20;
              kq.field_P.f(var3, var4, var7Lifetime1Lifetime1);
              var6Lifetime1 = ib.field_j - 140;
              if (var6Lifetime1 > 0) {
                var7Lifetime1Lifetime1 = 256;
                if (var6Lifetime1 < 20) {
                  var7Lifetime1Lifetime1 = var6Lifetime1 * 256 / 20;
                }
                vt.field_k.e(var3 + 15, var4 + 10, var7Lifetime1Lifetime1 * var5 >> 8);
              }
              return;
            }
            kq.field_P.f(var3, var4, 256);
            var6Lifetime1 = ib.field_j - 140;
            if (var6Lifetime1 > 0) {
              var7Lifetime1Lifetime1 = 256;
              if (var6Lifetime1 < 20) {
                var7Lifetime1Lifetime1 = var6Lifetime1 * 256 / 20;
              }
              vt.field_k.e(var3 + 15, var4 + 10, var7Lifetime1Lifetime1 * var5 >> 8);
            }
            return;
          }
          return;
        }
        dc.field_n.h(var3, var4);
        var6Lifetime2 = -125 + ib.field_j;
        if (var6Lifetime2 <= 0) {
          var6Lifetime2 = ib.field_j - 140;
          if (var6Lifetime2 > 0) {
            var7Lifetime2 = 256;
            if (var6Lifetime2 < 20) {
              var7Lifetime2 = var6Lifetime2 * 256 / 20;
            }
            vt.field_k.e(var3 + 15, var4 + 10, var7Lifetime2 * var5 >> 8);
          }
          return;
        }
        if (50 <= var6Lifetime2) {
          var6Lifetime2 = ib.field_j - 140;
          if (var6Lifetime2 > 0) {
            var7Lifetime3 = 256;
            if (var6Lifetime2 < 20) {
              var7Lifetime3 = var6Lifetime2 * 256 / 20;
            }
            vt.field_k.e(var3 + 15, var4 + 10, var7Lifetime3 * var5 >> 8);
          }
        } else {
          if (20 > var6Lifetime2) {
            var7Lifetime3 = var6Lifetime2 * 256 / 20;
            kq.field_P.f(var3, var4, var7Lifetime3);
            var6Lifetime2 = ib.field_j - 140;
            if (var6Lifetime2 > 0) {
              var7Lifetime3 = 256;
              if (var6Lifetime2 < 20) {
                var7Lifetime3 = var6Lifetime2 * 256 / 20;
              }
              vt.field_k.e(var3 + 15, var4 + 10, var7Lifetime3 * var5 >> 8);
            }
            return;
          }
          if (var6Lifetime2 >= 30) {
            var7Lifetime3 = (-var6Lifetime2 + 50) * 256 / 20;
            kq.field_P.f(var3, var4, var7Lifetime3);
            var6Lifetime2 = ib.field_j - 140;
            if (var6Lifetime2 > 0) {
              var7Lifetime3 = 256;
              if (var6Lifetime2 < 20) {
                var7Lifetime3 = var6Lifetime2 * 256 / 20;
              }
              vt.field_k.e(var3 + 15, var4 + 10, var7Lifetime3 * var5 >> 8);
            }
            return;
          }
          kq.field_P.f(var3, var4, 256);
          var6Lifetime2 = ib.field_j - 140;
          if (var6Lifetime2 > 0) {
            var7Lifetime3 = 256;
            if (var6Lifetime2 < 20) {
              var7Lifetime3 = var6Lifetime2 * 256 / 20;
            }
            vt.field_k.e(var3 + 15, var4 + 10, var7Lifetime3 * var5 >> 8);
          }
          return;
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_b = null;
        field_f = null;
        if (param0 <= -6) {
          field_h = null;
          field_d = null;
          field_i = null;
          return;
        }
        sc.a(85);
        field_h = null;
        field_d = null;
        field_i = null;
    }

    public final void decodeTaggedField(int encodedLength, CipherPacketBuffer packet, String fieldName, byte obfuscationGuard) {
        int var6 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != 37) {
            field_i = (String) null;
          }
          if (!fieldName.equals("nump")) {
            if (fieldName.equals("w")) {
              if (encodedLength <= 0) {
                return;
              }
              this.field_k = (int)tn.a(false, encodedLength, packet);
            } else {
              if (!fieldName.equals("h")) {
                if (fieldName.equals("them")) {
                  if (0 >= encodedLength) {
                    return;
                  }
                  this.field_a = (int)tn.a(false, encodedLength, packet);
                  return;
                }
                if (!fieldName.equals("map")) {
                  return;
                }
                if (encodedLength <= 0) {
                  return;
                }
                var5_int = ai.a(packet, true);
                this.field_c = new MapTile[var5_int];
                for (var6 = 0; var5_int > var6; var6++) {
                  mt.a(packet, true);
                  var7 = packet.a(false);
                  var8 = AiPlanner.a(packet, true);
                  var9 = -var7 + packet.a(false);
                  kq.a(var7, -24232, var9, var8, packet);
                  this.field_c[var6] = rb.a(var8, (byte) 70, packet);
                  ao.a(var7, -126, var9, packet, var8);
                }
              } else {
                if (0 < encodedLength) {
                  this.field_e = (int)tn.a(false, encodedLength, packet);
                  return;
                }
              }
            }
          } else {
            if (0 < encodedLength) {
              this.field_j = (int)tn.a(false, encodedLength, packet);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("sc.B(").append(encodedLength).append(',');
          if (packet == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (fieldName == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_i = "This unit's movement is unaffected by this spell.";
        field_d = "<%0> is not on your friend list.";
        field_h = "This game option is not available in rated games.";
    }
}
