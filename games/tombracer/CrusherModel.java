/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CrusherModel extends TrapModel {
    private int field_r;
    private int field_m;
    private int field_t;
    static int field_o;
    private boolean field_p;
    private CrusherBehaviour field_v;
    private int field_n;
    private int field_q;
    private boolean field_u;
    private fla field_s;

    final void decode(int param0, Room param1, BitPacketBuffer param2) {
        try {
          super.decode(120, param1, param2);
          this.field_q = param2.readBits((byte) 44, 4);
          if (param0 <= 119) {
            iq var5 = (iq) null;
            this.a((iq) null, 87, -34, 68, (byte) 5);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "dc.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final int getRenderZ(byte param0) {
        if (param0 < -86) {
          return super.getRenderZ((byte) -108) + (this.field_r << 16);
        }
        this.getRenderZ((byte) 28);
        return super.getRenderZ((byte) -108) + (this.field_r << 16);
    }

    final void encode(byte param0, BitPacketBuffer param1) {
        try {
          super.encode((byte) 85, param1);
          int var3_int = -96 / ((param0 + 8) / 40);
          param1.writeBits((byte) -125, this.field_q, 4);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "dc.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    CrusherModel(int param0, Room param1, BitPacketBuffer param2) {
        super(param0, param1, param2);
        this.field_n = 160;
    }

    final static void a(int param0, int param1, byte param2) {
        if (null == ItemBehaviour.field_p ||
          !(param0 <= ItemBehaviour.field_p.length)) {
          ItemBehaviour.field_p = new int[param0 * 2];
        }
        if (null == jk.field_h ||
          !(param0 <= jk.field_h.length)) {
          jk.field_h = new int[param0 * 2];
        }
        if (DamageableBehaviour.field_o == null) {
          DamageableBehaviour.field_o = new int[param0 * 2];
          if (null == bq.field_h) {
            bq.field_h = new int[param0 * 2];
            if (PortalBehaviour.field_o == null ||
              !(param0 <= PortalBehaviour.field_o.length)) {
              PortalBehaviour.field_o = new int[param0 * 2];
            }
            if (ic.field_c == null ||
              !(param0 <= ic.field_c.length)) {
              ic.field_c = new int[param0 * 2];
            }
            if (BlockModel.field_n == null ||
              !(param1 + param0 <= BlockModel.field_n.length)) {
              BlockModel.field_n = new int[2 * (param1 + param0)];
            }
            if (gja.field_B == null ||
              !(gja.field_B.length >= param0)) {
              gja.field_B = new boolean[2 * param0];
            }
          } else {
            if (bq.field_h.length < param0) {
              bq.field_h = new int[param0 * 2];
              if (PortalBehaviour.field_o == null ||
                !(param0 <= PortalBehaviour.field_o.length)) {
                PortalBehaviour.field_o = new int[param0 * 2];
              }
              if (ic.field_c == null ||
                !(param0 <= ic.field_c.length)) {
                ic.field_c = new int[param0 * 2];
              }
              if (BlockModel.field_n == null ||
                !(param1 + param0 <= BlockModel.field_n.length)) {
                BlockModel.field_n = new int[2 * (param1 + param0)];
              }
              if (gja.field_B == null ||
                !(gja.field_B.length >= param0)) {
                gja.field_B = new boolean[2 * param0];
              }
            } else {
              if (PortalBehaviour.field_o == null) {
                PortalBehaviour.field_o = new int[param0 * 2];
                if (ic.field_c == null ||
                  !(param0 <= ic.field_c.length)) {
                  ic.field_c = new int[param0 * 2];
                }
                if (BlockModel.field_n == null ||
                  !(param1 + param0 <= BlockModel.field_n.length)) {
                  BlockModel.field_n = new int[2 * (param1 + param0)];
                }
                if (gja.field_B == null ||
                  !(gja.field_B.length >= param0)) {
                  gja.field_B = new boolean[2 * param0];
                }
              } else {
                if (param0 > PortalBehaviour.field_o.length) {
                  PortalBehaviour.field_o = new int[param0 * 2];
                  if (ic.field_c == null ||
                    !(param0 <= ic.field_c.length)) {
                    ic.field_c = new int[param0 * 2];
                  }
                  if (BlockModel.field_n == null ||
                    !(param1 + param0 <= BlockModel.field_n.length)) {
                    BlockModel.field_n = new int[2 * (param1 + param0)];
                  }
                  if (gja.field_B == null ||
                    !(gja.field_B.length >= param0)) {
                    gja.field_B = new boolean[2 * param0];
                  }
                } else {
                  if (ic.field_c == null ||
                    !(param0 <= ic.field_c.length)) {
                    ic.field_c = new int[param0 * 2];
                  }
                  if (BlockModel.field_n == null ||
                    !(param1 + param0 <= BlockModel.field_n.length)) {
                    BlockModel.field_n = new int[2 * (param1 + param0)];
                  }
                  if (gja.field_B == null) {
                    gja.field_B = new boolean[2 * param0];
                  } else {
                    if (gja.field_B.length < param0) {
                      gja.field_B = new boolean[2 * param0];
                    }
                  }
                }
              }
            }
          }
        } else {
          if (DamageableBehaviour.field_o.length >= param0) {
            if (null == bq.field_h) {
              bq.field_h = new int[param0 * 2];
              if (PortalBehaviour.field_o == null ||
                !(param0 <= PortalBehaviour.field_o.length)) {
                PortalBehaviour.field_o = new int[param0 * 2];
              }
              if (ic.field_c == null ||
                !(param0 <= ic.field_c.length)) {
                ic.field_c = new int[param0 * 2];
              }
              if (BlockModel.field_n == null ||
                !(param1 + param0 <= BlockModel.field_n.length)) {
                BlockModel.field_n = new int[2 * (param1 + param0)];
              }
              if (gja.field_B == null ||
                !(gja.field_B.length >= param0)) {
                gja.field_B = new boolean[2 * param0];
              }
            } else {
              if (bq.field_h.length < param0) {
                bq.field_h = new int[param0 * 2];
                if (PortalBehaviour.field_o == null ||
                  !(param0 <= PortalBehaviour.field_o.length)) {
                  PortalBehaviour.field_o = new int[param0 * 2];
                }
                if (ic.field_c == null ||
                  !(param0 <= ic.field_c.length)) {
                  ic.field_c = new int[param0 * 2];
                }
                if (BlockModel.field_n == null ||
                  !(param1 + param0 <= BlockModel.field_n.length)) {
                  BlockModel.field_n = new int[2 * (param1 + param0)];
                }
                if (gja.field_B == null ||
                  !(gja.field_B.length >= param0)) {
                  gja.field_B = new boolean[2 * param0];
                }
              } else {
                if (PortalBehaviour.field_o == null) {
                  PortalBehaviour.field_o = new int[param0 * 2];
                  if (ic.field_c == null ||
                    !(param0 <= ic.field_c.length)) {
                    ic.field_c = new int[param0 * 2];
                  }
                  if (BlockModel.field_n == null ||
                    !(param1 + param0 <= BlockModel.field_n.length)) {
                    BlockModel.field_n = new int[2 * (param1 + param0)];
                  }
                  if (gja.field_B == null ||
                    !(gja.field_B.length >= param0)) {
                    gja.field_B = new boolean[2 * param0];
                  }
                } else {
                  if (param0 > PortalBehaviour.field_o.length) {
                    PortalBehaviour.field_o = new int[param0 * 2];
                    if (ic.field_c == null ||
                      !(param0 <= ic.field_c.length)) {
                      ic.field_c = new int[param0 * 2];
                    }
                    if (BlockModel.field_n == null ||
                      !(param1 + param0 <= BlockModel.field_n.length)) {
                      BlockModel.field_n = new int[2 * (param1 + param0)];
                    }
                    if (gja.field_B == null ||
                      !(gja.field_B.length >= param0)) {
                      gja.field_B = new boolean[2 * param0];
                    }
                  } else {
                    if (ic.field_c == null ||
                      !(param0 <= ic.field_c.length)) {
                      ic.field_c = new int[param0 * 2];
                    }
                    if (BlockModel.field_n == null ||
                      !(param1 + param0 <= BlockModel.field_n.length)) {
                      BlockModel.field_n = new int[2 * (param1 + param0)];
                    }
                    if (gja.field_B == null) {
                      gja.field_B = new boolean[2 * param0];
                    } else {
                      if (gja.field_B.length < param0) {
                        gja.field_B = new boolean[2 * param0];
                      }
                    }
                  }
                }
              }
            }
          } else {
            DamageableBehaviour.field_o = new int[param0 * 2];
            if (null == bq.field_h) {
              bq.field_h = new int[param0 * 2];
              if (PortalBehaviour.field_o == null ||
                !(param0 <= PortalBehaviour.field_o.length)) {
                PortalBehaviour.field_o = new int[param0 * 2];
              }
              if (ic.field_c == null ||
                !(param0 <= ic.field_c.length)) {
                ic.field_c = new int[param0 * 2];
              }
              if (BlockModel.field_n == null ||
                !(param1 + param0 <= BlockModel.field_n.length)) {
                BlockModel.field_n = new int[2 * (param1 + param0)];
              }
              if (gja.field_B == null) {
                gja.field_B = new boolean[2 * param0];
              } else {
                if (gja.field_B.length < param0) {
                  gja.field_B = new boolean[2 * param0];
                }
              }
            } else {
              if (bq.field_h.length < param0) {
                bq.field_h = new int[param0 * 2];
                if (PortalBehaviour.field_o == null ||
                  !(param0 <= PortalBehaviour.field_o.length)) {
                  PortalBehaviour.field_o = new int[param0 * 2];
                }
                if (ic.field_c == null ||
                  !(param0 <= ic.field_c.length)) {
                  ic.field_c = new int[param0 * 2];
                }
                if (BlockModel.field_n == null ||
                  !(param1 + param0 <= BlockModel.field_n.length)) {
                  BlockModel.field_n = new int[2 * (param1 + param0)];
                }
                if (gja.field_B == null ||
                  !(gja.field_B.length >= param0)) {
                  gja.field_B = new boolean[2 * param0];
                }
              } else {
                if (PortalBehaviour.field_o == null) {
                  PortalBehaviour.field_o = new int[param0 * 2];
                  if (ic.field_c == null ||
                    !(param0 <= ic.field_c.length)) {
                    ic.field_c = new int[param0 * 2];
                  }
                  if (BlockModel.field_n == null ||
                    !(param1 + param0 <= BlockModel.field_n.length)) {
                    BlockModel.field_n = new int[2 * (param1 + param0)];
                  }
                } else {
                  if (param0 <= PortalBehaviour.field_o.length) {
                    if (ic.field_c == null ||
                      !(param0 <= ic.field_c.length)) {
                      ic.field_c = new int[param0 * 2];
                    }
                    if (BlockModel.field_n == null ||
                      !(param1 + param0 <= BlockModel.field_n.length)) {
                      BlockModel.field_n = new int[2 * (param1 + param0)];
                    }
                  } else {
                    PortalBehaviour.field_o = new int[param0 * 2];
                    if (ic.field_c == null ||
                      !(param0 <= ic.field_c.length)) {
                      ic.field_c = new int[param0 * 2];
                    }
                    if (BlockModel.field_n == null ||
                      !(param1 + param0 <= BlockModel.field_n.length)) {
                      BlockModel.field_n = new int[2 * (param1 + param0)];
                    }
                  }
                }
                if (gja.field_B == null) {
                  gja.field_B = new boolean[2 * param0];
                } else {
                  if (gja.field_B.length < param0) {
                    gja.field_B = new boolean[2 * param0];
                  }
                }
              }
            }
          }
        }
        ota.field_c = 2147483647;
        if (param2 != 47) {
          field_o = -102;
        }
        ma.field_g = -2147483648;
        kc.field_a = 2147483647;
        C2SChooseCharacterPacket.field_d = -2147483648;
        ContextMenu.field_Eb = 0;
    }

    final void d(int param0) {
        int var2;
        int var3;
        int var6;
        int var7;
        Trap var8;
        w var9;
        Object var16;
        Object var17;
        int stackIn_16_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_118_0 = 0;
        int stackIn_149_0 = 0;
        Trap var10;
        w var11;
        Trap var12;
        w var13;
        Trap var14;
        w var15;
        w var17_ref;
        Trap var18;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        var17 = null;
        var16 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        super.d(param0);
        if (null == this.field_v) {
          return;
        }
        var2 = this.field_r;
        this.field_t = 0;
        this.field_r = this.field_n;
        this.field_m = 0;
        var3 = 1;
        if (this.field_v.isWaiting(76)) {
          this.field_t = -2 + uca.cosmeticRandom.nextBounded(5, 0);
          var3 = 0;
          this.field_m = uca.cosmeticRandom.nextBounded(5, ~param0) - 2;
        } else {
          if (this.field_v.isWindingUp(-98)) {
            var3 = 0;
            this.field_r = this.field_n - this.field_n * this.field_v.getPhaseTicks((byte) -107) / this.field_v.getWindUpTicks((byte) 90);
            if (this.field_r == 0 &&
              var2 != 0) {
              this.a(42).getParticleEffects(false).a(0, this.getRenderY((byte) 92), 0, 0, 0, this.getRenderX((byte) 52));
            }
            var13 = (w) (this.a(param0 + 44).field_G);
            if (var13 == null) {
              return;
            }
            var12 = (Trap) (this.body);
            if (var12.d(param0 + 51, false)) {
              stackIn_85_0 = (var3 != 0) ? 1 : 0;
            } else {
              stackIn_85_0 = 0;
            }
            var6 = stackIn_85_0;
            if (this.field_s == null &&
              var6 != 0) {
              var13.a(new fm(56, this.getRenderX((byte) -93), this.getRenderY((byte) 124), this.getRenderZ((byte) -118)), -58);
              this.field_s = var13.a(new fm(57, this.getRenderX((byte) 32), this.getRenderY((byte) 118), this.getRenderZ((byte) -95)), -58);
            } else {
              if (this.field_s != null &&
                var6 == 0) {
                this.field_s.a(1, var13);
                this.field_s = null;
                var13.a(new fm(58, this.getRenderX((byte) -99), this.getRenderY((byte) 95), this.getRenderZ((byte) -122)), param0 ^ 57);
              }
            }
            if (var6 == 0 &&
              !this.field_u &&
              this.field_v.isWaiting(110)) {
              var13.a(new fm(59, this.getRenderX((byte) -121), this.getRenderY((byte) 92), this.getRenderZ((byte) -105)), -58);
            }
            this.field_u = this.field_v.isWaiting(param0 - 77);
            if (var6 == 0 &&
              !this.field_p &&
              this.field_v.isWindingUp(-110)) {
              var13.a(new fm(60, this.getRenderX((byte) -86), this.getRenderY((byte) 112), this.getRenderZ((byte) -97)), -58);
            }
            this.field_p = this.field_v.isWindingUp(-59);
            if (this.field_r == 0 &&
              var2 != 0) {
              var13.a(new fm(2, this.getRenderX((byte) -90), this.getRenderY((byte) 127), this.getRenderZ((byte) -122)), -58);
            }
            return;
          }
          if (this.field_v.isCrushed(param0 ^ -61)) {
            var3 = 0;
            this.field_r = 0;
            if (this.field_r == 0 &&
              var2 != 0) {
              this.a(42).getParticleEffects(false).a(0, this.getRenderY((byte) 92), 0, 0, 0, this.getRenderX((byte) 52));
            }
            var9 = (w) (this.a(param0 + 44).field_G);
            if (var9 == null) {
              return;
            }
            var8 = (Trap) (this.body);
            if (var8.d(param0 + 51, false)) {
              stackIn_16_0 = (var3 != 0) ? 1 : 0;
            } else {
              stackIn_16_0 = 0;
            }
            var6Lifetime3 = stackIn_16_0;
            if (this.field_s == null &&
              var6Lifetime3 != 0) {
              var9.a(new fm(56, this.getRenderX((byte) -93), this.getRenderY((byte) 124), this.getRenderZ((byte) -118)), -58);
              this.field_s = var9.a(new fm(57, this.getRenderX((byte) 32), this.getRenderY((byte) 118), this.getRenderZ((byte) -95)), -58);
            } else {
              if (this.field_s != null &&
                var6Lifetime3 == 0) {
                this.field_s.a(1, var9);
                this.field_s = null;
                var9.a(new fm(58, this.getRenderX((byte) -99), this.getRenderY((byte) 95), this.getRenderZ((byte) -122)), param0 ^ 57);
              }
            }
            if (var6Lifetime3 == 0 &&
              !this.field_u &&
              this.field_v.isWaiting(110)) {
              var9.a(new fm(59, this.getRenderX((byte) -121), this.getRenderY((byte) 92), this.getRenderZ((byte) -105)), -58);
            }
            this.field_u = this.field_v.isWaiting(param0 - 77);
            if (var6Lifetime3 == 0 &&
              !this.field_p &&
              this.field_v.isWindingUp(-110)) {
              var9.a(new fm(60, this.getRenderX((byte) -86), this.getRenderY((byte) 112), this.getRenderZ((byte) -97)), -58);
            }
            this.field_p = this.field_v.isWindingUp(-59);
            if (this.field_r == 0 &&
              var2 != 0) {
              var9.a(new fm(2, this.getRenderX((byte) -90), this.getRenderY((byte) 127), this.getRenderZ((byte) -122)), -58);
            }
            return;
          }
          if (this.field_v.isRetracting(param0 - 4)) {
            var3 = 0;
            this.field_r = this.field_n * this.field_v.getPhaseTicks((byte) -120) / this.field_v.getRetractTicks(false);
            if (this.field_r == 0 &&
              var2 != 0) {
              this.a(42).getParticleEffects(false).a(0, this.getRenderY((byte) 92), 0, 0, 0, this.getRenderX((byte) 52));
            }
            var11 = (w) (this.a(param0 + 44).field_G);
            if (var11 == null) {
              return;
            }
            var10 = (Trap) (this.body);
            if (var10.d(param0 + 51, false)) {
              stackIn_51_0 = (var3 != 0) ? 1 : 0;
            } else {
              stackIn_51_0 = 0;
            }
            var6Lifetime4 = stackIn_51_0;
            if (this.field_s == null &&
              var6Lifetime4 != 0) {
              var11.a(new fm(56, this.getRenderX((byte) -93), this.getRenderY((byte) 124), this.getRenderZ((byte) -118)), -58);
              this.field_s = var11.a(new fm(57, this.getRenderX((byte) 32), this.getRenderY((byte) 118), this.getRenderZ((byte) -95)), -58);
            } else {
              if (this.field_s != null &&
                var6Lifetime4 == 0) {
                this.field_s.a(1, var11);
                this.field_s = null;
                var11.a(new fm(58, this.getRenderX((byte) -99), this.getRenderY((byte) 95), this.getRenderZ((byte) -122)), param0 ^ 57);
              }
            }
            if (var6Lifetime4 == 0 &&
              !this.field_u &&
              this.field_v.isWaiting(110)) {
              var11.a(new fm(59, this.getRenderX((byte) -121), this.getRenderY((byte) 92), this.getRenderZ((byte) -105)), -58);
            }
            this.field_u = this.field_v.isWaiting(param0 - 77);
            if (var6Lifetime4 == 0 &&
              !this.field_p &&
              this.field_v.isWindingUp(-110)) {
              var11.a(new fm(60, this.getRenderX((byte) -86), this.getRenderY((byte) 112), this.getRenderZ((byte) -97)), -58);
            }
            this.field_p = this.field_v.isWindingUp(-59);
            if (this.field_r == 0 &&
              var2 != 0) {
              var11.a(new fm(2, this.getRenderX((byte) -90), this.getRenderY((byte) 127), this.getRenderZ((byte) -122)), -58);
            }
            return;
          }
        }
        if (this.field_r == 0) {
          if (var2 == 0) {
            var15 = (w) (this.a(param0 + 44).field_G);
            if (var15 == null) {
              return;
            }
            var14 = (Trap) (this.body);
            if (var14.d(param0 + 51, false)) {
              stackIn_118_0 = (var3 != 0) ? 1 : 0;
            } else {
              stackIn_118_0 = 0;
            }
            var6Lifetime1 = stackIn_118_0;
            if (this.field_s == null &&
              var6Lifetime1 != 0) {
              var15.a(new fm(56, this.getRenderX((byte) -93), this.getRenderY((byte) 124), this.getRenderZ((byte) -118)), -58);
              this.field_s = var15.a(new fm(57, this.getRenderX((byte) 32), this.getRenderY((byte) 118), this.getRenderZ((byte) -95)), -58);
            } else {
              if (this.field_s != null &&
                var6Lifetime1 == 0) {
                this.field_s.a(1, var15);
                this.field_s = null;
                var15.a(new fm(58, this.getRenderX((byte) -99), this.getRenderY((byte) 95), this.getRenderZ((byte) -122)), param0 ^ 57);
              }
            }
            if (var6Lifetime1 == 0 &&
              !this.field_u &&
              this.field_v.isWaiting(110)) {
              var15.a(new fm(59, this.getRenderX((byte) -121), this.getRenderY((byte) 92), this.getRenderZ((byte) -105)), -58);
            }
            this.field_u = this.field_v.isWaiting(param0 - 77);
            if (var6Lifetime1 == 0 &&
              !this.field_p &&
              this.field_v.isWindingUp(-110)) {
              var15.a(new fm(60, this.getRenderX((byte) -86), this.getRenderY((byte) 112), this.getRenderZ((byte) -97)), -58);
            }
            this.field_p = this.field_v.isWindingUp(-59);
            if (this.field_r == 0 &&
              var2 != 0) {
              var15.a(new fm(2, this.getRenderX((byte) -90), this.getRenderY((byte) 127), this.getRenderZ((byte) -122)), -58);
            }
            return;
          }
          this.a(42).getParticleEffects(false).a(0, this.getRenderY((byte) 92), 0, 0, 0, this.getRenderX((byte) 52));
        }
        var17_ref = (w) (this.a(param0 + 44).field_G);
        if (var17_ref == null) {
          return;
        }
        var18 = (Trap) (this.body);
        if (var18.d(param0 + 51, false)) {
          stackIn_149_0 = (var3 == 0) ? 0 : 1;
        } else {
          stackIn_149_0 = 0;
        }
        var6Lifetime2 = stackIn_149_0;
        if (this.field_s == null &&
          var6Lifetime2 != 0) {
          var17_ref.a(new fm(56, this.getRenderX((byte) -93), this.getRenderY((byte) 124), this.getRenderZ((byte) -118)), -58);
          this.field_s = var17_ref.a(new fm(57, this.getRenderX((byte) 32), this.getRenderY((byte) 118), this.getRenderZ((byte) -95)), -58);
          if (var6Lifetime2 == 0 &&
            !this.field_u &&
            this.field_v.isWaiting(110)) {
            var17_ref.a(new fm(59, this.getRenderX((byte) -121), this.getRenderY((byte) 92), this.getRenderZ((byte) -105)), -58);
            this.field_u = this.field_v.isWaiting(param0 - 77);
            if (!this.field_p &&
              this.field_v.isWindingUp(-110)) {
              var17_ref.a(new fm(60, this.getRenderX((byte) -86), this.getRenderY((byte) 112), this.getRenderZ((byte) -97)), -58);
            }
            this.field_p = this.field_v.isWindingUp(-59);
            if (this.field_r == 0 &&
              var2 != 0) {
              var17_ref.a(new fm(2, this.getRenderX((byte) -90), this.getRenderY((byte) 127), this.getRenderZ((byte) -122)), -58);
            }
            return;
          }
          this.field_u = this.field_v.isWaiting(param0 - 77);
          if (var6Lifetime2 == 0 &&
            !this.field_p) {
            if (!this.field_v.isWindingUp(-110)) {
              this.field_p = this.field_v.isWindingUp(-59);
              if (this.field_r == 0 &&
                var2 != 0) {
                var17_ref.a(new fm(2, this.getRenderX((byte) -90), this.getRenderY((byte) 127), this.getRenderZ((byte) -122)), -58);
              }
              return;
            }
            var17_ref.a(new fm(60, this.getRenderX((byte) -86), this.getRenderY((byte) 112), this.getRenderZ((byte) -97)), -58);
          }
          this.field_p = this.field_v.isWindingUp(-59);
          if (this.field_r != 0) {
            return;
          }
          if (var2 == 0) {
            return;
          }
          var17_ref.a(new fm(2, this.getRenderX((byte) -90), this.getRenderY((byte) 127), this.getRenderZ((byte) -122)), -58);
          return;
        }
        if (this.field_s != null) {
          if (var6Lifetime2 == 0) {
            this.field_s.a(1, var17_ref);
            this.field_s = null;
            var17_ref.a(new fm(58, this.getRenderX((byte) -99), this.getRenderY((byte) 95), this.getRenderZ((byte) -122)), param0 ^ 57);
            if (!this.field_u &&
              this.field_v.isWaiting(110)) {
              var17_ref.a(new fm(59, this.getRenderX((byte) -121), this.getRenderY((byte) 92), this.getRenderZ((byte) -105)), -58);
            }
            this.field_u = this.field_v.isWaiting(param0 - 77);
            if (!this.field_p &&
              this.field_v.isWindingUp(-110)) {
              var17_ref.a(new fm(60, this.getRenderX((byte) -86), this.getRenderY((byte) 112), this.getRenderZ((byte) -97)), -58);
            }
          } else {
            if (var6Lifetime2 == 0 &&
              !this.field_u &&
              this.field_v.isWaiting(110)) {
              var17_ref.a(new fm(59, this.getRenderX((byte) -121), this.getRenderY((byte) 92), this.getRenderZ((byte) -105)), -58);
            }
            this.field_u = this.field_v.isWaiting(param0 - 77);
            if (var6Lifetime2 == 0 &&
              !this.field_p &&
              this.field_v.isWindingUp(-110)) {
              var17_ref.a(new fm(60, this.getRenderX((byte) -86), this.getRenderY((byte) 112), this.getRenderZ((byte) -97)), -58);
            }
          }
          this.field_p = this.field_v.isWindingUp(-59);
          if (this.field_r == 0 &&
            var2 != 0) {
            var17_ref.a(new fm(2, this.getRenderX((byte) -90), this.getRenderY((byte) 127), this.getRenderZ((byte) -122)), -58);
          }
          return;
        }
        if (var6Lifetime2 == 0 &&
          !this.field_u &&
          this.field_v.isWaiting(110)) {
          var17_ref.a(new fm(59, this.getRenderX((byte) -121), this.getRenderY((byte) 92), this.getRenderZ((byte) -105)), -58);
          this.field_u = this.field_v.isWaiting(param0 - 77);
          if (!this.field_p) {
            if (!this.field_v.isWindingUp(-110)) {
              this.field_p = this.field_v.isWindingUp(-59);
              if (this.field_r == 0 &&
                var2 != 0) {
                var17_ref.a(new fm(2, this.getRenderX((byte) -90), this.getRenderY((byte) 127), this.getRenderZ((byte) -122)), -58);
              }
              return;
            }
            var17_ref.a(new fm(60, this.getRenderX((byte) -86), this.getRenderY((byte) 112), this.getRenderZ((byte) -97)), -58);
          }
          this.field_p = this.field_v.isWindingUp(-59);
          if (this.field_r != 0) {
            return;
          }
          if (var2 == 0) {
            return;
          }
          var17_ref.a(new fm(2, this.getRenderX((byte) -90), this.getRenderY((byte) 127), this.getRenderZ((byte) -122)), -58);
          return;
        }
        this.field_u = this.field_v.isWaiting(param0 - 77);
        if (var6Lifetime2 == 0 &&
          !this.field_p) {
          if (!this.field_v.isWindingUp(-110)) {
            this.field_p = this.field_v.isWindingUp(-59);
            if (this.field_r != 0) {
              return;
            }
            if (var2 == 0) {
              return;
            }
            var17_ref.a(new fm(2, this.getRenderX((byte) -90), this.getRenderY((byte) 127), this.getRenderZ((byte) -122)), -58);
            return;
          }
          var17_ref.a(new fm(60, this.getRenderX((byte) -86), this.getRenderY((byte) 112), this.getRenderZ((byte) -97)), -58);
        }
        this.field_p = this.field_v.isWindingUp(-59);
        if (this.field_r == 0 &&
          var2 != 0) {
          var17_ref.a(new fm(2, this.getRenderX((byte) -90), this.getRenderY((byte) 127), this.getRenderZ((byte) -122)), -58);
          return;
        }
        return;
    }

    CrusherModel(int param0) {
        super(param0);
        this.field_n = 160;
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        ka var9 = null;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          var6_int = param2 + (this.field_t << 16);
          param3 = param3 + (this.field_r << 16);
          var7 = param1 + (this.field_m << 16);
          var8 = GameScreen.positiveModulo(4096 - this.body.getFacingAngle(-25787) >> 2, 2048, -120);
          var10 = 14 % ((param4 + 38) / 47);
          var11 = this.field_q;
          if (var11 != 0 &&
            var11 == 1) {
            var9 = RevolverItemComponent.field_J[74];
          } else {
            var9 = RevolverItemComponent.field_J[74];
          }
          gqa.a(var8, -83584144, var7, var6_int, var9, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("dc.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void attach(TrapPart param0, WorldBody param1, byte param2) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          super.attach(param0, param1, param2);
          if (param0 instanceof CrusherBehaviour) {
            this.field_v = (CrusherBehaviour) (param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("dc.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_o = 6;
    }
}
