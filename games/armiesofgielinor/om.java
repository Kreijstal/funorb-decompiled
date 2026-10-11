/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class om extends IntrusiveNode implements TaggedFieldReader {
    int field_k;
    int field_l;
    static String field_s;
    static long[] field_r;
    int field_z;
    int field_q;
    private lo field_C;
    static String field_p;
    private int field_A;
    String field_n;
    int[] field_D;
    int field_m;
    int field_u;
    int[] field_B;
    int[] field_y;
    static el field_I;
    int field_o;
    int field_v;
    cf field_G;
    kl field_H;
    int field_E;
    int field_w;
    int field_F;
    private int[] field_x;
    String field_J;
    private int field_t;

    public final void decodeTaggedField(int encodedLength, CipherPacketBuffer packet, String fieldName, byte obfuscationGuard) {
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_92_2 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_95_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != 37) {
            this.g(-112);
          }
          if (!fieldName.equals("id")) {
            if (fieldName.equals("flg")) {
              if (encodedLength <= 0) {
                return;
              }
              this.field_k = (int)tn.a(false, encodedLength, packet);
            } else {
              if (fieldName.equals("name")) {
                if (encodedLength <= 0) {
                  return;
                }
                this.field_J = up.a(packet, encodedLength, (byte) -82);
                return;
              }
              if (!fieldName.equals("key")) {
                if (fieldName.equals("pos")) {
                  if (encodedLength > 0) {
                    this.field_w = (int)tn.a(false, encodedLength, packet);
                    return;
                  }
                } else {
                  if (!fieldName.equals("w")) {
                    if (fieldName.equals("h")) {
                      if (0 >= encodedLength) {
                        return;
                      }
                      tn.a(false, encodedLength, packet);
                      return;
                    }
                    if (!fieldName.equals("mid")) {
                      if (fieldName.equals("ngb")) {
                        if (encodedLength <= 0) {
                          return;
                        }
                        var5_int = ai.a(packet, true);
                        this.field_y = new int[var5_int];
                        for (var6 = 0; var6 < var5_int; var6++) {
                          this.field_y[var6] = (int)tn.a(false, 2, packet);
                        }
                      } else {
                        if (fieldName.equals("mpsz")) {
                          if (0 < encodedLength) {
                            this.field_o = (int)tn.a(false, encodedLength, packet);
                            return;
                          }
                        } else {
                          if (!fieldName.equals("mpt")) {
                            if (fieldName.equals("ptc")) {
                              if (encodedLength <= 0) {
                                return;
                              }
                              var5_int = ai.a(packet, true);
                              this.field_B = new int[var5_int];
                              for (var6 = 0; var5_int > var6; var6++) {
                                this.field_B[var6] = (int)tn.a(false, 2, packet);
                              }
                            } else {
                              if (!fieldName.equals("rwd")) {
                                if (fieldName.equals("mbr")) {
                                  if (0 >= encodedLength) {
                                    return;
                                  }
                                  this.field_u = (int)tn.a(false, encodedLength, packet);
                                  return;
                                }
                                if (fieldName.equals("tr")) {
                                  if (encodedLength <= 0) {
                                    return;
                                  }
                                  this.field_l = (int)tn.a(false, encodedLength, packet);
                                  return;
                                }
                                if (!fieldName.equals("df")) {
                                  if (fieldName.equals("dsc")) {
                                    if (0 >= encodedLength) {
                                      return;
                                    }
                                    this.field_n = up.a(packet, encodedLength, (byte) -119);
                                    return;
                                  }
                                  if (fieldName.equals("gt")) {
                                    if (0 >= encodedLength) {
                                      return;
                                    }
                                    this.field_m = (int)tn.a(false, encodedLength, packet);
                                    return;
                                  }
                                  if (fieldName.equals("gd")) {
                                    if (encodedLength > 0) {
                                      this.field_F = (int)tn.a(false, encodedLength, packet);
                                      return;
                                    }
                                  } else {
                                    if (fieldName.equals("ach")) {
                                      if (0 >= encodedLength) {
                                        return;
                                      }
                                      tn.a(false, encodedLength, packet);
                                      return;
                                    }
                                    if (fieldName.equals("song")) {
                                      if (encodedLength > 0) {
                                        this.field_q = (int)tn.a(false, encodedLength, packet);
                                        return;
                                      }
                                    } else {
                                      if (!fieldName.equals("team")) {
                                        return;
                                      }
                                      if (encodedLength > 0) {
                                        var5_int = ai.a(packet, true);
                                        this.field_x = new int[var5_int];
                                        for (var6 = 0; var5_int > var6; var6++) {
                                          this.field_x[var6] = (int)tn.a(false, 2, packet);
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  if (0 < encodedLength) {
                                    this.field_E = (int)tn.a(false, encodedLength, packet);
                                    return;
                                  }
                                }
                              } else {
                                if (encodedLength > 0) {
                                  var5_int = ai.a(packet, true);
                                  this.field_D = new int[var5_int];
                                  for (var6 = 0; var6 < var5_int; var6++) {
                                    this.field_D[var6] = (int)tn.a(false, 2, packet);
                                  }
                                }
                              }
                            }
                          } else {
                            if (encodedLength > 0) {
                              this.field_z = (int)tn.a(false, encodedLength, packet);
                              return;
                            }
                          }
                        }
                      }
                    } else {
                      if (0 < encodedLength) {
                        this.field_t = (int)tn.a(false, encodedLength, packet);
                        return;
                      }
                    }
                  } else {
                    if (encodedLength > 0) {
                      this.field_A = (int)tn.a(false, encodedLength, packet);
                      return;
                    }
                  }
                }
              } else {
                if (encodedLength > 0) {
                  up.a(packet, encodedLength, (byte) -82);
                  return;
                }
              }
            }
          } else {
            if (encodedLength > 0) {
              this.field_v = (int)tn.a(false, encodedLength, packet);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_91_0 = var5;
          stackIn_91_1 = new StringBuilder().append("om.B(").append(encodedLength).append(',');
          if (packet == null) {
            stackIn_92_2 = "null";
          } else {
            stackIn_92_2 = "{...}";
          }
          stackIn_94_1 = ((StringBuilder) (Object) stackIn_91_1).append(stackIn_92_2).append(',');
          if (fieldName == null) {
            stackIn_95_2 = "null";
          } else {
            stackIn_95_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_91_0), ((StringBuilder) (Object) stackIn_94_1).append(stackIn_95_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final lo a(int param0) {
        if (null == this.field_C) {
          this.field_C = this.d((byte) 92);
        }
        if (param0 > -88) {
          this.field_q = 10;
        }
        return this.field_C;
    }

    public static void f(int param0) {
        field_r = null;
        field_I = null;
        field_s = null;
        field_p = null;
        if (param0 != 0) {
          field_r = (long[]) null;
        }
    }

    private final lo d(byte param0) {
        if (param0 < 86) {
          om.c((byte) 8);
        }
        byte[] var3 = this.field_H.a((byte) 76, this.field_t, this.field_H.a(gk.field_O[this.field_G.field_r], 102));
        byte[] var2 = var3;
        return new lo(this.field_v, var3);
    }

    final String[] e(int param0) {
        int var3 = 0;
        String[] var2;
        sd var4;
        int var5;
        String[] var6;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 != -23209) {
          return (String[]) null;
        }
        var6 = new String[this.field_B.length];
        var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
          if (var3 == this.field_w) {
            var6[var3] = this.field_G.field_l;
          } else {
            var4 = this.field_G.field_q[this.field_B[var3]];
            var6[var3] = var4.field_u;
          }
        }
        return var2;
    }

    final int[] a(byte param0) {
        int var2 = -73 % ((param0 - 13) / 33);
        return this.field_x;
    }

    final boolean e(byte param0) {
        if (param0 <= 56) {
          return true;
        }
        return (this.field_k & 2) != 0 ? true : false;
    }

    final fu g(int param0) {
        if (param0 != -1) {
          this.g(-55);
        }
        return new fu(this.field_D, this.field_l, this.field_u);
    }

    final static RgbSprite[] a(byte param0, String param1, String param2, kl param3) {
        RgbSprite[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        RgbSprite[] var7 = null;
        RgbSprite[] stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var7 = fk.a(param1, (byte) -126, param3, param2);
          var4 = var7;
          for (var5 = 0; var5 < 9; var5++) {
            var7[var5].i();
          }
          var5Lifetime1 = -30 % ((2 - param0) / 55);
          stackIn_5_0 = var4;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_8_0 = var4_ref;
          stackIn_8_1 = new StringBuilder().append("om.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        for (var2 = 0; var2 < hs.field_G.length; var2++) {
          if (hs.field_G[var2] == this.field_A) {
            this.field_o = var2;
            break;
          }
        }
        if (!param0) {
          this.a((byte) 40);
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param1 != -22696) {
          field_s = (String) null;
        }
        ij.field_x = param0;
        te.field_l = param2;
        if (null != ee.field_v) {
          ee.field_v.a(param2, param0, (byte) -14);
        }
    }

    final static gl c(byte param0) {
        if (param0 >= -11) {
          kl var2 = (kl) null;
          om.a((byte) -102, (String) null, (String) null, (kl) null);
        }
        return new gl(cn.e(488997228), rf.c(-104));
    }

    om() {
        this.field_q = -1;
        this.field_l = -1;
        this.field_E = 1;
    }

    static {
        field_s = "Unfortunately we are unable to create an account for you at this time.";
        field_p = "Blue_Team";
        field_r = new long[32];
    }
}
