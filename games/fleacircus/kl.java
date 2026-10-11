/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl {
    static String field_d;
    static String field_b;
    static int[] field_c;
    static String[] field_a;

    final static bi a(int param0) {
        bi var1 = new bi(e.field_e, uf.field_k, vg.field_I[0], b.field_b[0], ij.field_H[0], ob.field_a[0], of.field_d[0], rd.field_d);
        c.o(-28210);
        int var2 = -70 / ((param0 - 76) / 39);
        return var1;
    }

    final static dd a(int param0, rh param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        dd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 252) {
            kl.a(122);
          }
          var4_int = param1.a(param2, (byte) -100);
          var5 = param1.a(param3, (byte) -15, var4_int);
          stackIn_3_0 = vb.a(param0 ^ -141, param1, var4_int, var5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("kl.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var4 = fleas.field_A ? 1 : 0;
        try {
          bl.b();
          bj.field_l = 11;
          h.field_b = new int[260];
          var1_int = 0;
          if (param0 != 31207) {
            kl.a(38);
          }
          while (var1_int < 256) {
            var2 = 15.0;
            h.field_b[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
            var1_int++;
          }
          var5 = 256;
          var1_intLifetime1 = var5;
          while (var5 < h.field_b.length) {
            h.field_b[var5] = 255;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "kl.D(" + param0 + ')');
        }
    }

    final static char a(byte param0, char param1) {
        int var2;
        int var3;
        var3 = fleas.field_A ? 1 : 0;
        if (param0 != -78) {
          field_b = (String) null;
        }
        var2 = param1;
        if (var2 != 32 &&
          var2 != 160 &&
          var2 != 95 &&
          var2 != 45) {
          if (91 != var2 &&
            93 != var2 &&
            var2 != 35) {
            if (224 != var2 &&
              225 != var2 &&
              226 != var2 &&
              var2 != 228 &&
              227 != var2 &&
              var2 != 192 &&
              var2 != 193 &&
              var2 != 194 &&
              var2 != 196 &&
              var2 != 195) {
              if (var2 != 232 &&
                233 != var2 &&
                var2 != 234 &&
                var2 != 235 &&
                var2 != 200 &&
                var2 != 201 &&
                var2 != 202 &&
                var2 != 203) {
                if (var2 != 237 &&
                  var2 != 238 &&
                  var2 != 239 &&
                  var2 != 205 &&
                  var2 != 206 &&
                  207 != var2) {
                  if (var2 != 242 &&
                    var2 != 243 &&
                    244 != var2 &&
                    246 != var2 &&
                    var2 != 245 &&
                    210 != var2 &&
                    var2 != 211 &&
                    212 != var2 &&
                    var2 != 214 &&
                    var2 != 213) {
                    if (var2 != 249 &&
                      var2 != 250 &&
                      var2 != 251 &&
                      var2 != 252 &&
                      var2 != 217 &&
                      218 != var2 &&
                      var2 != 219 &&
                      var2 != 220) {
                      if (var2 != 231 &&
                        var2 != 199) {
                        if (var2 != 255 &&
                          var2 != 376) {
                          if (var2 != 241 &&
                            var2 != 209) {
                            if (223 != var2) {
                              return Character.toLowerCase(param1);
                            }
                            return 'b';
                          }
                          return 'n';
                        }
                        return 'y';
                      }
                      return 'c';
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
          return param1;
        }
        return '_';
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        field_d = null;
        if (param0 != -24) {
          field_d = (String) null;
        }
    }

    static {
        field_d = "<%0>Spring:<%1> when a flea stands on top of a spring it is catapulted upwards until it hits an obstacle, at which point it falls back down to land on the spring again.";
        field_b = "Fleas: <%0>";
        field_a = new String[]{"The fleas must be saved!<br><br>Click on \"Right Slope\", then click in the highlighted area to start placing slopes for them to climb.", "Stop the fleas from drowning by placing a block between them and the water.", "Bombs explode on contact, destroying everything nearby... except the fleas.", "This is a Teleporter. It lets you get fleas to places that they could otherwise not reach.", "Fans blow fleas sideways, allowing them to get past certain obstacles... or pushing them into other obstacles!", "Gravity. It's just a theory, honest. Change its direction by getting a flea to touch the arrows.", "The first flea to touch one of these tiles will bounce off, destroying the tile in the process.", "This is a balloon and a landing pad. The balloon will always rise up to the next landing pad, regardless of any tiles in the way.", "These green switches turn recessed walls into normal blocks, drastically changing the layout of the level.", "These are spiders! They are nasty, and eat every flea that walks underneath them. You must find a way around them, or kill them with a bomb!", "", "", "", "", ""};
        field_c = new int[8192];
    }
}
