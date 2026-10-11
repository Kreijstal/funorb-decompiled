/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tl implements Runnable {
    private java.net.URL field_h;
    private int field_a;
    static nh field_k;
    private pn field_g;
    static cn field_i;
    static String[] field_e;
    static String field_c;
    private DataInputStream field_o;
    private ec field_j;
    private pn field_b;
    static String[] field_m;
    private qg field_f;
    private pn field_n;
    static boolean field_l;
    static boolean field_d;

    final static char a(byte param0, char param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = DungeonAssault.field_K;
        if (param0 == -69) {
          var2 = param1;
          if (var2 == 32) {
            return '_';
          }
          if (var2 == 160) {
            return '_';
          }
          if (95 == var2) {
            return '_';
          }
          if (var2 == 45) {
            return '_';
          }
          if (var2 != 91) {
            if (93 == var2) {
              return param1;
            }
            if (var2 != 35) {
              if (var2 != 224 &&
                var2 != 225 &&
                var2 != 226 &&
                var2 != 228 &&
                var2 != 227 &&
                192 != var2 &&
                193 != var2 &&
                var2 != 194 &&
                196 != var2 &&
                195 != var2) {
                if (var2 != 232 &&
                  var2 != 233 &&
                  var2 != 234 &&
                  var2 != 235 &&
                  var2 != 200 &&
                  201 != var2 &&
                  202 != var2 &&
                  var2 != 203) {
                  if (var2 != 237 &&
                    var2 != 238 &&
                    var2 != 239 &&
                    var2 != 205 &&
                    var2 != 206 &&
                    207 != var2) {
                    if (var2 != 242 &&
                      var2 != 243 &&
                      var2 != 244 &&
                      246 != var2 &&
                      var2 != 245 &&
                      210 != var2 &&
                      var2 != 211 &&
                      212 != var2 &&
                      var2 != 214 &&
                      var2 != 213) {
                      if (var2 != 249 &&
                        250 != var2 &&
                        var2 != 251 &&
                        252 != var2) {
                        if (var2 == 217) {
                          return 'u';
                        }
                        if (var2 != 218) {
                          if (219 == var2) {
                            return 'u';
                          }
                          if (var2 != 220) {
                            if (var2 == 231) {
                              return 'c';
                            }
                            if (var2 == 199) {
                              return 'c';
                            }
                            if (var2 == 255) {
                              return 'y';
                            }
                            if (var2 == 376) {
                              return 'y';
                            }
                            if (241 == var2) {
                              return 'n';
                            }
                            if (var2 == 209) {
                              return 'n';
                            }
                            if (223 != var2) {
                              return Character.toLowerCase(param1);
                            }
                            return 'b';
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
          return param1;
        }
        field_c = (String) null;
        var2Lifetime1 = param1;
        if (var2Lifetime1 == 32) {
          return '_';
        }
        if (var2Lifetime1 != 160 &&
          95 != var2Lifetime1 &&
          var2Lifetime1 != 45) {
          if (var2Lifetime1 != 91 &&
            93 != var2Lifetime1 &&
            var2Lifetime1 != 35) {
            if (var2Lifetime1 != 224 &&
              var2Lifetime1 != 225 &&
              var2Lifetime1 != 226 &&
              var2Lifetime1 != 228 &&
              var2Lifetime1 != 227 &&
              192 != var2Lifetime1 &&
              193 != var2Lifetime1 &&
              var2Lifetime1 != 194 &&
              196 != var2Lifetime1 &&
              195 != var2Lifetime1) {
              if (var2Lifetime1 != 232 &&
                var2Lifetime1 != 233 &&
                var2Lifetime1 != 234 &&
                var2Lifetime1 != 235 &&
                var2Lifetime1 != 200 &&
                201 != var2Lifetime1 &&
                202 != var2Lifetime1 &&
                var2Lifetime1 != 203) {
                if (var2Lifetime1 != 237 &&
                  var2Lifetime1 != 238 &&
                  var2Lifetime1 != 239) {
                  if (var2Lifetime1 == 205) {
                    return 'i';
                  }
                  if (var2Lifetime1 == 206) {
                    return 'i';
                  }
                  if (207 != var2Lifetime1) {
                    if (var2Lifetime1 == 242) {
                      return 'o';
                    }
                    if (var2Lifetime1 == 243) {
                      return 'o';
                    }
                    if (var2Lifetime1 != 244) {
                      if (246 == var2Lifetime1) {
                        return 'o';
                      }
                      if (var2Lifetime1 == 245) {
                        return 'o';
                      }
                      if (210 != var2Lifetime1 &&
                        var2Lifetime1 != 211 &&
                        212 != var2Lifetime1) {
                        if (var2Lifetime1 == 214) {
                          return 'o';
                        }
                        if (var2Lifetime1 == 213) {
                          return 'o';
                        }
                        if (var2Lifetime1 == 249) {
                          return 'u';
                        }
                        if (250 == var2Lifetime1) {
                          return 'u';
                        }
                        if (var2Lifetime1 == 251) {
                          return 'u';
                        }
                        if (252 == var2Lifetime1) {
                          return 'u';
                        }
                        if (var2Lifetime1 == 217) {
                          return 'u';
                        }
                        if (var2Lifetime1 != 218) {
                          if (219 == var2Lifetime1) {
                            return 'u';
                          }
                          if (var2Lifetime1 != 220) {
                            if (var2Lifetime1 == 231) {
                              return 'c';
                            }
                            if (var2Lifetime1 == 199) {
                              return 'c';
                            }
                            if (var2Lifetime1 == 255) {
                              return 'y';
                            }
                            if (var2Lifetime1 == 376) {
                              return 'y';
                            }
                            if (241 == var2Lifetime1) {
                              return 'n';
                            }
                            if (var2Lifetime1 == 209) {
                              return 'n';
                            }
                            if (223 != var2Lifetime1) {
                              return Character.toLowerCase(param1);
                            }
                            return 'b';
                          }
                        }
                        return 'u';
                      }
                    }
                    return 'o';
                  }
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

    final ec c(int param0) {
        if (this.field_a != param0) {
          return null;
        }
        return this.field_j;
    }

    public static void a(byte param0) {
        field_k = null;
        field_c = null;
        field_e = null;
        field_i = null;
        field_m = null;
        if (param0 != 50) {
          field_i = (cn) null;
        }
    }

    protected final void finalize() {
        if (null != this.field_g) {
          if (this.field_g.field_f != null) {
            try {
              ((DataInputStream) (this.field_g.field_f)).close();
            } catch (Exception exception) {
            }
          }
          this.field_g = null;
        }
        if (null != this.field_n) {
          if (null != this.field_n.field_f) {
            try {
              ((java.net.Socket) (this.field_n.field_f)).close();
            } catch (Exception exception) {
            }
          }
          this.field_n = null;
        }
        if (null != this.field_o) {
          try {
            this.field_o.close();
          } catch (Exception exception) {
          }
          this.field_o = null;
        }
        this.field_b = null;
    }

    final static void a(int param0) {
        if (sp.field_c != null) {
          sp.field_c.c(-6624);
          sp.field_c = null;
        }
        int var1 = 17 / ((param0 - 42) / 58);
    }

    public final void run() {
        try {
          int var1_int = 0;
          Object var1 = null;
          Throwable var2 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          Object var2_ref = null;
          var4 = DungeonAssault.field_K;
          try {
            while (this.field_j.field_m.length > this.field_j.field_o) {
              var1_int = this.field_o.read(this.field_j.field_m, this.field_j.field_o, -this.field_j.field_o + this.field_j.field_m.length);
              if (var1_int >= 0) {
                this.field_j.field_o = this.field_j.field_o + var1_int;
                continue;
              }
              break;
            }
            if (this.field_j.field_m.length == this.field_j.field_o) {
              throw tl.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_j.field_m.length + " " + this.field_h));
            }
            var1 = this;
            synchronized (var1) {
              this.finalize();
              this.field_a = 3;
            }
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var2_ref = this;
            synchronized (var2_ref) {
              this.finalize();
              this.field_a = this.field_a + 1;
            }
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized boolean d(int param0) {
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (this.field_a >= 2) {
          return true;
        }
        if (0 == this.field_a) {
          if (null == this.field_g) {
            this.field_g = this.field_f.a(-18, this.field_h);
          }
          if (this.field_g.field_c == 0) {
            return false;
          }
          if (this.field_g.field_c != 1) {
            this.field_g = null;
            this.field_a = this.field_a + 1;
            return false;
          }
        }
        if (this.field_a == 1) {
          if (null == this.field_n) {
            this.field_n = this.field_f.a(-114, 443, this.field_h.getHost());
          }
          if (this.field_n.field_c == 0) {
            return false;
          }
          if (this.field_n.field_c != 1) {
            this.field_n = null;
            this.field_a = this.field_a + 1;
            return false;
          }
        }
        if (null == this.field_o) {
          try {
            if (this.field_a == 0) {
              this.field_o = (DataInputStream) (this.field_g.field_f);
            }
            if (1 == this.field_a) {
              var4 = (java.net.Socket) (this.field_n.field_f);
              var4.setSoTimeout(10000);
              var3 = var4.getOutputStream();
              var3.write(17);
              var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_h.getFile() + "\n\n"));
              var3.write(n.a(var5, -14553));
              this.field_o = new DataInputStream(var4.getInputStream());
            }
            this.field_j.field_o = 0;
            decompiledRegionSelector0 = 0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            this.finalize();
            this.field_a = this.field_a + 1;
            decompiledRegionSelector0 = 1;
          }
          if (decompiledRegionSelector0 == 0) {
            if (this.field_b == null) {
              this.field_b = this.field_f.a(-21432, 5, (Runnable) (this));
            }
            if (0 == this.field_b.field_c) {
              return false;
            }
            if (1 != this.field_b.field_c) {
              this.finalize();
              this.field_a = this.field_a + 1;
            }
            if (param0 <= 13) {
              this.finalize();
            }
            return false;
          }
        }
        if (this.field_b == null) {
          this.field_b = this.field_f.a(-21432, 5, (Runnable) (this));
        }
        if (0 == this.field_b.field_c) {
          return false;
        }
        if (1 != this.field_b.field_c) {
          this.finalize();
          this.field_a = this.field_a + 1;
        }
        if (param0 > 13) {
          return false;
        }
        this.finalize();
        return false;
    }

    tl(qg param0, java.net.URL param1, int param2) {
        try {
          this.field_h = param1;
          this.field_f = param0;
          this.field_j = new ec(param2);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "tl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static String b(int param0) {
        if (~dk.field_c > param0) {
          return to.field_g;
        }
        if (ia.field_U != null) {
          if (!ia.field_U.a(-14354)) {
            return ec.field_r;
          }
          return ki.field_c;
        }
        if (!fi.field_u.a(-14354)) {
          return qk.field_c;
        }
        if (!fi.field_u.a(false, "commonui")) {
          return sa.field_w + " - " + fi.field_u.b("commonui", -1) + "%";
        }
        if (!kg.field_b.a(param0 ^ 14355)) {
          return rf.field_L;
        }
        if (!kg.field_b.a(false, "commonui")) {
          return mp.field_c + " - " + kg.field_b.b("commonui", param0 ^ 2) + "%";
        }
        if (!ib.field_b.a(param0 - 14351)) {
          return fg.field_m;
        }
        if (!ib.field_b.a((byte) 59)) {
          return kj.field_m + " - " + ib.field_b.b(100) + "%";
        }
        return p.field_K;
    }

    static {
        field_e = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_m = new String[]{"Modifiers", "Some things are capable of changing the skill levels of your raider, or a dungeon room. If any of these effects are present on a raider or room, a symbol will be displayed in the corner of its portrait. A <col=00FF00>green</col> symbol means a skill level has <col=00FF00>increased</col>; a <col=FF0000>red</col> symbol indicates a skill level has <col=FF0000>decreased</col>. There are also other symbols you will encounter.<br><br><%command>Continue moving your party towards the hoard room.</col>"};
        field_c = "You must have charged <%0> Orb of Mastery in total to earn the title of <%1>.";
        field_l = true;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
