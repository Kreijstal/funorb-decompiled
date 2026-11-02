/*
 * Decompiled by CFR-JS 0.4.0.
 */
class SpecialOrder extends CreatureOrder {
    private boolean field_m;
    static String field_l;
    static pna field_o;
    CreatureRef field_j;
    int field_k;
    int field_i;
    int field_n;

    public static void b(boolean param0) {
        field_l = null;
        field_o = null;
        if (param0) {
          byte[] var2 = (byte[]) null;
          SpecialOrder.a(-123, (byte[]) null);
        }
    }

    final void a(int param0, PacketBuffer param1) {
        try {
          if (this.a(-4)) {
            FlirtAnimation.a(this.field_j, 111, param1);
          } else {
            param1.writeByte(this.field_k, 0);
            param1.writeByte(this.field_n, 0);
          }
          param1.writeByte(this.field_i, 0);
          param1.writeByte(!this.field_m ? 0 : 1, 0);
          int var3_int = 71 % ((61 - param0) / 53);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "td.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    SpecialOrder(int param0, BattleCreature param1) {
        super(4, param0, new CreatureRef(param1));
    }

    final static byte[] a(int param0, byte[] param1) {
        byte[] stackIn_2_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        PacketBuffer var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          if (param0 >= -46) {
            stackIn_2_0 = (byte[]) null;
            return stackIn_2_0;
          }
          var9 = new PacketBuffer(param1);
          var3 = var9.readUnsignedByte(16711935);
          var4 = var9.readInt(-52);
          if (var4 >= 0 && (0 == kq.field_k ||
            !(var4 > kq.field_k))) {
            if (var3 == 0) {
              var12 = new byte[var4];
              var10 = var12;
              var5_ref_byte__ = var10;
              var9.a(var12, var4, 128, 0);
              stackIn_10_0 = var5_ref_byte__;
              return stackIn_10_0;
            }
            var5 = var9.readInt(-128);
            if (var5 >= 0 && (0 == kq.field_k ||
              !(kq.field_k < var5))) {
              var13 = new byte[var5];
              var11 = var13;
              var6 = var11;
              if (1 == var3) {
                Bzip2Decoder.a(var13, var5, param1, var4, 9);
              } else {
                var7 = kca.field_b;
                synchronized (var7) {
                  kca.field_b.a(var9, var13, -10);
                }
              }
              stackIn_24_0 = var6;
              return stackIn_24_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("td.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    private final boolean a(int param0) {
        if (param0 != -4) {
          BattleState var3 = (BattleState) null;
          this.createEvent((BattleState) null, 56);
        }
        SpecialMoveDefinition var2 = (SpecialMoveDefinition) (WhirlpoolDigest.field_e[this.moveId]);
        return var2.c(0) == 3 ? true : false;
    }

    SpecialOrder(int param0, BattleCreature param1, boolean param2) {
        super(4, param0, new CreatureRef(param1));
        try {
          this.field_m = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "td.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    CreatureEvent createEvent(BattleState param0, int param1) {
        int[] dupTemp$0 = null;
        int[] dupTemp$1 = null;
        CreatureEvent stackIn_132_0 = null;
        Object stackIn_136_0 = null;
        StringBuilder stackIn_136_1 = null;
        String stackIn_137_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var3 = null;
        int var4_int = 0;
        CreatureEvent var4 = null;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        try {
          var3 = null;
          var4_int = this.moveId;
          if (88 != var4_int) {
            if (89 == var4_int) {
              var3 = new SuperSpeedSpecial(this.moveId, this.creature.a(param1 ^ 63, param0));
            } else {
              if (90 == var4_int) {
                var3 = new SleepSpecial(this.moveId, this.creature.a(8, param0), this.field_i);
              } else {
                if (91 == var4_int) {
                  var3 = new ShieldSpecial(this.moveId, this.creature.a(38, param0));
                } else {
                  if (92 != var4_int) {
                    if (var4_int == 93) {
                      var3 = new RaiseSpecial(this.moveId, this.creature.a(param1 + 36, param0), this.field_j);
                    } else {
                      if (var4_int == 94) {
                        var3 = new DiveBomberSpecial(this.moveId, this.creature.a(62, param0));
                      } else {
                        if (var4_int == 95) {
                          var3 = new MartyrSpecial(this.moveId, this.creature.a(param1 ^ 50, param0));
                        } else {
                          if (var4_int != 96) {
                            if (var4_int == 97) {
                              var3 = new SpiltMilkSpecial(this.moveId, this.creature.a(103, param0));
                            } else {
                              if (var4_int == 98) {
                                var3 = new DreamsSpecial(this.moveId, this.creature.a(20, param0));
                              } else {
                                if (var4_int == 99) {
                                  var3 = new SlowAllSpecial(this.moveId, this.creature.a(40, param0));
                                } else {
                                  if (var4_int == 100) {
                                    var3 = new InsanoSauceSpecial(this.moveId, this.creature.a(85, param0), this.field_k, this.field_n);
                                  } else {
                                    if (var4_int == 101) {
                                      var3 = new SuperSpeedAllSpecial(this.moveId, this.creature.a(27, param0));
                                    } else {
                                      if (var4_int != 102) {
                                        if (var4_int != 103) {
                                          if (var4_int != 104) {
                                            if (var4_int == 105) {
                                              var3 = new FullHealSpecial(this.moveId, this.creature.a(param1 + 65, param0));
                                            } else {
                                              if (var4_int != 106) {
                                                if (107 == var4_int) {
                                                  var3 = new ClamsSpecial(this.moveId, this.creature.a(21, param0), this.field_k, this.field_n);
                                                } else {
                                                  if (var4_int != 108) {
                                                    if (109 == var4_int) {
                                                      var3 = new FishRainSpecial(this.moveId, this.creature.a(112, param0), this.field_k, this.field_n);
                                                    } else {
                                                      if (var4_int == 110) {
                                                        var3 = new MassPoisonSpecial(this.moveId, this.creature.a(53, param0));
                                                      } else {
                                                        if (var4_int != 111) {
                                                          if (var4_int != 112) {
                                                            if (var4_int != 113) {
                                                              if (var4_int != 114) {
                                                                if (var4_int == 115) {
                                                                  var3 = new FlirtSpecial(this.moveId, this.creature.a(112, param0), this.field_j);
                                                                } else {
                                                                  if (116 != var4_int) {
                                                                    if (var4_int != 117) {
                                                                      if (var4_int != 118) {
                                                                        if (var4_int != 119) {
                                                                          if (var4_int != 120) {
                                                                            if (var4_int == 121) {
                                                                              var3 = new AttackUpAllSpecial(this.moveId, this.creature.a(51, param0));
                                                                            } else {
                                                                              if (122 != var4_int) {
                                                                                if (var4_int == 123) {
                                                                                  var3 = new SplitSpecial(this.moveId, this.creature.a(param1 + 25, param0));
                                                                                } else {
                                                                                  if (124 != var4_int) {
                                                                                    if (var4_int != 125) {
                                                                                      if (var4_int != 126) {
                                                                                        if (var4_int == 127) {
                                                                                          var3 = new BagpipeSpecial(this.moveId, this.creature.a(param1 ^ 127, param0));
                                                                                        } else {
                                                                                          if (var4_int == 128) {
                                                                                            var3 = new ResetSpecial(this.moveId, this.creature.a(param1 + 60, param0));
                                                                                          } else {
                                                                                            if (var4_int != 129) {
                                                                                              if (var4_int == 130) {
                                                                                                var3 = new TeleportSpecial(this.moveId, this.creature.a(107, param0), this.field_k, this.field_n);
                                                                                              } else {
                                                                                                if (var4_int == 131) {
                                                                                                  var3 = new AirstrikeSpecial(this.moveId, this.creature.a(param1 ^ 123, param0), this.field_k, this.field_n);
                                                                                                } else {
                                                                                                  if (var4_int != 132) {
                                                                                                    if (133 != var4_int) {
                                                                                                      if (var4_int == 134) {
                                                                                                        var3 = new RefreshingSpecial(this.moveId, this.creature.a(58, param0));
                                                                                                      } else {
                                                                                                        if (135 != var4_int) {
                                                                                                          if (var4_int == 136) {
                                                                                                            var3 = new GasCloudSpecial(this.moveId, this.creature.a(109, param0), this.field_k, this.field_n);
                                                                                                          } else {
                                                                                                            if (var4_int != 137) {
                                                                                                              throw new IllegalArgumentException("Special not found");
                                                                                                            }
                                                                                                            var3 = new OneSpecial(this.moveId, this.creature.a(52, param0), this.field_j);
                                                                                                          }
                                                                                                        } else {
                                                                                                          var3 = new RageSpecial(this.moveId, this.creature.a(96, param0), this.field_j);
                                                                                                        }
                                                                                                      }
                                                                                                    } else {
                                                                                                      var3 = new OhNoSpecial(this.moveId, this.creature.a(17, param0), this.field_k, this.field_n);
                                                                                                    }
                                                                                                  } else {
                                                                                                    var3 = new PizzaPartySpecial(this.moveId, this.creature.a(param1 ^ 78, param0), this.field_k, this.field_n);
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              var3 = new PetAttackSpecial(this.moveId, this.creature.a(94, param0));
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var3 = new HazmatSpecial(this.moveId, this.creature.a(24, param0), this.field_k, this.field_n);
                                                                                      }
                                                                                    } else {
                                                                                      var3 = new BuffVendorSpecial(this.moveId, this.creature.a(param1 + 83, param0), this.field_k, this.field_n);
                                                                                    }
                                                                                  } else {
                                                                                    var3 = new CranberrySpecial(this.moveId, this.creature.a(116, param0), this.field_j);
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                var3 = new SauceOfFlameSpecial(this.moveId, this.creature.a(37, param0), this.field_k, this.field_n);
                                                                              }
                                                                            }
                                                                          } else {
                                                                            var3 = new ScavengerSpecial(this.moveId, this.creature.a(113, param0));
                                                                          }
                                                                        }
                                                                      } else {
                                                                        var3 = new StampedeSpecial(this.moveId, this.creature.a(32, param0), this.field_i);
                                                                      }
                                                                    } else {
                                                                      var3 = new BananarangSpecial(this.moveId, this.creature.a(107, param0), this.field_i);
                                                                    }
                                                                  } else {
                                                                    var3 = new HomingMissileSpecial(this.moveId, this.creature.a(param1 + 44, param0), this.field_k, this.field_n);
                                                                  }
                                                                }
                                                              } else {
                                                                var3 = new StickySpecial(this.moveId, this.creature.a(81, param0), this.field_k, this.field_n);
                                                              }
                                                            } else {
                                                              var3 = new TBomberSpecial(this.moveId, this.creature.a(19, param0), this.field_k, this.field_n);
                                                            }
                                                          } else {
                                                            var3 = new FlySpecial(this.moveId, this.creature.a(13, param0), this.field_k, this.field_n);
                                                          }
                                                        } else {
                                                          var3 = new ZombiesSpecial(this.moveId, this.creature.a(25, param0));
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    var3 = new DisableSpecial(this.moveId, this.creature.a(87, param0), this.field_j);
                                                  }
                                                }
                                              } else {
                                                var3 = new InvincibleSpecial(this.moveId, this.creature.a(113, param0));
                                              }
                                            }
                                          } else {
                                            var3 = new LevitateSpecial(this.moveId, this.creature.a(param1 ^ 105, param0), this.field_j);
                                          }
                                        } else {
                                          var3 = new FloodSpecial(this.moveId, this.creature.a(param1 + 53, param0));
                                        }
                                      } else {
                                        var3 = new ShuffleSpecial(this.moveId, this.creature.a(126, param0));
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var3 = new IncomingSpecial(this.moveId, this.creature.a(109, param0), this.field_k, this.field_n);
                          }
                        }
                      }
                    }
                  } else {
                    var3 = new HailSpecial(this.moveId, this.creature.a(30, param0), this.field_k, this.field_n);
                  }
                }
              }
            }
          } else {
            var3 = new SnowSpecial(this.moveId, this.creature.a(104, param0), this.field_k, this.field_n);
          }
          param0.field_T.field_v[this.creature.field_g] = param0.field_T.field_v[this.creature.field_g] + 1;
          param0.field_T.field_r[this.creature.field_g] = sr.a(param0.field_T.field_r[this.creature.field_g], 1L << this.moveId - 88);
          dupTemp$0 = param0.field_T.field_m[this.creature.field_g];
          dupTemp$0[this.moveId - 88] = dupTemp$0[this.moveId - 88] + 1;
          if (this.field_m) {
            dupTemp$1 = param0.field_T.field_m[this.creature.field_g];
            dupTemp$1[31] = dupTemp$1[31] + 1;
          }
          var4 = ((SpecialOrder) (var3)).createEvent(param0, param1);
          if (var3 == null) {
            throw new IllegalArgumentException("Special not found");
          }
          stackIn_132_0 = var4;
          return stackIn_132_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_136_0 = var3;
          stackIn_136_1 = new StringBuilder().append("td.A(");
          if (param0 == null) {
            stackIn_137_2 = "null";
          } else {
            stackIn_137_2 = "{...}";
          }
          throw pe.wrapException((Throwable) (stackIn_136_0), ((StringBuilder) (Object) stackIn_136_1).append(stackIn_137_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
