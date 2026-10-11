/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tk extends bc implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static dl[] field_h;
    private java.awt.image.ImageConsumer field_g;
    private java.awt.image.ColorModel field_j;
    static dl field_l;
    static mk field_k;
    static java.applet.Applet field_i;

    final void a(java.awt.Graphics param0, int param1, byte param2, int param3) {
        try {
          int var5_int = -29 / ((83 - param2) / 34);
          this.c(126);
          param0.drawImage(this.field_b, param3, param1, (java.awt.image.ImageObserver) (this));
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "tk.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static char a(int param0, char param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = CrazyCrystals.field_B;
        if (param0 == 235) {
          var2 = param1;
          if (var2 != 32) {
            if (160 == var2) {
              return '_';
            }
            if (var2 != 95) {
              if (var2 == 45) {
                return '_';
              }
              if (var2 == 91) {
                return param1;
              }
              if (var2 == 93) {
                return param1;
              }
              if (var2 == 35) {
                return param1;
              }
              if (var2 != 224 &&
                var2 != 225 &&
                var2 != 226 &&
                228 != var2 &&
                var2 != 227 &&
                var2 != 192 &&
                var2 != 193 &&
                var2 != 194 &&
                var2 != 196 &&
                var2 != 195) {
                if (var2 != 232 &&
                  var2 != 233 &&
                  var2 != 234 &&
                  var2 != 235 &&
                  var2 != 200 &&
                  var2 != 201 &&
                  var2 != 202 &&
                  var2 != 203) {
                  if (237 != var2 &&
                    238 != var2 &&
                    var2 != 239 &&
                    var2 != 205 &&
                    206 != var2 &&
                    var2 != 207) {
                    if (var2 != 242 &&
                      var2 != 243 &&
                      var2 != 244 &&
                      var2 != 246 &&
                      var2 != 245 &&
                      var2 != 210 &&
                      211 != var2 &&
                      var2 != 212 &&
                      214 != var2 &&
                      213 != var2) {
                      if (var2 != 249) {
                        if (250 == var2) {
                          return 'u';
                        }
                        if (var2 == 251) {
                          return 'u';
                        }
                        if (var2 != 252) {
                          if (217 == var2) {
                            return 'u';
                          }
                          if (var2 == 218) {
                            return 'u';
                          }
                          if (var2 == 219) {
                            return 'u';
                          }
                          if (var2 != 220) {
                            if (var2 != 231 &&
                              var2 != 199) {
                              if (255 == var2) {
                                return 'y';
                              }
                              if (var2 == 376) {
                                return 'y';
                              }
                              if (241 != var2 &&
                                209 != var2) {
                                if (var2 == 223) {
                                  return 'b';
                                }
                                return Character.toLowerCase(param1);
                              }
                              return 'n';
                            }
                            return 'c';
                          }
                        }
                      }
                      return 'u';
                    }
                    return 'o';
                  }
                  return 'i';
                }
                return 'e';
              }
              return 'a';
            }
          }
          return '_';
        }
        tk.a(-103, '\023');
        var2Lifetime1 = param1;
        if (var2Lifetime1 != 32) {
          if (160 == var2Lifetime1) {
            return '_';
          }
          if (var2Lifetime1 != 95 &&
            var2Lifetime1 != 45) {
            if (var2Lifetime1 != 91 &&
              var2Lifetime1 != 93 &&
              var2Lifetime1 != 35) {
              if (var2Lifetime1 != 224 &&
                var2Lifetime1 != 225 &&
                var2Lifetime1 != 226 &&
                228 != var2Lifetime1 &&
                var2Lifetime1 != 227 &&
                var2Lifetime1 != 192 &&
                var2Lifetime1 != 193 &&
                var2Lifetime1 != 194 &&
                var2Lifetime1 != 196 &&
                var2Lifetime1 != 195) {
                if (var2Lifetime1 != 232 &&
                  var2Lifetime1 != 233 &&
                  var2Lifetime1 != 234 &&
                  var2Lifetime1 != 235) {
                  if (var2Lifetime1 == 200) {
                    return 'e';
                  }
                  if (var2Lifetime1 != 201 &&
                    var2Lifetime1 != 202) {
                    if (var2Lifetime1 == 203) {
                      return 'e';
                    }
                    if (237 != var2Lifetime1) {
                      if (238 == var2Lifetime1) {
                        return 'i';
                      }
                      if (var2Lifetime1 == 239) {
                        return 'i';
                      }
                      if (var2Lifetime1 != 205) {
                        if (206 == var2Lifetime1) {
                          return 'i';
                        }
                        if (var2Lifetime1 != 207) {
                          if (var2Lifetime1 == 242) {
                            return 'o';
                          }
                          if (var2Lifetime1 == 243) {
                            return 'o';
                          }
                          if (var2Lifetime1 != 244) {
                            if (var2Lifetime1 == 246) {
                              return 'o';
                            }
                            if (var2Lifetime1 == 245) {
                              return 'o';
                            }
                            if (var2Lifetime1 != 210) {
                              if (211 == var2Lifetime1) {
                                return 'o';
                              }
                              if (var2Lifetime1 == 212) {
                                return 'o';
                              }
                              if (214 != var2Lifetime1 &&
                                213 != var2Lifetime1) {
                                if (var2Lifetime1 == 249) {
                                  return 'u';
                                }
                                if (250 == var2Lifetime1) {
                                  return 'u';
                                }
                                if (var2Lifetime1 == 251) {
                                  return 'u';
                                }
                                if (var2Lifetime1 != 252) {
                                  if (217 == var2Lifetime1) {
                                    return 'u';
                                  }
                                  if (var2Lifetime1 == 218) {
                                    return 'u';
                                  }
                                  if (var2Lifetime1 == 219) {
                                    return 'u';
                                  }
                                  if (var2Lifetime1 != 220) {
                                    if (var2Lifetime1 != 231 &&
                                      var2Lifetime1 != 199) {
                                      if (255 == var2Lifetime1) {
                                        return 'y';
                                      }
                                      if (var2Lifetime1 == 376) {
                                        return 'y';
                                      }
                                      if (241 != var2Lifetime1 &&
                                        209 != var2Lifetime1) {
                                        if (var2Lifetime1 == 223) {
                                          return 'b';
                                        }
                                        return Character.toLowerCase(param1);
                                      }
                                      return 'n';
                                    }
                                    return 'c';
                                  }
                                }
                                return 'u';
                              }
                            }
                          }
                          return 'o';
                        }
                      }
                    }
                    return 'i';
                  }
                }
                return 'e';
              }
              return 'a';
            }
            return param1;
          }
        }
        return '_';
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
          this.field_g = param0;
          param0.setDimensions(this.field_d, this.field_e);
          param0.setProperties((Hashtable) null);
          param0.setColorModel(this.field_j);
          param0.setHints(14);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "tk.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final synchronized void c(int param0) {
        if (param0 <= 78) {
          java.awt.image.ImageConsumer var3 = (java.awt.image.ImageConsumer) null;
          this.isConsumer((java.awt.image.ImageConsumer) null);
          if (this.field_g == null) {
            return;
          }
          this.field_g.setPixels(0, 0, this.field_d, this.field_e, this.field_j, this.field_c, 0, this.field_d);
          this.field_g.imageComplete(2);
          return;
        }
        if (this.field_g == null) {
          return;
        }
        this.field_g.setPixels(0, 0, this.field_d, this.field_e, this.field_j, this.field_c, 0, this.field_d);
        this.field_g.imageComplete(2);
    }

    final void a(int param0, int param1, java.awt.Component param2, int param3) {
        try {
          this.field_c = new int[1 + param1 * param3];
          this.field_e = param3;
          this.field_d = param1;
          this.field_j = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
          this.field_b = param2.createImage((java.awt.image.ImageProducer) (this));
          int var5_int = -79 % ((50 - param0) / 32);
          this.c(110);
          param2.prepareImage(this.field_b, (java.awt.image.ImageObserver) (this));
          this.c(108);
          param2.prepareImage(this.field_b, (java.awt.image.ImageObserver) (this));
          this.c(79);
          param2.prepareImage(this.field_b, (java.awt.image.ImageObserver) (this));
          this.a(6945);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "tk.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        try {
          if (this.field_g == param0) {
            this.field_g = null;
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "tk.removeConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
          this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "tk.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    tk() {
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return this.field_g == param0;
    }

    public static void a(byte param0) {
        field_k = null;
        field_i = null;
        field_l = null;
        if (param0 > -123) {
          field_k = (mk) null;
          field_h = null;
          return;
        }
        field_h = null;
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("tk.imageUpdate(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_k = new mk();
    }
}
